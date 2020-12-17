package string;

public class TestMethod {

    public static void main(String args[]) {

        String s = "?1";

        System.out.println(change(s));


    }

    public static String change(String s) {


        char[] sr = s.toCharArray();

        int LastServedIndex = Integer.MAX_VALUE;
        for (int i = 0; i < sr.length; i++) {

            char[] num = {'1', '2', '3'};

            if (sr[i] == '?') {

                if (LastServedIndex == i - 1) {
                    if (sr[i - 1] == num[0]) {
                        sr[i] = num[1];
                        LastServedIndex = i;

                    } else if (sr[i - 1] == num[1]) {
                        sr[i] = num[0];
                        LastServedIndex = i;

                    } else {
                        sr[i] = num[2];
                        LastServedIndex = i;


                    }
                } else {

                    if(i!=0){
                    if (sr[i - 1] == '1') {
                        sr[i] = num[1];
                        LastServedIndex = i;

                    } else {
                        sr[i] = num[0];
                        LastServedIndex = i;

                    }
                    }

                    else{

                        sr[i] = num[0];
                        LastServedIndex = i;
                    }


                }
            }


        }//f(id+1,sum,dp,a)|f(id+2,sum-a[id],dp,a)
        return String.valueOf(sr);
    }
}