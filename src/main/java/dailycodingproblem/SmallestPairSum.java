package dailycodingproblem;

public class SmallestPairSum {

    public static void main(String[] args){

        int[] arr = {2,1,0};

        int product = solve(arr);
        System.out.println(product);

    }

    public static int solve(int[] a) {
        // Write your code here
        int n = a.length;
     
int temp=0;
        for(int i =0; i<n; i++){

temp=temp+a[i];
            
        }
        if(temp==0)
        return 0;
        int min =  Integer.MAX_VALUE, secondMin =  Integer.MAX_VALUE; 
        for (int j = 0; j < n; j++)  
        { 
      
            // If found new minimum 
            if (a[j] < min) 
            { 
      
                // Minimum now becomes second minimum 
                secondMin = min; 
      
                // Update minimum 
                min = a[j]; 
            } 
      
            // If current element is > min and < secondMin 
            else if ((a[j] < secondMin) && a[j] != min) 
      
                // Update secondMin 
                secondMin = a[j]; 
        } 
      
        // Return the sum of the minimum pair 
        return (secondMin + min); 
    }
    
}