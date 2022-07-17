package vehiculos;

import java.util.Scanner;
import static vehiculos.Vehiculo.indiceCocheMBarato;

public class Main {

    public static void main(String[] args) {
        String marca, modelo;
        float precio;
        int nVehiculos, indiceBarato;

        Scanner entrada = new Scanner(System.in);

        System.out.print("¿Cuántos vehículos?: ");

        nVehiculos = entrada.nextInt();
        Vehiculo coches[] = new Vehiculo[nVehiculos];

        for (int i = 0; i < nVehiculos; i++) { //(coches.length()+1 en vez de nVehiculos)?
            entrada.nextLine();
            System.out.println("Características del automóvil " + (i + 1) + ": ");
            System.out.print("Ingrese la marca: ");
            marca = entrada.nextLine();
            System.out.print("Ingrese el modelo");
            modelo = entrada.nextLine();
            System.out.print("Ingrese el precio");
            precio = entrada.nextFloat();

            coches[i] = new Vehiculo(marca, modelo, precio);

        }
        indiceBarato = indiceCocheMBarato(coches);
        System.out.println("El vehiculo más barato es: " + coches[indiceBarato]); //El retorno no es String

    }

}

