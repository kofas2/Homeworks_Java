package Homeworks_Java.Homework3;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.Random;

public class Task001 {
    public Task001() {
    }

    public static void main(String[] args) {
        Random rnd = new Random();
        ArrayList<Integer> list1 = new ArrayList();

        int max;
        int min;
        int i;
        for (max = 0; max < 10; ++max) {
            min = rnd.nextInt(0, 100);
            list1.add(min);
        }

        System.out.printf(
                "\u041f\u0435\u0440\u0432\u043e\u043d\u0430\u0447\u0430\u043b\u044c\u043d\u044b\u0439 \u0441\u043f\u0438\u0441\u043e\u043a %s\n",
                list1);
        max = (Integer) Collections.max(list1);
        min = (Integer) Collections.min(list1);
        int maxItem = (Integer) list1.get(0);
        int minItem = (Integer) list1.get(0);
        int sumItems = 0;

        int item;
        for (Iterator var8 = list1.iterator(); var8.hasNext(); sumItems += item) {
            item = (Integer) var8.next();
            if (item > maxItem) {
                maxItem = item;
            }

            if (item < minItem) {
                minItem = item;
            }
        }

        float average = (float) sumItems / (float) list1.size();
        i = 0;
        while (i < list1.size()) {
            if ((Integer) list1.get(i) % 2 == 0) {
                list1.remove(i);
            } else {
                ++i;
            }
        }
        System.out.printf(
                "\u0421\u043f\u0438\u0441\u043e\u043a \u0441 \u0443\u0434\u0430\u043b\u0435\u043d\u043d\u044b\u043c\u0438 \u0447\u0435\u0442\u043d\u044b\u043c\u0438 \u0447\u0438\u0441\u043b\u0430\u043c\u0438 %s\n",
                list1);
        System.out.printf(
                "\u041c\u0430\u043a\u0441\u0438\u043c\u0430\u043b\u044c\u043d\u044b\u0439 \u044d\u043b\u0435\u043c\u0435\u043d\u0442 %s\n",
                maxItem);
        System.out.printf(
                "\u041c\u0438\u043d\u0438\u043c\u0430\u043b\u044c\u043d\u044b\u0439 \u044d\u043b\u0435\u043c\u0435\u043d\u0442 %s\n",
                minItem);
        System.out.printf(
                "\u0421\u0440\u0435\u0434\u043d\u0435\u0435 \u0430\u0440\u0438\u0444\u043c\u0435\u0442\u0438\u0447\u0435\u0441\u043a\u043e\u0435 %s\n",
                average);
    }
}
