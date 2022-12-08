package ru.vsu.cs.zhilyaev;

import org.junit.jupiter.api.Test;

class MathForVectors4Test {
    MathForVectors4 mathForVectors4 = new MathForVectors4();

    @Test
    void sumOfVectors() {
        Vector4 v1 = new Vector4(6.0f, 5.2f, 3.3f, 1.0f);
        Vector4 v2 = new Vector4(2.2f, 5.25f, 2.0f, 1.1f);

        Vector4 vectorFromMethod = mathForVectors4.sumOfVectors(v1, v2);
        Vector4 vectorResult = new Vector4(8.2f, 10.45f, 5.3f, 2.1f);

        double eps = 1e-6;

        assert (vectorFromMethod.getX() - vectorResult.getX()) < eps;
        assert (vectorFromMethod.getY() - vectorResult.getY()) < eps;
        assert (vectorFromMethod.getZ() - vectorResult.getZ()) < eps;
        assert (vectorFromMethod.getM() - vectorResult.getM()) < eps;
    }

    @Test
    void diffOfVectors() {
        Vector4 v1 = new Vector4(6.0f, 5.2f, 3.3f, 1.0f);
        Vector4 v2 = new Vector4(2.2f, 5.25f, 2.0f, 1.1f);

        Vector4 vectorFromMethod = mathForVectors4.diffOfVectors(v1, v2);
        Vector4 vectorResult = new Vector4(6.0f - 2.2f, 5.2f - 5.25f, 3.3f - 2.0f, 1.0f - 1.1f);

        double eps = 1e-6;

        assert (vectorFromMethod.getX() - vectorResult.getX()) < eps;
        assert (vectorFromMethod.getY() - vectorResult.getY()) < eps;
        assert (vectorFromMethod.getZ() - vectorResult.getZ()) < eps;
        assert (vectorFromMethod.getM() - vectorResult.getM()) < eps;
    }

    @Test
    void increaseVectorOnNumber() {
        Vector4 v1 = new Vector4(6.0f, 5.2f, 3.4f, 1.1f);
        float n = 3.0f;

        Vector4 vectorFromMethod = mathForVectors4.increaseVectorOnNumber(v1, n);
        Vector4 vectorResult = new Vector4(6.0f * 3.0f, 5.2f * 3.0f, 3.4f * 3.0f, 1.1f * 3.0f);

        double eps = 1e-6;

        assert (vectorFromMethod.getX() - vectorResult.getX()) < eps;
        assert (vectorFromMethod.getY() - vectorResult.getY()) < eps;
        assert (vectorFromMethod.getZ() - vectorResult.getZ()) < eps;
        assert (vectorFromMethod.getM() - vectorResult.getM()) < eps;
    }

    @Test
    void divisionOnNumber() {
        Vector4 v1 = new Vector4(6.0f, 5.2f, 3.4f, 1.0f);
        float n = 2.0f;

        Vector4 vectorFromMethod = mathForVectors4.divisionVectorOnNumber(v1, n);
        Vector4 vectorResult = new Vector4(3.0f, 2.6f, 1.7f, 0.5f);

        double eps = 1e-6;

        assert (vectorFromMethod.getX() - vectorResult.getX()) < eps;
        assert (vectorFromMethod.getY() - vectorResult.getY()) < eps;
        assert (vectorFromMethod.getZ() - vectorResult.getZ()) < eps;
        assert (vectorFromMethod.getM() - vectorResult.getM()) < eps;
    }

    @Test
    void divisionOnZero() {
        Vector4 v1 = new Vector4(6.0f, 5.2f, 3.4f, 1.0f);
        float n = 0.0f;

        Vector4 vectorFromMethod = mathForVectors4.divisionVectorOnNumber(v1, n);
        assert vectorFromMethod == null;
    }

    @Test
    void lengthOfVector() {
        Vector4 v1 = new Vector4(1.0f, 1.0f, 5.0f, 3.0f);

        float lengthFromMethod = mathForVectors4.lengthOfVector(v1);
        float lengthResult = 6.0f;

        double eps = 1e-6;

        assert (lengthResult - lengthFromMethod) < eps;
    }

    @Test
    void scalarProduct() {
        Vector4 v1 = new Vector4(6.0f, 5.2f, 3.3f, 1.2f);
        Vector4 v2 = new Vector4(2.2f, 5.25f, 2.0f, 1.1f);

        float resultFromMethod = mathForVectors4.scalarProduct(v1, v2);
        float result = 6.0f * 2.2f + 5.2f * 5.25f + 3.3f * 2.0f + 1.2f * 1.1f;

        double eps = 1e-6;

        assert (result - resultFromMethod) < eps;
    }

    // 1 1 5 3
    // 2 4 5 6
    @Test
    void normalization() {
        //Vector4 v1 = new Vector4(2.0, 4.0, 5.0, 6.0);
        Vector4 v1 = new Vector4(1.0f, 1.0f, 5.0f, 3.0f);

        Vector4 vectorFromMethod = mathForVectors4.normalization(v1);
        //Vector4 vectorResult = new Vector4(2.0 / 9.0, 4.0 / 9.0, 5.0 / 9.0, 6.0 / 9.0);
        Vector4 vectorResult = new Vector4(1.0f / 6.0f, 1.0f / 6.0f, 5.0f / 6.0f, 3.0f / 6.0f);

        double eps = 1e-6;

        assert (vectorFromMethod.getX() - vectorResult.getX()) < eps;
        assert (vectorFromMethod.getY() - vectorResult.getY()) < eps;
        assert (vectorFromMethod.getZ() - vectorResult.getZ()) < eps;
        assert (vectorFromMethod.getM() - vectorResult.getM()) < eps;
    }
}