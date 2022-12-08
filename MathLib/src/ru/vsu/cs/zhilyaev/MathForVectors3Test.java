package ru.vsu.cs.zhilyaev;

import org.junit.jupiter.api.Test;

class MathForVectors3Test {
    MathForVectors3 mathForVectors3 = new MathForVectors3();

    @Test
    void sumOfVectors() {
        Vector3 v1 = new Vector3(1.0f, 2.0f, 7.0f);
        Vector3 v2 = new Vector3(5.0f, 6.0f, 3.0f);

        Vector3 vectorFromMethod = mathForVectors3.sumOfVectors(v1, v2);
        Vector3 vectorResult = new Vector3(6.0f, 8.0f, 10.0f);

        double eps = 1e-6;

        assert (vectorFromMethod.getX() - vectorResult.getX()) < eps;
        assert (vectorFromMethod.getY() - vectorResult.getY()) < eps;
        assert (vectorFromMethod.getZ() - vectorResult.getZ()) < eps;
    }

    @Test
    void diffOfVectors() {
        Vector3 v1 = new Vector3(1.0f, 2.0f, 8.0f);
        Vector3 v2 = new Vector3(5.0f, 6.0f, 3.5f);

        Vector3 vectorFromMethod = mathForVectors3.diffOfVectors(v1, v2);
        Vector3 vectorResult = new Vector3(-4.0f, -4.0f, 4.5f);

        double eps = 1e-6;

        assert (vectorFromMethod.getX() - vectorResult.getX()) < eps;
        assert (vectorFromMethod.getY() - vectorResult.getY()) < eps;
        assert (vectorFromMethod.getZ() - vectorResult.getZ()) < eps;
    }

    @Test
    void increaseVectorOnNumber() {
        Vector3 v1 = new Vector3(1.0f, 2.0f, 5.2f);
        float n = 5.0f;

        Vector3 vectorFromMethod = mathForVectors3.increaseVectorOnNumber(v1, n);
        Vector3 vectorResult = new Vector3(5.0f, 10.0f, 26.0f);

        double eps = 1e-6;

        assert (vectorFromMethod.getX() - vectorResult.getX()) < eps;
        assert (vectorFromMethod.getY() - vectorResult.getY()) < eps;
        assert (vectorFromMethod.getZ() - vectorResult.getZ()) < eps;
    }

    @Test
    void divisionVectorOnZero() {
        Vector3 v1 = new Vector3(1.0f, 2.0f, 5.0f);
        float n = 0.0f;

        Vector3 vectorFromMethod = mathForVectors3.divisionVectorOnNumber(v1, n);
        assert vectorFromMethod == null;
    }

    @Test
    void divisionVectorOnNumber() {
        Vector3 v1 = new Vector3(6.0f, 8.0f, 12.2f);
        float n = 2;

        Vector3 vectorFromMethod = mathForVectors3.divisionVectorOnNumber(v1, n);
        Vector3 vectorResult = new Vector3(3.0f, 4.0f, 6.1f);

        double eps = 1e-6;

        assert (vectorFromMethod.getX() - vectorResult.getX()) < eps;
        assert (vectorFromMethod.getY() - vectorResult.getY()) < eps;
        assert (vectorFromMethod.getZ() - vectorResult.getZ()) < eps;
    }

    @Test
    void lengthOfVector() {
        Vector3 v1 = new Vector3(2.0f, 2.0f, 1.0f);

        float lengthFromMethod = mathForVectors3.lengthOfVector(v1);
        float lengthResult = 3.0f;

        double eps = 1e-6;

        assert (lengthResult - lengthFromMethod) < eps;
    }

    @Test
    void scalarProduct() {
        Vector3 v1 = new Vector3(6.0f, 8.0f, 2.0f);
        Vector3 v2 = new Vector3(5.0f, 4.0f, 7.5f);

        float resultFromMethod = mathForVectors3.scalarProduct(v1, v2);
        float result = 77;

        double eps = 1e-6;

        assert  (result - resultFromMethod) < eps;
    }

    @Test
    void normalization() {
        Vector3 v1 = new Vector3(1.0f, 8.0f, 4.0f);

        Vector3 vectorFromMethod = mathForVectors3.normalization(v1);
        Vector3 vectorResult = new Vector3(1.0f / 9.0f,8.0f / 9.0f, 4.0f / 9.0f);

        double eps = 1e-6;

        assert (vectorFromMethod.getX() - vectorResult.getX()) < eps;
        assert (vectorFromMethod.getY() - vectorResult.getY()) < eps;
        assert (vectorFromMethod.getZ() - vectorResult.getZ()) < eps;
        System.out.println("Все воркает");
    }

    @Test
    void vectorProduct() {
        Vector3 v1 = new Vector3(6.0f, 8.0f, 2.0f);
        Vector3 v2 = new Vector3(5.0f, 4.0f, 7.5f);

        Vector3 vectorFromMethod = mathForVectors3.vectorProduct(v1, v2);
        Vector3 vectorResult = new Vector3(52.0f, -35.0f, -16.0f);

        double eps = 1e-6;

        assert (vectorFromMethod.getX() - vectorResult.getX()) < eps;
        assert (vectorFromMethod.getY() - vectorResult.getY()) < eps;
        assert (vectorFromMethod.getZ() - vectorResult.getZ()) < eps;
    }
}