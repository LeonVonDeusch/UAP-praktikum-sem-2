// package
package uap.mains;

//import 
import uap.bases.Shape; 
import uap.models.*;
import java.util.Scanner;

// KalkulatorPabrik class
public class KalkulatorPabrik {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        
        System.out.println("====================================================");
        System.out.println("Kalkulator Pabrik Donat Rumahan");
        System.out.println("Dandy Zikri Arifandi");
        System.out.println("245150707111035");
        System.out.println("====================================================");
        System.out.println("Donat dengan lubang");
        System.out.println("====================================================");
        System.out.print("Isikan Radius   : ");
        double R = input.nextDouble();
        System.out.print("Isikan radius   : ");
        double r = input.nextDouble();
        Shape Torus = new Torus(R, r);
        Torus.printInfo();

        System.out.println("====================================================");
        System.out.println("Donat tanpa lubang");
        System.out.println("====================================================");
        System.out.print("Isikan radius   : ");
        double rad = input.nextDouble();
        Shape Sphere = new Sphere(rad);
        System.out.println("====================================================");
        Sphere.printInfo();
        System.out.println("====================================================");

        input.close();
    }
}
