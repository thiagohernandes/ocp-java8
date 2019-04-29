package ocp.classe.cap2.design;

class Point {
    public int x;
    Point(int y) {
        this.x = y;
        System.out.println("Valor de x -> " + this.x);
    }
}

public class ObjTeste {
    public static void main(String...args) {
        Object obj = new Point(10);
        System.out.println(((Point) obj).x);
    }
}
