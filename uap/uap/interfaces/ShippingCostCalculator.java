// package
package uap.interfaces;

// ShippingCostCalculator interface
public interface ShippingCostCalculator {
    int PRICE_PER_KG = 2000; // Harga per kilogram untuk pengiriman
    double calculateCost(); // Method untuk menghitung biaya pengiriman
}