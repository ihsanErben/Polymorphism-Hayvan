
public class Kopek extends Hayvan{
    private String lakab;

    public Kopek(String lakab, String isim, int yas) {
        super(isim, yas);
        this.lakab = lakab;
    }
    
    public void kostur(){
    System.out.println("Kopek kosuyor.");
    }
}
