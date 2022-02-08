package pro.sky.javadev;

import java.util.*;

public class Main {

    private static final List<Integer> nums = Arrays.asList(1, 1, 2, 3, 4, 4, 5, 5, 6, 7);
    private static final List<String> words = Arrays.asList("Весна", "Зима", "идет", "цветет", "Зима", "идет", "капель", "цветы", "снег");


    public static void main(String[] args) {
//        task1();
//        task2();
//        task3();
        task4();
    }

    public static void task1() {
        for (Integer num : nums) {
            if (num % 2 != 0) {
                System.out.print(num + " ");
            }
        }
        System.out.println();
    }

    public static void task2() {
        List<Integer> list2 = new ArrayList<>(Set.copyOf(nums));
        Collections.sort(list2);
        list2.removeIf(num -> num % 2 != 0);
        for (Integer num : list2) {
            System.out.print(num + " ");
        }
        System.out.println();
    }

    public static void task3() {
        Set<String> uniqueWords = new HashSet<>(words);
        System.out.println(uniqueWords);
    }

    public static void task4() {
        Set<String> uniqueWords = new HashSet<>(words);
        System.out.println(words.size() - uniqueWords.size());
    }


}
