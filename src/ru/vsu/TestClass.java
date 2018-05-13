package ru.vsu;

import ru.vsu.elapsingAnnotation.Elapsing;

import java.io.Serializable;
import java.util.logging.*;

public class TestClass implements Serializable {

    @Elapsing(format = "Elapsed  %s ms")
    public void doSmth() {
        doSame();
    }

    @Elapsing(interval = Elapsing.TimeInterval.NANOSECOND, maxElapsed = 0)
    private static void doSame() {
        try {
            Thread.sleep(500);

        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}