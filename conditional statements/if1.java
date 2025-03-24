// package conditional statements;

public class if1 {
    public static void main(String[] args){
        int a = 16;
        if(a>= 18){
            System.out.println(" you are adult since you have "+a+" years");
        }
        else if (a >=75)
        {
            System.out.println("You are a old one");
        }
        else if (a >= 13 & a<18)
    {
        System.out.println("you are a teenager");
    }
        else{
            System.out.println("you are not adult");
        }

    }
    
}
