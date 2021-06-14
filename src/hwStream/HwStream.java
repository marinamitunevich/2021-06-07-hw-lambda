package hwStream;

import java.util.Arrays;
import java.util.List;
import java.util.Locale;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class HwStream {
    public static void main(String[] args) {
        System.out.println(task1());
        long n = 4;
        System.out.println(factorial(n));

        System.out.println("Summer of numbers: "+sumOddNumbersBetween(5,11));

        String text = "I want fff to go to fff and what can I hhh g ddd what want ddd jjj";
        List<String> badWords = Arrays.asList("fff","hhh","ddd","nnn","ccc");
        System.out.println(task2(text,badWords));


    }

    private static int sumOddNumbersBetween(int a, int b) {
        IntStream intStream = IntStream.rangeClosed(a,b);
        int toReturn = intStream.filter(s -> s % 2 != 0).reduce((result,elements) -> result + elements)
                .orElse(0);
        return toReturn;
    }

    private static long factorial(long n) {
        IntStream range = IntStream.rangeClosed(1,(int)n);
        long factorial = range.reduce((result,element) -> result*element).orElse(0);
        return factorial;
    }

    private static IntStream task1() {
        IntStream intStreamEven = IntStream.of(2,6,8,20,100,34,30);
        IntStream intStreamOdd = IntStream.of(75,3,15,35,65,45);
        IntStream toReturn = IntStream.concat(intStreamEven,intStreamOdd).filter(s-> s % 3 == 0 && s % 5 == 0 )
                .skip(2).sorted();
        return toReturn;
    }

    private static List<String> task2(String text, List<String> badWords) {
        List<String> listFromText = Arrays.asList(text.toLowerCase().split(" "));

        List<String> listOfBadWordsInText = listFromText.stream().filter(s ->badWords.contains(s))
                .distinct().sorted((o1,o2)->o1.compareTo(o2))
                .collect(Collectors.toList());

        return listOfBadWordsInText;

    }
}
