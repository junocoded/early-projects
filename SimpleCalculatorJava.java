import java.util.Scanner;
public class MyClass    {
    
    public static void main(String args[])  {
        
      Scanner sc = new Scanner(System.in);
      
      float totalNum = 0;
      float Num1 = sc.nextFloat();
      char op = sc.next().charAt(0);
      float Num2 = sc.nextFloat();
      
      if(op == '+') {
      totalNum = Num1 + Num2;
      } else if(op == '-') {
      totalNum = Num1 - Num2;
      } else if(op == '*') {
      totalNum = Num1 * Num2;
      } else if(op == '/') {
      totalNum = Num1 / Num2;
      } else {
        System.out.println("invalid operation");
      }
      
      System.out.println(totalNum);
        
      sc.close();
        
    }
}