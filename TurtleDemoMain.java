package com.sd.Turtle;
import ch.aplu.turtle.*;

class TurtleDemoMain {
    TurtleDemoMain() {
        Turtle t1=new Turtle();
        for (int i=0; i<4; i++) {
            t1.fd(50);
            t1.left(90);
        }
    }
    public static void main(String[] args) {
        new TurtleDemoMain();
    }
}