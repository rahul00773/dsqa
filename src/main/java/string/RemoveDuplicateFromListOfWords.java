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
        //{"Hi", "Hello", "Hey", "Hi", "Hello", "Hey"}

        removeDuplicates(list);
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
