package org.example.colas;

import java.util.Deque;
import java.util.LinkedList;
import java.util.Queue;
import java.util.concurrent.ArrayBlockingQueue;

public class cosas {
    public static void main(String[] args) {

//        Queue<Integer> cola2 = new LinkedList<>();
//        //capacidad ilimitada
//
//        Queue<Integer> col1 = new ArrayBlockingQueue<>(3);
//        //capacidad definida
//
//        cola2.offer(12);
//        cola2.offer(23);
//        cola2.offer(9);
//
//        System.out.println(cola2.peek());
//
//        while(!cola2.isEmpty()){
//            System.out.println(cola2.poll());
//        }

        Deque<String> burgers = new LinkedList<>();

        burgers.offer("Big Mac");
        burgers.offer("Mc Pollo");
        burgers.offerFirst("Cuarto de Libra");

        System.out.println(burgers);

    }
}
