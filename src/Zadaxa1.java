public class Zadaxa1 {
    public static void arrayMatrix(int matrix1[][] ) {


       for(int i=0; i<matrix1.length; i++){
           for(int j=0; j< matrix1[i].length; j++){
               System.out.print(matrix1[i][j]);
           }
           System.out.println();
       }
    }
    public static void matrixNumber(int matrix2[][]){

        for(int i=0; i< matrix2.length; i++){
            for(int j=0; j< matrix2[i].length; j++){
                System.out.print(matrix2[i][j]);
            }
            System.out.println();
        }
    }

   public static void Plus(int matrix1[][]){

      int sum=0;
       for(int i=0; i<matrix1.length; i++){
           for(int j=0; j< matrix1[i].length; j++){
             sum+= matrix1.length + sum;
             System.out.print(sum);
           }
           System.out.println();
       }
   }
    public static void Plus2( int matrix2[][]){
        int sum=0;
        for(int i=0; i<matrix2.length; i++){
            for(int j=0; j< matrix2[i].length; j++){
                sum+= sum + matrix2.length;
                System.out.print(sum);
            }
            System.out.println();
        }
    }
   public static void Mult( int matrix1[][]){
       int sum=0;
       for(int i=0; i<matrix1.length; i++){
            for(int j=0; j< matrix1[i].length; j++){
                sum=matrix1.length * sum;
                System.out.print(sum);
            }
            System.out.println();
        }

   }
    public static void Mult2(int matrix2[][] ){
        int sum=1;
        for(int i=0; i<matrix2.length; i++){
            for(int j=0; j< matrix2[i].length; j++){
                sum=sum * matrix2.length;
                System.out.print(sum);
            }
            System.out.println();
        }
    }
   public static void scalarMilt( int  matrix1[][]){
    int sum=0;
       int s=1;
       for(int i=0; i<matrix1.length; i++){
           for(int j=0; j< matrix1[i].length; j++){
              sum=matrix1[i].length*s;

            System.out.print(sum);
           }
           System.out.println();
       }
   }
   public static void scalarMilt2(int matrix2[][]){
        int sum=0;
        int s=1;
       for(int i=0; i<matrix2.length; i++){
           for(int j=0; j< matrix2[i].length; j++){
               sum=matrix2.length*s;

               System.out.print(sum);
           }
           System.out.println();
       }
   }
   public static void matrixDeterminant( int  matrix1[][]) {
       int determinant = 1;
       for (int i = 0; i < matrix1.length; i++) {
           for (int j = 0; j < matrix1[i].length; j++) {
               determinant = determinant * matrix1[j].length;
               System.out.print(determinant);

           }
       }
   }
    public static void matrixDeterminant2(int matrix2[][]){
        int determinant = 1;
        for (int i = 0; i < matrix2.length; i++) {
            determinant = determinant * matrix2[i].length;
            for (int j = 0; j < matrix2[i].length; j++) {
                determinant = determinant * matrix2[j].length;
                System.out.print(determinant);

            }
        }
    }
}


