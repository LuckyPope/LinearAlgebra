package ru.vsu.cs.zhilyaev;

import org.junit.jupiter.api.Test;
import java.util.Arrays;

class MathForMatrix4Test {
    MathForMatrix4 mathForMatrix4 = new MathForMatrix4();

    @Test
    void sumOfDoubleMatrix() {
        float[][] matrix1 = new float[][]{
                {1.0f, 2.3f, 3.7f, 4.6f},
                {5.2f, 7.7f, 24.23f, 9.9f},
                {2.2f, 6.4f, 8.1f, 3.9f},
                {8.2f, 3.3f, 1.1f, 2.2f}
        };
        float[][] matrix2 = new float[][]{
                {0.5f, 1.1f, 7.7f, 4.6f},
                {2.5f, 8.8f, 9.23f, 10.25f},
                {0.75f, 3.5f, 2.0f, 1.0f},
                {0.8f, 12.4f, 50.0f, 7.1f}
        };

        float[][] matrixFromMethod = mathForMatrix4.sumOfDoubleMatrix(matrix1, matrix2);
        float[][] matrixResult = new float[][]{
                {1.0f + 0.5f, 2.3f + 1.1f, 3.7f + 7.7f, 4.6f + 4.6f},
                {5.2f + 2.5f, 7.7f + 8.8f, 24.23f + 9.23f, 9.9f + 10.25f},
                {2.2f + 0.75f, 6.4f + 3.5f, 8.1f + 2.0f, 3.9f + 1.0f},
                {8.2f + 0.8f, 3.3f + 12.4f, 1.1f + 50.0f, 2.2f + 7.1f}
        };

        assert Arrays.deepEquals(matrixResult, matrixFromMethod);
    }

    @Test
    void difOfDoubleMatrix() {
        float[][] matrix1 = new float[][]{
                {1.0f, 2.3f, 3.7f, 4.6f},
                {5.2f, 7.7f, 24.23f, 9.9f},
                {2.2f, 6.4f, 8.1f, 3.9f},
                {8.2f, 3.3f, 1.1f, 2.2f}
        };
        float[][] matrix2 = new float[][]{
                {0.5f, 1.1f, 7.7f, 4.6f},
                {2.5f, 8.8f, 9.23f, 10.25f},
                {0.75f, 3.5f, 2.0f, 1.0f},
                {0.8f, 12.4f, 50.0f, 7.1f}
        };

        float[][] matrixFromMethod = mathForMatrix4.difOfDoubleMatrix(matrix1, matrix2);
        float[][] matrixResult = new float[][]{
                {1.0f - 0.5f, 2.3f - 1.1f, 3.7f - 7.7f, 0},
                {5.2f - 2.5f, 7.7f - 8.8f, 24.23f - 9.23f, 9.9f - 10.25f},
                {2.2f - 0.75f, 6.4f - 3.5f, 8.1f - 2.0f, 3.9f - 1.0f},
                {8.2f - 0.8f, 3.3f - 12.4f, 1.1f - 50.0f, 2.2f - 7.1f}
        };

        assert Arrays.deepEquals(matrixResult, matrixFromMethod);
    }

    @Test
    void increaseDoubleMatrixOnVector() {
        float[][] matrix = new float[][]{
                {1.1f, 2.2f, 3.4f, 7.7f},
                {4.1f, 5.5f, 6.25f, 96.1f},
                {7.4f, 8.6f, 9.9f, 0.02f},
                {12.3f, 64.2f, 1.5f, 5.2f}
        };
        Vector4 v = new Vector4(1.1f, 2.0f, 3.0f, 2.2f);

        float[][] matrixFromMethod = mathForMatrix4.increaseDoubleMatrixOnVector(matrix, v);
        float[][] matrixResult = new float[][]{
                {1.1f * 1.1f + 2.2f * 2.0f + 3.4f * 3.0f + 7.7f * 2.2f},
                {4.1f * 1.1f + 5.5f * 2.0f + 6.25f * 3.0f + 96.1f * 2.2f},
                {7.4f * 1.1f + 8.6f * 2.0f + 9.9f * 3.0f + 0.02f * 2.2f},
                {12.3f * 1.1f + 64.2f * 2.0f + 1.5f * 3.0f + 5.2f * 2.2f}
        };

        assert Arrays.deepEquals(matrixResult, matrixFromMethod);
    }

