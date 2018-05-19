import ru.vsu.elapsingAnnotation.Elapsing;

public class TestClass {
    private static final String s = "jklj";
    int a;

    @Elapsing(maxElapsed = 20)
    public void doSmth() {
        doSame();
    }

    @Elapsing(messageFormat = "custom message", overtimeMessageFormat = "Elapsed %s ms more")
    private static void doSame() {
        try {
            Thread.sleep(10);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}