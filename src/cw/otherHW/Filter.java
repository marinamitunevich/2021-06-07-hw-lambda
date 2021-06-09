package cw.otherHW;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Predicate;

public class Filter {
    public List<Account> filter(List<Account> accounts, int conditionNummer){
        List<Account> newList = new ArrayList<>();
        if(conditionNummer == 1) {
            Predicate<Long> predicate = n -> n > 0;
            for (int i = 0; i < accounts.size(); i++) {
                if (predicate.test(accounts.get(i).getBalance())) {
                    newList.add(accounts.get(i));

                }
            }
        }

        if(conditionNummer == 2) {
            for (int i = 0; i < accounts.size(); i++) {
                OurPredicate<Long,Boolean> predicate2 = (n,m) -> n > 100_000 && m == true;
                if (predicate2.test(accounts.get(i).getBalance(),accounts.get(i).isLocked())) {
                    newList.add(accounts.get(i));

                }
            }
        }

        return newList;

    }
}
