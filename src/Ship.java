import java.util.ArrayList;

public class Ship {
    private BoardPlot boardplot;
    private ShipModel shipmodel;
    private Direction direction;

    public Ship(BoardPlot boardplot, Direction direction, ShipModel shipmodel) {
        this.boardplot = boardplot;
        this.shipmodel = shipmodel;
        this.direction = direction;
    }

    public void initializCoord() {
        ArrayList<String> tableauCoord = new ArrayList<String>();
        switch (this.direction) {
            case NORTH:
                for (int i = 0; i <= this.shipmodel.getSize() - 1; i++) {
                    int newOrdonnee = this.boardplot.getOrdonnee() + i;
                    tableauCoord.add(String.valueOf(this.boardplot.getAbscisse()) + newOrdonnee);
                }
                System.out.println(tableauCoord);
                break;
            case SOUTH:
                for (int i = 0; i <= this.shipmodel.getSize() - 1; i++) {
                    int newOrdonnee = this.boardplot.getOrdonnee() - i;
                    tableauCoord.add(String.valueOf(this.boardplot.getAbscisse()) + newOrdonnee);
                }
                System.out.println(tableauCoord);
                break;
            case EAST:
                for (int i = 0; i <= this.shipmodel.getSize() - 1; i++) {
                    int newAbscisse = this.boardplot.getAbscisse() + i;
                    tableauCoord.add(newAbscisse + String.valueOf(this.boardplot.getOrdonnee()));
                }
                System.out.println(tableauCoord);
                break;
            case WEST:
                for (int i = 0; i <= this.shipmodel.getSize() - 1; i++) {
                    int newAbscisse = this.boardplot.getAbscisse() - i;
                    tableauCoord.add(newAbscisse + String.valueOf(this.boardplot.getOrdonnee()));
                }
                System.out.println(tableauCoord);
                break;

        }
    }

    public void isOnPlot() {

    }
}
