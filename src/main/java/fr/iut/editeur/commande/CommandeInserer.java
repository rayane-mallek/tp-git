package fr.iut.editeur.commande;

import fr.iut.editeur.document.Document;

/**
 * The type Commande inserer.
 */
public class CommandeInserer extends CommandeDocument {


    /**
     * Instantiates a new Commande inserer.
     *
     * @param document   the document
     * @param parameters the parameters
     */
    public CommandeInserer(Document document, String[] parameters) {
        super(document, parameters);
    }

    @Override
    public void executer() {
        if(parameters.length < 3) {
            description();
            return;
        }
        int index = Integer.parseInt(parameters[1]);
        String texte = parameters[2];
        this.document.inserer(index, texte);
        super.executer();
    }

    @Override
    public void description() {
        super.description();
        System.out.println("inserer;index;texte");
    }

}
