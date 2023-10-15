
public class Kedi extends Hayvan {
    private String lakab;

    public Kedi(String lakab, String isim, int yas) {
        super(isim, yas);
        this.lakab = lakab;
    }
    
    public void kostur(){
    System.out.println("Kedi kosuyot.");
    }
}
