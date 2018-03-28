import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

public class pizzaTest {

	pizza newPizza,newPizza1;
	float total;

	@Before
	public void setUp() throws Exception {
		newPizza = new pizza("CHICKENSAUSAGE", 150, 6, "Non-Veg");
		newPizza1 = new pizza("CHEESECORN", 260, 2, "Veg");

		total=total+newPizza.generatePrice()+newPizza1.generatePrice();
	}

	@Test
	public void testGetName() {
		//fail("Not yet implemented");
		System.out.println("------ PIZZA Details -----");
		newPizza.displayDetails();
		newPizza1.displayDetails();
	}


	@Test
	public void testGetPrice() {
		
		System.out.println("-----before tax -----:"+newPizza.generatePrice());
		
		System.out.println(" ----before TAX------ :"+newPizza1.generatePrice());
		
		System.out.println("-----Total Amount-----:- "+total);
		
		float amount=total;
		float GST;
		float finalamt;
		GST=(amount*8)/100;
		System.out.println("GST :- "+GST);
		finalamt=amount+GST;
		System.out.println("Total amount: " +finalamt);
	}


	@Test
	public void testGetQuantity() {
	}
	
	@Test
	public void testGetFinalRate() {
		

	}

}