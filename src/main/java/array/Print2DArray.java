package array;

public class Print2DArray {
    
    public static void main(String[] args){

        int[][] num2 = {{5,6,7},{7,8,9}};

        for(int i=0; i<num2.length; i++){

            for(int j=0; j<num2.length; j++){

                System.out.print(num2[i][j]+" ");
            }
            System.out.println();
        }

    }
}