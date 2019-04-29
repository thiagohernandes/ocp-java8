package ocp.classe.cap2.design;
class Color {
    int red, green, blue;
    void Color() {
        red = 10;
        green = 10;
        blue = 10;
    }
    public Color() {

    }
    public Color(int t) {
        red = t;
        green = 10;
        blue = 10;
    }
    void printColor() {
        System.out.println("red: " + red + " green: " + green + " blue: " +
                blue);
    }
    public static void main(String [] args) {
        Color color = new Color();
        System.out.println(color.red);
        Color color2 = new Color(4);
        System.out.println(color2.red);
        color.printColor();
    }
}