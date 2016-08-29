package day07_allay;
 
import java.util.Scanner;
 
class classEx08_method {
    static int input(int x) {
        Scanner sc = new Scanner(System.in);
 
        System.out.print("������ �Է��ϼ��� : ");
        x = sc.nextInt();
 
        return x;
    }
 
    static void process(int x, int y) {
        Scanner sc = new Scanner(System.in);
        double result = 0.0;
        int op = 0;
 
        tool();
        op = sc.nextInt();
 
        switch (op) {
        case 1:
            result = x + y;
            output2(result);
            break;
        case 2:
            result = x - y;
            output2(result);
            break;
        case 3:
            result = x * y;
            output2(result);
            break;
        case 4:
            try {
                result = (double) x / y;
                output1(result);
                break;
            } catch (Exception e) {
                System.out.println("0���δ� ���� �� �����ϴ�.");
                System.exit(0);
            }
        }
    }
 
    static void output1(double result) {
        System.out.printf("\n�������� : %.2f �Դϴ�.", result);
        
        exit();
    }
    
    static void output2(double result) {
        int result2 = (int)result;
        System.out.printf("\n�������� : " +result2 + " �Դϴ�.");
        
        exit();
    }
 
    static void tool() {
 
        System.out.println("�ѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤ�");
        System.out.println("        ��Ģ������ �Է��ϼ���");
        System.out.println("1. ���� | 2. ���� | 3. ���� | 4. ������");
        System.out.println("�ѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤ�");
    }
    
    static void exit(){
        Scanner sc = new Scanner(System.in);
        System.out.print("\n\n\n������ ��� �Ͻðڽ��ϱ�?(y/n) : ");
        char op = sc.next().charAt(0);
        
        System.out.println("\n");
        
        if(op == 'n' || op == 'N') {
            System.out.println("���α׷��� ����˴ϴ�.");
            System.exit(0);
        }
        else if(op == 'y' || op == 'Y') {
            
        }else {
            System.out.println("�ٸ� ���ڰ� �ԷµǾ� ���α׷��� ����˴ϴ�.");
            System.exit(0);
        }
        
        
        
    }
 
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num1 = 0, num2 = 0;
        int n = 0;
        double result = 0;
 
        while(true){
            num1 = input(num1);
            num2 = input(num2);
 
            process(num1, num2);
        }
        
 
    }
}