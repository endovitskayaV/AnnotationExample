package bla;



import ru.vsu.elapsingAnnotation.Elapsing;
import ru.vsu.elapsingAnnotation.ElapsingConfig;

import java.io.Serializable;

//@Data
public class TestClass implements  Serializable {
    private static final String s = "jklj";
    int a;
    @Elapsing()
    public void doSmth() {
        doSame();
    }

   // @Elapsing(interval = Elapsing.TimeInterval.NANOSECOND, maxElapsed = 1)
    private static void doSame() {
        try {
            Thread.sleep(500);

        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}