package oop.q2;
import java.util.ArrayList;
import java.util.List;
import java.util.Arrays;
public class quiz2 {
    public static void main(String[] args) {
        List<Integer> list1 = Arrays.asList(9, 3, 9, 5, 5, 4, 5, 9, 5, 9, 3, 7, 4);
        List<String> list2 = Arrays.asList(
                "z2v", "jdR8D", "HTnVc", "fBxI", "hOuj", "BTH", "3Xt",
                "nZH", "t1cBL", "AGmj0", "a8Mv", "MuXzF", "7Ztu4",
                "c2I", "tICB", "EptH", "hEHJ", "lSv"
        );

        int list2Size = list2.size() - 1;

        int maxInList1 = list1.stream().max(Integer::compare).orElse(0);

        List<String> list3 = new ArrayList<>();

        for (int num: list1){
            double result = (list2Size / (double) maxInList1) * num;
            list3.add(list2.get((int) result));
        }

        System.out.println("Result (list3): " + list3);
    }
}

/*
  Functionality:
  - It initializes two lists: one of integers (list1) and one of strings (list2).
  - It calculates the maximum value in the integer list.
  - It uses the calculated maximum value and divides list2Size by that amount.
  - It retrieves the corresponding strings from list2 and stores them in a new list (list3).
  - Finally, it prints the resulting list of mapped strings.
 */