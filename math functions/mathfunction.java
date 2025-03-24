import java.util.Scanner;

public class mathfunction {
    public static void main(String [] args){
        double x = 3.14;
        double y = -10;
        double z = Math.max(x, y);
        System.out.println("Larger number is  ="+z);
        double v = Math.min(x, y);
        System.out.println("smallest number is ="+v);
        double w = Math.abs(x);
        System.out.println("absolute number is"+w);
        double opp,adj,hyp;
        Scanner scanner = new Scanner(System.in); 
        System.out.println("Enter Opposite side:");
        opp = scanner.nextDouble();
        System.out.println("Enter Adjacent side:");
        adj = scanner.nextDouble();
        hyp = Math.sqrt((opp*opp)+(adj*adj));
        System.out.println("Hypotenuse of given rt trianle is "+hyp);
        scanner.close();

    }    
    
    
}
