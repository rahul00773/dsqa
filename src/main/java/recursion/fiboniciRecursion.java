package recursion;

public class fiboniciRecursion {

    public static void main(String[] args){

        System.out.println(getFib(8));
    }

    public static int getFib(int n){

        if (n==0)
            return 0;

        if(n==1)
            return 1;

        if(n==2){
            return 1;
        }

        return getFib(n-1)+getFib(n-2);
    }
}
