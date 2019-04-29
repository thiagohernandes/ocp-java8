package ocp.classe.cap4.generics.collections;

import java.util.ArrayDeque;
import java.util.Deque;

class SplQueue {
    private Deque<String> splQ = new ArrayDeque<>();
    void addInQueue(String customer){
        splQ.addLast(customer);
    }
    void removeFront(){
        splQ.removeFirst();
    }
    void removeBack(){
        splQ.removeLast();
    }
    void printQueue(){
        System.out.println("Special queue contains: " + splQ);
    }
}
class SplQueueTest {
    public static void main(String []args) {
        SplQueue splQ = new SplQueue();
        splQ.addInQueue("Harrison");
        splQ.addInQueue("McCartney");
        splQ.addInQueue("Starr");
        splQ.addInQueue("Lennon");
        splQ.printQueue();
        splQ.removeFront();
        splQ.removeBack();
        splQ.printQueue();
    }
}