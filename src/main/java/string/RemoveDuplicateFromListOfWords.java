package string;

import java.util.ArrayList;
import java.util.List;
import java.util.TreeSet;

public class RemoveDuplicateFromListOfWords {

    public static void main(String[] args){

List<String> list = new ArrayList<>();

list.add("Hi");
list.add("Hello");
list.add("Hey");
        list.add("Hi");
        list.add("Hello");
        list.add("Hey");
        list.add("name");
        //{"Hi", "Hello", "Hey", "Hi", "Hello", "Hey"}

       ArrayList<String> list1 = removeDuplicates(list);

        for (String s:
             list1) {
            System.out.println(s);

        }
}




    public static ArrayList<String> removeDuplicates(List<String> input) {

        TreeSet<String> str = new TreeSet();
        for(int i =0; i<input.size(); i++){
            if(!str.contains(input.get(i) ) ){
                str.add(input.get(i));
            }
        }


        ArrayList<String> list = new ArrayList<>();
        for(String s : str){
            list.add(s);
        }

        return list;

    }
}
