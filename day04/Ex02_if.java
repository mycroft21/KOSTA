import java.util.*;
class Ex02_if{
public static void main(String[] args){

Scanner sc = new Scanner(System.in);
System.out.println("당신의 점수를 입력하세요:");
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

System.out.println("당신의 점수는 " + su +"점이고 학점은 " + gr + "를 획득하셨습니다.");


}// end main
}//end lass