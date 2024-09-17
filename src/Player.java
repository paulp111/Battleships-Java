public class Player {
    private Gameboard gameboard;
    private boolean isHuman;

    public Player(Gameboard gameboard, boolean isHuman) {
        this.gameboard = gameboard;
        this.isHuman = isHuman;
    }

    public boolean makeMove(int x, int y) {
        return gameboard.attack(x, y);
    }

}
