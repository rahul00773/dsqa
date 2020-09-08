package string;

public class ReverseStringAndPreserveSpace {


    public static void main(String[] args){


        printReverseString("Hello how are you?");
        


    }


    public static void printReverseString(String s){

        int stringLength = s.length();

        Character[] arr = new Character[stringLength];


        for (int i =0; i<stringLength; i++){

                if(s.charAt(i)==' '){

                    arr[i]=' '; 
                }

        }


        int k =0;
        for(int j=stringLength-1; j>=0; j--){

            
            if(s.charAt(j)!=' '){
                if(arr[k]!=null){
                    k++;
                }
                
                arr[k]=s.charAt(j);
                k++;
                

            }

    
        }

        for(int m =0; m<arr.length; m++){
            System.out.print(arr[m]);
        }

    }
    
}