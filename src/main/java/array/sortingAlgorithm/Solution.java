package array.sortingAlgorithm;

class Solution {
    public void duplicateZeros(int[] arr) {

        int[] newArr = new int[arr.length+10];


        int j=0;

        for (int i =0; i<arr.length; i++){

            if(arr[i]==0){
                arr[j]=0;
                j++;
                newArr[j+1]=0;

            }

            else{
                newArr[j]=arr[i];

            }
        j++;
        }


        for(int k=0; k<arr.length;k++){
            arr[k]=newArr[k];
        }

    }

    public static void main(String[] args){

        int[] arr = {1,0,2,3,0,4,5,0};

        Solution solution  = new Solution();

        solution.duplicateZeros(arr);
    }
}