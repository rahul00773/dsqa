package Integer;

public class PowerOfFour {

    public static boolean isPowerOfFour(int num) {
        if(num==0)
        return false;
        if(num==1)
        return true;
    
     int initial=4;
    for(int i=0;i<15;i++){
        if((num^initial)==0)
            return true;
        initial=initial<<2;
        //System.out.println(initial);

    }
    return false;
    }


    public static void main(String[] args){
        System.out.println(isPowerOfFour(1162261466));

    }
    
}