package suju;

import java.io.DataOutputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.InputStream;
import java.io.OutputStream;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Scanner;

public class WareHouse {
	
	public static HashMap<Integer, Product> PRODUCT = new HashMap<>();
	public static HashMap<Integer, Cliunt> LIST = new HashMap<>();

	String pName, ts, ds;
	int wHouse, stock, temp3=1, temp2,temp=0;
	ArrayList<Integer> al = new ArrayList<>();
	Scanner sc = new Scanner(System.in);

	public WareHouse() throws FileNotFoundException {


		InputStream input = new FileInputStream("stock.txt");
		OutputStream output = new FileOutputStream("stcok.txt");
		
		

	}//conend

	void save() {

		

		for (int i = PRODUCT.size();; i++) {

			System.out.println("상품 이름을 입력합니다.");
			pName = sc.next();

			System.out.println("초기 재고를 기록합니다.");
			stock = sc.nextInt();

			System.out.println("물건이 저장될 창고를 선택합니다.\n1.수원\n2.의정부\n3.삼척\n4.비워둡니다.");
			wHouse = sc.nextInt();

			PRODUCT.put(i, new Product(pName, stock, wHouse));
			
			System.out.println("주문이 완료 됐습니다. 계속하시겠습니까?");
			System.out.println("1. 계속 \t 2. 종료");
			stock = sc.nextInt();
			if(stock!=1){System.out.println("see you!"); break;}
		}

	}//saveend

	public void buy() {
	up:do{	
	do{
		System.out.println("주문자를 입력해주세요!");
		ds = sc.nextLine();
		for(int i =0; i < LIST.size(); i++){
		LIST.get(i).CLname.equals(ds);
		temp3=i;	
		}
		
	}while(temp3!=1);
	
		System.out.println("주문할 상품을 선택해주세요!");
		ts = sc.nextLine();
		
		for(int i = 0; i < PRODUCT.size(); i++){
		if(	PRODUCT.get(i).pName.equals(ts)){
			temp += PRODUCT.get(i).stock;
			al.add(i);
			}
		}
		System.out.println("상품 " +ts+"의 재고량 : "+ temp);
		System.out.println("몇개나 주문 하시겠습니까?");
		temp2 = sc.nextInt();
		if(temp2<temp){ System.out.println("재고가 부족합니다."); break up;}
		
		else if(temp>temp2){
			for(int i = 0; i<al.size(); i++){
			if(temp<=PRODUCT.get(al.get(i)).stock){
				this.pName = PRODUCT.get(al.get(i)).pName;
				this.stock = PRODUCT.get(al.get(i)).stock;
				this.wHouse = PRODUCT.get(al.get(i)).wHouse;
				
				PRODUCT.put(al.get(i),new Product(pName, wHouse, stock-temp));
				break;
			}else if(temp>PRODUCT.get(al.get(i)).stock){
				this.pName = PRODUCT.get(al.get(i)).pName;
				this.stock = PRODUCT.get(al.get(i)).stock;
				this.wHouse = PRODUCT.get(al.get(i)).wHouse;
				
				PRODUCT.put(al.get(i),new Product(pName, wHouse, 0));
				temp = temp-stock;
			}
		}
			
		}
		System.out.println("주문이 완료 됐습니다. 계속하시겠습니까?");
		System.out.println("1. 계속 \t 2. 종료");
		stock = sc.nextInt();
		if(stock!=1){System.out.println("see you!"); break up;}
	}while(true);
	}//bueend

	public void show() {

		System.out.println("죄회할 창고를 선택해 주세요!\n1.수원\n2.의정부\n3.삼척\n4.모든 물품 조회");
		
		temp = sc.nextInt();
		
		if(temp==1){
			for(int i = 0; i< PRODUCT.size(); i++){
			if(PRODUCT.get(i).wHouse==1){
				System.out.println(PRODUCT.get(i));
			}
			}
		}else if(temp==2){
			for(int i = 0; i< PRODUCT.size(); i++){
				if(PRODUCT.get(i).wHouse==2){
					System.out.println(PRODUCT.get(i));
				}}
			
		}else if(temp==3){
			for(int i = 0; i< PRODUCT.size(); i++){
				if(PRODUCT.get(i).wHouse==3){
					System.out.println(PRODUCT.get(i));
				}}
			
			
		}else if(temp==4){
			for(int i = 0; i< PRODUCT.size(); i++){				
					System.out.println(PRODUCT.get(i));
				}}
			
			
		}//show end
		
/*	InputStream input = new FileInputStream("restore.txt");
	OutputStream output = new FileOutputStream("join.txt");
	
	byte[] buffer = new byte[1024 * 8];  
	long start = System.currentTimeMillis(); 
	
	while (true) {
		int inputData = input.read(buffer);
		if (inputData == -1) break;
		output.write(buffer, 0, inputData);
	} 
	long end = System.currentTimeMillis(); 
	System.out.println(end - start); 
	
	input.close();	output.close();
System.out.println("복구가 완료 되었습니다!");*/
		
	}


