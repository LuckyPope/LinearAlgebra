package ru.vsu.cs.zhilyaev;

import org.junit.jupiter.api.Test;
import java.util.Arrays;

class MathForMatrix3Test {
    MathForMatrix3 mathForMatrix3 = new MathForMatrix3();

    @Test
    void sumOfDoubleMatrix() {
        float[][] matrix1 = new float[][] {
                {1.0f, 2.2f, 3.4f},
                {4.1f, 5.5f, 6.25f},
                {7.4f, 8.6f, 9.9f}
        };
        float[][] matrix2 = new float[][] {
                {12.1f, 8.8f, 9.2f},
                {7.2f, 5.52f, 12.22f},
                {9.5f, 3.1f , 1.1f}
        };

        float[][] matrixFromMethod = mathForMatrix3.sumOfDoubleMatrix(matrix1, matrix2);
        float[][] matrixResult = new float[][] {
                {1.0f + 12.1f, 2.2f + 8.8f, 3.4f + 9.2f},
                {4.1f + 7.2f, 5.5f + 5.52f, 6.25f + 12.22f},
                {7.4f + 9.5f, 8.6f + 3.1f, 9.9f + 1.1f}
        };
        assert Arrays.deepEquals(matrixResult, matrixFromMethod);
    }

    @Test
    void diffOfDoubleMatrix() {
        float[][] matrix1 = new float[][] {
                {1.0f, 2.2f, 3.4f},
                {4.1f, 5.5f, 6.25f},
                {7.4f, 8.6f, 9.9f}
        };
        float[][] matrix2 = new float[][] {
                {12.1f, 8.8f, 9.2f},
                {7.2f, 5.52f, 12.22f},
                {9.5f, 3.1f , 1.1f}
        };

        float[][] matrixFromMethod = mathForMatrix3.diffOfDoubleMatrix(matrix1, matrix2);
        float[][] matrixResult = new float[][] {
                {1.0f - 12.1f, 2.2f - 8.8f, 3.4f - 9.2f},
                {4.1f - 7.2f, 5.5f - 5.52f, 6.25f - 12.22f},
                {7.4f - 9.5f, 8.6f - 3.1f, 9.9f - 1.1f}
        };
        assert Arrays.deepEquals(matrixResult, matrixFromMethod);
    }

    @Test
    void increaseDoubleMatrixOnVector() {
        float[][] matrix = new float[][] {
                {1.0f, 2.2f, 3.4f},
                {4.1f, 5.5f, 6.25f},
                {7.4f, 8.6f, 9.9f}
        };
        Vector3 v = new Vector3(1.1f, 2.0f, 3.0f);

        float[][] matrixFromMethod = mathForMatrix3.increaseDoubleMatrixOnVector(matrix, v);
        float[][] matrixResult = new float[][] {
                {1.0f * 1.1f + 2.2f * 2.0f + 3.4f * 3.0f},
                {4.1f * 1.1f + 5.5f * 2.0f + 6.25f * 3.0f},
                {7.4f * 1.1f + 8.6f * 2.0f + 9.9f * 3.0f}
        };

        assert Arrays.deepEquals(matrixResult, matrixFromMethod);
    }

    @Test
    void increaseOfDoubleMatrix() {
        float[][] matrix1 = new float[][] {
                {1.0f, 2.2f, 3.4f},
                {4.1f, 5.5f, 6.25f},
                {7.4f, 8.6f, 9.9f}
        };
        float[][] matrix2 = new float[][] {
                {12.1f, 8.8f, 9.2f},
                {7.2f, 5.52f, 12.22f},
                {9.5f, 3.1f , 1.1f}
        };

        float[][] matrixFromMethod = mathForMatrix3.increaseOfDoubleMatrix(matrix1, matrix2);
        float[][] matrixResult = new float[][] {
                {12.1f + 2.2f * 7.2f + 3.4f * 9.5f, 8.8f + 2.2f * 5.52f + 3.4f * 3.1f, 9.2f + 2.2f * 12.22f + 3.4f * 1.1f},
                {4.1f * 12.1f + 5.5f * 7.2f + 6.25f * 9.5f, 4.1f * 8.8f + 5.5f * 5.52f + 6.25f * 3.1f, 4.1f * 9.2f + 5.5f * 12.22f + 6.25f * 1.1f},
                {7.4f * 12.1f + 8.6f * 7.2f + 9.9f * 9.5f, 7.4f * 8.8f + 8.6f * 5.52f + 9.9f * 3.1f, 7.4f * 9.2f + 8.6f * 12.22f + 9.9f * 1.1f}
        };

        assert Arrays.deepEquals(matrixResult, matrixFromMethod);
    }

    @Test
    void transDoubleMatrix() {
        float[][] matrix = new float[][] {
                {1.0f, 2.2f, 3.4f},
                {4.1f, 5.5f, 6.25f},
                {7.4f, 8.6f, 9.9f}
        };

        float[][] matrixFromMethod = mathForMatrix3.transDoubleMatrix(matrix);
        float[][] matrixResult = new float[][] {
                {1.0f, 4.1f, 7.4f},
                {2.2f, 5.5f, 8.6f},
                {3.4f, 6.25f, 9.9f}
        };

        assert Arrays.deepEquals(matrixResult, matrixFromMethod);

    }

    @Test
    void nullDoubleMatrix() {
        float[][] matrixFromMethod = mathForMatrix3.nullDoubleMatrix();
        float[][] matrixResult = new float[][] {
                {0, 0, 0},
                {0, 0, 0},
                {0, 0, 0}
        };

        assert Arrays.deepEquals(matrixResult, matrixFromMethod);
    }

    @Test
    void oneDoubleMatrix() {
        float[][] matrixFromMethod = mathForMatrix3.oneDoubleMatrix();
        float[][] matrixResult = new float[][] {
                {1, 0, 0},
                {0, 1, 0},
                {0, 0, 1}
        };

        assert Arrays.deepEquals(matrixResult, matrixFromMethod);
    }
}