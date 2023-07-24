import java.util.*;
class currency{
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int amount=sc.nextInt();
        int hundred=amount/100;
        amount=amount%100;
        int fifty=amount/50;
        amount=amount%50;
        int twenty=amount/20;
        amount=amount%20;
        int ten=amount/10;
        amount=amount%10;
        int five=amount/5;
        amount=amount%5;
        int one=amount/1;
        amount=amount%1;

        System.out.println("no.of 100:"+hundred);
        System.out.println("no.of 50:"+fifty);
        System.out.println("no.of 20:"+twenty);
        System.out.println("no.of 10:"+ten);
        System.out.println("no.of 5:"+five);
        System.out.println("no.of 5:"+five);

    }
}