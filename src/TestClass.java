import ru.vsu.elapsingAnnotation.Elapsing;

public class TestClass {
    private static final String s = "jklj";
    int a;

    @Elapsing
    public void doSmth() {
        doSame();
    }

    @Elapsing(messageFormat = "custom message")
    private static void doSame() {
        try {
            Thread.sleep(10);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}