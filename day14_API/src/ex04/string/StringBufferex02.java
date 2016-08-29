package ex04.string;

public class StringBufferex02 {
	public static void main(String[] args) {

		
		StringBuffer sb = new StringBuffer("this");
		
		System.out.println(sb);
		
		sb.append(" is pencul"); //자료 끝에 문자열 추가
		System.out.println(sb);
		
		sb.insert(7, " my");// 글 사이에 문자열 추가
		System.out.println(System.identityHashCode(sb));
		System.out.println(sb);
		
		sb.replace(8, 11, "your "); //문자열 변경
		System.out.println(sb);
		
		sb.setLength(5);//길이 조절
		System.out.println(sb);
		
		sb.setLength(10);
		System.out.println(sb);
	}
}
