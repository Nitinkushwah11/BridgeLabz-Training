package test;

import static org.junit.jupiter.api.Assertions.*;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.time.format.ResolverStyle;

import org.junit.jupiter.api.*;

import com.junit.DateFormatter;

public class DateFormatterTest {
	static DateFormatter formatter;
	
	@BeforeAll
	public static void setup() {
		formatter = new DateFormatter();
	}
	
	@Test
	public void testValidDateFormat() {
		assertEquals("15-08-2024", formatter.formatDate("2024-08-15"));
		assertEquals("01-01-2023", formatter.formatDate("2023-01-01"));
	}
	
	@Test
	public void testInvalidDateFormat() {
		assertThrows(IllegalArgumentException.class, () -> formatter.formatDate("15-08-2024"));
	}
	
	public String formatDate(String date) {
	    if (date == null || date.isEmpty()) {
	        throw new IllegalArgumentException("Date cannot be null or empty");
	    }

	    DateTimeFormatter input =
	        DateTimeFormatter.ofPattern("yyyy-MM-dd")
	                         .withResolverStyle(ResolverStyle.STRICT);

	    LocalDate parsedDate = LocalDate.parse(date, input);

	    DateTimeFormatter output =
	        DateTimeFormatter.ofPattern("dd-MM-yyyy");

	    return parsedDate.format(output);
	}

	
	@Test
	public void testNullDate() {
		assertThrows(IllegalArgumentException.class, () -> formatter.formatDate(null));
	}
	
	@Test
	public void testEmptyDate() {
		assertThrows(IllegalArgumentException.class, () -> formatter.formatDate(""));
	}
	
	@AfterAll
	public static void afterAllTests() {
		System.out.println("Date Formatter Tests Complete");
	}
}
