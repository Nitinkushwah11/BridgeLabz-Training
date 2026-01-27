package test;

import static org.junit.jupiter.api.Assertions.assertTimeout;

import java.time.Duration;

import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.Timeout;

import com.junit.LongRunning;

public class LongRunningTest {
	
	static LongRunning obj;
	
	@BeforeAll
	public static void setup() {
		obj=new LongRunning();
	}
	
	@Test
	void testLongRunning() {
	    assertTimeout(Duration.ofSeconds(2), () -> {
	        obj.longRunningTask();
	    });
	}

	
	@AfterAll
	public static void finished() {
		System.out.println("Test Finished");
	}
	
}
