package javaPrep.implementDSFromScratch;

public class MemoryDemo {
    public static void main(String[] args) {
        int x = 10; // primitive stored in stack
        int y = 20; // primitive stored in stack

        Person p1 = new Person("Alice", 25); // object stored in heap, reference on stack
        Person p2 = new Person("Bob", 30);   // same

        System.out.println(x + y);
        System.out.println(p1);
        System.out.println(p2);
    }
}

class Person {
    private String name;  // stored in heap
    private int age;      // primitive, part of heap object

    public Person(String name, int age) {
        this.name = name;
        this.age = age;
    }

    @Override
    public String toString() {
        return name + " (" + age + ")";
    }
}