public class ResizeableCircleTest {
    public static void main(String[] args) {
        ResizeableCircle[] circles = new ResizeableCircle[3];
        circles[0] = new ResizeableCircle(3.6);
        circles[1] = new ResizeableCircle();
        circles[2] = new ResizeableCircle(3.5, "indigo", false);

        System.out.println("Pre-resized:");
        for (ResizeableCircle circle : circles) {
            System.out.println(circle);
        }
        for (int i=0;i< circles.length;i++){
            circles[i].resize(1+(Math.random()*100));
        }
        System.out.println("After-resized:");
        for (ResizeableCircle circle : circles) {
            System.out.println(circle);
        }
    }
}
