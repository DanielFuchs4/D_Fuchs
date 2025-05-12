import java.util.Scanner;
public class Ucitel extends Osoba {

    Scanner sc = new Scanner(System.in);

    private String hlavniPredmet;

    public Ucitel(){
        super();
        System.out.print("Předmět jaký má učitel jako hlavní:");
        String hlavniPredmet1 = sc.nextLine();
        this.hlavniPredmet = hlavniPredmet1;
    }

    @Override
    public void vypisIntro(){
        System.out.println("Jméno: " + jmeno +", Rok narození: " + rokNarozeni+", Hlavní předmět: " + hlavniPredmet);
    }
}
