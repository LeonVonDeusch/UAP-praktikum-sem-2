// package
package uap.bases;

// Shape abstract class
public abstract class Shape {
    private String name; // Nama dari bentuk

    public Shape() {} // Konstruktor default

    public void setName(String name) { // Setter untuk nama bentuk
        this.name = name;
    }

    public String getName() { // Getter untuk nama bentuk
        return name;
    }

    public abstract void printInfo(); // Metode abstrak untuk mencetak informasi bentuk
    
}
