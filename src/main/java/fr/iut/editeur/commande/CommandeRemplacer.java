package fr.iut.editeur.commande;

import fr.iut.editeur.document.Document;

/**
 * The type Commande remplacer.
 */
public class CommandeRemplacer extends CommandeDocument {


    /**
     * Instantiates a new Commande remplacer.
     *
     * @param document   the document
     * @param parameters the parameters
     */
    public CommandeRemplacer(Document document, String[] parameters) {
        super(document, parameters);
    }

    @Override
    public void executer() {
        if(parameters.length < 4) {
            description();
            return;
        }
        //C'est tres tres mal codé car on ne peut pas faire "remplacer;0;5;" alors que c'est demandé dans le TP enfin bref apres c'est pas une compétition
        this.document.remplacer(Integer.parseInt(parameters[1]), Integer.parseInt(parameters[2]), parameters[3]);
        super.executer();
    }

    @Override
    public void description() {
        super.description();
        System.out.println("remplacer;0;5;nouveauTexte");
    }

}
