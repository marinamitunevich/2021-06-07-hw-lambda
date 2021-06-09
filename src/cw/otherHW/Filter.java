package cw.otherHW;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Predicate;

public class Filter {
    public List<Account> filter(List<Account> accounts, Predicate<Account> predicate) {
        List<Account> newList = new ArrayList<>();

        for (int i = 0; i < accounts.size(); i++) {
            if (predicate.test(accounts.get(i))) {
                newList.add(accounts.get(i));
            }
        }
        return newList;
    }
}
