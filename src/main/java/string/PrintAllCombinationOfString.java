package string;

public class PrintAllCombinationOfString {

    public static void main(String[] args){


        String s ="avc";

        PrintAllCombinationOfString permutation = new PrintAllCombinationOfString();
        permutation.printAllPossibleCom(s,0,s.length()-1);

    }

    public void printAllPossibleCom(String s ,int l, int r){

     if(l==r){

         System.out.println(s);
     }

     else {


         for(int i=l; i<=r; i++){


             s= swap(s,l,i);
             printAllPossibleCom(s,l+1,r);
             s=swap(s,l,i);

         }
     }




    }

    public String swap(String a, int i, int j){

        char temp;
        char[] charArray = a.toCharArray();
        temp = charArray[i] ;
        charArray[i] = charArray[j];
        charArray[j] = temp;
        return String.valueOf(charArray);
    }
}
