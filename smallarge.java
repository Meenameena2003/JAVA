import java.util.*;
class SmallLarge{
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        String str=sc.nextLine();
        int count=0;
        String word[]=str.split("\\s");
        int num[]=new int[word.length];
        for(int i=0;i<word.length;i++){
            count=word[i].length();
            num[i]=count;
        }
        Arrays.sort(num);
        System.out.print(Arrays.toString(num));
        for(int i=0;i<word.length;i++){
            if(num[0]==word[i].length()){
                System.out.print("\n"+word[i]+"\n");
            }
            else if(num[num.length-1]==word[i].length()){
                System.out.print(word[i]);
            }
        }

    }
}
/*
i am sleeping
[1, 2, 8]
i
sleeping
*/