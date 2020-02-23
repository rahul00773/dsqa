
package javadatastructure;

/**
 * @author rahul.kumar
 * @version $Id: Strudent.java, v 0.1 2020-02-23 23:33 rahul.kumar Exp $$
 */
public class Strudent implements Comparable<Strudent> {

    private int rank;
    private String name;

    Strudent(int a , String b){

        this.rank = a;

        this.name = b;
    }


    @Override
    public int compareTo(Strudent o) {
       if(rank<o.rank)
           return -1;

       else if(rank>o.rank)
           return 1;
       else
           return 0;
    }


    @Override
    public String toString() {

        String str = "Strudent Name ;" + name + ", rank:" + rank;
        return str;
    }
}