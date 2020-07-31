package com.example.demo;

//import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

import java.util.Arrays;
import java.util.List;
import java.util.Random;
import java.util.stream.Collectors;

@SpringBootTest
class DemoApplicationTests {

    @Test
    void contextLoads() {
        List<String> strings = Arrays.asList("abc", "", "bc", "efg", "jkl");
        List<String> filtered = strings.stream().filter(string -> !string.isEmpty()).collect(Collectors.toList());
        filtered.forEach(System.out::println);
Random random = new Random();
        random.ints().limit(2).forEach(System.out::println);
//        List<Integer> numbers = Arrays.asList(3, 5, 5, 6, 7, 8);
//        List<Integer> squre = numbers.stream().map(integer -> integer).distinct().collect(Collectors.toList());
//        squre.forEach(System.out::println);
//        List<String> strings1 = Arrays.asList("fff", "gg" ,"ggg", "","bvc", "c");
//        long count = strings1.stream().filter(string -> string.isEmpty()).count();
//        System.out.println(count);
//        new Random().ints().limit(20).sorted().forEach(System.out::println);
//testT(strings1);testT(squre);dd
    }
    public  void testT(List<?> ddd){
        ddd.forEach(System.out::println);
    }
}
