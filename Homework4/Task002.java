// Даны два Deque, представляющие два целых числа. Цифры хранятся в обратном порядке и каждый из их узлов содержит одну цифру.
// 2) Сложите два числа и верните сумму в виде связанного списка. Одно или два числа должны быть отрицательными.

package Homeworks_Java.Homework4;

import java.util.ArrayDeque;
import java.util.Arrays;
import java.util.Deque;

import Homeworks_Java.Homework4.Task002;

public class Task002 {

     public static void main(String[] args) {
          Deque d1 = new ArrayDeque<>(Arrays.asList(-1, 2, 3));
          Deque d2 = new ArrayDeque<>(Arrays.asList(-5, 4, 7));
          Task002 task = new Task002();
          Deque<Integer> result1 = task.sum(d1, d2);
          System.out.print("Addition: ");
          System.out.println(result1);
     }

     public Deque<Integer> sum(Deque<Integer> d1, Deque<Integer> d2) {
          Deque<Integer> result1 = new ArrayDeque<>();
          int carry1 = 0;
          while (!d1.isEmpty() || !d2.isEmpty()) {
               int sum = carry1;
               if (!d1.isEmpty()) {
                    sum += d1.removeFirst();
               }
               if (!d2.isEmpty()) {
                    sum += d2.removeFirst();
               }
               result1.addLast(sum % 10);
               carry1 = sum / 10;
          }
          if (carry1 != 0) {
               result1.addLast(carry1);
          }
          return result1;
     }

}
