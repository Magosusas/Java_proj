public class TreeAndArray {

    public void printTree(int levels) {
        for (int i = 1; i <= levels; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }

    public void createAndPrintArray(int rows, int cols) {
        int[][] array = new int[rows][cols];
        int value = 0;

        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                array[i][j] = value;
                value += 3;
            }
        }

        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                System.out.print(array[i][j] + "\t");
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {
        TreeAndArray obj = new TreeAndArray();

        System.out.println("Ялинка:");
        obj.printTree(6);

        System.out.println("\nДвовимірний масив:");
        obj.createAndPrintArray(3, 3);
    }
}
