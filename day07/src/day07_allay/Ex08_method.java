package day07_allay;
 
import java.util.Scanner;
 
class classEx08_method {
    static int input(int x) {
        Scanner sc = new Scanner(System.in);
 
        System.out.print("정수를 입력하세요 : ");
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
                System.out.println("0으로는 나눌 수 없습니다.");
                System.exit(0);
            }
        }
    }
 
    static void output1(double result) {
        System.out.printf("\n연산결과는 : %.2f 입니다.", result);
        
        exit();
    }
    
    static void output2(double result) {
        int result2 = (int)result;
        System.out.printf("\n연산결과는 : " +result2 + " 입니다.");
        
        exit();
    }
 
    static void tool() {
 
        System.out.println("ㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡ");
        System.out.println("        사칙연산을 입력하세요");
        System.out.println("1. 덧셈 | 2. 뺄셈 | 3. 곱셈 | 4. 나눗셈");
        System.out.println("ㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡ");
    }
    
    static void exit(){
        Scanner sc = new Scanner(System.in);
        System.out.print("\n\n\n연산을 계속 하시겠습니까?(y/n) : ");
        char op = sc.next().charAt(0);
        
        System.out.println("\n");
        
        if(op == 'n' || op == 'N') {
            System.out.println("프로그램이 종료됩니다.");
            System.exit(0);
        }
        else if(op == 'y' || op == 'Y') {
            
        }else {
            System.out.println("다른 문자가 입력되어 프로그램이 종료됩니다.");
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