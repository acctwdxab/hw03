package quintrix03;

import java.time.LocalDateTime;
import java.time.LocalTime;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Calendar;
import java.util.Date;
import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

public class streamPractice {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<Integer>numbersList = Arrays.asList(10,15,20,25,30);
		List<Integer>evenNumbersList = new ArrayList<Integer>();
		
		//Equivalent to using stream
//		for(int n:numbersList)
//		{
//			if(n%2==0) {
//			evenNumbersList.add(n);
//		}
//
//		};System.out.println(evenNumbersList);
		evenNumbersList=numbersList.stream().filter(n->n%2==0).collect(Collectors.toList());
		System.out.println(evenNumbersList);
		
//		numbersList.stream().filter(n->n%2==0).forEach(n->System.out.println(n));
//		numbersList.stream().filter(n->n%2==0).forEach(System.out::println);
		
		List<String>vehicles = Arrays.asList("truck","car","RV","boat","SUV");
		List<String>vehiclesListinUpperCase = new ArrayList<String>();
		vehiclesListinUpperCase = vehicles.stream().map(name->name.toUpperCase()).collect(Collectors.toList());
		System.out.println(vehiclesListinUpperCase);
		
		List<Integer>numbersList02 = Arrays.asList(10,15,20,25,30);
		List<Integer>multipliedNumbersList = new ArrayList<Integer>();
		multipliedNumbersList = numbersList02.stream().map(n->n*3).collect(Collectors.toList());
		long total = multipliedNumbersList.stream().count();
		System.out.println(multipliedNumbersList);
		
		System.out.println(total);
		 Optional<Integer> result = multipliedNumbersList.stream().findFirst();
		 System.out.println(result);
		
		 LocalTime now = LocalTime.now();
		 System.out.printf("Hour: %s%n", now.getHour());
		 System.out.printf("8 Hours later: %s%n", now.plusHours(8));
	     System.out.printf("Minute: %s%n", now.getMinute());
	     System.out.printf("Second: %s%n", now.getSecond());
	}

}
