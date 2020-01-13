package StringMethods;

public class testPractice {
public static void main(String[] args) {
	
	String codeAllDay = "Code all day.";
	int indexOfFirstSpace = codeAllDay.indexOf(" "); //4
	int indexOfSecondSpace = codeAllDay.indexOf(" ", indexOfFirstSpace + 1); //8,5
	codeAllDay.substring(0, indexOfSecondSpace); //Code all
	String codeAllNight = codeAllDay + "night"; //Code all night
	System.out.println(codeAllDay + codeAllNight);
	
}
}
