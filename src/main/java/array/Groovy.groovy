package array

import org.testng.annotations.Test

class Groovy {
    def main(){
        int[] arr = new int[4];
        arr[0]=1;
        println arr[0];
    }
    @Test
    public void test(){

        main();
    }
}
