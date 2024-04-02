package recursive;

import java.util.ArrayList;

public class DoubleHashing {

    private static final int TABLE_SIZE = 11;
    private ArrayList<Integer> table[];

    public DoubleHashing() {
        table = new ArrayList[TABLE_SIZE];
        for (int i = 0; i < TABLE_SIZE; i++) {
            table[i] = new ArrayList<>();
        }
    }

    // Double hashing function to generate hash value
    private int hashFunction1(int key) 
    {
        return key % TABLE_SIZE;
    }

    private int hashFunction2(int key) {
        return 7 - (key % 7); // Using a prime number less than table size
    }

    // Insert method using double hashing
    public void insert(int key) {
        int index = hashFunction1(key);
        int step = hashFunction2(key);
        int i = 0;
        while (i < TABLE_SIZE) {
            if (table[index].isEmpty()) {
                table[index].add(key);
                return;
            }
            index = (index + step) % TABLE_SIZE;
            i++;
        }
        System.out.println("Table is full. Unable to insert: " + key);
    }

    // Display the hash table
    public void display() {
        for (int i = 0; i < TABLE_SIZE; i++) {
            System.out.print( i + "-->>");
            for (int j = 0; j < table[i].size(); j++) {
                System.out.print(table[i].get(j) + " ");
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {
        DoubleHashing hashTable = new DoubleHashing();
        int[] numbers = {76, 26, 37, 59, 21, 65};
        for (int number : numbers) {
            hashTable.insert(number);
        }
        hashTable.display();
    }
}
