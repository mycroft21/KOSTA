package Exam;

public class Test2 {

    public static void main(String[] args) {
        // 1~5000 ����
        // generator �� ������ �� ���� �迭�� ����
        // ���� 1~5000�� ��ġ���� �ʴ� ���� ��󳽴�
        // int �� ���� ��� �Ҽ��� ���ϴ� ��꿡�� ���õǹǷ� int�� ���

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

        System.out.println("Self-Number�� �հ�� : " + sum);

    }
}