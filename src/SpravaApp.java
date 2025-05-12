import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Scanner;

public class SpravaApp {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Kolik chceš přidat učitelů?");
        int ucitele = sc.nextInt();
        System.out.println("Kolik chceš přidat studentů?");
        int studenti = sc.nextInt();

        ArrayList<Osoba> osoby = new ArrayList<Osoba>();

        if (ucitele < 5){
            System.out.println("Přidej "+ucitele+" učitele.");
        }
        else {
            System.out.println("Přidej "+ucitele+" učitelů.");
        }

        for (int i = 0; i < ucitele; i++) {
            System.out.println(i+1+".");
            Ucitel ucitel = new Ucitel();
            osoby.add(ucitel);
        }


        if (studenti == 1){
            System.out.println("Přidej "+studenti+" studenta.");
        }
        else if (studenti < 5){
            System.out.println("Přidej "+studenti+" studenty.");
        }
        else {
            System.out.println("Přidej "+studenti+" studentů.");
        }

        for (int i = 0; i < studenti; i++) {
            System.out.println(i+1+".");
            Student student = new Student();
            osoby.add(student);
        }

        System.out.println("Výpis všech osob:");
        for (int i = 0; i < osoby.size(); i++) {
            osoby.get(i).vypisIntro();
        }

        System.out.println("Na škole se nachází "+ucitele+" učitelů.");
        if (ucitele < studenti) {
            System.out.println("Na škole je více studentů než učitelů");
        } else {
            System.out.println("Na škole je více učitelů než studentů");
        }
        int min = osoby.get(ucitele+1).getRokNarozeni();
        for (int i = ucitele; i < osoby.size(); i++) {
            if (osoby.get(i).getRokNarozeni() < min) {
                min = osoby.get(i).getRokNarozeni();
            }
        }
        System.out.print("Nejmladší student je:");
        for (int i = ucitele; i < osoby.size(); i++) {
            if (osoby.get(i).getRokNarozeni() == min) {
                osoby.get(i).vypisIntro();
            }
        }






    }
}