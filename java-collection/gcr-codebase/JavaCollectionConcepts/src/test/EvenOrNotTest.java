package test;

import org.junit.jupiter.api.BeforeAll;
import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.ValueSource;

import com.junit.EvenOrNot;

public class EvenOrNotTest {
	static EvenOrNot obj;
	
	@BeforeAll
	public static void before() {
		obj=new EvenOrNot();
	}
	
	@ParameterizedTest
	@ValueSource(ints = {2, 4, 6})
	void testEvenNumbers(int x) {
	    assertTrue(obj.isEven(x));
	}

	@ParameterizedTest
	@ValueSource(ints = {1, 3, 5})
	void testOddNumbers(int x) {
	    assertFalse(obj.isEven(x));
	}

	
	@AfterAll
	public static void after() {
		System.out.println("The test is finished");
	}
}
