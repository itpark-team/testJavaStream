package com.company;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Main {

    public static void main(String[] args) {
        ArrayList<Integer> numbers = new ArrayList<>();
        Collections.addAll(numbers, 32, 65, 576, 234, 65, 7879, 8, 45);

        ArrayList<Integer> filteredNumbers = (ArrayList<Integer>) numbers.stream().filter(item -> item % 2 == 0).collect(Collectors.toList());

        numbers.stream().filter(item -> item % 2 == 0).forEach(item -> System.out.print(item + " "));

        System.out.println();

        Stream<Integer> tempStream = numbers.stream().filter(item -> item > 100);
        System.out.println("count even:" + tempStream.count());

        numbers.stream().filter(item -> item > 100 && item < 300).count();

//        System.out.println("count 100<x<300:" + tempStream.filter(item -> item < 300).count());


        long a = numbers.stream().filter(item -> {
            if (item > 100) {
                numbers.add(item);
            }
            return true;
        }).count();


//        for (int i = 0; i < numbers.size(); i++) {
//            if (numbers.get(i) % 2 == 0) {
//                System.out.print(numbers.get(i)+" ");
//            }
//        }
//        System.out.println();
//        System.out.println("----");
//
//        Iterator<Integer> iter = numbers.iterator();
//        while (iter.hasNext()) {
//            System.out.print(iter.next()+" ");
//        }
//
//        System.out.println();
//        System.out.println("----");
//
//        for (Integer item : numbers) {
//            System.out.print(item+" ");
//        }


    }
}
