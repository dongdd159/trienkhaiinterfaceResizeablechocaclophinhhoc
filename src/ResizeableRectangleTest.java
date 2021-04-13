public class ResizeableRectangleTest {
    public static void main(String[] args) {
        ResizeableRectangle[] rectangles = new ResizeableRectangle[3];
        rectangles[0] = new ResizeableRectangle();
        rectangles[1] = new ResizeableRectangle(3, 4);
        rectangles[2] = new ResizeableRectangle("red", true, 7, 5);
        System.out.println("Pre-resized:");
        for (ResizeableRectangle rectangle : rectangles) {
            System.out.println(rectangle);
        }
        for (int i = 0; i < rectangles.length; i++) {
            rectangles[i].resize(1 + (Math.random() * 100));
        }
        System.out.println("After-resized:");
        for (ResizeableRectangle rectangle : rectangles) {
            System.out.println(rectangle);
        }
    }
}
