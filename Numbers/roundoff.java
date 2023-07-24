import java.util.*;
class Roundoff{
public static void main(String[] args){
    Scanner sc=new Scanner(System.in);
    double d=sc.nextInt(); 
    float val=Math.round(val*100.0) / 100.0;
    System.out.print(val);

}
}