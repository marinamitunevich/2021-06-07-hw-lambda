package telranCollect;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class Main {
    public static void main(String[] args) {

        Worker worker1 = new Worker("Vasya",25,3100,"Tester");
        Worker worker2 = new Worker("Natalia",35,3500,"Tester");
        Worker worker3 = new Worker("Falco",27,5000,"Programmer");
        Worker worker4 = new Worker("Marina",40,4000,"Designer");
        Worker worker5 = new Worker("Maria",37,3000,"Programmer");
        Worker worker6 = new Worker("Max",23,2500,"Designer");
        List<Worker> workers = Arrays.asList(worker1,worker2,worker3,worker4,worker5,worker6);

        task1(workers);
        System.out.println(task2(workers));
        System.out.println(counting(workers));
        System.out.println(task4(workers));
        System.out.println(task5(workers));
;
    }

    private static Map<String,Integer> task5(List<Worker> workers) {
        Map<String,Integer> mapSumOfSalary = workers.stream()
                .collect(Collectors.groupingBy(worker -> worker.getPosition() , Collectors
                .summingInt(worker -> worker.getSalary())));
        return mapSumOfSalary;

    }

    private static Map<Integer,List<Worker>> task4(List<Worker> workers) {
        Map<Integer,List<Worker>> map = workers.stream().filter(worker -> worker.getAge() > 31)
                .collect(Collectors.groupingBy(worker -> worker.getAge()));
        return map;

    }

    private static long counting(List<Worker> workers) {
        long amount = workers.stream().filter(worker -> worker.getPosition().equals("Tester"))
                .count();
        return amount;
    }

    private static Map<String,List<Worker>> task2(List<telranCollect.Worker> workers) {
        Map<String,List<Worker>> mapByPosition = workers.stream()
                .collect(Collectors.groupingBy(worker -> worker.getPosition()));
        return mapByPosition;
    }

    private static void task1(List<Worker> workers) {
        Map<Boolean,List<Worker>> mapMore300 = workers.stream()
                .collect(Collectors.partitioningBy(worker -> worker.getSalary() > 3000));
        System.out.println(mapMore300.get(true));

        Map<Boolean,List<Worker>> mapLess300 = workers.stream()
                .collect(Collectors.partitioningBy(worker -> worker.getSalary() < 3000));
        System.out.println(mapLess300.get(true));
    }
}
