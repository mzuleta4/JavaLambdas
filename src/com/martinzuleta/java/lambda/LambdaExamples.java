package com.martinzuleta.java.lambda;

import java.util.Comparator;

public class LambdaExamples {
    public static void main(String[] args) {

//        Comparator<String> stringComparatorLambda = (String o1, String o2) -> {return o1.compareTo(o2); };
//
//        int comparision = stringComparatorLambda.compare("hello", "world");
//        System.out.println(comparision);

        MyFunction myFunction = (text1, text2) ->{
            System.out.println(text1+ " "+ text2);
            return text1 + "+" + text2;
        };

        String returnValue = myFunction.apply("Hello", "Martin");
        System.out.println(returnValue);

        MyFunction myFunction2 = myFunction;
        String returnValue2 = myFunction2.apply("text1", "text2");
        System.out.println(returnValue2);
    }
}
