import java.util.*;
class CountVowels{
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int vcount=0;
        int ccount=0;
        String str=sc.nextLine();
        char c[]=str.toCharArray();
        for(int i=0;i<c.length;i++){
            if((c[i]=='a'|| c[i]=='e'|| c[i]=='i'|| c[i]=='o'|| c[i]=='u') || (c[i]=='A'|| c[i]=='E'|| c[i]=='I'|| c[i]=='O'|| c[i]=='U')){
                vcount++;
            }
            else {
                ccount++;
            }
        }
        System.out.print("Vowels:"+vcount);
        System.out.print("\nConsonents:"+ccount);
    }
}
/*
Aeioussss
Vowels:5
Consonents:4
*/