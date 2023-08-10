package com.cbfacademy;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class FlowControlExercises {

    public List<String> fizzBuzz(List<Integer> numbers) {
        List<String> result = new ArrayList<>();
        for (int number : numbers){
            boolean divisibleBy3 = (number % 3 == 0);
            boolean divisibleBy5 = (number % 5 == 0);
            if (divisibleBy3 && divisibleBy5) {
                result.add("FizzBuzz");
            } else if (divisibleBy3) {
                result.add("Fizz");
            } else if (divisibleBy5) {
                result.add("Buzz");
            } else {
                result.add(String.valueOf(number));
            } 
        }
        return result;
    }
    public String whichMonth(Integer number) {
        String[] months = { 
            "Invalid month number",
            "January", "February", "March", 
            "April", "May", "June", 
            "July", "August", "September", 
            "October", "November", "December"
        };
       if(number >= 1 && number <=12 ){
         return months[number];
       }else {
        return months[0];
       }
    }
    public Map<String, Integer> sumOfOddsAndSumOfEvens() {
        // TODO - Implement this method such that
         List<Integer> listHundred = new ArrayList<>();
        for (int i = 1; i <= 100; i++) {
            listHundred.add(i);
        }
        int sumOfEvens = 0;
        int sumOfOdds = 0;
        for (int num : listHundred) {
            if (num % 2 == 0) {
                sumOfEvens += num;
            } else {
                sumOfOdds += num;
            }
        }
        Map<String, Integer> result = new HashMap<>();
        result.put("SumOfEvens", sumOfEvens);
        result.put("SumOfOdds", sumOfOdds);
        return result;
    }
    public List<Integer> reverse(ArrayList<Integer> numbers) {
        List<Integer> reversedNumbers = new ArrayList<>();
        for (int i = numbers.size() - 1; i >= 0; i--) {
            reversedNumbers.add(numbers.get(i));
        }
        return reversedNumbers;
    }

    public String getName() {
        return "Flow Control Exercises";
    }
}
