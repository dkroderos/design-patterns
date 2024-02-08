public class Knight implements CharacterType {
    protected AttackStrategy attack;
    protected DefenseStrategy defense;
    
    public Knight() {
        attack = new SwingSword();
    }

    public void attack() {
        System.out.println("Knight: " + attack.attack());
    }

    public void defend() {
        System.out.println("Knight: ");

        defense = new CreateMagic();
        System.out.println(defense.defend());
        defense = new Shield();
        System.out.println(defense.defend());
        defense = new Dodge();
        System.out.println(defense.defend());
    }
}
