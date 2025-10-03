package com.queue;

import java.util.Scanner;

public class DoubleEndedQueue {
	int queue[];
    int front, rear, size, capacity;
    
    public DoubleEndedQueue(int capacity) {
        this.capacity = capacity;
        queue = new int[capacity];
        front = -1;
        rear = 0;
        size = 0;
    }
    
    public boolean isFull() {
        return size == capacity;
    }
    
    public boolean isEmpty() {
        return size == 0;
    }

    
    public void insertFront(int item) {
        if (isFull()) {
            System.out.println("Deque is full");
            return;
        }
        if (front == -1) { 
            front = 0;
            rear = 0;
        } else if (front == 0) {
            front = capacity - 1;
        } else {
            front--;
        }
        queue[front] = item;
        size++;
    }
    
    
    public void insertRear(int item) {
        if (isFull()) {
            System.out.println("Deque is full");
            return;
        }
        if (front == -1) { 
            front = 0;
            rear = 0;
        } else if (rear == capacity - 1) {
            rear = 0;
        } else {
            rear++;
        }
        queue[rear] = item;
        size++;
    }
    
    public void deleteFront() {
        if (isEmpty()) {
            System.out.println("Deque is empty");
            return;
        }
        if (front == rear) {
            front = -1;
            rear = -1;
        } else if (front == capacity - 1) {
            front = 0;
        } else {
            front++;
        }
        size--;
    }
    
    public void deleteRear() {
        if (isEmpty()) {
            System.out.println("Deque is empty");
            return;
        }
        if (front == rear) {
            front = -1;
            rear = -1;
        } else if (rear == 0) {
            rear = capacity - 1;
        } else {
            rear--;
        }
        size--;
    }
    
    public int getFront() {
        if (isEmpty()) return -1;
        return queue[front];
    }
    
    public int getRear() {
        if (isEmpty()) return -1;
        return queue[rear];
    }
    public void display() {
        if (isEmpty()) {
            System.out.println("Deque is empty");
            return;
        }
        System.out.print("Deque elements: ");
        int i = front;
        while (true) {
            System.out.print(queue[i] + " ");
            if (i == rear) break;
            i = (i + 1) % capacity;
        }
        System.out.println();
    }

    public void clear() {
        front = -1;
        rear = 0;
        size = 0;
        System.out.println("Deque cleared!");
    }
    
    
    
    public static void main(String[] args) {
    	 Scanner sc = new Scanner(System.in);
         System.out.println("----------------------Deque Operations----------------------");
         System.out.print("Enter the size of Deque: ");
         int size = sc.nextInt();
         DoubleEndedQueue dq = new DoubleEndedQueue(size);

         while (true) {
             System.out.println("\n1. Insert Front");
             System.out.println("2. Insert Rear");
             System.out.println("3. Delete Front");
             System.out.println("4. Delete Rear");
             System.out.println("5. Get Front");
             System.out.println("6. Get Rear");
             System.out.println("7. Display");
             System.out.println("8. Clear");
             System.out.println("9. IsEmpty");
             System.out.println("10. IsFull");
             System.out.println("11. Exit");
             System.out.print("Enter Your Choice: ");
             int choice = sc.nextInt();

             switch (choice) {
                 case 1:
                     System.out.print("Enter element: ");
                     dq.insertFront(sc.nextInt());
                     break;
                 case 2:
                     System.out.print("Enter element: ");
                     dq.insertRear(sc.nextInt());
                     break;
                 case 3:
                     dq.deleteFront();
                     break;
                 case 4:
                     dq.deleteRear();
                     break;
                 case 5:
                     System.out.println("Front element: " + dq.getFront());
                     break;
                 case 6:
                     System.out.println("Rear element: " + dq.getRear());
                     break;
                 case 7:
                     dq.display();
                     break;
                 case 8:
                     dq.clear();
                     break;
                 case 9:
                     System.out.println(dq.isEmpty() ? "Deque is empty" : "Deque is not empty");
                     break;
                 case 10:
                     System.out.println(dq.isFull() ? "Deque is full" : "Deque is not full");
                     break;
                 case 11:
                     System.out.println("Bye Bye !!");
                     System.exit(0);
                 default:
                     System.out.println("Invalid Choice, please try again.");
             }
         }
	}
}
