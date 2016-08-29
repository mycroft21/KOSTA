package ex01.instance;

class InstanceMethod {
	public static void main(String[] args) {
		System.out.println("main");
		
			MethodClass2 see = new MethodClass2();
			
			see.show();
			int[] arr = new int[30];
			int x = 1;
			for(x =1; x < arr.length; x++){
				arr[x] = arr[x-1] + 5;
				System.out.println(arr[x]);
			}
			
	}
}

	class MethodClass1{
		
		public static void view(){
			System.out.println("view");
		}
	}
	
	class MethodClass2{
		
		public void show(){
			System.out.println("shwo");
			System.out.println("인스턴트 메소드.");
		}
		
		
		
		
	}


