package array;

public class SumOfConsecutive {

    public static void main(String[] args) {

        System.out.println(getCount(10));
    }

    public static int getCount(int num) {

        int ans = 0;
        if (num == 0 || num == 1) {

            return 1;
        }

        int x = 0;
        if (num % 2 != 0) {
            x = num / 2 + 1;
        } else {
            x = num / 2;
        }

        while (x > 1) {

             int sum = x;
            int y = x;
            while (num > sum) {
                sum += y - 1;
                y--;
                if (y < 0) {
                    break;
                }

            }

            if (sum == num) {
                ans = ans + 1;
            }
            x--;

        }

        return ans;

    }

    public static int getSum(int x, int n) {

        return x + n;

    }

}