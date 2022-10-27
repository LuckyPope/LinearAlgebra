package ru.vsu.cs.zhilyaev;

public class Vector4 {
    private double x;
    private double y;
    private double z;
    private double m;

    public Vector4(double x, double y, double z, double m) {
        this.x = x;
        this.y = y;
        this.z = z;
        this.m = m;
    }

    public double getX() {
        return x;
    }

    public double getY() {
        return y;
    }

    public double getZ() {
        return z;
    }

    public double getM() {
        return m;
    }
}
