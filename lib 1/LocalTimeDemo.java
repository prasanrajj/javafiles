package lib1;

import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.ZoneId;

public class LocalTimeDemo {

	public static void main(String[] args) {
		var now = LocalTime.now(); 
		System.out.println(now);
		
		var singtime = LocalTime.now(ZoneId.of("Asia/Singapore"));
		System.out.println(singtime);
		
		var ct = LocalDateTime.now();
		System.out.println(ct);

	}

}
