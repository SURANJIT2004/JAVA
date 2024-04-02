package recursive;

public class LinearProbing {
    private static final int TABLE_SIZE = 7;
    private int[] table;

    public LinearProbing() {
        table = new int[TABLE_SIZE];
        for (int i = 0; i < TABLE_SIZE; i++) {
            table[i] = -1; 
        }
    }

    
    private int hash(int key) {
        return key % TABLE_SIZE;
    }

    
    public void insert(int key) {
        int index = hash(key);
        int originalIndex = index;
        do {
            if (table[index] == -1) {
                table[index] = key;
                return;
            }
            index = (index + 1) % TABLE_SIZE; // Linear probing
        } while (index != originalIndex); // Stop if we've checked all slots
        System.out.println("Table is full. Cannot insert " + key);
    }

    // Display the hash table
    public void display() {
        System.out.println("Hash Table:");
        System.out.println();
        for (int i = 0; i < TABLE_SIZE; i++) {
            System.out.println( i + "  -->> " + table[i]);
        }
    }

    public static void main(String[] args) {
        int[] numbers = {50, 700, 76, 85, 92, 73, 101};
        LinearProbing linearProbing = new LinearProbing();

        for (int num : numbers) {
            linearProbing.insert(num);
        }

        linearProbing.display();
    }
}

