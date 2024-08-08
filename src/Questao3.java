import java.util.Arrays;

public class Questao3 {
    public static final int ROWS = 5;
    public static final int COLS = 5;
    public static final int RANGE = 2;

    public static void main(String[] args) {
        int[][] matrixA = MatrixUtil.createMatrix(ROWS, COLS, RANGE);
        int[][] matrixB = MatrixUtil.createMatrix(ROWS, COLS, RANGE);
        int[][] resultMatrix = sumMatrices(matrixA, matrixB);

        MatrixUtil.showMatrix(matrixA);
        System.out.println(" + ");
        MatrixUtil.showMatrix(matrixB);
        System.out.println(" = ");
        MatrixUtil.showMatrix(resultMatrix);
    }

    private static int[][] sumMatrices(int[][] matrixA, int[][] matrixB) {
        int[][] resultMatrix = new int[ROWS][COLS];

        for (int i = 0; i < ROWS; i++) {
            for (int j = 0; j < COLS; j++) {
                resultMatrix[i][j] = matrixA[i][j] + matrixB[i][j];
            }
        }

        return resultMatrix;
    }
}
