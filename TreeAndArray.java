public class TreeAndArray {

    public void printCenteredTree(int levels) {
        for (int i = 1; i <= levels; i++) {
            for (int j = 0; j < levels - i; j++) {
                System.out.print(" ");
            }
            for (int j = 0; j < (2 * i - 1); j++) {
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

        System.out.println("Централізована ялинка:");
        obj.printCenteredTree(6);

        System.out.println("\nДвовимірний масив:");
        obj.createAndPrintArray(3, 3);
    }
}
