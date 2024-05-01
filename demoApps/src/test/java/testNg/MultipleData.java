package testNg;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class MultipleData {
	
	@DataProvider
	public Object[][] data() {
		
		Object [][] arr = new Object[3][3];
		
		arr[0][0]="Adesh";
		arr[1][0]="Aditya";
		arr[2][0]="Akash";
		
		arr[0][1]="Bunglow";
		arr[1][1]="Wife";
		arr[2][1]="Gadi";
		
		arr[0][2]=4;
		arr[1][2]=2;
		arr[2][2]=1;
		
		return arr;
		
	}
	
	@Test(dataProvider = "data")
	public void product(String customer, String product, int quantity) {
		System.out.println(""+customer+" want "+product+" with "+quantity+"");
	}

}
