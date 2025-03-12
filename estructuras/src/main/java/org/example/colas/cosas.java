package org.example.colas;

import java.util.LinkedList;
import java.util.Queue;

public class cosas {
    public static void main(String[] args) {

        Queue<Integer> cola2 = new LinkedList<>();

        cola2.offer(12);
        cola2.offer(23);
        cola2.offer(9);

        System.out.println(cola2.peek());

        while(!cola2.isEmpty()){
            System.out.println(cola2.poll());
        }
    }
}
