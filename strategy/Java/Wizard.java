public class Wizard implements CharacterType {
    protected AttackStrategy attack;
    protected DefenseStrategy defense;

    public Wizard() {
        attack = new SwingSword();
        defense = new CreateMagic();
    }

    public void attack() {
        System.out.println("Wizard: " + attack.attack());
    }

    public void defend() {
        System.out.println("Wizard: " + defense.defend());
    }
}

