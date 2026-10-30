/**
 *  Java program to create, read, update, and delete Queue collection.
 */

package com.mycollections;

import java.util.PriorityQueue;
import java.util.Queue;

/**
 *  Main class.
 */
public class Main {

    // JVM entry point.
    public static void main(String[] args) {

        // Create.
        Queue<Long> myQueue = new PriorityQueue<>();

        // Add.
        myQueue.add(-9_223_372_036_854_775_808L);
        myQueue.add(-1_223_362_987_854_775_808L);
        myQueue.add(9_223_372_036_854_775_807L);

        // Print.
        System.out.println(myQueue); // Output: [-9223372036854775808, -1223362987854775808, 9223372036854775807]

        // Print first element.
        System.out.println(myQueue.peek()); // Output: -9223372036854775808

        // Print and delete first element.
        System.out.println(myQueue.poll()); // Output: -9223372036854775808

        // Printing size of queue.
        System.out.println("Size is: " + myQueue.size()); // Output: Size is: 2

        // Add.
        myQueue.offer(567_789L);

        // Remove and print first.
        System.out.println(myQueue.remove()); // Output: -1223362987854775808

        // Print all elements of myQueue.
        System.out.println(myQueue); // Output: [567789, 9223372036854775807]

        // Clear.
        myQueue.clear();

    }
}