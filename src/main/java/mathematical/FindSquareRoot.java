package mathematical;

public class FindSquareRoot {

    public static void main(String[] args) {

        getSquareRoot(5);

    }
    public static void getSquareRoot(double n) {
        double i = 1;
        boolean found = false;
        while (!found) {
            if (i * i == n) {
                System.out.println(i);
                found = true;

            }

            else if (i * i > n) {

                double res = Square(n, i - 1, i);

                System.out.printf("%.5f",res);
                found = true;
            }

            i++;

        }

    }

    public static double Square(double n, double i, double j) {

        double mid = (i + j) / 2;
        double mul = mid * mid;

        if ((mul == n) || (Math.abs(mul - n) < 0.00001))
            return mid;

        else if (mul < n)
            return Square(n, mid, j);

        else
            return Square(n, i, mid);

    }

}