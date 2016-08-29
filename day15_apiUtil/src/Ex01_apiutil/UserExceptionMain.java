package Ex01_apiutil;

public class UserExceptionMain {

	public void method(String[] s)throws UserException{
		System.out.println("TEST of userExcep");
		if(s.length<1)	{
			throw new UserException("아무도없어");
				}
		else{
			throw new UserException("최종");
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
