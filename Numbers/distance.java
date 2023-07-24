import java.util.*;
class user{
    public static void main (String[] args)
    {
        long day=1000;
        long distance;
        long sec;
        long light=186000;

        

        
        sec=day*24*60*60;
        distance=sec*light;
        
        System.out.println(+distance);
    }
}