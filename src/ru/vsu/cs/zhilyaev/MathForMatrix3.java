package ru.vsu.cs.zhilyaev;

public class MathForMatrix3 {
    public double[][] sumOfDoubleMatrix(double[][] matrix1, double[][] matrix2) {
        double[][] matrixResult = new double[3][3];
        for (int col = 0; col < matrix1[0].length; col++) {
            for (int row = 0; row < matrix1.length; row++) {
                matrixResult[row][col] = matrix1[row][col] + matrix2[row][col];
            }
        }
        return matrixResult;
    }

    public double[][] diffOfDoubleMatrix(double[][] matrix1, double[][] matrix2) {
        double[][] matrixResult = new double[3][3];
        for (int col = 0; col < matrix1[0].length; col++) {
            for (int row = 0; row < matrix1.length; row++) {
                matrixResult[row][col] = matrix1[row][col] - matrix2[row][col];
            }
        }
        return matrixResult;
    }

    public double[][] increaseDoubleMatrixOnVector(double[][] matrix, Vector3 vector) {
        double[][] matrixResult = new double[3][1];
        double[][] vectorMatrix = new double[3][1];
        vectorMatrix[0][0] = vector.getX();
        vectorMatrix[1][0] = vector.getY();
        vectorMatrix[2][0] = vector.getZ();

        for (int row = 0; row < matrix.length; row++) {
            for (int col = 0; col < matrix[0].length; col++) {
                matrixResult[row][0] += matrix[row][col] * vectorMatrix[col][0];
            }
        }
        return matrixResult;
    }

    public double[][] increaseOfDoubleMatrix(double[][] matrix1, double[][] matrix2) { // Переписать умножение матриц
        double[][] matrixResult = new double[3][3];

        for (int row = 0; row < matrix1.length; row++) {
            for (int col = 0; col < matrix2[0].length; col++) {
                for (int i = 0; i < matrix2.length; i++) {
                    matrixResult[row][col] += (matrix1[row][i] * matrix2[i][col]);
                }
            }
        }
        return matrixResult;
    }

    public double[][] transDoubleMatrix(double[][] matrix) {
        double[][] matrixResult = new double[3][3];
        for (int col = 0; col < matrix[0].length; col++) {
            for (int row = 0; row < matrix.length; row++) {
                matrixResult[col][row] = matrix[row][col];
            }
        }
        return matrixResult;
    }

    public double[][] nullDoubleMatrix() {
        double[][] matrixResult = new double[3][3];
        for (int row = 0; row < matrixResult[0].length; row++) {
            for (int col = 0; col < matrixResult.length; col++) {
                matrixResult[row][col] = 0;
            }
        }
        return matrixResult;
    }

    public double[][] oneDoubleMatrix() {
        double[][] matrixResult = new double[3][3];
        for (int row = 0; row < matrixResult[0].length; row++) {
            for (int col = 0; col < matrixResult.length; col++) {
                if(row == col){
                    matrixResult[row][col] = 1;
                    continue;
                }
                matrixResult[row][col] = 0;
            }
        }
        return matrixResult;
    }
}
