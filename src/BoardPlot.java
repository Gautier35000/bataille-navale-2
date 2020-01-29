public class BoardPlot implements Plot {


    private final int ordonnee;
    private final int abscisse;


    public BoardPlot(int absisse, int ordonnee) {
        this.abscisse = absisse;
        this.ordonnee = ordonnee;

    }

    @Override
    public int getAbscisse() {
        return this.abscisse;
    }

    @Override
    public int getOrdonnee() {
        return this.ordonnee;
    }

}

