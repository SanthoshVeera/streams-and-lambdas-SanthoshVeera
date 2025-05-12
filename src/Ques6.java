package src;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class Ques6 {
    public static void main(String[] args) {

//        Q6. Remove Duplicate Elements
//        Remove all duplicates from a list of integers.


        Integer arr [] = {10,20,30,10,10,20,30,10};

        List<Integer> disincrList = Arrays.asList(arr)
                .stream()
                .distinct()
                .collect(Collectors.toList());

        System.out.println(disincrList);
    }
}
