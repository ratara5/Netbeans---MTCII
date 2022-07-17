package reto3;

public class Equipos {

    //Variables Base
    protected final static char MODELO_BASE = 'F';
    protected final static Double PRECIO_BASE = 100.0;
    protected final static Integer PESO_BASE = 5;

    //Variables
    protected Double precio;
    protected Integer peso;
    private char modelos;

    //Constructores
    public Equipos() {
        this(PRECIO_BASE, PESO_BASE, MODELO_BASE);
    }

    //Constructores
    public Equipos(Double precio, Integer peso) {
        this(precio, peso, MODELO_BASE);
    }

    //Constructores
    public Equipos(Double precio, Integer peso, char modelos) {
        this.precio = precio;
        this.peso = peso;
        comprobarModelos(modelos);
    }

    //Metodos
    public void comprobarModelos(char modelos) {
        //Codigo
        if (modelos >= 65 && modelos <= 70) {
            this.modelos = modelos;
        } else {
            this.modelos = MODELO_BASE;
        }
    }

    public Double calcularPrecio() {
        Double adicion = 0.0;
        //Codigo
        switch (modelos) {
            case 'A':
                adicion += 100.0;
                break;
            case 'B':
                adicion += 80.0;
                break;
            case 'C':
                adicion += 60.0;
                break;
            case 'D':
                adicion += 50.0;
                break;
            case 'E':
                adicion += 30.0;
                break;
            case 'F':
                adicion += 10.0;
                break;
        }
        if (peso >= 0 && peso < 19) {
            adicion += 10.0;
        } else if (peso >= 20 && peso < 49) {
            adicion += 50.0;
        } else if (peso >= 50 && peso < 79) {
            adicion += 80.0;
        } else if (peso >= 80) {
            adicion += 100.0;
        }
        return precio + adicion;
    }

    public Double getPrecio() {
        return precio;
    }

    public char getModelo() {
        return modelos;
    }

    public Integer getPeso() {
        return peso;
    }
}
