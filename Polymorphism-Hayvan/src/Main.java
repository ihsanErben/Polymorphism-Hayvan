
public class Main {
    public static void main(String[] args){
    
    Hayvan hayvan1 = new Kedi("hizli","tekir",10);
    Hayvan hayvan2 = new Kopek("cita","karabas",15);
    
    hayvan1.kostur();
    hayvan2.kostur();
    
    kostur(new Kedi("cita","karabas",15));
    
    }
    
    public static void kostur(Hayvan hayvan){
    hayvan.kostur();
    }
    
}
