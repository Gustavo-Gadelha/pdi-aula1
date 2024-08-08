public class Questao5 {
    public static final int ROWS = 3;
    public static final int COLS = 4;
    public static final int RANGE = 2;

    public static void main(String[] args) {
        int[][] matrix = MatrixUtil.createMatrix(ROWS, COLS, RANGE);
        int[][] transposedMatrix = transposeMatrix(matrix);

        System.out.println("MATRIZ ORIGINAL: ");
        MatrixUtil.showMatrix(matrix);

        System.out.println("MATRIZ TRANSPOSTA: ");
        MatrixUtil.showMatrix(transposedMatrix);
    }

    public static int[][] transposeMatrix(int[][] matrix) {
        int rows = matrix.length;
        int cols = matrix[0].length;
        int[][] resultMatrix = new int[cols][rows];

        for (int i = 0; i < cols; i++) {
            for (int j = 0; j < rows; j++) {
                resultMatrix[i][j] = matrix[j][i];
            }
        }

        return resultMatrix;
    }
}
