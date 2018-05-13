package ru.vsu;

import ru.vsu.elapsingAnnotation.Elapsing;

import java.io.Serializable;
import java.util.logging.*;

public class TestClass implements Serializable {

    int num;

    // @Elapsing(format="method time: %s ms")
    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if ((obj == null) || (obj.getClass() != this.getClass()))
            return false;
        TestClass test = (TestClass) obj;
        return num == test.num;
    }

    // @Elapsing
    public static void doSmth() {
        try {
            Thread.sleep(500);

        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }

    @Elapsing(format = "VVVV  %s")
    public void doSmth1() {
        doSmth();
    }
}