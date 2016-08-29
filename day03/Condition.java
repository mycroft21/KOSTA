class Condition 
{
	public static void main(String[] args) 
	{

	String str = "";
	int x = 3;
	str = (x==3)?"1":"2";

	System.out.println(str);

		int a=3,b=4,c=10;
		int result = 0;

		result = (a>b)?a:b;
			System.out.println(result);

			result = (a>b)?a:(b>c)?b:c;

			System.out.println(result);
	}
}
