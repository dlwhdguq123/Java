import java.util.Scanner;
class Ssn{
    public static void main(String[] args){
    System.out.println("�ֹε�Ϲ�ȣ�� �Է��Ͻʽÿ�.");
    Scanner scan = new Scanner(System.in);
    String a = scan.next();
    
    //"1"."3";"2"."4"; "5"."6";
    String gender = "";
    char ch=a.charAt(7);

    if(ch=='1'||ch=='3'){
             gender= "����"; 
    }else if(ch=='2'||ch=='4'){
             gender= "����";
    }else if(ch=='5'||ch=='6'){
             gender= "�ܱ���";
    }else{
             gender= "�ٽ� �Է��ϼ���.";
    }
    System.out.println(gender);
}
}