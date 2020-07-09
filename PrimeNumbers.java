package dev.zepnex;

import java.util.*;

public class PrimeNumbers {

    public static void main(String[] args) {
        System.out.println("Till which number should the primes be printed?");
        Scanner scanner = new Scanner(System.in);
        int number = scanner.nextInt();
        List<Integer> list = new ArrayList<>();
        for (int i = 2; i <= number; i++) {
            if ((i % 2 != 0) || i == 2) {
                list.add(i);
            }
        }
        System.out.println(isPrime(list));
    }

    public static List<Integer> isPrime(List<Integer> list) {

        for (int i = 3; i < list.size(); i += 2) {
            for (int j = 1; j < list.size(); j++) {
                if (list.get(j) % i == 0 && list.get(j) != i) {
                    list.remove(j);
                }
            }
        }
        return list;
    }
}