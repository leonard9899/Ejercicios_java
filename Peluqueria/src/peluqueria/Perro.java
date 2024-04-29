package peluqueria;


public class Perro {
    private String nombre;
    private boolean pelo;
    
    public Perro(){
        this.nombre="spike";
        this.pelo=true;
    }

    @Override
    public String toString() {
        return "Perro{" + "nombre=" + nombre + ", pelo=" + pelo + '}';
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public boolean isPelo() {
        return pelo;
    }

    public void setPelo(boolean pelo) {
        this.pelo = pelo;
    }
}
