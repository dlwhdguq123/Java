import java.util.Scanner;
class Exam{		
  	 public static void main(String[]  args){
               System.out.println("�󸶿���?");
               Scanner scan=new Scanner(System.in);
               String num1= scan.next();
               int a = Integer.parseInt(num1);
               System.out.println(a +" �Դϴ�.");	
 

              System.out.println("� �帱���?");
              Scanner scan1=new Scanner(System.in);
	 String num2= scan1.next();
	 int b = Integer.parseInt(num2);
	 System.out.println(b +" ����.");
   	

	int add=0;
              if(a>=1000){
	  add=a*b;
	  add=add/100;
	  add=add*80;  
              }else if(a>=500){
               add=a*b;
	  add=add/100; 
	  add=add*90;
	}else{
	  add = a* b;
	} 
                System.out.println("�� �ݾ���" + add + "�Դϴ�.");
                 
      }
}	