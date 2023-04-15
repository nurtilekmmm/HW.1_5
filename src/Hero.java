public class Hero {
   private int health;
    private int damage;
    private String ultimate;

    public Hero(int theHealth, int theDamage, String theUltimate){
        this.health=theHealth;
        this.damage=theDamage;
        this.ultimate=theUltimate;
    }
    public Hero(int theHealth, int theDamage){
        this.health=theHealth;
        this.damage=theDamage;
    }

    public int getHealth() {
        return health;
    }

    public int getDamage() {
        return damage;
    }

    public String getUltimate() {
        return ultimate;
    }
}
