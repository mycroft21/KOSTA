import java.util.*;
class Ex02_if{
public static void main(String[] args){

Scanner sc = new Scanner(System.in);
System.out.println("����� ������ �Է��ϼ���:");
int su = sc.nextInt();
String gr = "";

if (100 >= su && 90 <= su)
{ gr = "A";
} else if (90 > su && su > 79)
{ gr = "B";
} else if (80 > su && su > 69)
{ gr = "C";
} else if (70 > su && su > 59)
{ gr = "D";
} else { gr = "F";}

System.out.println("����� ������ " + su +"���̰� ������ " + gr + "�� ȹ���ϼ̽��ϴ�.");


}// end main
}//end lass