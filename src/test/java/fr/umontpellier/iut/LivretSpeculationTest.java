package fr.umontpellier.iut;

import org.junit.jupiter.api.Test;

import java.math.BigDecimal;

import static org.junit.jupiter.api.Assertions.*;

class LivretSpeculationTest {

    @Test
    void getSolde() {

        LivretSpeculation livretspec = new LivretSpeculation(2400,"FR224564651","Manelphe","idontknow",0.5,0.3);
        // [solde * (1 + txInteret)] - (nbTransaction * taxe)
        // (2400 * 1.3) - (150 * 0.3) = 3120 - 45 = 3075
        livretspec.setNbtransaction(150);
        double valeur = livretspec.getSolde();
        BigDecimal expected = new BigDecimal(3075);
        BigDecimal actual = new BigDecimal(valeur);
        assertTrue(expected.compareTo(actual)==0);
    }
}