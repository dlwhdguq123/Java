 import java.util.Scanner;
       class Calc2{    
             public static void main(String[] args){      
             System.out.println("���� �ΰ��� �Է��Ͻʽÿ�.");
             Scanner scan = new Scanner(System);
             int a = scan.nextInt();
             String op = scan.next();
             int b = scan.nextInt();

             int add = 0;

             if(op.equals("+")){
                  add = a+b;
             }else if(op.equals("-")){
                  add = a-b; 
             }else if(op.equals("*")){
                   add= a*b;
             }else if(op.equals("/")){
                   add=a/b;
             }else if(op.equals("%")){
                   add=a%b;
             }else{
                   add=0;
             }
                  System.out.println(a+op+b+"="+add);
    }
}