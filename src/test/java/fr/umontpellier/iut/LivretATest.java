package fr.umontpellier.iut;

import org.junit.jupiter.api.Test;

import java.math.BigDecimal;

import static org.junit.jupiter.api.Assertions.*;

class LivretATest {

    @Test
    void getSolde() {
        Compte livretA = new LivretA(650,"FR762115498","Bernadas","Clapiers avenue des pigeonniers",0.2,7500);

        double valeur = livretA.getSolde();
        BigDecimal expected = new BigDecimal(780);
        BigDecimal actual = new BigDecimal(valeur);
        assertTrue(expected.compareTo(actual)==0);
    }
}