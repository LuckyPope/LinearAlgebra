package ru.vsu.cs.zhilyaev;

public class MathForVectors2 {
    public Vector2 sumOfVectors(Vector2 v1, Vector2 v2) {
       return new Vector2(v1.getX() + v2.getX(), v1.getY() + v2.getY());
    }

    public Vector2 diffOfVectors(Vector2 v1, Vector2 v2) {
        return new Vector2(v1.getX() - v2.getX(), v1.getY() - v2.getY());
    }

    public Vector2 increaseVectorOnNumber(Vector2 v1, float n) {
        return new Vector2(v1.getX() * n, v1.getY() * n);
    }

    public Vector2 divisionVectorOnNumber(Vector2 v1, float n) {
        if(n == 0) {
            System.out.println("На 0 делить нельзя");
            return null;
        }

        return new Vector2(v1.getX() / n, v1.getY() / n);
    }

    public float lengthOfVector(Vector2 v1) {
        return (float) Math.sqrt(v1.getX() * v1.getX() + v1.getY() * v1.getY());
    }

    public float scalarProduct(Vector2 v1, Vector2 v2) {
        return v1.getX() * v2.getX() + v1.getY() * v2.getY();
    }

    public Vector2 normalization(Vector2 v1) {
        float invLength = (float) (1 / (Math.sqrt(v1.getX() * v1.getX() + v1.getY() * v1.getY())));
        return new Vector2(v1.getX() * invLength, v1.getY() * invLength);
    }
}
