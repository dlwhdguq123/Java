import java.util.Scanner;
class Bmi{
        public static void main(String[] args) {
        System.out.println("������=");
        Scanner scan = new Scanner(System.in);
        Double w = scan.nextDouble();
        
        System.out.println("Ű");
        Double t = scan.nextDouble();

        String a = "";
        t = t/100;
        t = t*t;
        Double bmi = w/t;

        if(bmi>=40){
                a= "����";
        }else if(bmi>=35){
                a= "�ߵ��";
        }else if(bmi>=30){
                a= "�浵��";
        }else if(bmi>=25){
                a= "��ü��";
        }else if(bmi>=18.5){
                a= "����";
        }else{
                a= "��ü��";
        }
        System.out.println("Bmi =" + bmi);
        System.out.println(a);
}
}