package peluqueria;

public class PruebaPeluqueria {
    public static void main(String[]args){
        Perro perro01=new Perro();
        
        perro01.setNombre("Snoopy");
        
        Peluqueria p = new Peluqueria();
        p.cortarPelo(perro01);
        
        System.out.println(perro01);
        System.out.println("tiene pelo " + perro01.isPelo());
    }
}
