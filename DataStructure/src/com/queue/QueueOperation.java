package com.queue;

import java.util.Scanner;

public class QueueOperation {
    static int[] queue;
    static int rear, front;

    static void createQueue(int size) {
        queue = new int[size];
        front = 0;
        rear = 0;
        System.out.println("Queue has been created with the size of " + size);
        System.out.println("====================================");
    }

    static void enqueue(int ele) {
        if (rear == queue.length) {
            System.out.println("Queue is full....!!");
            System.out.println("====================================");
        } else {
            queue[rear] = ele;
            rear++;
            System.out.println(ele + " has been added.");
            System.out.println("====================================");
        }
    }

    static void dequeue() {
        if (rear == front) {
            System.out.println("Queue is empty");
            System.out.println("====================================");
        } else {
            int removed = queue[front];
         
            for (int i = 0; i < rear - 1; i++) {
                queue[i] = queue[i + 1];
            }
            rear--;
            System.out.println(removed + " has been removed.");
            System.out.println("====================================");
        }
    }

    static void display() {
        if (rear == front) {
            System.out.println("Queue is empty");
            System.out.println("====================================");
        } else {
            System.out.print("Queue elements are: ");
            for (int i = front; i < rear; i++) {
                System.out.print(queue[i] + " ");
            }
            System.out.println("\n====================================");
        }
    }

    static void clear() {
        rear = 0;
        front = 0;
        System.out.println("Queue has been cleared.");
        System.out.println("====================================");
    }

    static void isEmpty() {
        if (rear == front) {
            System.out.println("Queue is empty.");
        } else {
            System.out.println("Queue is not empty.");
        }
        System.out.println("====================================");
    }

    static void isFull() {
        if (rear == queue.length) {
            System.out.println("Queue is full.");
        } else {
            System.out.println("Queue is not full.");
        }
        System.out.println("====================================");
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("----------------------Queue Operation----------------------");
        System.out.println("Enter the size of Queue : ");
        int size = sc.nextInt();
        createQueue(size);

        while (true) {
            System.out.println("1.Enqueue\n2.Dequeue\n3.Display\n4.Clear\n5.IsEmpty\n6.IsFull\n7.Exit");
            System.out.println("Enter Your Choice:");
            int choice = sc.nextInt();
            switch (choice) {
                case 1:
                    System.out.println("Enter the element for Queue : ");
                    int ele = sc.nextInt();
                    enqueue(ele);
                    break;
                case 2:
                    dequeue();
                    break;
                case 3:
                    display();
                    break;
                case 4:
                    clear();
                    break;
                case 5:
                    isEmpty();
                    break;
                case 6:
                    isFull();
                    break;
                case 7:
                    System.out.println("Bye Bye !!");
                    System.exit(0);
                    break;
                default:
                    System.out.println("Invalid Choice, give a correct option");
            }
        }
    }
}
