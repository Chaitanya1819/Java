import java.util.Random;
public class randomvariable{
    public static void main (String [] args){
        Random random = new Random();
        int x = random.nextInt();
        // here random will generate - 2 billion to + 2 billion
        int w = random.nextInt(7);
        // if we use bound as 7 it will generate from 0 to 7 
        double y = random.nextDouble();
        //it will generate only from 0 to 1
        boolean z = random.nextBoolean();
        System.out.println("x is"+x);
        System.out.println("w is"+w);
        System.out.println("y is"+y);
        System.out.println("z is"+z);
    }
}