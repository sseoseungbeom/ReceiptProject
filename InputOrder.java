package Receipt;
import java.util.Scanner;



	public class InputOrder {
		 

		Scanner sc = new Scanner(System.in);

		int addOrder=0;

		public int InputNo() {
		    System.out.println("�ֹ��Ͻ� �����ȣ�� �Է��ϼ���. : " );
		    int inputNo = sc.nextInt();
		    return inputNo;
		}
		public int inputCount() {
			System.out.println("���� ������ �Է��ϼ���. : " );
		    int count = sc.nextInt();	   
		     return count;
		}
		
		public void inputADD() {
		    System.out.print("1. �߰�����, 2. �������� : " );
		    addOrder = sc.nextInt();	 
		}
}