package ex04.string;

public class StringBufferex02 {
	public static void main(String[] args) {

		
		StringBuffer sb = new StringBuffer("this");
		
		System.out.println(sb);
		
		sb.append(" is pencul"); //�ڷ� ���� ���ڿ� �߰�
		System.out.println(sb);
		
		sb.insert(7, " my");// �� ���̿� ���ڿ� �߰�
		System.out.println(System.identityHashCode(sb));
		System.out.println(sb);
		
		sb.replace(8, 11, "your "); //���ڿ� ����
		System.out.println(sb);
		
		sb.setLength(5);//���� ����
		System.out.println(sb);
		
		sb.setLength(10);
		System.out.println(sb);
	}
}
