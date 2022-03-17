package chap06.book.exercise.p18;

 

public class ShopService {
	
	private static ShopService ShopService = new ShopService();
	
	private ShopService() {
		
	}
	
	public static ShopService getInstance() {
	
		return ShopService;
	}
}
