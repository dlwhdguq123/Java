import java.util.Scanner;
class Test{       
    public static void main(String[] args){           
        Scanner scan = new Scanner(System.in);           
        String n1 = scan.next();           
        int a = scan.nextInt();           
        String n2 = scan.next();           
        int b = scan.nextInt();           
        String n3 = scan.next();           
        int c = scan.nextInt();           
        
        String add = "";           
        //(n1 ȫ�浿49 a) (n2������78 b) (n3�豸96 c)           
        if(a<=100 && b<=100 && c<=100){                
                if(a>b && b>c){                
                System.out.println("1��" + n1 + a + "��");                
                System.out.println("2��" + n2 + b + "��");                
                System.out.println("3��" + n3 + c + "��");                
                }else if(b>a && a>c){                
                System.out.println("1��" + n2 + b + "��");                
                System.out.println("2��" + n1 + a + "��");                
                System.out.println("3��" + n3 + c + "��");                
                }else if(c>b && a>b){                
                System.out.println("1��" + n3 + c + "��");                
                System.out.println("2��" + n1 + a + "��");                
                System.out.println("3��" + n2 + b + "��");                
                }else{                
                System.out.println("�߸� �Է��ϼ̽��ϴ�.");           
             }        
            }
        }
        }