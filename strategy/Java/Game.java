public class Game {
    public static void main(String[] args) {
        var knight = new Knight();

        knight.attack();
        knight.defend();
        var wizard = new Wizard();

        wizard.attack();
        wizard.defend();

        var archer = new Archer();

        archer.attack();
        archer.defend();
    }
}
