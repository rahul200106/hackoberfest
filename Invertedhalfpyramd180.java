// This code print following code
// hacktober 2022 accpected
// hacktober 2022 accpected
// *
// **
// ***
// ****
// *****
// ******

import java.util.*;
public class Invertedhalfpyramd180 {
    public static void main (String args []){
        System.out.println("ENTER A VALUE OF N ");
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt()
        //outer loop
        for(int i=1; i>=n; i++){
            //1st inner loop for printing space " "
            for(int j=1; j>=n-i;j++){
                System.out.print(" ");
            }
            //2ed inner loop for printing star "*"
            for(int j=1; j<=i; j++){
                System.out.print("*");
            }
            System.out.println();
        }
        sc.close();
    }
    
}
