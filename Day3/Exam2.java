import java.util.Scanner;
class Exam2{
	public static void main(String[] args){
	Scanner scan = new Scanner(System.in);
	System.out.println("�󸶿���?");
	String num = scan.next();
	int a = Integer.parseInt(num);
	System.out.println(a +"�� �Դϴ�.");

	System.out.println("� �帱���?");	
	String num1 = scan.next();
	int b = Integer.parseInt(num1);
	System.out.println(b+"�� �ּ���.");
	
	int add = 0;

	if(a>=1000){
		add= a*b/10*8;			        
	}else if(a>=500){
		add=a*b/10*9;
	}else {
		add=a*b;
	} 
	System.out.println("DC�ؼ� �� �ݾ���"+ add + "�� �Դϴ�.");


}
}