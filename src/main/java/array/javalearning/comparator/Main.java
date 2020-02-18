
package array.javalearning.comparator;

import java.util.ArrayList;
import java.util.Collections;

/**
 * @author rahul.kumar
 * @version $Id: Main.java, v 0.1 2020-02-19 00:47 rahul.kumar Exp $$
 */
public class Main {

    public static void main(String[] args){

        ArrayList<Student> std = new ArrayList<>();

        std.add(new Student(111,"rahul","Noida"));
        std.add(new Student(121,"mohit","Kanina"));
        std.add(new Student(131,"hitarth","noida"));

        System.out.println("Unsorted");

        for(int i =0; i<std.size(); i++){

            System.out.println(std.get(i));
        }


        System.out.println("Sort By Roll Number");
        Collections.sort(std,new SortByRoll());
        for(int i =0; i<std.size(); i++){

            System.out.println(std.get(i));
        }


        System.out.println("Sort by name");
        Collections.sort(std,new SortByName());

        for(int i =0; i<std.size(); i++){

            System.out.println(std.get(i));
        }
    }
}