package ru.vsu.cs.zhilyaev;

import org.junit.jupiter.api.Test;
import java.util.Arrays;

class MathForMatrix4Test {
    MathForMatrix4 mathForMatrix4 = new MathForMatrix4();

    @Test
    void sumOfDoubleMatrix() {
        double[][] matrix1 = new double[][] {
                {1.0, 2.3, 3.7, 4.6},
                {5.2, 7.7, 24.23, 9.9},
                {2.2, 6.4, 8.1, 3.9},
                {8.2, 3.3, 1.1, 2.2}
        };
        double[][] matrix2 = new double[][] {
                {0.5, 1.1, 7.7, 4.6},
                {2.5, 8.8, 9.23, 10.25},
                {0.75, 3.5, 2.0, 1.0},
                {0.8, 12.4, 50.0, 7.1}
        };

        double[][] matrixFromMethod = mathForMatrix4.sumOfDoubleMatrix(matrix1, matrix2);
        double[][] matrixResult = new double[][] {
                {1.0 + 0.5, 2.3 + 1.1, 3.7 + 7.7, 4.6 + 4.6},
                {5.2 + 2.5, 7.7 + 8.8, 24.23 + 9.23, 9.9 + 10.25},
                {2.2 + 0.75, 6.4 + 3.5, 8.1 + 2.0, 3.9 + 1.0},
                {8.2 + 0.8, 3.3 + 12.4, 1.1 + 50.0, 2.2 + 7.1}
        };

        assert Arrays.deepEquals(matrixResult, matrixFromMethod);
    }

    @Test
    void difOfDoubleMatrix() {
        double[][] matrix1 = new double[][] {
                {1.0, 2.3, 3.7, 4.6},
                {5.2, 7.7, 24.23, 9.9},
                {2.2, 6.4, 8.1, 3.9},
                {8.2, 3.3, 1.1, 2.2}
        };
        double[][] matrix2 = new double[][] {
                {0.5, 1.1, 7.7, 4.6},
                {2.5, 8.8, 9.23, 10.25},
                {0.75, 3.5, 2.0, 1.0},
                {0.8, 12.4, 50.0, 7.1}
        };

        double[][] matrixFromMethod = mathForMatrix4.difOfDoubleMatrix(matrix1, matrix2);
        double[][] matrixResult = new double[][] {
                {1.0 - 0.5, 2.3 - 1.1, 3.7 - 7.7, 4.6 - 4.6},
                {5.2 - 2.5, 7.7 - 8.8, 24.23 - 9.23, 9.9 - 10.25},
                {2.2 - 0.75, 6.4 - 3.5, 8.1 - 2.0, 3.9 - 1.0},
                {8.2 - 0.8, 3.3 - 12.4, 1.1 - 50.0, 2.2 - 7.1}
        };

        assert Arrays.deepEquals(matrixResult, matrixFromMethod);
    }

    @Test
    void increaseDoubleMatrixOnVector() {
    }

    @Test
    void increaseOfDoubleMatrix() {
    }

    @Test
    void transMatrix() {
        double[][] matrix = new double[][] {
                {1.0, 2.3, 3.7, 4.6},
                {5.2, 7.7, 24.23, 9.9},
                {2.2, 6.4, 8.1, 3.9},
                {8.2, 3.3, 1.1, 2.2}
        };

        double[][] matrixFromMethod = mathForMatrix4.transMatrix(matrix);
        double[][] matrixResult = new double[][] {
                {1.0, 5.2 , 2.2, 8.2},
                {2.3, 7.7, 6.4, 3.3},
                {3.7, 24.23, 8.1, 1.1},
                {4.6, 9.9, 3.9, 2.2}
        };

        assert Arrays.deepEquals(matrixResult, matrixFromMethod);
    }

    @Test
    void nullMatrix() {
        double[][] matrixFromMethod = mathForMatrix4.nullMatrix();
        double[][] matrixResult = new double[][] {
                {0, 0, 0, 0},
                {0, 0, 0, 0},
                {0, 0, 0, 0},
                {0, 0, 0, 0}
        };

        assert Arrays.deepEquals(matrixResult, matrixFromMethod);
    }

    @Test
    void oneMatrix() {
        double[][] matrixFromMethod = mathForMatrix4.oneMatrix();
        double[][] matrixResult = new double[][] {
                {1, 1, 1, 1},
                {1, 1, 1, 1},
                {1, 1, 1, 1},
                {1, 1, 1, 1}
        };

        assert Arrays.deepEquals(matrixResult, matrixFromMethod);
    }
}