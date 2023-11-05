public class Zadaxa2 {
     public static int  Sum(int [] arr1) {

         int sum=0;
         for (int i = 0; i < arr1.length; i++) {
         sum+= arr1[i];
         }

         return sum;
     }
     public static String letters(String s){

         System.out.print(s);
         System.out.println();
       return s;
     }
     public static int Multip (int [][] arr2){

        int sum=0;
         for(int i=0; i< arr2.length;i++){
             for(int j=0; j< arr2[i].length; j++){
                sum=sum+ arr2[i][j];
             }
            System.out.println();
         }
         return sum;
     }
     public static float Number(float arr3D[][]){


         for (int i=0; i<arr3D.length; i++){
             for(int j=0; j<arr3D[i].length; j++){
                 System.out.print(arr3D[i][j]);
             }
             System.out.println();
         }
         return 0;
     }
}
