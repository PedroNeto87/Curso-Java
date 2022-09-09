import java.time.Instant;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.ZoneId;
import java.time.format.DateTimeFormatter;

public class Program {

	public static void main(String[] args) {
		
		LocalDate d04 = LocalDate.parse("2022-09-09");
		LocalDateTime d05 = LocalDateTime.parse("2022-09-09T12:00:59");
		Instant d06 = Instant.parse("2022-09-09T12:30:15Z");
		
		DateTimeFormatter fmt01 = DateTimeFormatter.ofPattern("dd/MM/yyyy");
		DateTimeFormatter fmt02 = DateTimeFormatter.ofPattern("dd/MM/yyy HH:mm");
		DateTimeFormatter fmt03 = DateTimeFormatter.ofPattern("dd/MM/yyyy HH:mm").withZone(ZoneId.systemDefault());
		DateTimeFormatter fmt04 = DateTimeFormatter.ISO_DATE_TIME;
		DateTimeFormatter fmt05 = DateTimeFormatter.ISO_INSTANT;
		
		System.out.println("d04 = " + d04.format(fmt01));
		System.out.println("d04 = " + fmt01.format(d04));
		System.out.println();
		System.out.println("d05 = " + d05.format(fmt02));
		System.out.println("d05 = " + fmt02.format(d05));
		System.out.println("d05 = " + d05.format(fmt04));
		System.out.println();
		System.out.println("d06 = " + fmt03.format(d06));
		System.out.println("d06 = " + d06);
		System.out.println("d06 = " + fmt05.format(d06));
	}

}
