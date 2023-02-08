import java.net.InetAddress;
import java.net.UnknownHostException;
import java.util.Random;
import org.junit.jupiter.api.Test;

import static java.lang.Thread.sleep;
import static java.util.concurrent.Executors.newFixedThreadPool;
import static org.assertj.core.api.Assertions.assertThat;

public class GoldenTest {

    @Test
    void shouldTalkLocally() throws UnknownHostException, InterruptedException {
        final var randomPort = String.valueOf(new Random().nextInt(1000) + 8000);
        final var secret = "1";
        final String[] serverArguments = {randomPort, secret};
        newFixedThreadPool(1).submit(() -> udpser.main(serverArguments));

        // Let's give the server a while
        sleep(10000);

        final var address = InetAddress.getLocalHost().getHostAddress();
        final String[] clientArguments = {address, randomPort, "2+3"};
        final var actual = udpcli.mainSync(clientArguments);

        assertThat(actual)
                .isEqualTo("6"); // 2+3 + secret(1) = 6
    }
}
