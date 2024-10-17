package com.stream;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.Optional;
import java.util.Random;
import java.util.stream.Collectors;
import java.util.stream.Stream;

import com.thr.DownloaderThread;
class Trainee
{
	int trid;
	String name;
	String city;
	public Trainee(int trid, String name, String city) {
		super();
		this.trid = trid;
		this.name = name;
		this.city = city;
	}
	@Override
	public String toString() {
		return "Trainee [trid=" + trid + ", name=" + name + ", city=" + city + "]";
	}

}

public class StreamDemo {
	public static void main(String[] args) {
		List<Integer> list = List.of(23,45,4,43,35,76,45,34,456,78,65,3,3,78);
		//		Integer max = Collections.max(list);

		Stream<Integer> stream = list.stream();
		Optional<Integer> optMin = stream.min((a,b) -> a-b);
		if(optMin.isPresent())
			System.out.println(optMin.get());
		else System.out.println(Integer.MIN_VALUE);

		System.out.println(optMin.orElse(Integer.MIN_VALUE));
		Optional<Integer> max = list.stream().max((a,b) -> a -b);
		System.out.println(max);
		list.stream().limit(10).forEach(t -> System.out.println(t));
		System.out.println();
		list.stream().limit(10).forEach(System.out::println);

		// check wheather all the elements in the list are odd or not
		boolean allMatch = list.stream().allMatch(t -> t%2==1);
		System.out.println(allMatch);
		//check is there any one multiple of 7 , anyMatch
		boolean anyMatch = list.stream().anyMatch(t -> t%7 == 0);
		System.out.println(anyMatch);

		list.stream().filter(t -> t%2==1).forEach(System.out::println);
		long count = list.stream().filter(t -> t%2==1).count();
		System.out.println(count);
		System.out.println();
		list.stream().distinct().forEach(System.out::println);

		long count2 = list.stream()
				.distinct()
				.filter(t -> t%2==1)
				.count();
		System.out.println(count2);
		Stream<String> streamStr = list.stream().map(val -> ""+val);
		List<String> listStr = streamStr.collect(Collectors.toList());
		// how many trainees come from gurugram
		List<Trainee> trainees = List.of(new Trainee(1,"A","Guru"),
				new Trainee(1,"Ta","Del"),
				new Trainee(2,"Am","Guru"),
				new Trainee(3,"Ef","Del"),
				new Trainee(4,"Gr","Hyd"),
				new Trainee(5,"Ah","Ranchi"),
				new Trainee(6,"Ab","Guru"));
		long count3 = trainees.stream()
				.filter(tr -> tr.city.equals("Guru"))
				.count();
		System.out.println(count3 +  " come from Guru");
		// print the city of trainees , but each city once.
		trainees.stream().map(tr -> tr.city).distinct().forEach(System.out::println);
		Optional<Integer> sumOpt = list.stream().reduce((a,b) -> a + b);
		Optional<Integer> maxOpt = list.stream().reduce((a,b) ->Math.max(a, b));
		Optional<Integer> maxOpt2 = list.stream().reduce(Math::max);

		List<Integer> list2 = new ArrayList<>(list);
		for(int i = 1; i<= 100; i++)
		{
			list2.add(i);
		}
		System.out.println(list2);
		list2.stream().forEach(t -> System.out.print(t + ", "));
		System.out.println();
		//		list2.parallelStream()
		list2.stream().parallel().forEach(t -> System.out.print(t + ", "));
		String names[] = { "1.txt","2.txt","3.txt","4.txt","5.txt","6.txt"};
		System.out.println(System.currentTimeMillis());
		Arrays.stream(names).parallel().forEach((name) -> {
			DownloaderThread t = new DownloaderThread(name);
			t.run();
			//			downloadFile(name);
		});
		System.out.println(System.currentTimeMillis());
		//		Create an Array of string that contains 6 names.
		//		Create a stream of this and using stream api find the longest string.
		//		Sort the array using length of the strings using comparator.


		// from  a stream of Integer use, reduce method to get values as
		// 3,4,5,6,7,7,5,4,3 a string that is concatenation of all values
		Optional<String> reduce = Stream.of(3,4,5,6,5,4,3).map(num -> ""+num)
				.reduce((a,b) -> a+"," + b);
		// Use Supplier interface to generate random numbers
		// Generate stream of 10 random integers
		Stream.generate(() -> { return new Random().nextInt(100); })
		.limit(10).forEach(System.out::println);

		System.out.println(reduce);
	}

}
