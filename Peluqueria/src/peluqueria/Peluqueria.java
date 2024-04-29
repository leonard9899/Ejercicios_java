package peluqueria;

public class Peluqueria  {
    public void cortarPelo (Perro perro01){
        if(perro01.isPelo()){
           perro01.setPelo(false);
        }else{
            System.out.println("nada que cortar");
        }
            
    }
}
