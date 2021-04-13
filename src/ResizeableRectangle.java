public class ResizeableRectangle extends Rectangle implements Resizeable{
    public void resize(double percent){
        setWidth(getWidth()+getWidth()*percent/100);
        setLength(getLength()+getLength()+percent/100);
    }
    public ResizeableRectangle() {
    }
    public ResizeableRectangle(double width, double length) {
        super(width, length);
    }

    public ResizeableRectangle(String color, boolean filled, double width, double length) {
        super(color, filled, width, length);
    }
}
