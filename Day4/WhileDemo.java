import java.util.Scanner;
import java.util.Random;
class WhileDemo{
    public static void main(String[] args){
    System.out.print("1���� 10���� ���");
    Scanner scan = new Scanner(System.in);
    Random random = new Random();
    int limit = random.nextInt(11)+1;
    System.out.println("������:"+limit);
    int count = 1;
    String a = "";
    int sum=0;
    while(count <= limit){        
    
        if(count != limit){
                a += count+"+";
                sum +=count;
        }else{
                a += count+"=";
                sum +=count;    
        }
        System.out.println("sum�� ��ȭ:"+"="+sum);
        count ++;
    }
    System.out.println(a+sum);
}
}
