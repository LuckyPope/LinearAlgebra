package ru.vsu.cs.zhilyaev;

import org.junit.jupiter.api.Test;

class MathForVectors3Test {
    MathForVectors3 mathForVectors3 = new MathForVectors3();

    @Test
    void sumOfVectors() {
        Vector3 v1 = new Vector3(1.0, 2.0, 7.0);
        Vector3 v2 = new Vector3(5.0, 6.0, 3.0);

        Vector3 vectorFromMethod = mathForVectors3.sumOfVectors(v1, v2);
        Vector3 vectorResult = new Vector3(6.0, 8.0, 10.0);

        double eps = 1e-6;

        assert (vectorFromMethod.getX() - vectorResult.getX()) < eps;
        assert (vectorFromMethod.getY() - vectorResult.getY()) < eps;
        assert (vectorFromMethod.getZ() - vectorResult.getZ()) < eps;
    }

    @Test
    void diffOfVectors() {
        Vector3 v1 = new Vector3(1.0, 2.0, 8.0);
        Vector3 v2 = new Vector3(5.0, 6.0, 3.5);

        Vector3 vectorFromMethod = mathForVectors3.diffOfVectors(v1, v2);
        Vector3 vectorResult = new Vector3(-4.0, -4.0, 4.5);

        double eps = 1e-6;

        assert (vectorFromMethod.getX() - vectorResult.getX()) < eps;
        assert (vectorFromMethod.getY() - vectorResult.getY()) < eps;
        assert (vectorFromMethod.getZ() - vectorResult.getZ()) < eps;
    }

    @Test
    void increaseVectorOnNumber() {
        Vector3 v1 = new Vector3(1.0, 2.0, 5.2);
        double n = 5.0;

        Vector3 vectorFromMethod = mathForVectors3.increaseVectorOnNumber(v1, n);
        Vector3 vectorResult = new Vector3(5.0, 10.0, 26.0);

        double eps = 1e-6;

        assert (vectorFromMethod.getX() - vectorResult.getX()) < eps;
        assert (vectorFromMethod.getY() - vectorResult.getY()) < eps;
        assert (vectorFromMethod.getZ() - vectorResult.getZ()) < eps;
    }

    @Test
    void divisionVectorOnZero() {
        Vector3 v1 = new Vector3(1.0, 2.0, 5.0);
        double n = 0.0;

        Vector3 vectorFromMethod = mathForVectors3.divisionVectorOnNumber(v1, n);
        assert vectorFromMethod == null;
    }

    @Test
    void divisionVectorOnNumber() {
        Vector3 v1 = new Vector3(6.0, 8.0, 12.2);
        double n = 2;

        Vector3 vectorFromMethod = mathForVectors3.divisionVectorOnNumber(v1, n);
        Vector3 vectorResult = new Vector3(3.0, 4.0, 6.1);

        double eps = 1e-6;

        assert (vectorFromMethod.getX() - vectorResult.getX()) < eps;
        assert (vectorFromMethod.getY() - vectorResult.getY()) < eps;
        assert (vectorFromMethod.getZ() - vectorResult.getZ()) < eps;
    }

    @Test
    void lengthOfVector() {
        Vector3 v1 = new Vector3(2.0, 2.0, 1.0);

        double lengthFromMethod = mathForVectors3.lengthOfVector(v1);
        double lengthResult = 3.0;

        double eps = 1e-6;

        assert (lengthResult - lengthFromMethod) < eps;
    }

    @Test
    void scalarProduct() {
        Vector3 v1 = new Vector3(6.0, 8.0, 2.0);
        Vector3 v2 = new Vector3(5.0, 4.0, 7.5);

        double resultFromMethod = mathForVectors3.scalarProduct(v1, v2);
        double result = 77;

        double eps = 1e-6;

        assert  (result - resultFromMethod) < eps;
    }

    @Test
    void normalization() {
        Vector3 v1 = new Vector3(1.0, 8.0, 4.0);

        Vector3 vectorFromMethod = mathForVectors3.normalization(v1);
        Vector3 vectorResult = new Vector3(1.0 / 9.0,8.0 / 9.0, 4.0 / 9.0);

        double eps = 1e-6;

        assert (vectorFromMethod.getX() - vectorResult.getX()) < eps;
        assert (vectorFromMethod.getY() - vectorResult.getY()) < eps;
        assert (vectorFromMethod.getZ() - vectorResult.getZ()) < eps;
        System.out.println("Все воркает");
    }

    @Test
    void vectorProduct() {
        Vector3 v1 = new Vector3(6.0, 8.0, 2.0);
        Vector3 v2 = new Vector3(5.0, 4.0, 7.5);

        Vector3 vectorFromMethod = mathForVectors3.vectorProduct(v1, v2);
        Vector3 vectorResult = new Vector3(52.0, -35.0, -16.0);

        double eps = 1e-6;

        assert (vectorFromMethod.getX() - vectorResult.getX()) < eps;
        assert (vectorFromMethod.getY() - vectorResult.getY()) < eps;
        assert (vectorFromMethod.getZ() - vectorResult.getZ()) < eps;
    }
}