package fr.iutmontpellier.tests;

import fr.iut.editeur.document.Document;
import junit.framework.TestCase;
import org.junit.Test;

public class DocumentTest extends TestCase {
    @Test
    public void testAjouter() {
        Document document = new Document();
        document.ajouter("Bonjour ");
        document.ajouter("le ");
        document.ajouter("monde !");
        assertEquals("Bonjourle monde !", document.getTexte());
    }

    @Test
    public void testRemplacer() {
        Document document = new Document();
        document.setTexte("Bonjour le monde !");
        document.remplacer(8, 10, "notre");
        assertEquals("Bonjour notre monde !", document.getTexte());
    }

    @Test
    public void testMajuscules() {
        Document document = new Document();
        document.setTexte("Bonjour le monde !");
        document.majuscules(8, 10);
        assertEquals("Bonjour LE monde !", document.getTexte());
    }

    @Test
    public void testEffacer() {
        Document document = new Document();
        document.setTexte("Bonjour le monde !");
        document.effacer(8, 11);
        assertEquals("Bonjour monde !", document.getTexte());
    }

    @Test
    public void testClear() {
        Document document = new Document();
        document.setTexte("Bonjour le monde !");
        document.clear();
        assertEquals("", document.getTexte());
    }

    @Test
    public void testInserer() {
        Document document = new Document();
        document.setTexte("Bonjour le !");
        document.inserer(10, " monde");
        assertEquals("Bonjour le monde !", document.getTexte());
    }

    @Test
    public void testMinuscules() {
        Document document = new Document();
        document.setTexte("Bonjour LE Monde !");
        document.minuscules(8, 10);
        TestCase Assertions;
        assertEquals("Bonjour le Monde !", document.getTexte());
    }
}
