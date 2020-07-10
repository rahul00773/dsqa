package string;

public class Unique2 {

    public static void main(String[] args){


        allCharactersAreUnique("[Empty]");
    }


    public static boolean allCharactersAreUnique(String str){

        if(str==null || str.length()==1)
            return true;


        boolean[] checker_Arr = new boolean[256];

        for(int i=0; i<str.length(); i++){
            int position = str.charAt(i);

            if(checker_Arr[position])
                return false;

            checker_Arr[position]=true;
        }

        return true;
    }
}
