
package ambitosvariables;


public class ClasePrincipal {
    public static void main(String[] args) {
        System.out.println("Esta es la variable estatica 'variableEstatica'. No fue necesario instanciar (osea crear un objeto de la clase 'AmbitosVariable': "+AmbitosVariable.variableEstatica);
        System.out.println("Probar si imprime la variable global 'variableGlobal': "+AmbitosVariable.variableGlobal); //no imprime, pues es una variable global de otra clase.
    }
}
