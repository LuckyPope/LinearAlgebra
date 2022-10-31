package ru.vsu.cs.zhilyaev;

import org.junit.jupiter.api.Test;
import java.util.Arrays;

class MathForMatrix3Test {
    MathForMatrix3 mathForMatrix3 = new MathForMatrix3();

    @Test
    void sumOfDoubleMatrix() {
        double[][] matrix1 = new double[][] {
                {1.0, 2.2, 3.4},
                {4.1, 5.5, 6.25},
                {7.4, 8.6, 9.9}
        };
        double[][] matrix2 = new double[][] {
                {12.1, 8.8, 9.2},
                {7.2, 5.52, 12.22},
                {9.5, 3.1 , 1.1}
        };

        double[][] matrixFromMethod = mathForMatrix3.sumOfDoubleMatrix(matrix1, matrix2);
        double[][] matrixResult = new double[][] {
                {1.0 + 12.1, 2.2 + 8.8, 3.4 + 9.2},
                {4.1 + 7.2, 5.5 + 5.52, 6.25 + 12.22},
                {7.4 + 9.5, 8.6 + 3.1, 9.9 + 1.1}
        };
        assert Arrays.deepEquals(matrixResult, matrixFromMethod);
    }

    @Test
    void diffOfDoubleMatrix() {
        double[][] matrix1 = new double[][] {
                {1.0, 2.2, 3.4},
                {4.1, 5.5, 6.25},
                {7.4, 8.6, 9.9}
        };
        double[][] matrix2 = new double[][] {
                {12.1, 8.8, 9.2},
                {7.2, 5.52, 12.22},
                {9.5, 3.1 , 1.1}
        };
        double[][] matrixFromMethod = mathForMatrix3.diffOfDoubleMatrix(matrix1, matrix2);
        double[][] matrixResult = new double[][] {
                {1.0 - 12.1, 2.2 - 8.8, 3.4 - 9.2},
                {4.1 - 7.2, 5.5 - 5.52, 6.25 - 12.22},
                {7.4 - 9.5, 8.6 - 3.1, 9.9 - 1.1}
        };
        assert Arrays.deepEquals(matrixResult, matrixFromMethod);
    }

    @Test
    void increaseDoubleMatrixOnVector() {
        double[][] matrix = new double[][] {
                {1.1, 2.2, 3.4},
                {4.1, 5.5, 6.25},
                {7.4, 8.6, 9.9}
        };
        Vector3 v = new Vector3(1.1, 2.0, 3.0);

        double[][] matrixFromMethod = mathForMatrix3.increaseDoubleMatrixOnVector(matrix, v);
        double[][] matrixResult = new double[][] {
                {1.1 * 1.1 + 2.2 * 2.0 + 3.4 * 3.0},
                {4.1 * 1.1 + 5.5 * 2.0 + 6.25 * 3.0},
                {7.4 * 1.1 + 8.6 * 2.0 + 9.9 * 3.0}
        };

        assert Arrays.deepEquals(matrixResult, matrixFromMethod);
    }

    @Test
    void increaseOfDoubleMatrix() {
        double[][] matrix1 = new double[][] {
                {1.0, 2.2, 3.4},
                {4.1, 5.5, 6.25},
                {7.4, 8.6, 9.9}
        };
        double[][] matrix2 = new double[][] {
                {12.1, 8.8, 9.2},
                {7.2, 5.52, 12.22},
                {9.5, 3.1 , 1.1}
        };

        double[][] matrixFromMethod = mathForMatrix3.increaseOfDoubleMatrix(matrix1, matrix2);
        double[][] matrixResult = new double[][] {
                {1.0 * 12.1 + 2.2 * 7.2 + 3.4 * 9.5, 1.0 * 8.8 + 2.2 * 5.52 + 3.4 * 3.1, 1.0 * 9.2 + 2.2 * 12.22 + 3.4 * 1.1},
                {4.1 * 12.1 + 5.5 * 7.2 + 6.25 * 9.5, 4.1 * 8.8 + 5.5 * 5.52 + 6.25 * 3.1, 4.1 * 9.2 + 5.5 * 12.22 + 6.25 * 1.1},
                {7.4 * 12.1 + 8.6 * 7.2 + 9.9 * 9.5, 7.4 * 8.8 + 8.6 * 5.52 + 9.9 * 3.1, 7.4 * 9.2 + 8.6 * 12.22 + 9.9 * 1.1}
        };

        assert Arrays.deepEquals(matrixResult, matrixFromMethod);
    }

    @Test
    void transDoubleMatrix() {
        double[][] matrix = new double[][] {
                {1.0, 2.2, 3.4},
                {4.1, 5.5, 6.25},
                {7.4, 8.6, 9.9}
        };

        double[][] matrixFromMethod = mathForMatrix3.transDoubleMatrix(matrix);
        double[][] matrixResult = new double[][] {
                {1.0, 4.1, 7.4},
                {2.2, 5.5, 8.6},
                {3.4, 6.25, 9.9}
        };

        assert Arrays.deepEquals(matrixResult, matrixFromMethod);

    }

    @Test
    void nullDoubleMatrix() {
        double[][] matrixFromMethod = mathForMatrix3.nullDoubleMatrix();
        double[][] matrixResult = new double[][] {
                {0, 0, 0},
                {0, 0, 0},
                {0, 0, 0}
        };

        assert Arrays.deepEquals(matrixResult, matrixFromMethod);
    }

    @Test
    void oneDoubleMatrix() {
        double[][] matrixFromMethod = mathForMatrix3.oneDoubleMatrix();
        double[][] matrixResult = new double[][] {
                {1, 0, 0},
                {0, 1, 0},
                {0, 0, 1}
        };

        assert Arrays.deepEquals(matrixResult, matrixFromMethod);
    }
}