public class WindowSeat {


    public static void main(String[] args) {


        int x = 6;

        int max = 15;
        System.out.println(getSeat(x));


    }

    public static char getSeat(int num) {

        if (num <= 0 || num > 120) {
            return '0';
        }

        int output = num % 6;

        if (output == 1 || output == 0) {

            return 'w';
        } else if (output == '2' || output == '5') {
            return 'm';
        } else {
            return 'l';
        }


    }
}
