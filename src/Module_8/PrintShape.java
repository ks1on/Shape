package Module_8;

public class PrintShape implements Printable {
    private Shape shape;

    public PrintShape(Shape shape) {
        this.shape = shape;
    }

    @Override
    public void print() {
        System.out.println(shape.getName());
    }
}
