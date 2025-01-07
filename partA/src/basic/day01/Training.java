package basic.day01;

public class Training {

    public static void main(String[] args) {
    
        int mone = 500000;   
        int rateWo = 1450;
        int result = wonToDollar(mone,rateWo);
        System.out.println(result);
    }
public static int wonToDollar(int mon , int rate){
            
    return mon / rate;
}
}