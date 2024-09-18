// This defines double array class and variables
public class DoubleDimensionArray {
    private int[][] array;
    private int rows;
    private int cols; 

    // Defines constructor
    public DoubleDimensionArray(int rows, int cols) {
        this.rows = rows;
        this.cols = cols;
        this.array = new int[rows][cols];
        System.out.println("Created a " + rows + "x" + cols + " array.");
    }

    // Using insert method
    public void insert(int row, int col, int value) {
        if (isCorrectPosition(row, col)) {
            array[row][col] = value;
            System.out.println("Inserted " + value + " at position [" + row + "][" + col + "]");
        } else {
            System.out.println("Cannot insert: Position [" + row + "][" + col + "] is not correct.");
        }
    }

    // Traverse method
    public void traverse() {
        System.out.println("Array contents:");
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                System.out.print(array[i][j] + " ");
            }
            System.out.println();
        }
    }

    // Search method
    public void search(int value) {
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                if (array[i][j] == value) {
                    System.out.println("Found " + value + " at position [" + i + "][" + j + "]");
                    return;
                }
            }
        }
        System.out.println(value + " not found in the array");
    }

    // Delete method
    public void delete(int row, int col) {
        if (isCorrectPosition(row, col)) {
            int deletedValue = array[row][col];
            array[row][col] = 0; 
            System.out.println("Deleted " + deletedValue + " from position [" + row + "][" + col + "]");
        } else {
            System.out.println("Cannot delete: Position [" + row + "][" + col + "] is not correct.");
        }
    }

    // This checks if position is within array bounds
    private boolean isCorrectPosition(int row, int col) {
        return row >= 0 && row < rows && col >= 0 && col < cols;
    }

    // Using main method to test the class
    public static void main(String[] args) {
        DoubleDimensionArray dda = new DoubleDimensionArray(3, 3);

        // Test insert
        dda.insert(0, 0, 1);
        dda.insert(0, 1, 2);
        dda.insert(1, 1, 3);
        dda.insert(3, 3, 4); // This prints an error message

        // Test traverse
        dda.traverse();

        // Test search
        dda.search(3);
        dda.search(5);

        // Test delete
        dda.delete(0, 1);
        dda.delete(3, 3); // This prints an error message

        // Traverse again to see the result
        dda.traverse();
    }
}