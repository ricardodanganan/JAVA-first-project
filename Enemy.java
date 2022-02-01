import java.util.Random;

// Using Extend the Enemy class (subclass) inherits the attributes and methods from the playerCharacter class (superclass)
class Enemy extends playerCharacter {
    private static final String[] enemies = { "[Fast]Dwarven spider", "[Strong]Centurion", "[Durable]Centurion Automaton" };
    static Enemy spawnRandomEnemy() {
        Random rand = new Random();
        int enemyHealthLeft = 250; // Enemy health value
        int enemyAttackDamage = 50; // Enemy attack value
        int mana = 100;
        int pSkill = 45;
        int mSkill = 55;
        return new Enemy(enemies[rand.nextInt(enemies.length)],rand.nextInt(enemyHealthLeft),rand.nextInt(enemyAttackDamage),mana, pSkill, mSkill);
    }

    private Enemy(String name, int health, int damage, int mana, int pSkill, int mSkill) {
        super(name, health, damage, mana, pSkill, mSkill); }

    void dropPotionFor(Potion player) { // Method for the potion drop when the player defeated the enemy
        Random rand = new Random(); // Random class generator
        int healthPotionDropChance = 35; // the variable value set for the health potion drop chance
        // By generating a random number from 0-100, if the number generated is less than the
        // Health potion drop chance which is 35 then the enemy will drop a potion.
        // In other words we set the HP potion drop chance to 35%.
        if (rand.nextInt(100) < healthPotionDropChance) {
            System.out.println("\nThe " + this + " dropped a health potion!");
            System.out.println("--------------------------------------------------------------");
            // +1/increment health potion for the player's inventory.
            System.out.println("You have " + (++player.healthPots) + " health potion(s) in your inventory now.");
            System.out.println("--------------------------------------------------------------");
            System.out.println("   ____    ");
            System.out.println("  {<++>}   ");
            System.out.println("    ||     ");
            System.out.println("  {++++}   ");
            System.out.println(" {++++++}  ");
            System.out.println(" {++++++}  ");
            System.out.println("  {++++}   ");
            System.out.println("   {++}  \n");
        }
        int manaPotionDropChance = 35; // the variable value set for mana potion drop chance
        // By generating a random number from 0-100, if the number generated is less than the
        // mana potion drop chance which is 35 then the enemy will drop a potion.
        // In other words we set the HP potion drop chance to 35%.
        if (rand.nextInt(100) < manaPotionDropChance){
            System.out.println("\nThe " + this + " dropped a manapotion!");
            System.out.println("----------------------------------------------------------");
            // +1/increment mana potion for the player's inventory.
            System.out.println("You have " + (++player.manaPots) + " mana potion(s) in your inventory now.");
            System.out.println("----------------------------------------------------------");
            System.out.println("    ____    ");
            System.out.println("   {<++>}   ");
            System.out.println("     ||     ");
            System.out.println("   {@@@@}   ");
            System.out.println("  {@@@@@@}  ");
            System.out.println(" {@@@@@@@@} ");
            System.out.println("   {@@@@}   ");
            System.out.println("    {@@}  \n");
        }
    } // dropPotionFor class
}//main

