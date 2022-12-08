package ru.vsu.cs.zhilyaev;

public class Vector4 {
    private float x;
    private float y;
    private float z;
    private float m;

    public Vector4(float x, float y, float z, float m) {
        this.x = x;
        this.y = y;
        this.z = z;
        this.m = m;
    }

    public float getX() {
        return this.x;
    }

    public float getY() {
        return this.y;
    }

    public  float getZ() {
        return z;
    }

    public float getM() {
        return m;
    }
}
