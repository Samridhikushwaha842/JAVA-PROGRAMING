import java.util.Scanner;

public class Concatenate_first_And_Last_Name{
    public static void main(String args[]){

        Scanner scanner = new Scanner(System.in);

        System.out.print("Entre your first name:");
        String firstname = scanner.nextLine();

        System.out.print("Entre your LastName:");
        String lastname = scanner.nextLine();

        String fullname = firstname + "" + lastname;

        System.out.print("FullName" + fullname);

        scanner.close();
    }
}
