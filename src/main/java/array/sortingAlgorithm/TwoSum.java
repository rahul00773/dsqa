package array.sortingAlgorithm;

public class TwoSum {

    public static void main(String[] args){

        int[] arr ={2,7,11,15};
        int[] ar=twoSume(arr,9);
        System.out.println(ar[0]);
        System.out.println(ar[1]);
    }

    public static int[] twoSume(int[] ar,int targe){

        int i=0;
        int j = ar.length-1;
        int[] newar = new int[2];

        while (i<j){
            if(ar[i]+ar[j]>targe){
                j--;
            }

            else if(ar[i]+ar[j]<targe){
                i++;
            }

            else if(ar[i]+ar[j]==targe){

                newar[0]=i;
                newar[1]=j;
                i++;
                j--;
            }

            else {
                System.out.println("n valid");
            }
        }


        return newar;

    }
}
