package Prerequesites;

import java.util.*;

public class TwoD_ArrayLists {

    public static void main(String[] args) {


        /**
         * These are 3 areas of a shopping store, with different items
         */
        ArrayList<String> bakeryList = new ArrayList<String>();
        bakeryList.add("Pasta");
        bakeryList.add("Garlic Bread");
        bakeryList.add("Donuts");

        ArrayList<String> produceList = new ArrayList<String>();
        produceList.add("apple");
        produceList.add("carrot");
        produceList.add("tomatoes");

        ArrayList<String> drinksList = new ArrayList<String>();
        drinksList.add("soda");
        drinksList.add("coffee");
        // System.out.println(drinksList);
/**
 * this is an array list that takes in an array list of type strings.
 * we are adding different lists to make one big array list
 * to display the array list: use the print command to print the list like normal: sout(totalList);
 * to print one of the lists, sout(totalList.get(0)); this gets the first list in the big list
 * to get a specific element. sout(totalList.get(0).get(0)); gets the first element of the first list.
 */
        ArrayList<ArrayList<String>> totalList = new ArrayList<>();
        totalList.add(bakeryList);
        totalList.add(produceList);
        totalList.add(drinksList);

        System.out.println(totalList.get(0).get(0));
    }
}