    @Test
    void increaseOfDoubleMatrix() {
        float[][] matrix1 = new float[][]{
                {1.0f, 2.2f, 3.4f, 22.2f},
                {4.1f, 5.5f, 6.25f, 33.3f},
                {7.4f, 8.6f, 9.9f, 0.01f},
                {2.2f, 6.4f, 22.3f, 0.12f}
        };
        float[][] matrix2 = new float[][]{
                {12.1f, 8.8f, 9.2f, 52.2f},
                {7.2f, 5.52f, 12.22f, 975.2f},
                {9.5f, 3.1f, 1.1f, 2.12f},
                {1.23f, 5.21f, 2.2f, 6.3f}
        };

        float[][] matrixFromMethod = mathForMatrix4.increaseOfDoubleMatrix(matrix1, matrix2);


        float[][] matrixResult = new float[][]{
                {12.1f + 2.2f * 7.2f + 3.4f * 9.5f + 22.2f * 1.23f, 8.8f + 2.2f * 5.52f + 3.4f * 3.1f + 22.2f * 5.21f, 9.2f + 2.2f * 12.22f + 3.4f * 1.1f + 22.2f * 2.2f,
                        52.2f + 2.2f * 975.2f + 3.4f * 2.12f + 22.2f * 6.3f},
                {4.1f * 12.1f + 5.5f * 7.2f + 6.25f * 9.5f + 33.3f * 1.23f, 4.1f * 8.8f + 5.5f * 5.52f + 6.25f * 3.1f + 33.3f * 5.21f, 4.1f * 9.2f + 5.5f * 12.22f + 6.25f * 1.1f + 33.3f * 2.2f,
                        4.1f * 52.2f + 5.5f * 975.2f + 6.25f * 2.12f + 33.3f * 6.3f},
                {7.4f * 12.1f + 8.6f * 7.2f + 9.9f * 9.5f + 0.01f * 1.23f, 7.4f * 8.8f + 8.6f * 5.52f + 9.9f * 3.1f + 0.01f * 5.21f, 7.4f * 9.2f + 8.6f * 12.22f + 9.9f * 1.1f + 0.01f * 2.2f,
                        7.4f * 52.2f + 8.6f * 975.2f + 9.9f * 2.12f + 0.01f * 6.3f},
                {2.2f * 12.1f + 6.4f * 7.2f + 22.3f * 9.5f + 0.12f * 1.23f, 2.2f * 8.8f + 6.4f * 5.52f + 22.3f * 3.1f + 0.12f * 5.21f, 2.2f * 9.2f + 6.4f * 12.22f + 22.3f * 1.1f + 0.12f * 2.2f,
                        2.2f * 52.2f + 6.4f * 975.2f + 22.3f * 2.12f + 0.12f * 6.3f}
        };

        assert Arrays.deepEquals(matrixResult, matrixFromMethod);
    }

    @Test
    void transMatrix() {
        float[][] matrix = new float[][]{
                {1.0f, 2.3f, 3.7f, 4.6f},
                {5.2f, 7.7f, 24.23f, 9.9f},
                {2.2f, 6.4f, 8.1f, 3.9f},
                {8.2f, 3.3f, 1.1f, 2.2f}
        };

        float[][] matrixFromMethod = mathForMatrix4.transMatrix(matrix);
        float[][] matrixResult = new float[][]{
                {1.0f, 5.2f, 2.2f, 8.2f},
                {2.3f, 7.7f, 6.4f, 3.3f},
                {3.7f, 24.23f, 8.1f, 1.1f},
                {4.6f, 9.9f, 3.9f, 2.2f}
        };

        assert Arrays.deepEquals(matrixResult, matrixFromMethod);
    }

    @Test
    void nullMatrix() {
        float[][] matrixFromMethod = mathForMatrix4.nullMatrix();
        float[][] matrixResult = new float[][]{
                {0, 0, 0, 0},
                {0, 0, 0, 0},
                {0, 0, 0, 0},
                {0, 0, 0, 0}
        };

        assert Arrays.deepEquals(matrixResult, matrixFromMethod);
    }

    @Test
    void oneMatrix() {
        float[][] matrixFromMethod = mathForMatrix4.oneMatrix();
        float[][] matrixResult = new float[][]{
                {1, 0, 0, 0},
                {0, 1, 0, 0},
                {0, 0, 1, 0},
                {0, 0, 0, 1}
        };

        assert Arrays.deepEquals(matrixResult, matrixFromMethod);
    }
}