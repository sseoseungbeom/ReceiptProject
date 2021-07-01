package Receipt;
import java.util.ArrayList;

public class PrintOrder {
	int totalPrice = 0;



	public void printOrder(ArrayList<OrderListArray> orderList) {
		System.out.printf("           %10s   \n", "(주) 처음커피");
		System.out.printf("%s  \n", "영수증NO:0005-1");
		System.out.printf("%s %d   \n", "사업자번호 :",1298801502);
		System.out.println("주소 : 서울 노원구 동일로 1693-6 (상계동 1260, 수락산우체국 2층");
		System.out.println("성명 : 김진규     전화 : 02-935-6700");
		System.out.println("일자 : 2020-08-26 14:03:15");
		System.out.println("________________________________________________");
		System.out.printf("%-13s %8s %8s %8s \n","품명", "단가", "수량", "금액");
		System.out.println("________________________________________________");
		
		for(int idx=0; idx<orderList.size(); idx++) {
			
			totalPrice += orderList.get(idx).price*orderList.get(idx).count;
			System.out.printf("%-7s \t   %-2d원   \t %-2d개 \t%d원\n", orderList.get(idx).name, orderList.get(idx).price, orderList.get(idx).count, orderList.get(idx).price*orderList.get(idx).count);
		
		}
		System.out.println("________________________________________________");
		System.out.printf("%s %37d원 \n", "청구금액:  ",   totalPrice);
		System.out.printf("%s %37d원 \n","받은금액:  " ,   totalPrice);
		System.out.printf("%s %37d원 \n","거스름돈:  ",     0);
		System.out.println("________________________________________________");
		System.out.printf("%s %s \n", "카드번호 :"," 5584-53**-****-1971");
		System.out.printf("%s %s \n", "유효기간 :", "**/**");
		System.out.printf("%s %s \n", "카 드 명 :", "씨티카드");
		System.out.printf("%s %d \n", "가맹점no :", 716393386);
		System.out.printf("%s %s \n", "매입사명 :    ",  "비씨카드사");
		System.out.printf("%s %d원\n", "결제금액 :    ",    totalPrice);
		System.out.printf("%s %s \\n", "할부개월 : \n",     "일시불");
		System.out.println("________________________________________________");
		System.out.println("DSC \n");
		System.out.println("계산자 : 서승범");
	}
}