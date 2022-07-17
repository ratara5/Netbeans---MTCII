package ambitosvariables;

// Las variables no deben declararse aquí (es decir, fuera de la clase), de hacerlo no van a servir.

//El ámbito de una variable hace referencia a su alcance de uso, es decir, en que secciones de código estará disponible.
public class AmbitosVariable {
    
    static int variableEstatica=555; // También conocida como variable de clase, pertenece a la propia clase donde ha sido declarada, y para poder acceder a ella no es necesario crear una instancia de clases.
    
    int variableGlobal; // Variable global no requiere incializarse (mejor no hacerlo); también conocida como variable de instancia, pertenecen a la clase donde han sido declaradas, y dependiendo del modificador de acceso utilizado (sin nada es el 'por defecto'), podrán ser accedidas unicamente dese la misma clase. Son declaradas fuera de una estructura o de cualquier método.
    
    void miMetodo(int parametro){
        int variableLocal=0; // Variable local siempre tiene que inicializarse. La variable local es definida dentro de un método o estructura: repetitiva, condicional...
        System.out.println("El valor del parámetro es: "+parametro); // El parámetro también va y debe ser  local.
        System.out.println("El valor de la variable global es: "+variableGlobal); //La variable global se puede acceder desde cualquier método dentro de la clase. OJO si la inicializo dentro de un método ya va a dejar de ser global y no se va a poder usar fuera.
    }
    
    public void Prueba(){
        System.out.println("El valor de la variable local es: "+variableLocal); //La variable local variableLocal no está definida en este ámbito
    }

    
   
    
    
}
