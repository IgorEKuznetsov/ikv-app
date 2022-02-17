package com.luxoft.automation;
    //описание свойств:
public class Point {
    private static int x;
    private int y;

    //конструктор без параметров:
    public Point() {
        this.x = 0;
        this.y = 0;
    }
        // Конструктор с двумя параметрами:
        public Point (int x, int y){
      // setX(x);
      // setY(y);
            this.x = x * 2;
            this.y = y;
    }

        //статические методы
        static int test(){
            return x;
        }
        //динамические методы
        public void setX(int x) {
            this.x = x;
        }
        public void setY(int y) {
            this.y = y;
        }
        public int getX() {
            return x+1;
        }
        public int getY() {
            return y;
        }

}


