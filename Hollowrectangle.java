import java.util.*;
public class Hollowrectangle{
    public static void main(String args []){
        System.out.println("ENTER A VALUE OF N ");
        Scanner sc= new Scanner(System.in);
        int n= sc.nextInt();
        System.out.println("ENTER A VALUE OF M");
        int m= sc.nextInt();
       
        //outer loop
        for(int i=1; i<=n; i++){
            for(int j=1; j<=m ;j++){
                if (i==1 || j==m || j==1 || i==n){
                    System.out.print("*");
                }else{
                    System.out.print( " ");
                }
            } 
            System.out.println();
        }sc.close();

    }
}
