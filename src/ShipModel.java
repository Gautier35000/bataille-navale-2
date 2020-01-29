public enum ShipModel {
    porte_avion(5),
    croiseur(4),
    contre_torpilleur(3),
    sous_marin(3),
    torpilleur(2);
    private int size;

    private ShipModel(int size) {
        this.size = size;
    }

    public final int getSize() {
        return size;
    }
}


