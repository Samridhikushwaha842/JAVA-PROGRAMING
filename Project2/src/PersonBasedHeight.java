public class PersonBasedHeight{
    public static void main(String[] args) {
        int height = 189;
        if (height < 150) {
            System.out.println("The person is Dwarf.");
        } else if (height >= 150 && height <= 165) {
            System.out.println("The person has Average height.");
        } else {
            System.out.println("The person is Tall.");
        }
    }
}
