import java.util.Scanner;
	class avr{
	public static void main(String[]   args){
	System.out.println("�̸��� �����Դϱ�?");
	Scanner scan= new Scanner(System.in);
	String num1=scan.next(); 
	
	System.out.println("����,����,����,����,��ȸ ���� ������ �Է����ּ���.");
 	String sub1 = scan.next();
	String sub2 = scan.next();
	String sub3 = scan.next();
	String sub4 = scan.next();
	String sub5 = scan.next();
	
	int a = Integer.parseInt(sub1);
	int b = Integer.parseInt(sub2);
	int c = Integer.parseInt(sub3);
	int d = Integer.parseInt(sub4);
	int e = Integer.parseInt(sub5);
	
	int avr = a+b+c+d+e;
	int avr1 = avr/5 ;
	
	if(avr1>=90){
	System.out.println(num1 + "����" + avr +"���"+ avr1 + "���� A����.");	
	} else if(avr1>=80){
	System.out.println(num1 + "����" + avr +"���"+ avr1 + "���� B����.");	
	}  else if(avr1>=70){
	System.out.println(num1 + "����" + avr +"���"+ avr1 + "���� C����.");	
	} else if(avr1>=60){
	System.out.println(num1 + "����" + avr +"���"+ avr1 + "���� D����.");	
	} else {
	System.out.println(num1 + "����" + avr +"���"+ avr1 + "���� F����.");	
	}
     }
}