import java.util.Scanner;

public class Zadaxa4 {
    static void Triangle(int n) {

       for(int i=0; i<n; i++){
           for(int j=0; j<n-i-1; j++){
               System.out.print(" ");
           }
           for(int r=0; r<i*2+1; r++){
               System.out.print(7);


           }
           System.out.println();
       }
    }
}
