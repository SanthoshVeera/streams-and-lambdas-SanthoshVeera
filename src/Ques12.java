package src;

import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class Ques12 {
    public static void main(String[] args) {

//        Q12. Employee Name Initial Map
//        Return a map where the key is the first character of employee names, and the value is a list of names starting with that character.
//
//                Input: ["Alice", "Andrew", "Bob"]
//        Output: {A=[Alice, Andrew], B=[Bob]}

        String arr [] = {"Alice", "Andrew", "Bob"};

        Map<Character, List<String >>resultMap = Arrays.asList(arr)
                .stream()
                .collect(Collectors.groupingBy(x -> x.charAt(0)));


        System.out.println(resultMap);

    }
}
