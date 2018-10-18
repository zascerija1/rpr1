package ba.unsa.etf.rpr;

public class Program {

    public static void main(String[] args) {
	Student s=new Student("Neko", "Nekic", 1345);
	Predmet p=new Predmet("Linearne algebra", 748, 120);

	Student s2=new Student("Drugi", "Drugic", 1494);
        p.dodajStudenta(s).dodajStudenta(s2).ispisi();
    }
}
