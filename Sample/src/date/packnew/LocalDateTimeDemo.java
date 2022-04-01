package date.packnew;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class LocalDateTimeDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		LocalDateTime now =LocalDateTime.now();
		
		System.out.println(now);

		
		DateTimeFormatter format= DateTimeFormatter.ofPattern("dd-MM-yyyy HH:mm:ss");
		
		String formatDateTime= now.format(format);
		
		
		System.out.println(formatDateTime);
		
	}

}
