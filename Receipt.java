package Receipt;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.Scanner; // java.util ��Ű�� �ؿ� Scanner Ŭ������ ����ϰڴ�. 
 

public class Receipt { // Ŭ���� �� 
	public static void main(String[] args) { 

			ArrayList<OrderListArray> orderList = new ArrayList<OrderListArray>(); // ���� ���� ArrayList ���� 
			InputOrder inputOr = new InputOrder(); 
			PrintOrder printOr = new PrintOrder(); 
			ListOrder listOr = new ListOrder(); 

			while(true) {

				OrderListArray item = new OrderListArray(0,null,0,0,0);	// OrderListArray Ŭ���� ����
				listOr.ListOrder(inputOr,item);

				orderList.add(item); // arrayList�� item ��ü ��� �߰�
			    
				inputOr.inputADD(); // �߰� ���� ����
			    
			    if (inputOr.addOrder == 1) { continue; } // 1 �Է� ��, while �� ������� �̵� 
			    else if(inputOr.addOrder == 2) { break;} // ���α׷� ����
			    
			} printOr.printOrder(orderList); // ������ ���
			
	
	}
}