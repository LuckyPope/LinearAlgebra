package ru.vsu.cs.zhilyaev;

public class MathForVectors3 {
    public Vector3 sumOfVectors(Vector3 v1, Vector3 v2) {
        return new Vector3(v1.getX() + v2.getX(), v1.getY() + v2.getY(), v1.getZ() + v2.getZ());
    }

    public Vector3 diffOfVectors(Vector3 v1, Vector3 v2) {
        return new Vector3(v1.getX() - v2.getX(), v1.getY() - v2.getY(), v1.getZ() - v2.getZ());
    }

    public Vector3 increaseVectorOnNumber(Vector3 v1, double n) {
        return new Vector3(v1.getX() * n, v1.getY() * n, v1.getZ() * n);
    }

    public Vector3 divisionVectorOnNumber(Vector3 v1, double n) {
        if(n == 0) {
            System.out.println("На 0 делить нельзя");
            return null;
        }

        return new Vector3(v1.getX() / n, v1.getY() / n, v1.getZ() / n);
    }

    public double lengthOfVector(Vector3 v1) {
        return Math.sqrt(v1.getX() * v1.getX() + v1.getY() * v1.getY() + v1.getZ() * v1.getZ());
    }

    public double scalarProduct(Vector3 v1, Vector3 v2) {
        return v1.getX() * v2.getX() + v1.getY() * v2.getY() + v1.getZ() * v2.getZ();
    }

    public Vector3 normalization(Vector3 v1) {
        double invLength = 1 / Math.sqrt(v1.getX() * v1.getX() + v1.getY() * v1.getY() + v1.getZ() * v1.getZ());
        return new Vector3(v1.getX() * invLength, v1.getY() * invLength, v1.getZ() * invLength);
    }

    public Vector3 vectorProduct(Vector3 v1, Vector3 v2) {
        double x = v1.getY() * v2.getZ() - v1.getZ() * v2.getY();
        double y = -1 * (v1.getX() * v2.getZ() - v1.getZ() * v2.getX());
        double z = v1.getX() * v2.getY() - v1.getY() * v2.getX();

        return new Vector3(x, y ,z);
    }
}
