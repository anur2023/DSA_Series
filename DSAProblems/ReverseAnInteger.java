import java.util.Scanner;

public class ReverseAnInteger {
    public static void main(String[] args) {
        System.out.print("Enter your integer :- ");
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();

        int val = num; 

        int result = 0;
        while (num != 0) {
            int digit = num % 10;
            result = result * 10 + digit;
            num /= 10;
        }

        System.out.println("Given Integer :- " + val);
        System.out.println("Reverse Integer:- " + (val >= 0 ? result : -result));
    }
}
