import java.util.Scanner;
class Bmi{
	public static void main(String[] args){
		Scanner scan = new Scanner(System.in);
		System.out.println("������:");
		String w = scan.next();
		double a = Double.parseDouble(w); 
	
		System.out.println("Ű:");
		String t = scan.next();
		double b = Double.parseDouble(t); 
		
		double bmi1=0.0;
		b = b / 100;             //      cm -> m
		double c= b * b;
		bmi1=a/c;
	
		if(bmi1 >= 40){             
		 	System.out.println("�� ��");
			System.out.println("Bmi:" + bmi1 );       
		}else if(bmi1 >= 35){            			
			System.out.println("�ߵ ��"); 
			System.out.println("Bmi:" + bmi1 );    
   		}else if(bmi1 >= 30){          			  	
			System.out.println("�浵 ��"); 
			System.out.println("Bmi:" + bmi1 );     
  		}else if(bmi1 >= 25){            			
			System.out.println("��ü��"); 
			System.out.println("Bmi:" + bmi1 );    
   		}else if(bmi1 >=18.5) {          			
			System.out.println("����");
			System.out.println("Bmi:" + bmi1 );
		}else{
			System.out.println("Bmi:" + bmi1 );
			System.out.println("��ü��");	
		}      

	}
}