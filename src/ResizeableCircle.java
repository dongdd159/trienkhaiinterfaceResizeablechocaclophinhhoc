public class ResizeableCircle extends Circle implements Resizeable{
    public void resize(double percent){
        setRadius(getRadius()+getRadius()*percent/100);
    }
    public ResizeableCircle(){
    }
    public ResizeableCircle(double radius) {
        super(radius);
    }
    public ResizeableCircle(double radius, String color, boolean filled) {
        super(radius, color, filled);
    }
}
