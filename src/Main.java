public class Main {
    public static void main(String[] args) {
        Boss boss = new Boss();
        boss.setHealth(700);
        boss.setDamage(50);
        boss.setDefense("Magic");

        System.out.println("Boss health: " + boss.getHealth());
        System.out.println("Boss damage: " + boss.getDamage());
        System.out.println("Boss defense type: " + boss.getDefense());
    }
}