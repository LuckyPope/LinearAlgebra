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
        double[][] matrix = new double[][] {
                {1.1, 2.2, 3.4, 7.7},
                {4.1, 5.5, 6.25, 96.1},
                {7.4, 8.6, 9.9, 0.02},
                {12.3, 64.2, 1.5, 5.2}
        };
        Vector4 v = new Vector4(1.1, 2.0, 3.0, 2.2);

        double[][] matrixFromMethod = mathForMatrix4.increaseDoubleMatrixOnVector(matrix, v);
        double[][] matrixResult = new double[][] {
                {1.1 * 1.1 + 2.2 * 2.0 + 3.4 * 3.0 + 7.7 * 2.2},
                {4.1 * 1.1 + 5.5 * 2.0 + 6.25 * 3.0 + 96.1 * 2.2},
                {7.4 * 1.1 + 8.6 * 2.0 + 9.9 * 3.0 + 0.02 * 2.2},
                {12.3 * 1.1 + 64.2 * 2.0 + 1.5 * 3.0 + 5.2 * 2.2}
        };

        assert Arrays.deepEquals(matrixResult, matrixFromMethod);
    }

    @Test
    void increaseOfDoubleMatrix() {
        double[][] matrix1 = new double[][] {
                {1.0, 2.2, 3.4, 22.2},
                {4.1, 5.5, 6.25, 33.3},
                {7.4, 8.6, 9.9, 0.01},
                {2.2, 6.4, 22.3, 0.12}
        };
        double[][] matrix2 = new double[][] {
                {12.1, 8.8, 9.2, 52.2},
                {7.2, 5.52, 12.22, 975.2},
                {9.5, 3.1 , 1.1, 2.12},
                {1.23, 5.21, 2.2, 6.3}
        };

        double[][] matrixFromMethod = mathForMatrix4.increaseOfDoubleMatrix(matrix1, matrix2);
        double[][] matrixResult = new double[][] {
                {1.0 * 12.1 + 2.2 * 7.2 + 3.4 * 9.5 + 22.2 * 1.23, 1.0 * 8.8 + 2.2 * 5.52 + 3.4 * 3.1 + 22.2 * 5.21, 1.0 * 9.2 + 2.2 * 12.22 + 3.4 * 1.1 + 22.2 * 2.2,
                        1.0 * 52.2 + 2.2 * 975.2 + 3.4 * 2.12 + 22.2 * 6.3},
                {4.1 * 12.1 + 5.5 * 7.2 + 6.25 * 9.5 + 33.3 * 1.23, 4.1 * 8.8 + 5.5 * 5.52 + 6.25 * 3.1 + 33.3 * 5.21, 4.1 * 9.2 + 5.5 * 12.22 + 6.25 * 1.1 + 33.3 * 2.2,
                        4.1 * 52.2 + 5.5 * 975.2 +6.25 * 2.12 + 33.3 * 6.3},
                {7.4 * 12.1 + 8.6 * 7.2 + 9.9 * 9.5 + 0.01 * 1.23, 7.4 * 8.8 + 8.6 * 5.52 + 9.9 * 3.1 + 0.01 * 5.21, 7.4 * 9.2 + 8.6 * 12.22 + 9.9 * 1.1 + 0.01 * 2.2,
                        7.4 * 52.2 + 8.6 * 975.2 + 9.9 * 2.12 + 0.01 * 6.3},
                {2.2 * 12.1 + 6.4 * 7.2 + 22.3 * 9.5 + 0.12 * 1.23, 2.2 * 8.8 + 6.4 * 5.52 + 22.3 * 3.1 + 0.12 * 5.21, 2.2 * 9.2 + 6.4 * 12.22 + 22.3 * 1.1 + 0.12 * 2.2,
                        2.2 * 52.2 + 6.4 * 975.2 + 22.3 * 2.12 + 0.12 * 6.3}
        };

        assert Arrays.deepEquals(matrixResult, matrixFromMethod);
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