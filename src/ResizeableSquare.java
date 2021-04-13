public class ResizeableSquare extends Square implements Resizeable {
    public void resize(double percent){
        setSide(getSide()*getSide()*percent/100);
    }

    public ResizeableSquare() {
    }

    public ResizeableSquare(double side) {
        super(side);
    }

    public ResizeableSquare(String color, boolean filled, double width, double length) {
        super(color, filled, width, length);
    }
}
