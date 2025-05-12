import java.util.Scanner;
public class Student extends Osoba{

    Scanner sc = new Scanner(System.in);

    private String studijniObor;


    public Student() {
        super();
        System.out.println("Studijní obor, který si žák vybral:");
        String studijniObor1 = sc.nextLine();
        this.studijniObor = studijniObor1;

    }

    @Override
    public void vypisIntro(){
        System.out.println("Jméno: " + jmeno+", Rok narození: " + rokNarozeni+", Studijní obor: " + studijniObor);
    }
}
