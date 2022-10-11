// This code print a rectangle box.
// y AXIS = length of rectangle box.
// x AXIS = width of rectangle box.
// hacktober 2022 accpected

// code look iike this.
// hacktober 2022 accpected
// whan y AXIS is 4 and x AXIS 5.
// ******
// ******
// ******
// ******

import java.util.*;
public class Rectangle{
    public static void main (String args []){
        System.out.println("ENTER y AXIS VALUE");
        Scanner sc = new Scanner(System.in); 
        int n = sc.nextInt();
        System.out.println("ENTER x AXIS VALUE");
        int m = sc.nextInt();
        for(int i=1; i<=n;i++){
            for(int j=1; j<=m;j++){
            System.out.print("*");
        }
        System.out.println();
    }sc.close();
}
}
