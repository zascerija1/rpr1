package ba.unsa.etf.rpr;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class StudentTest {

    @Test
    @DisplayName("Test setera i getera")
    void ImePrezimeIndeksSetGet() {
 Student s = new Student("Maja", "Majic", 1500);
 s.setIme("Marijana");
 s.setBrojIndeksa(1504);
 assertAll("Set i get metode",
         ()->assertEquals("Marijana", s.getIme()),
         ()->assertEquals("Majic",s.getPrezime()),
         ()->assertEquals(1504, s.getBrojIndeksa())
 );
    }
    @Test
    @DisplayName("Test za pretvorbu string")
    void toStringTest(){
        assertEquals("Waters Roger (1200)", new Student("Roger", "Waters", 1200).toString());
    }




}