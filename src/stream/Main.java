package stream;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class Main {
    public static void main(String[] args) {
        List<String> listOfString = Arrays.asList("marina","love","java","but","it","is","hard","hard");

        System.out.println(task1(listOfString,5));

        System.out.println(task2(listOfString,5));

        System.out.println(task3(listOfString,3));

        System.out.println("Word marina is in the list: "+ task5(listOfString,"marina"));

    }

    private static String task3(List<String> listOfString, int n) {
        String newString = listOfString.stream().filter(s -> s.length() > n).distinct()
                .sorted(((o1, o2) -> o1.compareTo(o2))).map(String::toUpperCase)
                .reduce("",(s, s2) -> s+s2);
        return newString;
    }

    private static boolean task5(List<String> listOfString, String marina) {
        return listOfString.stream().anyMatch(s -> s.equals(marina));
    }

    private static List<String> task2(List<String> listOfString, int n) {
        List<String> newList = listOfString.stream().filter(s -> s.length() < n).distinct()
                .collect(Collectors.toList());
        return newList;
    }

    private static long task1(List<String> list, int n) {
        long count = list.stream().filter(s -> s.length() < n).count();
        return count;
    }
}
