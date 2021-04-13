public class ResizeableSquareTest {
    public static void main(String[] args) {
        ResizeableSquare[] squares = new ResizeableSquare[3];
        squares[0] = new ResizeableSquare();
        squares[1] = new ResizeableSquare(4);
        squares[2] = new ResizeableSquare("red", true, 7, 7);
        System.out.println("Pre-resized:");
        for (ResizeableSquare square : squares) {
            System.out.println(square);
        }
        for (int i = 0; i < squares.length; i++) {
            squares[i].resize(1 + (Math.random() * 100));
        }
        System.out.println("After-resized:");
        for (ResizeableSquare square : squares) {
            System.out.println(square);
        }
    }
}
