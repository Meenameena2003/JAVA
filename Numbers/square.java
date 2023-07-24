import java.util.*;
import java.math.*;

class main{
    public static void main(String[] args)
    {
        int base=3;
        int power=3;
        square(power,base);

    }
    static void square(int power,int base){
         int pow=(int)Math.pow(base,power);
        System.out.println(pow);
    }
}