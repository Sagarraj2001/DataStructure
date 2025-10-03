package com.queue;

import java.util.Scanner;

public class CircularQueue {
    static int[] queue;
    static int front, rear, size, count;

    static void createQueue(int s) {
        size = s;
        queue = new int[size];
        front = 0;
        rear = -1;
        count = 0;
        System.out.println("Circular Queue created with size " + size);
        System.out.println("====================================");
    }

    static void enqueue(int ele) {
        if (isFull()) {
            System.out.println("Queue is full....!!");
            System.out.println("====================================");
        } else {
            rear = (rear + 1) % size;
            queue[rear] = ele;
            count++;
            System.out.println(ele + " has been added.");
            System.out.println("====================================");
        }
    }

    static void dequeue() {
        if (isEmpty()) {
            System.out.println("Queue is empty");
            System.out.println("====================================");
        } else {
            int removed = queue[front];
            front = (front + 1) % size;
            count--;
            System.out.println(removed + " has been removed.");
            System.out.println("====================================");
        }
    }

    static void display() {
        if (isEmpty()) {
            System.out.println("Queue is empty");
            System.out.println("====================================");
        } else {
            System.out.print("Queue elements are: ");
            int i = front;
            for (int c = 0; c < count; c++) {
                System.out.print(queue[i] + " ");
                i = (i + 1) % size;
            }
            System.out.println("\n====================================");
        }
    }

    static void clear() {
        front = 0;
        rear = -1;
        count = 0;
        System.out.println("Queue has been cleared.");
        System.out.println("====================================");
    }

    static boolean isEmpty() {
        return count == 0;
    }

    static boolean isFull() {
        return count == size;
    }

    static void checkEmpty() {
        if (isEmpty()) {
            System.out.println("Queue is empty.");
        } else {
            System.out.println("Queue is not empty.");
        }
        System.out.println("====================================");
    }

    static void checkFull() {
        if (isFull()) {
            System.out.println("Queue is full.");
        } else {
            System.out.println("Queue is not full.");
        }
        System.out.println("====================================");
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("----------------------Circular Queue Operation----------------------");
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
                    checkEmpty();
                    break;
                case 6:
                    checkFull();
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
