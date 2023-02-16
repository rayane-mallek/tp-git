package fr.iut.editeur.commande;

import fr.iut.editeur.document.Document;

/**
 * The type Commande minuscules.
 */
public class CommandeMinuscules extends CommandeDocument {


    /**
     * Instantiates a new Commande minuscules.
     *
     * @param document   the document
     * @param parameters the parameters
     */
    public CommandeMinuscules(Document document, String[] parameters) {
        super(document, parameters);
    }

    @Override
    public void executer() {
        if(parameters.length < 3) {
            System.err.println("Format attendu : minuscules;debut:fin");
            return;
        }
        int debut = Integer.parseInt(parameters[1]);
        int fin = Integer.parseInt(parameters[2]);
        this.document.minuscules(debut, fin);
        super.executer();

    }

}
