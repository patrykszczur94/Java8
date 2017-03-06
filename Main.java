import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class Main {

	public static void main(String[] args) {
		
		/*
		
		preparation lists to further exercises

		*/
		
		List<Person> persons = new ArrayList<>();
		persons.add(new Person("name", "surname" , 1));
		persons.add(new Person("name1", "surname1" , 2));
		persons.add(new Person("name2", "surname2" , 3));
				
		List<String> texts = new ArrayList<>();
		texts.add("textsExample");
		texts.add("textsExample1");
		texts.add("textsExample2");

		/*
		
		operations on lists

		*/
		
		//example using :: operator
		PersonInterface<Person> personFactory = Person::new;
		personFactory.create("name4", "surname4", 4);
			
		//example using of easy interface by anonymous class
		FunctionalInterface fun = new FunctionalInterface() {
			@Override
			public int defFun(int y) {
				return y*100;
			}
			@Override
			public int val(int x) {
				return x*100;
			}
		};		
		System.out.println(fun.val(10));
		System.out.println(fun.defFun(2));
		
		//the same interface using lambda expression
		FunctionalInterface functionalInterface = (x) -> {
			return x * 9 ;
		};
		System.out.println(functionalInterface.val(9));
				
		// ERROR because you can't use the default function in the lambda
//		FunctionalInterface functionalInterface2 = (y) -> {
//			return y * 9 ;
//		};
//		System.out.println(functionalInterface2.defFun(1));
		
		//how to filter list by using streams
		List<Person> personnsName = persons.stream().filter(x -> x.name.equals("name")).collect(Collectors.toList());
		System.out.println(personnsName);

		List<Person> numbers = persons.stream().filter(x -> x.number > 1).collect(Collectors.toList());
		System.out.println(numbers);
		
		//using lambda expression and streams to filter list and change letters to upper case 
		//and :: operator to print result 
		texts.stream().filter(x -> x.startsWith("t")).map(x -> x.toString().toUpperCase()).sorted().forEach(System.out::println);
		
	}

}
