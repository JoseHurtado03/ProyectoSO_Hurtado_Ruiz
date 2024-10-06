/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package EDD;

import javax.swing.JOptionPane;

/**
 *
 * @author josep
 */
public class List {
    private Node first;
    private Node last;
    private int size=0;

    public List() {
        this.first = null;
        this.last = null;
        this.size= 0;
    }

    public void addEnd(Thread hilo) {
        Node worker= new Node(hilo);

        if (isEmpty()) {
            this.first = worker;
            this.last = worker;
        } else {
            this.last.setNext(worker);
            this.last= worker;
        }
        this.size++;
        worker.getThread().start();

    }
    
        public void removeLast() {
            if (this.isEmpty()) {
                JOptionPane.showMessageDialog(null, "No se puede quitar mas trabajadores de este tipo debido a que no hay");
            } else {
                if (this.size == 1) {
                    setFirst(null);                    
                } else {
                    Node aux = this.first;
                    for (int i = 0; i < this.size; i++) {
                        if (aux.getNext().equals(this.last)) {
                            this.last = aux;
                            this.size--;
                        }
                        aux = aux.getNext();
                    }
                }
            }
    }

    
    public boolean isEmpty(){
        return first==null;
    }
            
    
    public Node getFirst() {
        return first;
    }

    public void setFirst(Node first) {
        this.first = first;
    }

    public Node getLast() {
        return last;
    }

    public void setLast(Node last) {
        this.last = last;
    }

    public int getSize() {
        return size;
    }

    public void setSize(int size) {
        this.size = size;
    }
    
    
}
