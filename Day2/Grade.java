import java.util.Scanner;
class Grade{
	public static void main(String[] args){
	System.out.println("학생 이름을 입력하시오.");
	Scanner scan = new Scanner(System.in);
	String name = scan.next();
 	

	System.out.println("국,영,수,사,과");

	String sub1= scan.next();
	String sub2= scan.next();
	String sub3= scan.next();
	String sub4= scan.next();
	String sub5= scan.next();

	int a = Integer.parseInt(sub1);
	int b = Integer.parseInt(sub2);
	int c = Integer.parseInt(sub3);
	int d = Integer.parseInt(sub4);
	int e = Integer.parseInt(sub5);

	
	int avr = a+b+c+d+e;
	int avr2 = avr/5;

	if(avr2>=90){
		System.out.println(name + "총점" + avr + "점"+ "평균" + avr2 + "점" + "성적 A 학점");
	}else if(avr2>=80){
 		System.out.println(name + "총점" + avr + "점"+ "평균" + avr2 + "점" + "성적 B 학점");
	}else if(avr2>=70){
		System.out.println(name + "총점" + avr + "점"+ "평균" + avr2 + "점" + "성적 C 학점");
	}else if(avr2>=60){
		System.out.println(name + "총점" + avr + "점"+ "평균" + avr2 + "점" + "성적 E 학점");
	}else{
		System.out.println(name + "총점" + avr + "점"+ "평균" + avr2 + "점" + "성적 F 학점");
}
}
}