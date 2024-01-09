package java_first_project;

import java.time.LocalDateTime;

public class AttendanceDateExtractor {
	public static int extractMonth(LocalDateTime dateTime) {
        return dateTime.getMonthValue();
     }
	    public static void main(String[] args) {
	        LocalDateTime myDateTime = LocalDateTime.now(); 	        
	        int month = extractMonth(myDateTime);
	        System.out.println("Month: " + month);
	    }
	}


