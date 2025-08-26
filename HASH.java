import java.util.ArrayList;
import java.util.List;
public class HASH {
    private int bucketCount;
    // List of lists to store chains
    private List<List<Integer>> table ;

    // Constructor to initialize the hash 
    public HASH(int buckets) {
        bucketCount = buckets ;
        table = new ArrayList<>() ;
        for (int i = 0; i < bucketCount; i++) {
            table.add(new ArrayList<>());
        }
    }

    public void insert(int key) {
        int index = getHashIndex(key);
        table.get(index).add(key);
    }

   // Function to delete key
    public void remove(int key) {
        int index = getHashIndex(key);
        table.get(index).remove(Integer.valueOf(key));
    }

// Function to display
    public void display() {
        for (int i = 0; i < bucketCount; i++) {
            System.out.print(i);
            for (int key : table.get(i)) {
                System.out.print(" --> " + key);
            }

            System.out.println();
        }
    }

    // Simple hash function to map key to index
    private int getHashIndex(int key) {
        return key % bucketCount;
    }

    public static void main(String[] args) {
        int[] keys = {2, 1, 0 , 6, 12,70};

        HASH hashTable = new HASH(7);

        for (int key : keys) {
            hashTable.insert(key);
        }

        hashTable.remove(12);
        hashTable.display();
    }
}

