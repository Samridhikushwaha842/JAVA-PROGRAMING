public class QuadrantOfACoOrdinatePoint {
    public static void main(String[] args) {
        int x = 7;
        int y = 9;

        if (x > 0 && y > 0) {
            System.out.println("The coordinate point (" + x + "," + y + ") lies in the First quadrant.");
        } else if (x < 0 && y < 0) {
            System.out.println("The coordinate point(" + x + "," + y + ") lies in the second quardant.");
        } else if (x < 0 && y < 0) {
            System.out.println("The coordinate point(" + x + "," + y + ") lies in the third quardant.");
        } else if (x > 0 && y > 0) {
            System.out.println("The coordinate point(" + x + "," + y + ") lies in the fourth quardant.");
        } else if (x == 0 && y != 0) {
            System.out.println("The coordinate point (" + x + "," + y + ") lies on the Y-axis.");
        } else if (x != 0 && y == 0) {
            System.out.println("The coordinate point (" + x + "," + y + ") lies on the X-axis.");
        } else {
            System.out.println("The coordinate point (" + x + "," + y + ") is at the origin.");
        }
    }
}


