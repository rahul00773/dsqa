package string;

public class CountExcelCoulmn {
    
    public static void main(String[] args){

          titleToNumber("AB");
        
        
    }

    public static int titleToNumber(String s) {
        
        int returnValue=0;
        for(char ch:s.toCharArray()){
            returnValue=returnValue*26+(ch-'A'+1);
        }
        return returnValue;
        
    }
}