import java.util.Scanner;
class Exam{
	public static void main(String[]	 args){
	Scanner scan = new Scanner(System.in);
	System.out.println("�󸶿���?");
	String num1 = scan.next();
	int a = Integer.parseInt(num1);
	System.out.println(a + "�� �Դϴ�."); 	

	System.out.println("� �帱���?");
	String num2 = scan.next();
	int b = Integer.parseInt(num2);
	System.out.println(b+"�� �ּ���.");

	int add = 0;
	
	if(a>=1000){
		add=a*b/10*8;
	}else if(a>=500){
		add=a*b/10*9;
	}else{
		add=a*b;
	}	
		System.out.println("�� �ݾ���"+ add + "�Դϴ�.");
	
}	
}