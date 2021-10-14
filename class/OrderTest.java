public class OrderTest {
    	public static void main(String[] args) {

		Order order = new Order();
		
		order.orderNum = 20211014L; 
		order.customerID = "idiscool";
		order.orderDate = "2021년 10월 14일"; 
		order.customerName = "문혜리";
		order.productNum = "PD-123-456"; 
		order.shippingAddress = "서울시 강남구";
		
		order.orderInfo();
	
		
	}
}
