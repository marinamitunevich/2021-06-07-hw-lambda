package cw;

import java.util.*;
import java.util.function.Function;
import java.util.function.Supplier;

public class Classwork {
    public static void main(String[] args) {
        List<String> list = Arrays.asList("java","skala","clojure","java","skala");
        System.out.println(task1(list));
        System.out.println(task2("marina"));

        List<Student> students = Arrays.asList(new Student("Vasya",5),
                new Student("Petya",6),
                new Student("Masha",10));
        task3(students);

        System.out.println(task4("marina","studies","java","and","she","likes","that"));

        System.out.println(task5(1,4,6));

        System.out.println(task6(Arrays.asList(1,4,6,7,4)));

        System.out.println(task7(Arrays.asList(11,1,1,4,4,0)));

    }

    private static List<Integer> task7(List<Integer> asList) {

        Function<List<Integer>, List<Integer>> function = listInteger -> new ArrayList<>(new TreeSet<>(listInteger));

        Comparator<Integer> comparatorByInteger = (o1,o2) -> o1-o2 ;

        List<Integer> listWithoutDuplicate = function.apply(asList);
        listWithoutDuplicate.sort(comparatorByInteger);

        return listWithoutDuplicate;

    }

    private static List<Integer> task6(List<Integer> asList) {
        Function<List<Integer>,List<Integer>> function = list -> {
            List<Integer> newList = new ArrayList<>();
            int i = 0;
            for (Integer e : list) {
                newList.add(list.get(i++)*2);
            }
            return newList;
        };
        return  function.apply(asList);
    }

    private static boolean task5(int i, int i1, int i2) {
        TernaryIntInterface<Integer> operator = (a,b,c) -> a.equals(b) && a.equals(c) && b.equals(c);
        return operator.test(i,i1,i2);
    }

    private static String task4(String marina, String studies, String java, String and, String she, String likes, String that) {
        Supplier<String> supplier = () -> new StringBuilder().append(marina).append(studies).append(java).append(and)
                .append(she).append(likes).append(that).toString().toUpperCase();
        return supplier.get();
    }


    private static void task3(List<Student> list) {
        Comparator<Student> byName = (o1,o2) -> o1.getName().compareTo(o2.getName());
        Comparator<Student> byNote = (o1,o2) -> o1.getNote()-o2.getNote();

        System.out.println(list);

        list.sort(byName);
        System.out.println(list);
    }

    private static String task2(String str) {
        Function<String,String> function = string -> {
            StringBuilder stringBuilder = new StringBuilder(string);
            return stringBuilder.reverse().toString();
        };
        return function.apply(str);
    }

    private static List<String> task1(List<String> list) {
        Function<List<String>, List<String>> function = listString -> new ArrayList<>(new TreeSet<>(listString));;

        return function.apply(list);
    }

}
