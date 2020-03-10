
package recursion;

/**
 * @author rahul.kumar
 * @version $Id: Fibonici.java, v 0.1 2020-03-08 23:15 rahul.kumar Exp $$
 */
public class Fibonici {

    static int x=0;

    public static void main(String[] args){

Fibonici fibonici = new Fibonici();
        System.out.println(fibonici.fib(2));
    }


    public int fib(int N) {

        int i=0; int j =1;

        while(N<=1){

           return 1;
        }

        x= i+fib(N-1);
        return x;
    }
}