package Herencia;

/**
 * Created by root on 13-12-17.
 */
public class Herencia {
}

class SeleccionFutbol
{
    protected int id;
    protected String Nombre;
    protected String Apellidos;
    protected int Edad;
    public void Concentrarse() {}
    public void Viajar() {
        System.out.println("");
    }
    public SeleccionFutbol() {
    }
    public SeleccionFutbol(int id, String nombre, String apellidos, int edad) {
        this.id = id;
        this.Nombre = nombre;
        this.Apellidos = apellidos;
        this.Edad = edad;
    }
}

class Futbolista extends SeleccionFutbol {
    private int dorsal;
    private String demarcacion;
    public void jugarPartido() { }
    public void entrenar() { }
    public Futbolista() {
        super();
    }
    public Futbolista(int id, String nombre, String apellidos, int edad, int dorsal, String demarcacion) {
        super(id, nombre, apellidos, edad);
        this.dorsal = dorsal;
        this.demarcacion = demarcacion;
    }
    private void methodic (){
        Viajar();
    }
}

