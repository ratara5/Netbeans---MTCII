package vehiculos;

public class Vehiculo {
    
    public static int indiceCocheMBarato (Vehiculo coches[]){    
        float precio;
        int indice = 0;

        precio = coches[0].getPrecio();
        for (int i = 1; i < coches.length; i++) {
            if (coches[i].getPrecio() < precio) {
                precio = coches[i].getPrecio();
                indice = i;

            }
        }
        return indice;
    }

    private String marca, modelo;
    private float precio;

    public Vehiculo(String marca, String modelo, float precio) {
        this.marca = marca;
        this.modelo = modelo;
        this.precio = precio;

    }

    /**
     * @return the precio
     */
    public float getPrecio() {
        return precio;
    }

    public String mostrarDatos() {
        return "La marca del vehiculo es: " + this.marca + ". Y el modelo es: " + this.modelo;
    }



}

