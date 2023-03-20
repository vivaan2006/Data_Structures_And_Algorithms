package DataStructuresAlgorithms;

import java.util.Stack;

public class Stacks {
    /**
     * A Stack is a last in first out data structure.
     * It stores objects in a vertical tower
     * push() to add an item to the top of the stack
     * pop() to remove an item from the top of the stack
     * stack.push(object) adds the item to the top
     * to access the object from the bottom of the stack, you must remove all the items above it (video game stack example) . pop()
     */
    public static void main(String[] args) {
        Stack<String> stack = new Stack<>();
        //   System.out.println(stack.empty());  prints a boolean value that says wether the stack is full or empty
        stack.push("burger");
        stack.push("pizza");
        stack.push("ice cream");
        stack.push("pasta");
        stack.push("fries");
        System.out.println(stack); // prints the stack in the order it was added
        stack.pop(); // removes the last item added to the stack, you can keep typing stack.pop until the stack is empty
        System.out.println(stack.peek()); // stack.peek() does not remove the item from the stack, it just returns the last item in the stack
        System.out.println(stack.search("pizza")); // stack.search allows you to search for an element in the stack. It returns the position of the element in the stack from the top of stack (last element declared)
        /**
         * uses of stacks
         * 1. undo/redo features in text editors
         * 2. moving back and forward through browser history
         * 3. backtracking algorithms (mazes, file directories)
         * 4. recursion/ calling functions  (call stack)
         */
    }
}