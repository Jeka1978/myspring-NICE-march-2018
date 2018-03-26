package com.nice.java8;

import lombok.SneakyThrows;

import java.util.List;

/**
 * @author Evgeny Borisov
 */
public class ListUtil {



    @SneakyThrows
    public static <T> void forEachWithDelay(List<T> list, int delay, Action<T> action) {

       /* list.forEach(t -> {
            action.doAction(t);
            Thread.sleep(delay);
        });*/
        for (T t : list) {
            action.doAction(t);
            Thread.sleep(delay);
        }
    }


    public static <T> int countDuplicate(T t, List<T> list,Equalator<T> equalator) {
        int counter=0;
        for (T t1 : list) {
            if (equalator.equals(t,t1)) {
                counter++;
            }
        }
        return counter;
    }

    public static <T> int countDuplicate(T t, List<T> list) {
        int counter=0;
        for (T t1 : list) {
            if (t1.equals(t)) {
                counter++;
            }
        }
        return counter;
    }
}
