import java.util.Scanner;
public class userinput{
    /**
     * @param args
     */
    public static void main(String[] args) {
        String a;
        Scanner scanner = new Scanner(System.in);
        System.out.println("Please enter your name?");
        a = scanner.nextLine();
        System.out.println("Enter your age");
        int b = scanner.nextInt();
        scanner.nextLine();
        System.out.println("what is your fav food");
        String c = scanner.nextLine();
        System.out.println("enter your favourite subject :");
        String d = scanner.nextLine();
        System.out.println("Hello"+ a);
        System.out.println("You are " + b +"yearsold");
        System.out.println("you like "+ c);
        System.out.println("your favorite subject is "+d);
    }
}