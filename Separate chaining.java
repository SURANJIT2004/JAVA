package recursive;

import java.util.ArrayList;

public class prg2 {
    // Number of buckets
    private final int length;
    // Hash table of size bucket
    private final ArrayList<Integer>[] table;
 
    public prg2(int length)
    {
        this.length = length;
        this.table = new ArrayList[length];
        for (int i = 0; i < length; i++) { 
            table[i] = new ArrayList<>();
        }
    }
 
    // hash function to map values to key
    public int hashFunction(int key)
    {
        return (key % length);
    }
 
    public void insertItem(int key)
    {
        // get the hash index of key
        int index = hashFunction(key);
        // insert key into hash table at that index
        table[index].add(key);
    }
 
    public void deleteItem(int key)
    {
        // get the hash index of key
        int index = hashFunction(key);
 
        // Check if key is in hash table
        if (!table[index].contains(key)) {
            return;
        }
 
        // delete the key from hash table
        table[index].remove(Integer.valueOf(key));
    }
 
    // function to display hash table
    public void displayHash()
    {
        for (int i = 0; i < length; i++) {
            System.out.print(i);
            for (int x : table[i]) {
                System.out.print(" -->> " + x);
            }
            System.out.println();
        }
    }
 
    // Drive Program
    public static void main(String[] args)
    {
        // array that contains keys to be mapped
        int[] a = { 50, 700, 76, 85, 92, 73, 101 };
 
        // Create a empty has of BUCKET_SIZE
        prg2 h = new prg2(7);

        // insert the keys into the hash table
        for (int x : a) {
            h.insertItem(x);
        }
 
        // delete 12 from the hash table
       
 
        // Display the hash table
        h.displayHash();
    }
}

