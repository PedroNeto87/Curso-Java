import java.time.Duration;
import java.time.Instant;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.temporal.ChronoUnit;

public class Program {

	public static void main(String[] args) {
		
		LocalDate d04 = LocalDate.parse("2022-09-09");
		LocalDateTime d05 = LocalDateTime.parse("2022-09-09T19:12:59");
		Instant d06 = Instant.parse("2022-09-09T01:30:15Z");
		
		LocalDate pastWeekLocalDate = d04.minusWeeks(1);
		LocalDate nextWeekLocalDate = d04.plusWeeks(1);
		
		System.out.println("pastWeekLocalDate = " + pastWeekLocalDate);
		System.out.println("nextWeekLocalDate = " + nextWeekLocalDate);
		System.out.println();
		LocalDateTime pastWeekLocalDateTime = d05.minusWeeks(1);
		LocalDateTime nextWeekLocalDateTime = d05.plusWeeks(1);
		
		System.out.println("pastWeekLocalDateTime = " + pastWeekLocalDateTime);
		System.out.println("nextWeekLocalDateTime = " + nextWeekLocalDateTime);
		System.out.println();
		Instant pastWeekInstant = d06.minus(7, ChronoUnit.DAYS);
		Instant nextWeekInstant = d06.plus(7, ChronoUnit.DAYS);
		
		System.out.println("pastWeekInstant = " + pastWeekInstant);
		System.out.println("nextWeekInstant = " + nextWeekInstant);
		System.out.println();
		
		Duration t1 = Duration.between(pastWeekLocalDate.atStartOfDay(), d04.atStartOfDay());
		Duration t2 = Duration.between(pastWeekLocalDateTime, d05);
		Duration t3 = Duration.between(pastWeekInstant, d06);
		Duration t4 = Duration.between(d06, pastWeekInstant);
		
		System.out.println("t1 dias = " + t1.toDays());
		System.out.println("t2 dias = " + t2.toDays());
		System.out.println("t3 dias = " + t3.toDays());
		System.out.println("t4 dias = " + t4.toDays());
	}

}
