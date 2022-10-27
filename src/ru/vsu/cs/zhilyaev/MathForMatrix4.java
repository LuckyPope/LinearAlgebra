package ru.vsu.cs.zhilyaev;

public class MathForMatrix4 {
    public double[][] sumOfDoubleMatrix(double[][] matrix1, double[][] matrix2) {
        double[][] matrixResult = new double[4][4];
        for (int col = 0; col < matrix1[0].length; col++) {
            for (int row = 0; row < matrix1.length; row++) {
                matrixResult[row][col] = matrix1[row][col] + matrix2[row][col];
            }
        }
        return matrixResult;
    }

    public double[][] difOfDoubleMatrix(double[][] matrix1, double[][] matrix2) {
        double[][] matrixResult = new double[4][4];
        for (int col = 0; col < matrix1[0].length; col++) {
            for (int row = 0; row < matrix1.length; row++) {
                matrixResult[row][col] = matrix1[row][col] - matrix2[row][col];
            }
        }
        return matrixResult;
    }

    public double[][] divisionDoubleMatrixOnVector(double[][] matrix, Vector4 vector) {
        double[][] matrixResult = new double[4][4];
        double[][] vectorMatrix = new double[1][4];
        vectorMatrix[0][0] = vector.getX();
        vectorMatrix[0][1] = vector.getY();
        vectorMatrix[0][2] = vector.getZ();
        vectorMatrix[0][3] = vector.getM();

        for (int col = 0; col < matrix[0].length; col++) {
            for (int row = 0; row < matrix.length; row++) {
                matrixResult[row][col] = matrix[row][col] * vectorMatrix[0][col];
            }
        }
        return matrixResult;
    }

    public double[][] divisionOfDoubleMatrix(double[][] matrix1, double[][] matrix2) {
        double[][] matrixResult = new double[4][4];

        for (int row = 0; row < matrix1[0].length; row++) {
            for (int col = 0; col < matrix1.length; col++) {
                matrixResult[row][col] = matrix1[row][col] * matrix2[col][row];
            }
        }
        return matrixResult;
    }

    public double[][] transMatrix(double[][] matrix) {
        double[][] matrixResult = new double[4][4];
        for (int col = 0; col < matrix[0].length; col++) {
            for (int row = 0; row < matrix.length; row++) {
                matrixResult[col][row] = matrix[row][col];
            }
        }
        return matrixResult;
    }

    public double[][] nullMatrix() {
        double[][] matrixResult = new double[4][4];
        for (int row = 0; row < matrixResult[0].length; row++) {
            for (int col = 0; col < matrixResult.length; col++) {
                matrixResult[row][col] = 0;
            }
        }
        return matrixResult;
    }

    public double[][] oneMatrix() {
        double[][] matrixResult = new double[4][4];
        for (int row = 0; row < matrixResult[0].length; row++) {
            for (int col = 0; col < matrixResult.length; col++) {
                matrixResult[row][col] = 1;
            }
        }
        return matrixResult;
    }
}
