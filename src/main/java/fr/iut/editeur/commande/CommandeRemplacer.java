package fr.iut.editeur.commande;

import fr.iut.editeur.document.Document;
public class CommandeRemplacer extends CommandeDocument {


    public CommandeRemplacer(Document document, String[] parameters) {
        super(document, parameters);
    }

    @Override
    public void executer() {
        if(parameters.length < 4) {
            System.err.println("Format attendu : remplacer;0;5;nouveauTexte");
            return;
        }

        this.document.remplacer(Integer.parseInt(parameters[1]), Integer.parseInt(parameters[2]), parameters[3]);
        super.executer();
    }

}
