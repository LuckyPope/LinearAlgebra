package ru.vsu.cs.zhilyaev;

import org.junit.jupiter.api.Test;

class MathForVectors2Test {
    MathForVectors2 mathForVectors2 = new MathForVectors2();

    @Test
    void sumOfVectors() {
        Vector2 v1 = new Vector2(1.0, 2.0);
        Vector2 v2 = new Vector2(5.0, 6.0);

        Vector2 vectorFromMethod = mathForVectors2.sumOfVectors(v1, v2);
        Vector2 vectorResult = new Vector2(6.0, 8.0);

        assert vectorResult.getX() == vectorFromMethod.getX();
        assert vectorResult.getY() == vectorFromMethod.getY();
    }

    @Test
    void diffOfVectors() {
        Vector2 v1 = new Vector2(1.0, 2.0);
        Vector2 v2 = new Vector2(5.0, 6.0);

        Vector2 vectorFromMethod = mathForVectors2.diffOfVectors(v1, v2);
        Vector2 vectorResult = new Vector2(-4.0, -4.0);

        assert vectorResult.getX() == vectorFromMethod.getX();
        assert vectorResult.getY() == vectorFromMethod.getY();
    }

    @Test
    void increaseVectorOnNumber() {
        Vector2 v1 = new Vector2(1.0, 2.0);
        double n = 5.0;

        Vector2 vectorFromMethod = mathForVectors2.increaseVectorOnNumber(v1, n);
        Vector2 vectorResult = new Vector2(5.0, 10.0);

        assert vectorResult.getX() == vectorFromMethod.getX();
        assert vectorResult.getY() == vectorFromMethod.getY();
    }

    @Test
    void divisionVectorOnNumber() {
        Vector2 v1 = new Vector2(6.0, 8.0);
        double n = 2;

        Vector2 vectorFromMethod = mathForVectors2.divisionVectorOnNumber(v1, n);
        Vector2 vectorResult = new Vector2(3.0, 4.0);

        assert vectorResult.getX() == vectorFromMethod.getX();
        assert vectorResult.getY() == vectorFromMethod.getY();
    }

    @Test
    void lengthOfVector() {
        Vector2 v1 = new Vector2(6.0, 8.0);

        double lengthFromMethod = mathForVectors2.lengthOfVector(v1);
        double lengthResult = 10.0;

        assert lengthResult == lengthFromMethod;
    }

    @Test
    void scalarProduct() {
        Vector2 v1 = new Vector2(6.0, 8.0);
        Vector2 v2 = new Vector2(5.0, 4.0);

        double resultFromMethod = mathForVectors2.scalarProduct(v1, v2);
        double result = 62;

        assert  result == resultFromMethod;
    }

    @Test
    void normalization() {
        Vector2 v1 = new Vector2(6.0, 8.0);

        Vector2 vectorFromMethod = mathForVectors2.normalization(v1);
        Vector2 vectorResult = new Vector2(0.6,0.8);

        assert vectorResult.getX() == vectorFromMethod.getX();
        assert vectorResult.getY() == vectorFromMethod.getY();
    }
}