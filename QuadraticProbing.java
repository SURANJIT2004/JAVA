package recursive;

public class QuadraticProbing {

    static int m = 11; 
    static int[] hashTable = new int[m];

    // Initialize hash table
    static void initializeHashTable() {
        for (int i = 0; i < m; i++)
            hashTable[i] = -1;
    }

    static int hash(int key) {
        return key % m;
    }

  
    static void insert(int key) {
        int hashValue = hash(key);
        int i = 1;
        int index = hashValue;

        while (hashTable[index] != -1) {
            index = (hashValue + i * i) % m;
            i++;
        }

        hashTable[index] = key;
    }

    // Display hash table
    static void displayHashTable() {
        System.out.println("Hash Table:");
        for (int i = 0; i < m; i++) {
            System.out.println(i + " -->>  " + hashTable[i]);
        }
    }

    public static void main(String[] args) {
        initializeHashTable();

        int[] numbers = {74, 28, 36, 58, 21, 64};
        for (int number : numbers) {
            insert(number);
        }

        displayHashTable();
    }
}

