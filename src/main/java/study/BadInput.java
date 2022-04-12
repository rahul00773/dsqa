package study;

public class BadInput {
    

    public static void main(String[] args) {
        
        System.out.println(firstBadVersion(5));

    }

    public static boolean isBadVersion(int n){

        if(n==4)
            return true;

    return false;
    }


    public static int firstBadVersion(int n) {
        int output=0;
        for (int i=n;i>=1; i--){
            if(isBadVersion(i))
            {
               output=  i+1;
            }
        }
        return output;   
    }
}
