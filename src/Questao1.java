public class Questao1 {
    public static final int ROWS = 5;
    public static final int COLS = 5;
    public static final int RANGE = 100;

    public static void main(String[] args) {
        int[][] matrix = MatrixUtil.createMatrix(ROWS, COLS, RANGE + 1);

        int diagonalEsquerda = 0;
        for (int i = 0; i < matrix.length; i++) {
            diagonalEsquerda += matrix[i][i];
        }

        int diagonalDireta = 0;
        for (int i = 0; i < matrix.length; i++) {
            diagonalDireta += matrix[i][(matrix[0].length - 1) - i];
        }

        MatrixUtil.showMatrix(matrix);
        System.out.println("Soma: " + sumAllElements(matrix));
        System.out.println("Diagonal esquerda (\\): " + diagonalEsquerda);
        System.out.println("Diagonal direita  (/): " + diagonalDireta);
    }

    public static int sumAllElements(int[][] matrix) {
        int totalSum = 0;

        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[0].length; j++) {
                totalSum += matrix[i][j];
            }
        }

        return totalSum;
    }
}
