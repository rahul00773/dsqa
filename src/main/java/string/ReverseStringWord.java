package string;

public class ReverseStringWord {

    public static void main(String[] args){


        String s = "my name is rahul";

        String[] sa = s.split(" ");

        for(int i= sa.length-1; i>=0; i--){


            System.out.print(sa[i]+" ");
           
        }
       
    }
    
}
