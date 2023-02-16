package fr.iut.editeur.document;

/**
 * The TYPE Document.
 */
public class Document {

    private String texte;

    /**
     * Instantiates a new Document.
     */
    public Document() {
        this.texte = "";
    }

    /**
     * Gets texte.
     *
     * @return the texte
     */
    public String getTexte() {
        return texte;
    }

    /**
     * Sets texte.
     *
     * @param texte the texte
     */
    public void setTexte(String texte) {
        this.texte = texte;
    }

    /**
     * Ajouter.
     *
     * @param texte the texte
     */
    public void ajouter(String texte) {
        this.texte += texte;
    }

    @Override
    public String toString() {
        return this.texte;
    }

    /**
     * Remplacer.
     *
     * @param start        the start
     * @param end          the end
     * @param remplacement the remplacement
     */
    public void remplacer(int start, int end, String remplacement) {
        String leftPart = this.texte.substring(0, start);
        String rightPart = this.texte.substring(end);
        this.texte = leftPart + remplacement + rightPart;
    }

    /**
     * Majuscules.
     *
     * @param start the start
     * @param end   the end
     */
    public void majuscules(int start, int end) {
        String leftPart = this.texte.substring(0, start);
        String middlePart = this.texte.substring(start, end).toUpperCase();
        String rightPart = this.texte.substring(end);
        this.texte = leftPart + middlePart + rightPart;
    }

    /**
     * Effacer.
     *
     * @param start the start
     * @param end   the end
     */
    public void effacer(int start, int end) {
        String leftPart = this.texte.substring(0, start);
        String rightPart = this.texte.substring(end);
        this.texte = leftPart + rightPart;
    }

    /**
     * Clear.
     */
    public void clear() {
        this.texte = "";
    }

    /**
     * Inserer.
     *
     * @param start the start
     * @param texte the texte
     */
    public void inserer(int start, String texte) {
        String leftPart = this.texte.substring(0, start);
        String rightPart = this.texte.substring(start);
        this.texte = leftPart + texte + rightPart;
    }

    /**
     * Minuscules.
     *
     * @param start the start
     * @param end   the end
     */
    public void minuscules(int start, int end) {
        String leftPart = this.texte.substring(0, start);
        String middlePart = this.texte.substring(start, end).toLowerCase();
        String rightPart = this.texte.substring(end);
        this.texte = leftPart + middlePart + rightPart;
    }
}
