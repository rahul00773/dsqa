
package string;

/**
 * @author rahul.kumar
 * @version $Id: ReverseStringLeetCode.java, v 0.1 2020-02-25 23:57 rahul.kumar Exp $$
 */
public class ReverseVovelOfString {


public static void main(String[] args){


    ReverseVovelOfString reverseVovelOfString = new ReverseVovelOfString();
    System.out.println(reverseVovelOfString.reverseVowels("hello"));

}

public String reverseVowels(String s) {
        
        
    char[] str = s.toCharArray(); 
     
     int i =0;
     int j = s.length()-1;
     
     
     while(i<j){
         
          if(!isVowel(str[i])){
             i++;
              continue; 
         }
         
          if(!isVowel(str[j])){
             j--;continue; 
         }
         
        
             char temp = str[i];
             str[i] = str[j];
             str[j]= temp;
             j--;
             i++;
             
         
         
        
            
            
     }
     
String str2 = String.copyValueOf(str); 
     return str2;
 }
 
 public static boolean isVowel(char c) { 
     return (c == 'a' || c == 'A' || c == 'e'
             || c == 'E' || c == 'i' || c == 'I'
             || c == 'o' || c == 'O' || c == 'u'
             || c == 'U'); 
 } 

}