package Prerequesites;

import java.util.ArrayList;

public class Array_List {
    public static void main(String[] args) throws IndexOutOfBoundsException {
//  An array list is a resizable array.
//  It's elements can be added or removed after the compilation phase.
//  It also stores reference datatypes.

        // creating an array list full of string values
        ArrayList<String> list = new ArrayList<String>();
        // adding strings to the array list.
        list.add("bag");
        list.add("bread");
        list.add("milk");
        list.add("eggs");
        list.add("pancakes");
// .set changes the value of the first element in the list from bag to book.
        list.set(0, "book");
        // .remove removes the element specified from the list.
        list.remove(0);
        // .clear clears the entire array list. Potentially useful in conditional caluses, person buying all of them and then list clears
        list.clear();


        // loop that as long as i is less than the size of the array list, it prints the next value in the list of strings.
        // if you just printed list, the same list would print 5 times. list.get(i) prints the list once.
        // instead of list.length for a normal array, for an array list, you use list.size()
        for (int i = 0; i < list.size(); i++) {
            System.out.println(list.get(i));
        }


    }
}
