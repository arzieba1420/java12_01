public class AbstractTester {
    public static void main(String[] args) {

        Shape shape = new Rectandle();
        ((Rectandle) shape).setLength(100);
        ((Rectandle) shape).setWidth(2);
        System.out.println(shape.getArea());


    }
}

abstract class Shape{
    private String color;
    abstract double getArea();
}

class Rectandle extends Shape{

    private int length;
    private int width;

    @Override
    double getArea() {
        return length*width;
    }

    public int getLength() {
        return length;
    }

    public void setLength(int length) {
        this.length = length;
    }

    public int getWidth() {
        return width;
    }

    public void setWidth(int width) {
        this.width = width;
    }
}

