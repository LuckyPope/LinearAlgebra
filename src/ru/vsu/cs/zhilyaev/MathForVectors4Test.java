package ru.vsu.cs.zhilyaev;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class MathForVectors4Test {
    MathForVectors4 mathForVectors4 = new MathForVectors4();

    @Test
    void sumOfVectors() {
        Vector4 v1 = new Vector4(6.0, 5.2, 3.3, 1.0);
        Vector4 v2 = new Vector4(2.2, 5.25, 2.0, 1.1);

        Vector4 vectorFromMethod = mathForVectors4.sumOfVectors(v1, v2);
        Vector4 vectorResult = new Vector4(8.2, 10.45, 5.3, 2.1);

        double eps = 1e-6;

        assert (vectorFromMethod.getX() - vectorResult.getX()) < eps;
        assert (vectorFromMethod.getY() - vectorResult.getY()) < eps;
        assert (vectorFromMethod.getZ() - vectorResult.getZ()) < eps;
        assert (vectorFromMethod.getM() - vectorResult.getM()) < eps;
    }

    @Test
    void diffOfVectors() {
        Vector4 v1 = new Vector4(6.0, 5.2, 3.3, 1.0);
        Vector4 v2 = new Vector4(2.2, 5.25, 2.0, 1.1);

        Vector4 vectorFromMethod = mathForVectors4.diffOfVectors(v1, v2);
        Vector4 vectorResult = new Vector4(6.0 - 2.2, 5.2 - 5.25, 3.3 - 2.0, 1.0 - 1.1);

        double eps = 1e-6;

        assert (vectorFromMethod.getX() - vectorResult.getX()) < eps;
        assert (vectorFromMethod.getY() - vectorResult.getY()) < eps;
        assert (vectorFromMethod.getZ() - vectorResult.getZ()) < eps;
        assert (vectorFromMethod.getM() - vectorResult.getM()) < eps;
    }

    @Test
    void increaseVectorOnNumber() {
        Vector4 v1 = new Vector4(6.0, 5.2, 3.4, 1.1);
        double n = 3.0;

        Vector4 vectorFromMethod = mathForVectors4.increaseVectorOnNumber(v1, n);
        Vector4 vectorResult = new Vector4(6.0 * 3.0, 5.2 * 3.0, 3.4 * 3.0, 1.1 * 3.0);

        double eps = 1e-6;

        assert (vectorFromMethod.getX() - vectorResult.getX()) < eps;
        assert (vectorFromMethod.getY() - vectorResult.getY()) < eps;
        assert (vectorFromMethod.getZ() - vectorResult.getZ()) < eps;
        assert (vectorFromMethod.getM() - vectorResult.getM()) < eps;
    }

    @Test
    void divisionOnNumber() {
        Vector4 v1 = new Vector4(6.0, 5.2, 3.4, 1.0);
        double n = 2.0;

        Vector4 vectorFromMethod = mathForVectors4.divisionVectorOnNumber(v1, n);
        Vector4 vectorResult = new Vector4(3.0, 2.6, 1.7, 0.5);

        double eps = 1e-6;

        assert (vectorFromMethod.getX() - vectorResult.getX()) < eps;
        assert (vectorFromMethod.getY() - vectorResult.getY()) < eps;
        assert (vectorFromMethod.getZ() - vectorResult.getZ()) < eps;
        assert (vectorFromMethod.getM() - vectorResult.getM()) < eps;
    }

    @Test
    void divisionOnZero() {
        Vector4 v1 = new Vector4(6.0, 5.2, 3.4, 1.0);
        double n = 0.0;

        Vector4 vectorFromMethod = mathForVectors4.divisionVectorOnNumber(v1, n);
        assert vectorFromMethod == null;
    }

    @Test
    void lengthOfVector() {
        Vector4 v1 = new Vector4(1.0, 1.0, 5.0, 3.0);

        double lengthFromMethod = mathForVectors4.lengthOfVector(v1);
        double lengthResult = 6.0;

        double eps = 1e-6;

        assert (lengthResult - lengthFromMethod) < eps;
    }

    @Test
    void scalarProduct() {
        Vector4 v1 = new Vector4(6.0, 5.2, 3.3, 1.2);
        Vector4 v2 = new Vector4(2.2, 5.25, 2.0, 1.1);

        double resultFromMethod = mathForVectors4.scalarProduct(v1, v2);
        double result = 6.0 * 2.2 + 5.2 * 5.25 + 3.3 * 2.0 + 1.2 * 1.1;

        double eps = 1e-6;

        assert (result - resultFromMethod) < eps;
    }

    // 1 1 5 3
    // 2 4 5 6
    @Test
    void normalization() {
        //Vector4 v1 = new Vector4(2.0, 4.0, 5.0, 6.0);
        Vector4 v1 = new Vector4(1.0, 1.0, 5.0, 3.0);

        Vector4 vectorFromMethod = mathForVectors4.normalization(v1);
        //Vector4 vectorResult = new Vector4(2.0 / 9.0, 4.0 / 9.0, 5.0 / 9.0, 6.0 / 9.0);
        Vector4 vectorResult = new Vector4(1.0 / 6.0, 1.0 / 6.0, 5.0 / 6.0, 3.0 / 6.0);

        double eps = 1e-6;

        assert (vectorFromMethod.getX() - vectorResult.getX()) < eps;
        assert (vectorFromMethod.getY() - vectorResult.getY()) < eps;
        assert (vectorFromMethod.getZ() - vectorResult.getZ()) < eps;
        assert (vectorFromMethod.getM() - vectorResult.getM()) < eps;
    }
}