import java.time.LocalDate;
import java.util.Scanner;
public class Osoba {

    Scanner sc = new Scanner(System.in);

    public String jmeno;
    public int rokNarozeni;

    public Osoba() {
       System.out.print("Jméno:");
       String jmeno1 = sc.nextLine();
       this.jmeno = jmeno1;

       System.out.print("Rok narození:");
       int rokNarozeni1 = sc.nextInt();
       this.rokNarozeni = rokNarozeni1;
    }

    public void vypisIntro(){
        System.out.println("Jméno: " + jmeno+", Rok narození: " + rokNarozeni);
    }

    public int getRokNarozeni() {
        return rokNarozeni;
    }
}
