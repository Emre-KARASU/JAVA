package day30collections;

import java.util.Deque;
import java.util.LinkedList;
import java.util.PriorityQueue;
import java.util.Queue;

public class QueueDeque01 {

    public static void main(String[] args) {

        //Queue ==> FIFO
        Queue<String> q1 = new LinkedList<>();
        q1.offer("a");
        System.out.println(q1);

        //This will be learnt more while lambda instructions
        Queue<String> q2 = new PriorityQueue<>();

        //Deque=> Double ended Queue ==> FIFO + LIFO
        Deque<String> d1 = new LinkedList<>();
        d1.addFirst("A"); //  C  B  A D
        d1.addFirst("B");
        d1.addFirst("C");
        d1.addLast("D");
        System.out.println(d1);//[C, B, A, D]

    }
}
