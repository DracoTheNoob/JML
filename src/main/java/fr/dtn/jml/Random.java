package fr.dtn.jml;

public class Random {
    public long Long(long min, long max){ return min + (long)(Math.random() * (max - min)); }
    public int Int(int min, int max){ return min + (int)(Math.random() * ((max - min))); }
    public short Short(short min, short max){ return (short)(min + (short)(Math.random() * ((max - min) + 1))); }
    public byte Byte(byte min, byte max){ return (byte)(min + (byte)(Math.random() * ((max - min) + 1))); }
    public float Float(float min, float max){ return (float)(min + Math.random() * (max - min)); }
    public double Double(double min, double max){ return min + Math.random() * (max - min); }
    public boolean Boolean(){ return Math.random() < .5; }
}