# upd-calculator-tester
To my dear classmates.

I've created this repo for testing our applications easily.
You can fork this repo into your **private one** and work from there, you can add more tests, change the structure or do whatever you want!

I've created two different modules, so you can start from there but, please, keep in mind this is not the path the teachers want: You will need to copy JUST the .java to the folder you will submit.

[updcli](client/src/main/java/udpcli.java) where your client application starts.
[updser](server/src/main/java/udpser.java) where your client application starts.

## How to run

I've created a [GoldenTest](src/test/java/GoldenTest.java) that runs in a thread the server behind server module main method.
And uses udpcli mainSync to try the UDP connection.

For a simple local validation just execute:
```./gradlew clean build```
(You just need to have installed jdk11)

But also I've set up a GitHub action gradle workflow, that means, on every single commit a pipeline will execute all the tests you create!


Any feedback is more than welcome, PRs too!
Thanks 🤓
