package Integer;

public class AddDigits {

    public static void main(String[] args){
        addDigits(38);

    }

    public static  int addDigits(int num) {

        int x=0;
        String s= String.valueOf(x);
        if (num == 0) {
            return 0;
        }
        if (num % 9 == 0) {
            return 9;
        }
        return num%9;
    }
}
