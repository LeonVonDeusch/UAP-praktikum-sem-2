// package
package uap.models;

// import
import uap.bases.Shape;
import uap.interfaces.*;

// Torus class
public class Torus extends Shape implements PiRequired, ThreeDimensional, MassCalculate, MassConverter, ShippingCostCalculator {
    private double majorRadius; // Radius utama dari torus
    private double minorRadius; // Radius kecil dari torus

    public Torus() {} // Default constructor

    public Torus(double majorRadius, double minorRadius) { // Constructor dengan parameter majorRadius dan minorRadius
        this.majorRadius = majorRadius;
        this.minorRadius = minorRadius;
        setName("Torus");
    }

    @Override // Menghitung volume torus
    public double getVolume() {
        return 2 * Math.pow(PI, 2) * majorRadius * Math.pow(minorRadius, 2);
    }

    @Override // Menghitung luas permukaan torus
    public double getSurfaceArea() {
        return 4 * Math.pow(PI, 2) * majorRadius * minorRadius;
    }

    @Override // Menghitung massa torus
    public double getMass() {
        return DENSITY * getSurfaceArea() * THICKNESS;
    }

    @Override // Mengonversi massa dari gram ke kilogram
    public void printInfo() {
        System.out.println("Volume          : " + getVolume());
        System.out.println("Luas Prmukaan   : " + getSurfaceArea());
        System.out.println("Massa           : " + getMass());
        System.out.println("Massa dalam kg  : " + gramsToKilograms());
        System.out.println("Biaya kirim     : Rp" + calculateCost());
        
    }

    @Override // Mengonversi massa dari gram ke kilogram
    public double gramsToKilograms() {
        return getMass() / 1000;
    }

    @Override // Menghitung biaya pengiriman berdasarkan
    public double calculateCost() {
        return  Math.ceil(gramsToKilograms()) * PRICE_PER_KG;
    }
}
