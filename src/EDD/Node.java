/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package EDD;

/**
 *
 * @author josep
 */
public class Node {
    private Thread hilo;
    private Node next; 

    public Node(Thread hilo) {
        this.hilo = hilo;
        this.next = null;
    }
    
   
    public Thread getThread() {
        return hilo;
    }

    public void setThread(Thread hilo) {
        this.hilo = hilo;
    }

    public Node getNext() {
        return next;
    }

    public void setNext(Node next) {
        this.next = next;
    }
}
