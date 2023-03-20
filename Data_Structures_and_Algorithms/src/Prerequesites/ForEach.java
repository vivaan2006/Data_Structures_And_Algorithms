package Prerequesites;

import java.util.ArrayList;

public class ForEach {
    // for each loop: traversing technique to iterate trough the elements in an array
    // less steps, more readable, less flexible :(

    // : means in; for each element i inside animals, do stuff in the for loop

    public static void main(String[] args) {

//        String[] animals = {"cat", "dog", "rabbit", "bird"};
//
//        for (String i : animals) {
//            System.out.println();
//        }
        ArrayList<String> animals = new ArrayList<String>();
        animals.add("cat");
        animals.add("dog");
        animals.add("rat");
        animals.add("bird");
        for (String i : animals) {
            System.out.println(animals.set(1,"bat"));
        }

    }
}
