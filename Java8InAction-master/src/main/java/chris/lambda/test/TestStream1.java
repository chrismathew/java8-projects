package chris.lambda.test;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collector;
import static java.util.stream.Collectors.toList;

public class TestStream1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		List<String> words = Arrays.asList("Java8", "Lambdas", "In", "Action");
		List<Integer> wordLengths = words.stream()
				.map(String::length)
				.collect(toList());
		System.out.println("wordLenths"+ wordLengths);
		
		
		 // Filtering unique elements
        List<Integer> numbers = Arrays.asList(1, 2, 1, 3, 3, 2, 4);
        numbers.stream()
               .filter(i -> i % 2 == 0)
               .distinct()
               .forEach(System.out::println);
        
        
        String[] arrayOfWords = {"Goodbye", "World"};
        words.stream()
        .map(word -> word.split(""))
        .map(Arrays::stream)
        .distinct()
        .collect(toList()  );
        
	}



}
