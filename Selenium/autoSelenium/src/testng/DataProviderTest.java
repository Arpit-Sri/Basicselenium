package testng;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class DataProviderTest {

	@DataProvider
	public Object[][] data(){

		Object[][] arr = new Object[4][2];
		
		arr[0][0]= "Noida";
		arr[1][0]= "Delhi";
		arr[2][0]= "Punjab";
		arr[3][0]= "Rajasthan";
		
		arr[0][1]= "Chaap";
		arr[1][1]= "Pakode";
		arr[2][1]= "Punjab";
		arr[3][1]= "PAni Pani";
		
		return arr;
	}
		
	@Test(dataProvider= "data")
	public void test(String place ,String food,String status) {
		//System.out.println("place:"+place+""+food:"+food+""sta);
	}
}



