package ru.vsu.cs.zhilyaev;

public class MathForVectors2 {
    public Vector2 sumOfVectors(Vector2 v1, Vector2 v2) {
       return new Vector2(v1.getX() + v2.getX(), v1.getY() + v2.getY());
    }

    public Vector2 diffOfVectors(Vector2 v1, Vector2 v2) {
        return new Vector2(v1.getX() - v2.getX(), v1.getY() - v2.getY());
    }

    public Vector2 increaseVectorOnNumber(Vector2 v1, double n) {
        return new Vector2(v1.getX() * n, v1.getY() * n);
    }

    public Vector2 divisionVectorOnNumber(Vector2 v1, double n) {
        return new Vector2(v1.getX() / n, v1.getY() / n);
    }

    public double lengthOfVector(Vector2 v1) {
        return Math.sqrt(v1.getX() * v1.getX() + v1.getY() * v1.getY());
    }

    public double scalarProduct(Vector2 v1, Vector2 v2) {
        return v1.getX() * v2.getX() + v1.getY() * v2.getY();
    }

    public Vector2 normalization(Vector2 v1) {
        double invLength = 1 / (Math.sqrt(v1.getX() * v1.getX() + v1.getY() * v1.getY()));
        return new Vector2(v1.getX() * invLength, v1.getY() * invLength);
    }
}
