import java.util.Random;

// This is the super class that the Potion and Enemy subclass will inherit to.
public class playerCharacter {
    private final Random rand = new Random();
    private final String name;
    int playerHealthLeft; // player health value variable
    int playerManaLeft; // player mana value variable
    private final int lightAttackDmg; // player light attack damage value variable
    int physicalSkillDamage; // player physical skill damage value variable
    int magicalSkillDamage; // player magical skill damage value variable
    private final String[] physicalSkillList = {"Bash", "Rapid Strikes", "Dizzying Swing"}; // list of the names of physical skills.
    private final String[] magicalSkillList = {"Fire Bolt", "Ice Bolt", "Lightning Bolt",}; // list of the names of magical skills.
    private final String pSkillList = physicalSkillList[rand.nextInt(physicalSkillList.length)]; // Select a random skill from the String array for the physical skills list.
    private final String mSkillList = magicalSkillList[rand.nextInt(physicalSkillList.length)];  // Select a random skill from the String array for the magical skills list.
    private int miracle = 3;

    // this keyword is to eliminate the confusion between class attributes and parameters with the same name
    playerCharacter(String name, int health, int damage, int mana, int pSkill, int mSkill) {
        this.name = name;
        this.playerHealthLeft = health;
        this.playerManaLeft = mana;
        this.lightAttackDmg = damage;
        this.physicalSkillDamage = pSkill;
        this.magicalSkillDamage = mSkill;
    }

    void attack(playerCharacter monster) {
        int damage = getDamage(); // damage from the return value from getDamage method.
        if (this instanceof Potion) {
            System.out.println("------------------------------------------------------------------");
            System.out.println("You used a light attack on the " + monster + " dealing " + damage + " damage.\n");
        }
        else {
            System.out.println("The enemy fought back dealing " + damage + " Damage to your HP");
            System.out.println("------------------------------------------------------------------");
        }
        monster.damageTaken(damage);
    }

    void pAttack(playerCharacter monster) {
        int pDamage = getPdamage(); // damage from the return value from getPdamage method.
        int physicalSkillCost = 20; // physical skill mana cost value set to 20.
        if (playerManaLeft >= 20) { // If the players mana is greater or equal to 20 then they can use a physical skill
            playerManaLeft -= physicalSkillCost; // total player mana left decrement by the physical skill cost.
            System.out.println("\nPhysical Skill Activated");
            if (this instanceof Potion) {
                System.out.println("------------------------------------------------------------------");
                System.out.println("You used " + pSkillList + " on the " + monster + " dealing " + pDamage + " damage\n");
            } else {
                System.out.println("The enemy fought back dealing " + pDamage + " Damage to your HP");
                System.out.println("------------------------------------------------------------------");
            }
            monster.damageTaken(pDamage);
        }else{
            System.out.println("+-----------------------------+");
            System.out.println("Not enough mana for that skill");
            System.out.println("+-----------------------------+");
        }
    }

    void mAttack(playerCharacter monster) {
        int mdamage = getMdamage(); // damage from the return value from getMdamage method.
        int magicalSkillCost = 30; // magical skill mana cost value set to 30.
        // total player mana left decrement by the magical skill cost.
        if (playerManaLeft >= 30) { // If the players mana is greater or equal to 30 then they can use a magical skill
            playerManaLeft -= magicalSkillCost; // total player mana left decrement by the physical skill cost.
            System.out.println("\nMagical Skill Activated");
            if (this instanceof Potion) {
                System.out.println("------------------------------------------------------------------");
                System.out.println("You used " + mSkillList + " on the " + monster + " dealing " + mdamage + " damage\n");
            } else {
                System.out.println("The enemy fought back dealing " + mdamage + " Damage to your HP");
                System.out.println("------------------------------------------------------------------");
            }
            monster.damageTaken(mdamage);
        }else{
            System.out.println("+-----------------------------+");
            System.out.println("Not enough mana for that skill");
            System.out.println("+-----------------------------+");
        }
    }
    void heal(){ // method for the option of using Auri-El's Blessing
        if(stillHasMiracle()){ // return stillHasMiracle
            int miraclePotency = 150; // healing Blessing potency
            playerHealthLeft += miraclePotency; // Players total health left + the healing value of the blessing.
            miracle--; // -1/Decrement the value of a miracle use by 1 whenever the user use a blessing skill.
            System.out.println("----------------------------------------------------------------");
            System.out.println("> You used Auri-El's Blessing and restored " + miraclePotency + " back to your HP");
            System.out.println("----------------------------------------------------------------");
        } else {
            System.out.println("> You have no more blessings left.");
        }
    }
    private void damageTaken(int damage) { // method for the damage taken of the player.
        playerHealthLeft -= damage; // player health decrement from the damage done by the enemy.
    }
    private int getDamage() { // method for the light attack damage of the player.
        Random rand = new Random();
        return rand.nextInt(lightAttackDmg); // return the random value of light attack damage.
    }
    private int getPdamage(){ // method for the physical damage of the player.
        return physicalSkillDamage; // return the value for the physical skill damage.
    }
    private int getMdamage(){ // method for the magic damage of the player.
        return magicalSkillDamage; // return the value for the magical skill damage.
    }
    boolean isAlive() { // boolean method for when the player is still alive.
        return playerHealthLeft > 0; // return the value if player health is greater than 0.
    }
    boolean isDead() { // boolean method for when the player is dead.
        return !isAlive(); // return value if the player is not alive.
    }
    public String toString() {
        return name;
    }
    private boolean stillHasMiracle(){ // Boolean method for using miracle blessings
        return miracle > 0; // return the value if the miracle count is still greater than 0 to the heal method
    }
}// class


