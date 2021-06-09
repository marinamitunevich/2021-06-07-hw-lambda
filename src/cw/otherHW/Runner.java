package cw.otherHW;

import java.util.Arrays;
import java.util.List;
import java.util.function.Predicate;

public class Runner {
    public static void main(String[] args) {

        List<Account> accounts = Arrays.asList(new Account("01",200_000,true),
                new Account("04",300_000,false),
                new Account("10",-100_000,true),
                new Account("05",10_000,false));


        System.out.println("List od the accounts that satisfies filter2 :");
        System.out.println((new Filter()).filter(accounts,2));

        System.out.println("List od the accounts that satisfies filter1 :");
        System.out.println((new Filter()).filter(accounts,1));

    }
}
