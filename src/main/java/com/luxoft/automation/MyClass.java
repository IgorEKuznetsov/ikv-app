package com.luxoft.automation;

public class MyClass {

    public static void main(String[] args) {
        Point p = new Point(2, 2);
        Point p2 = new Point(12, 2);
        //p.setX(3);
        //p.setY(5);
       int a = p.getY();
       int b = p.getX();
        System.out.println(b + " and " + a + " and " + Point.test()); //dynamic and static

       /*
       Point p2 = new Point();
        p2.x = 25;
        p2.y = 30;

        Rectangle rec = new Rectangle();
        rec.bottomRight.x = 10;
        rec.bottomRight.y = 20;
        rec.topLeft.x = 30;
        rec.topLeft.y = 50;
        System.out.println(rec.topLeft.x + " " +
                rec.topLeft.y + " " +
                rec.bottomRight.x + " " +
                rec.bottomRight.y);
*/
    }

}
