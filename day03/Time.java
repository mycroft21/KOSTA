class  Time
{
	public static void main(String[] args) 
	{
		int su = 12345;

		int hour, min, sec;

		hour = su / 3600;

		min = (su % 3600) / 60;

		sec = (su % 60);

		System.out.println(hour + "�ð� \t" + min + "�� \t" + sec + "��");

		System.out.println((su/3600) + " :" + ((su%3600)/60) +" :" + ((su%3600)%60) + "."); 
		
	}//endmain
}//endclass
