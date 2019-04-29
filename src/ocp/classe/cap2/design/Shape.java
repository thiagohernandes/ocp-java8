package ocp.classe.cap2.design;

public class Shape {
    protected int color = 5;
    protected int x;
    protected int y;

    public Shape() {
        teste();
    }

    public Shape(int x, int y) {
        this.x = x;
        this.y = y;
        testeNumerosSuper();
    }

    protected void teste() {
        System.out.println("Teste private -> " + color);
    }

    public void testeNumerosSuper(){
        System.out.println("Números " + this.x + " - " + this.y);
    }
}
