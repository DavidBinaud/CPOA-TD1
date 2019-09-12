package fr.umontpellier.iut;

import org.junit.jupiter.api.Test;

import java.math.BigDecimal;

import static org.junit.jupiter.api.Assertions.*;

class LivretPlusPlusTest {

    @Test
    void getSolde() {
        Compte livretplus = new LivretPlusPlus(1300,"FR15878423","Capell","derriere la fac de medecine",0.3,0.15);
        // [solde * (1 + txInteret)] * (1 - txImposition)
        // (1300 * 1.3) * (1 - 0.15 ) = 1690 * 0.85
        double valeur = livretplus.getSolde();
        BigDecimal expected = new BigDecimal(valeur);
        BigDecimal actual = new BigDecimal(1436.5);
        assertTrue(expected.compareTo(actual)==0);
    }
}