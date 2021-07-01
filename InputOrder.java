package Receipt;
import java.util.Scanner;



	public class InputOrder {
		 

		Scanner sc = new Scanner(System.in);

		int addOrder=0;

		public int InputNo() {
		    System.out.println("주문하실 음료번호를 입력하세요. : " );
		    int inputNo = sc.nextInt();
		    return inputNo;
		}
		public int inputCount() {
			System.out.println("구매 갯수를 입력하세요. : " );
		    int count = sc.nextInt();	   
		     return count;
		}
		
		public void inputADD() {
		    System.out.print("1. 추가구매, 2. 구매종료 : " );
		    addOrder = sc.nextInt();	 
		}
}