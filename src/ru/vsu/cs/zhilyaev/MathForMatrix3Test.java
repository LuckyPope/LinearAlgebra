package ru.vsu.cs.zhilyaev;

import org.junit.jupiter.api.Test;
import java.util.Arrays;

class MathForMatrix3Test {
    MathForMatrix3 mathForMatrix3 = new MathForMatrix3();

    @Test
    void sumOfDoubleMatrix() {
        double[][] matrix1 = new double[][] {
                {1, 2, 3},
                {4, 5, 6},
                {7, 8, 9}
        };
        double[][] matrix2 = new double[][] {
                {9, 8, 7},
                {6, 5, 4},
                {3, 2 , 1}
        };

        double[][] matrixFromMethod = mathForMatrix3.sumOfDoubleMatrix(matrix1, matrix2);
        double[][] matrixResult = new double[][] {
                {10, 10, 10},
                {10, 10, 10},
                {10, 10, 10}
        };
        assert Arrays.deepEquals(matrixResult, matrixFromMethod);
    }

    @Test
    void diffOfDoubleMatrix() {
        double[][] matrix1 = new double[][] {
                {1, 2, 3},
                {4, 5, 6},
                {7, 8, 9}
        };
        double[][] matrix2 = new double[][] {
                {9, 8, 7},
                {6, 5, 4},
                {3, 2 , 1}
        };
        double[][] matrixFromMethod = mathForMatrix3.diffOfDoubleMatrix(matrix1, matrix2);
        double[][] matrixResult = new double[][] {
                {-8, -6, -4},
                {-2, 0, 2},
                {4, 6, 8}
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
    void transDoubleMatrix() {
        double[][] matrix = new double[][] {
                {1, 2, 3},
                {4, 5, 6},
                {7, 8, 9}
        };

        double[][] matrixFromMethod = mathForMatrix3.transDoubleMatrix(matrix);
        double[][] matrixResult = new double[][] {
                {1, 4, 7},
                {2, 5, 8},
                {3, 6, 9}
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
                {1, 1, 1},
                {1, 1, 1},
                {1, 1, 1}
        };

        assert Arrays.deepEquals(matrixResult, matrixFromMethod);
    }
}