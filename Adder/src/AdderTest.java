import static org.junit.Assert.*;
import org.junit.Test;

public class AdderTest {

	private int nbErrors;
	Adder a = new Adder();
	
	@Test
	public void testAdd(){
		double result = a.add(10,50);
		assertEquals(60, result, 0);
	}
	
	@Test
	public void testAdd3(){
		double result = a.add(5,50);
		assertEquals(60, result, 0);
	}
	
	public void testAdd2(){
		Adder c = new Adder();
		double result = a.add(10, 50);
		if(result != 60){
			throw new IllegalStateException("Bad result: "+ result);
		}
	}
	
	public static void main(String[] args){
		AdderTest test = new AdderTest();
		try{
			test.testAdd2();
		}
		
		catch(Throwable e){
			test.nbErrors++;
			e.printStackTrace();
		}
		if(test.nbErrors>0){
			throw new IllegalStateException("There were " + test.nbErrors + " error(s)");
		}
	}
}
