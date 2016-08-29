package Exam;

public class Test2 {

    public static void main(String[] args) {
        // 1~5000 까지
        // generator 로 돌려서 각 값을 배열에 저장
        // 그중 1~5000과 일치하지 않는 수를 골라낸다
        // int 를 나눌 경우 소수점 이하는 계산에서 무시되므로 int를 사용

        Integer a,b,c,d,result,sum=0;

        boolean[] generated = new boolean[5000];

        for(int generator=1; generator<5000;generator++){
            a = generator/1000;
            b = (generator/100)%10;
            c = (generator/10)%10;
            d = generator%10;

            result = a+b+c+d+generator;

            if((result>=1)&&(result<5000)){
                generated[result] = true;
            }
        }

        for(int i=1; i<5000; i++){
            if(generated[i]==false){
                sum = sum + i;
            }
        }

        System.out.println("Self-Number의 합계는 : " + sum);

    }
}