// package
package uap.models;

// import
import uap.bases.Shape;
import uap.interfaces.*;

// Sphere class
public class Sphere extends Shape implements PiRequired, ThreeDimensional, MassCalculate, MassConverter, ShippingCostCalculator {
    private double radius; // Radius dari Sphere

    public Sphere() {} // Default constructor

    public Sphere(double radius) { // Constructor dengan parameter radius
        this.radius = radius;
    }

    @Override // Menghitung volume Sphere
    public double getVolume() {
        return (4.0 / 3.0) * PI * Math.pow(radius, 3); 
    }

    @Override // Menghitung luas permukaan Sphere
    public double getSurfaceArea() {
        return 4 * PI * Math.pow(radius, 2);
    }

    @Override // Menghitung massa Sphere
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
        return Math.ceil(gramsToKilograms()) * PRICE_PER_KG;
    }
}
