package Receipt;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.ArrayList;

public class ListOrder {


	public void ListOrder(InputOrder inputOrd, OrderListArray item) {
		 // ���� ���� ArrayList ����
		
		//OrderListArray item = new OrderListArray(0,null,0,0,0);	// OrderListArray Ŭ���� ���� 
		  
		try { // JDBC ��ü ���� Try - catch
			Class.forName("com.mysql.cj.jdbc.Driver"); 
		    Connection conn = DriverManager.getConnection("jdbc:mysql://127.0.0.1/goodslist","root" , "123456");
		    String a = "a";


		    item.no = inputOrd.InputNo(); // ��ǰ ��ȣ �Է�
		    Statement stmt = conn.createStatement(); 
		    ResultSet rset = stmt.executeQuery("SELECT * FROM goods WHERE no=" + item.no);

		    if (rset.next()) {   

		    	item.name = rset.getString(2);
		    	item.price = rset.getInt(3);		    	
		    } else { System.out.println("�ش��ϴ� ��ǰ�� �����ϴ�."); }
		    
		    rset.close();
		    stmt.close(); 
		    conn.close(); 
		} catch(Exception e) { e.printStackTrace(); }
	    item.count = inputOrd.inputCount(); // ���� ���� 	   
	    item.total = item.price * item.count; // ���� ���� * ���� ó�� 
	  
	}
		

}