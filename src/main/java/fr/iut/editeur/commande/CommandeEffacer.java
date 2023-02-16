package fr.iut.editeur.commande;

import fr.iut.editeur.document.Document;

/**
 * The type Commande effacer.
 */
public class CommandeEffacer extends CommandeDocument {


    /**
     * Instantiates a new Commande effacer.
     *
     * @param document   the document
     * @param parameters the parameters
     */
    public CommandeEffacer(Document document, String[] parameters) {
        super(document, parameters);
    }

    @Override
    public void executer() {
        if(parameters.length < 3) {
            description();
            return;
        }
        String texte = parameters[1];
        this.document.effacer(Integer.parseInt(parameters[1]), Integer.parseInt(parameters[2]));
        super.executer();
    }

    @Override
    public void description() {
        super.description();
        System.out.println("effacer;0;5");
    }

}
