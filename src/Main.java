public class Main {

    public static void main(String[] args) {
        Ship ship1 = new Ship(new BoardPlot(5,5),Direction.WEST,ShipModel.porte_avion);
        ship1.initializCoord();
    }
}
