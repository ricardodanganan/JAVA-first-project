// Using Extend the Potion class (subclass) inherits the attributes and methods from the playerCharacter class (superclass)
class Potion extends playerCharacter {

    int healthPots; // variable name for health potion
    int manaPots; // variable name for mana potion
    private int killCount = 1;
    Potion(String name, int health, int damage, int mana, int pSkill, int mSkill) {
        super(name, health, damage, mana, pSkill, mSkill);
        healthPots = 2; // health potions set to 3
        manaPots = 2; // mana potions set to 3
    }
    void consumeHealthPotion() { // method for the option of consuming health potion
        if (stillHasPotions()) { // return stillHasPotions
            int healthPotionPotency = 75; // int variable for the health heal points set to 75
            playerHealthLeft += healthPotionPotency; // Players total health left + the healing value of the health potion.
            healthPots--; // -1/Decrement the value of a potion by 1 whenever the user use a health potion.
            System.out.println("> You drank a health potion restoring " + healthPotionPotency + " HP points to your health.");
        } else { // Else if the health potion left is 0 then the user can't use the potion to heal the player's HP.
            System.out.println("> You have no health potions left! Defeat enemies for a chance to get more! \n");
        }
    }
    void consumeManaPotion(){ // method for the option of consuming mana potion
        if (stillHasManaPotions()){ // return stillHasManaPotions
            int manaPotionPotency = 50; // int variable for the mana heal points set to 50
            playerManaLeft += manaPotionPotency; // Players total mana left + the healing value of the mana potion.
            manaPots--; // -1/Decrement the value of a potion by 1 whenever the user use a mana potion.
            System.out.println("> You drank a mana potion restoring " + manaPotionPotency + " MP points to your mana.");
        } else { // Else if the mana potion left is 0 then the user can't use the potion to heal the player's MP.
            System.out.println("> You have no mana potions left! Defeat enemies for a chance to get more! \n");
        }
    }
    void defeat(Enemy enemy) { // Method for when the player defeats the enemy monster
        System.out.println("------------------------------------------");
        System.out.println("The " + enemy + " was defeated!");
        System.out.println("           ,,~`.___.`~,,           ");
        System.out.println("            ___|   |___            ");
        System.out.println("          _{           }_          ");
        System.out.println("        _{  ~~~     ~~~  }_        ");
        System.out.println("       {__               __}       ");
        System.out.println("         {_   #~~~~~#   _}         ");
        System.out.println("          {__         __}          ");
        System.out.println("     |###|  {_________}  |###|     ");
        System.out.println("    |#|   L#L         L#|   |#|    ");
        System.out.println("   |#|   |#|           |#|   |#|   ");
        System.out.println("  |#|    |#|           |#|    |#|\n");
        System.out.println("> You have " + playerHealthLeft + " HP left"); // inform the player of the health left after the battle sequence
        System.out.println("> You have " + playerManaLeft + " MP left"); // inform the player of the mana left after the battle sequence
        System.out.println("> You have " + healthPots + " Health potions in your inventory"); // inform the player of the health potions left after the battle sequence
        System.out.println("> You have " + manaPots + " Mana potions in your inventory");// inform the player of the mana potions left after the battle sequence
        System.out.println("> Automatons Slain = " + killCount);
        killCount++;
        if(killCount == 10){
            System.out.println("\n\nMISSION OBJECTTIVE COMPLETED!!\n\n");
            System.out.println("============================");
            System.out.println("~ THANKS FOR PLAYING ARENA ~");
            System.out.println("============================");
            System.exit(0);
        }
        enemy.dropPotionFor(this); // getting the info from dropPotionFor method, the enemy will drop a potion if defeated
    }
    private boolean stillHasPotions() { // boolean method for using potions
        return healthPots > 0; // return the value if health potions is still greater than 0 to the consumeHealthPotion method
    }
    private boolean stillHasManaPotions() { // boolean method for using mana potions
        return manaPots > 0; // return the value if mana potions is still greater than 0 to the consumeManaPotion method
    }
}//class

