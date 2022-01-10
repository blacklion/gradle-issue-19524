package sample;

import org.jtransforms.fft.DoubleFFT_1D;

public class Sample {
    public static void main(String[] args) {
        final int size = 16;
        double[] data = new double[size * 2];
        DoubleFFT_1D jplan = new DoubleFFT_1D(size);
        jplan.complexForward(data);
    }
}