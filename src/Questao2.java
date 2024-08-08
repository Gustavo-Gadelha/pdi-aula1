public class Questao2 {
    public static final int ROWS = 3;
    public static final int COLS = 3;
    public static final int RANGE = 2;

    public static void main(String[] args) {
        int[][] matrix = MatrixUtil.createMatrix(ROWS, COLS, RANGE);
        int[][] transposedMatrix = transposeMatrix(matrix);

        System.out.println("MATRIZ ORIGINAL: ");
        MatrixUtil.showMatrix(matrix);

        System.out.println("MATRIZ TRANSPOSTA: ");
        MatrixUtil.showMatrix(transposedMatrix);

        System.out.println("As matriz é simétrica? " + checkIfSymmetric(matrix));
        System.out.println("As matriz é de identidade? " + checkIdentity(matrix));
    }

    public static boolean checkIfSymmetric(int[][] matrix) {
        int rows = matrix.length;
        int cols = matrix[0].length;

        if (rows != cols) {
            return false;
        }

        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                if (matrix[i][j] != matrix[j][i]) {
                    return false;
                }
            }
        }

        return true;
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

    public static boolean checkIdentity(int[][] matrix) {
        int rows = matrix.length;
        int cols = matrix[0].length;

        if (rows != cols) {
            return false;
        }

        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                if (i == j && matrix[i][j] != 1) {
                    return false;
                } else if (i != j && matrix[i][j] != 0) {
                    return false;
                }
            }
        }

        return true;
    }
}
