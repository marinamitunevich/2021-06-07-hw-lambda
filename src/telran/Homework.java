package telran;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.function.BinaryOperator;
import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.Predicate;

public class Homework {
    public static void main(String[] args) {
        int n = 10;
        double a = 1.5;
        double b = 2;
        double c = 2;
        consumer(a,b,c,n);
        function("200");

        System.out.println("================3task========================");
        BinaryOperator<Double> binaryOperatorSummer = (o1,o2) -> o1+o2;
        BinaryOperator<Double> binaryOperatorDeduction = (o1,o2) -> o1-o2;
        BinaryOperator<Double> binaryOperatorMultiplication = (o1,o2) -> o1*o2;
        BinaryOperator<Double> binaryOperatorDivision = (o1,o2) -> o1/o2;
        BinaryOperator<Double> binaryOperatorMax = (o1,o2) -> Double.max(o1,o2);
        BinaryOperator<Double> binaryOperatorMin = (o1,o2) -> Double.min(o1,o2);

        System.out.println("Summer a + b = "+calculate(a,b,binaryOperatorSummer));
        System.out.println("Summer a - b = "+calculate(a,b,binaryOperatorDeduction));
        System.out.println("Summer a * b = "+calculate(a,b,binaryOperatorMultiplication));
        System.out.println("Summer a / b = "+calculate(a,b,binaryOperatorDivision));
        System.out.println("Max of the a  b = "+calculate(a,b,binaryOperatorMax));
        System.out.println("Min of the a  b = "+calculate(a,b,binaryOperatorMin));


        System.out.println("================3task========================");
        List<Integer> list = Arrays.asList(1,2,3,4,5,6,7);
        Predicate<Integer> predicate1 = integer -> integer > 0;
        Predicate<Integer> predicate2 = integer -> integer < 0;
        Predicate<Integer> predicate3 = integer -> integer % 2 == 0;
        Predicate<Integer> predicate4 = integer -> integer % 2 != 0;
        Predicate<Integer> predicate5 = integer -> integer > 5;
        System.out.println("All numbers that bigger than 0: ");
        evaluate(list,predicate1);
        System.out.println("All numbers that smaller than 0: ");
        evaluate(list,predicate2);
        System.out.println("All numbers that are even: ");
        evaluate(list,predicate3);
        System.out.println("All numbers that are odd: ");
        evaluate(list,predicate4);
        System.out.println("All numbers that are bigger than 5: ");
        evaluate(list,predicate5);
    }

    public static double calculate(double a, double b, BinaryOperator<Double> binaryOperator) {
        return binaryOperator.apply(a,b);
    }

    public static List<Integer> evaluate(List<Integer> list, Predicate<Integer> predicate1) {
        List<Integer> result = new ArrayList<>();
        for (Integer n:list) {
            if(predicate1.test(n)){
                result.add(n);
                System.out.print(n+" ");
            }
        }
        System.out.println();
        return result;
    }

    public static long function(String s) {
        Function<String,Long> function = str -> Long.parseLong(str)*2;
        System.out.println("Result of function: "+function.apply(s));
        return function.apply(s);
        
    }

    public static void consumer(double a, double b, double c, int n) {
        Consumer<Integer> consumer = integer -> {
          double count = (a + b + c)*integer;
            System.out.println(count);
        };
        consumer.accept(n);
    }


}
