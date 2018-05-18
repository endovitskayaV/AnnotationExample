import ru.vsu.elapsingAnnotation.ElapsingConfig;

public class Main {

    public static void main(String[] args) {
        System.out.println("Hello World!");
        TestClass t = new TestClass();
        ElapsingConfig.getInstance().setMessageFormat("global format %s");
       // ElapsingConfig.getInstance().setMaxElapsed(-2);
        t.doSmth();
    }
}
