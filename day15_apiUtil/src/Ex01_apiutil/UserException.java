package Ex01_apiutil;

public class UserException extends Exception {
	private int port = 7;
	
	public UserException(String msg) {
		super(msg);
		this.port = port;
	}
	
	public int getPort(){
		return port;
	}
}
