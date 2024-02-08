public class Archer implements CharacterType {
    protected AttackStrategy attack;
    protected DefenseStrategy defense;

    public Archer() {
        attack = new SwingSword();
        defense = new CreateMagic();
    }

    public void attack() {
        System.out.println("Archer: " + attack.attack());
    }

    public void defend() {
        System.out.println("Archer: " + defense.defend());
    }
}

