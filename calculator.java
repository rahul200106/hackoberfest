import java.util.*;
public class calculator{
    public static void main(String agrs[]){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter First Number : ");
        int a = sc.nextInt();
        System.out.print("Enter Second Number : "); 
        
        int b = sc.nextInt();
        
        System.out.printf("Select 1 For Addition : %n Select 2 For Subtraction : %n Select 3 For Multiplication : %n Select 4 For Division :");
      
        int botton = sc.nextInt();
        int d;

        switch (botton) {
            case 1 : d=a+b;
            System.out.println("Your Output is = "+d);
            break;
            case 2: d=a-b;
            System.out.println("Your Output is = "+d);
            break;
            case 3 : d=a*b;
            System.out.println("Your Output is = "+d);
            break;
            case 4 : d=a/b;
            System.out.println("Your Output is = "+d);
            break;
            default : System.out.println("Invalid button");
                
        }sc.close();
        

        }

    }
