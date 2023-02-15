package fr.iut.editeur.commande;

import fr.iut.editeur.document.Document;
public class CommandeClear extends CommandeDocument {


    public CommandeClear(Document document, String[] parameters) {
        super(document, parameters);
    }

    @Override
    public void executer() {
        if(parameters.length < 1) {
            description();
            return;
        }

        this.document.clear();
        super.executer();
    }

    @Override
    public void description() {
        super.description();
        System.out.println("clear");
    }

}
