
public class udpcli {

    public static void main(String[] args) {

        final var result = mainSync(args);
        System.out.printf("From server: %s%n", result);
    }

    /**
     * Bear in mind your classmates will use the main one.
     * */
    public static String mainSync(String[] args) {
        // TODO add your verifications here

        // TODO add your logic here
        final var responseFromServer = "6";

        return responseFromServer;
    }
}
