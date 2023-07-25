// Даны два Deque, представляющие два целых числа. Цифры хранятся в обратном порядке и каждый из их узлов содержит одну цифру.
// 1) Умножьте два числа и верните произведение в виде связанного списка.

package Homeworks_Java.Homework4;

import java.util.ArrayDeque;
import java.util.Arrays;
import java.util.Deque;

import Homeworks_Java.Homework4.Task001;

public class Task001 {

    public static void main(String[] args) {
        Deque d1 = new ArrayDeque<>(Arrays.asList(1, 2, 3));
        Deque d2 = new ArrayDeque<>(Arrays.asList(5, 4, 7));
        Task001 task = new Task001();
        Deque<Integer> result2 = task.product(d1, d2);
        System.out.print("Multiplication: ");
        System.out.println(result2);
    }


    public Deque<Integer> product(Deque<Integer> d1, Deque<Integer> d2) {
        Deque<Integer> result2 = new ArrayDeque<>();
        int carry = 0;
        while (!d1.isEmpty() || !d2.isEmpty()) {
            int n1 = d1.isEmpty() ? 0 : d1.removeFirst();
            int product = carry;
            while (!d2.isEmpty()) {
                int n2 = d2.isEmpty() ? 0 : d2.removeFirst();
                product = (n1 * n2);
                result2.addLast(product % 10);
                carry = product / 10;
            }
        }
        if (carry != 0) {
            result2.addLast(carry);
        }
        return result2;
    }
}
