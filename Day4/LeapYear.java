import java.util.Scanner;
class LeapYear{
    public static void main(String[] args) {
    System.out.println("������ �Է��Ͻʽÿ�.");    
    Scanner scan = new Scanner(System.in);
    int a = scan.nextInt();
    
    String aa = ""; 
    
    if((a%4==0 && a%100!=0) || a%400==0){
        aa = "����";         
    }else{
        aa = "���";
    }
    System.out.println(a+"��"+":"+aa);   
   
}
}