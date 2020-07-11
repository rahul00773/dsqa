package string;

public class Replace {

    public static void main(String[] args){
        System.out.println(replace("[Empty]","[Empty]"));
    }


    public static String replace(String a, String b) {


        String[] s= a.split(" ");
        String s2="";

        for(int i = 0 ; i<s.length-1; i++){

            s2=s2+s[i]+b;
        }

        return s2+s[s.length-1];
    }
}
