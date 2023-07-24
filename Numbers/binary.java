import java.util.*;
class Main {
   public static void main(String[] args) {
    int decimal = 31;
    convert(decimal);
  }
  
    public static void convert(int decimal){
        String binary = Integer.toBinaryString(decimal);
        System.out.println(binary);
    }
}