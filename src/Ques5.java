package src;

import java.util.Arrays;
import java.util.stream.Collectors;

public class Ques5 {
    public static void main(String[] args) {

//        Q5. Join Strings with Comma
//        Join all strings in a list using a comma as a delimiter.
//
//        Input: ["Java", "Python", "C++"]
//        Output: "Java,Python,C++"

        String [] arr = {"Java", "Python", "C++"};

        String res =Arrays.asList(arr)
                .stream()
                .collect(Collectors.joining(","));

        System.out.println(res);
    }
}
