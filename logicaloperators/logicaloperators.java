package logicaloperators;

// package logicaloperators;

public class logicaloperators {
    public static void main(String [] args){
        int temp = 25;
        if(temp>30){
            System.out.println("It is hot outside");
        }
        else if(temp >= 20 && temp <=30){
            System.out.println("It is warm outside");
        }
        // forand both conditions must true

        else{
            System.out.println("It is cold outside");
        }

    }
    
}
