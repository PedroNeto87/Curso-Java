import java.time.Instant;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class Program {

	public static void main(String[] args) {
		
		DateTimeFormatter fmt01 = DateTimeFormatter.ofPattern("dd/MM/yyyy");
		DateTimeFormatter fmt02 = DateTimeFormatter.ofPattern("dd/MM/yyyy HH:mm");
		
		LocalDate d01 = LocalDate.now();
		LocalDateTime d02 = LocalDateTime.now();
		Instant d03 = Instant.now();
		
		LocalDate d04 = LocalDate.parse("2022-09-09");
		LocalDateTime d05 = LocalDateTime.parse("2022-09-09T12:00:59");
		Instant d06 = Instant.parse("2022-09-09T12:30:15Z");
		Instant d07 = Instant.parse("2022-09-09T12:30:15-03:00");
		
		LocalDate d08 = LocalDate.parse("09/09/2022", fmt01);
		LocalDateTime d09 = LocalDateTime.parse("09/09/2022 10:24", fmt02);
		
		LocalDate d10 = LocalDate.of(2022, 9, 9);
		LocalDateTime d11 = LocalDateTime.of(2022, 9, 9, 12, 30);
		
		System.out.println("d01 = " + d01 + " - data local");
		System.out.println("d02 = " + d02 + " - data e hora local");
		System.out.println("d03 = " + d03 + " - data e hora Z(Londres)");
		System.out.println("d04 = " + d04 + " - data local instanciada manualmente(parse)padrão ISO 8601");
		System.out.println("d05 = " + d05 + " - data e hora local instanciada manualmente(parse) padrão ISO 8601");
		System.out.println("d06 = " + d06 + " - data e hora Z(londres) instanciada manualmente padrão ISO 8601");
		System.out.println("d07 = " + d07 + " - data e hora local convertida para Z(Londres) padrão ISO 8601");
		System.out.println("d08 = " + d08 + " - Instancia data a partir de um texto customizado");
		System.out.println("d09 = " + d09 + " - Instacia data e hora a partir de um texto customizado");
		System.out.println("d10 = " + d10 + " - Instancia data, a partir de dados isolados: ano, mês e dia");
		System.out.println("d11 = " + d11 + " - Instancia data e hora, a partir de dados isolados: ano, mês, dia, hora e minuto");
	}

}
