package Ex01_apiutil;

public class UserExceptionMain {

	public void method(String[] s)throws UserException{
		System.out.println("TEST of userExcep");
		if(s.length<1)	{
			throw new UserException("�ƹ�������");
				}
		else{
			throw new UserException("����");
		}
	}
	
	
	
	public static void main(String[] args) {
		UserExceptionMain user = new UserExceptionMain();
		try{
			user.method(args);
		}catch(Exception e){
			e.printStackTrace();
		}
	}

}
