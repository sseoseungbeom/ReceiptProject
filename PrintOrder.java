package Receipt;
import java.util.ArrayList;

public class PrintOrder {
	int totalPrice = 0;



	public void printOrder(ArrayList<OrderListArray> orderList) {
		System.out.printf("           %10s   \n", "(��) ó��Ŀ��");
		System.out.printf("%s  \n", "������NO:0005-1");
		System.out.printf("%s %d   \n", "����ڹ�ȣ :",1298801502);
		System.out.println("�ּ� : ���� ����� ���Ϸ� 1693-6 (��赿 1260, �������ü�� 2��");
		System.out.println("���� : ������     ��ȭ : 02-935-6700");
		System.out.println("���� : 2020-08-26 14:03:15");
		System.out.println("________________________________________________");
		System.out.printf("%-13s %8s %8s %8s \n","ǰ��", "�ܰ�", "����", "�ݾ�");
		System.out.println("________________________________________________");
		
		for(int idx=0; idx<orderList.size(); idx++) {
			
			totalPrice += orderList.get(idx).price*orderList.get(idx).count;
			System.out.printf("%-7s \t   %-2d��   \t %-2d�� \t%d��\n", orderList.get(idx).name, orderList.get(idx).price, orderList.get(idx).count, orderList.get(idx).price*orderList.get(idx).count);
		
		}
		System.out.println("________________________________________________");
		System.out.printf("%s %37d�� \n", "û���ݾ�:  ",   totalPrice);
		System.out.printf("%s %37d�� \n","�����ݾ�:  " ,   totalPrice);
		System.out.printf("%s %37d�� \n","�Ž�����:  ",     0);
		System.out.println("________________________________________________");
		System.out.printf("%s %s \n", "ī���ȣ :"," 5584-53**-****-1971");
		System.out.printf("%s %s \n", "��ȿ�Ⱓ :", "**/**");
		System.out.printf("%s %s \n", "ī �� �� :", "��Ƽī��");
		System.out.printf("%s %d \n", "������no :", 716393386);
		System.out.printf("%s %s \n", "���Ի�� :    ",  "��ī���");
		System.out.printf("%s %d��\n", "�����ݾ� :    ",    totalPrice);
		System.out.printf("%s %s \\n", "�Һΰ��� : \n",     "�Ͻú�");
		System.out.println("________________________________________________");
		System.out.println("DSC \n");
		System.out.println("����� : ���¹�");
	}
}