package ba.unsa.etf.rpr;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;

import static org.junit.jupiter.api.Assertions.*;

class PredmetTest {

    @Test
    void TestKonstruktora() {
        Predmet p = new Predmet("Matematika", 4, 150);

        // Predmet p=new Predmet("Matematika", 4, 150);
        assertAll("Velicine",
                () -> assertEquals("Matematika", p.getNazivPredmeta()),
                () -> assertEquals(4, p.getSifraPredmeta())
        );
    }

    @Test
    void MetodaIspisi() {
        Predmet p = new Predmet("Matematika", 4, 150);
        Student s=new Student("Neko", "Nekic", 1345);
        p.dodajStudenta(s);
        final ByteArrayOutputStream out = new ByteArrayOutputStream();
        System.setOut(new PrintStream(out));

        p.ispisi();

    assertEquals("1. Nekic Neko (1345)\r\n", out.toString());

    }
    @Test
    @DisplayName("Dodavanje i brisanje studenta")
    void MetodaIzbrisi(){
        Predmet p = new Predmet("Matematika", 4, 150);
        Student s=new Student("Neko", "Nekic", 1345);
        p.dodajStudenta(s);
        p.izbrisiStudenta(s);
        final ByteArrayOutputStream out = new ByteArrayOutputStream();
        System.setOut(new PrintStream(out));
        assertEquals("", out.toString());
    }
    @Test
    @DisplayName("Dodavanje 2 studenta i ispis")
   void Dodavanje2() {
       Predmet p = new Predmet("Matematika", 4, 150);
       final ByteArrayOutputStream out = new ByteArrayOutputStream();
       System.setOut(new PrintStream(out));
        p.dodajStudenta(new Student("Nick","Mason", 1234));
        p.dodajStudenta(new Student("David","Gilmour", 1100));
        p.ispisi();
        assertEquals("1. Mason Nick (1234)\r\n2. Gilmour David (1100)\r\n",out.toString());


    }

    @Test
    @DisplayName("Testiranje izuzetka")
    void izuzetak() {
        Predmet p = new Predmet("Matematika", 4, 1);
        p.dodajStudenta(new Student("Nick", "Mason", 1234));
        assertThrows(RuntimeException.class, () -> {
            p.dodajStudenta(new Student("David", "Gilmour", 1100));
        });


    }

}