package spr1;

public class Chinese implements Person {
    private Axe axe;
    public void setAxe(Axe axe) {
        this.axe = axe;
    }
    public void useAxe() {
        System.out.println("Œ“¥ÚÀ„»•ø≥≤Ò");
        System.out.println(axe.chop());
    }
}