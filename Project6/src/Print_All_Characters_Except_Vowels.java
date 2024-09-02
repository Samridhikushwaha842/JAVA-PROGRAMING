import java.util.Scanner;
public class Print_All_Characters_Except_Vowels{
        public static void main(String[] args){
            Scanner sc=new Scanner(System.in);

            System.out.print("Enter a string:");
            String input = sc.next();
            input =input.toLowerCase();
            for (int i=0 ; i<input.length(); i++){
                char ch=input.charAt(i);
                if (ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u') {
                    continue;
                }
                System.out.print(ch);
            }
        }
    }
