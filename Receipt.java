package Receipt;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.Scanner; // java.util 패키지 밑에 Scanner 클래스를 사용하겠다. 
 

public class Receipt { // 클래스 명 
	public static void main(String[] args) { 

			ArrayList<OrderListArray> orderList = new ArrayList<OrderListArray>(); // 가변 길이 ArrayList 선언 
			InputOrder inputOr = new InputOrder(); 
			PrintOrder printOr = new PrintOrder(); 
			ListOrder listOr = new ListOrder(); 

			while(true) {

				OrderListArray item = new OrderListArray(0,null,0,0,0);	// OrderListArray 클래스 변수
				listOr.ListOrder(inputOr,item);

				orderList.add(item); // arrayList에 item 객체 요소 추가
			    
				inputOr.inputADD(); // 추가 구매 유무
			    
			    if (inputOr.addOrder == 1) { continue; } // 1 입력 시, while 문 상단으로 이동 
			    else if(inputOr.addOrder == 2) { break;} // 프로그램 종료
			    
			} printOr.printOrder(orderList); // 영수증 출력
			
	
	}
}