import java.util.Random;
import java.util.Scanner;

public class Main {

    // System objects
    private static final Random rand = new Random();
    private static final Scanner keyboard = new Scanner(System.in);

    public static void main(final String[] args) {

        Potion player = new Potion("Player", 250, 20, 100, 45, 55);
        System.out.println("            #            #                ");
        System.out.println("           ##      ##    ##               ");
        System.out.println("          ###    #####   ###              ");
        System.out.println("         ###    #  ###    ###             ");
        System.out.println("        ###        ####    ###            ");
        System.out.println("       ###        #####     ###           ");
        System.out.println("      #####     ########   #####          ");
        System.out.println("      ######  #########  #######          ");
        System.out.println("      ##########################          ");
        System.out.println("       ###     ########     ###           ");
        System.out.println("        ###     ######     ###            ");
        System.out.println("         ###     #####    ###             ");
        System.out.println("          ###    ####    ###              ");
        System.out.println("           ##    ###    ##                ");
        System.out.println("            #    ##     #                 ");
        System.out.println("_________________________________________ ");
        System.out.println("   #     ####   ####  ##    #     #       ");
        System.out.println("  # #    #   #  #     # #   #    # #      ");
        System.out.println(" #####   ####   ####  #  #  #   #####     ");
        System.out.println("#     #  #  #   #     #   # #  #     #    ");
        System.out.println("#     #  #   #  ####  #    ## #       #   ");
        System.out.println("_________________________________________\n");

        // Select one of the game option before starting the game.
        System.out.println("[1] NEW GAME");
        System.out.println("[2] EXIT\n");

        // Input of the user in the console using the scanner object.
        String newGame = keyboard.nextLine();

        // Using switch statements for the option of starting the game.
        // If one of the option matched then the associated block of code is executed.
        // If the player selects "1" then then program will start the story introduction of the game.
        // And by pressing "2" then the game will end.
        // Default is if any button is pressed then its invalid option and then the game will end.
        switch (newGame) {
            case "1" -> {
                System.out.println("+=============================================================================+");
                System.out.println("> The Continent of Tamriel is in danger as the neighbor continent of Akaviri");
                System.out.println("> tries to invade and conquer all of Tamriel. The race of elves");
                System.out.println("> proposed a plan to the other races of tamriel on how to fight back");
                System.out.println("> the massive invading forces from Akaviri continent.");
                System.out.println("+=============================================================================+\n");
                System.out.println("Press Enter Key to Continue.....");
                keyboard.nextLine();
                System.out.println("+=====================================================================+");
                System.out.println("> The plan is to retrieve a powerful artifact called heart of Lorkhan,");
                System.out.println("> located inside the ancient Dwemer Ruins of Black reach");
                System.out.println("> at the center of the Red Mountain in the province of Vvarndenfell.");
                System.out.println("+=====================================================================+");
                System.out.println("Press Enter key to Continue....");
                keyboard.nextLine();
                System.out.println("+=========================================================================+");
                System.out.println("> Emperor Tiber Septim of Cyrodill sent people to Vvarndefell to retrieve");
                System.out.println("> the heart of Lorkhan in Blackreach, but all were unsuccessful due to the");
                System.out.println("> dwarven automatons inside Blackreach that is guarding the Artifact");
                System.out.println("+=========================================================================+\n");
                System.out.println("Press Enter Key to continue....");
                keyboard.nextLine();
                System.out.println("+=========================================================================+");
                System.out.println("> The emperor has no choice but to call once again his retired and most powerful");
                System.out.println("> knight to aid the people in defeating the automatons in Blackreach ");
                System.out.println("+=========================================================================+\n");
                System.out.println("Press Enter key to continue....");
                keyboard.nextLine();
                System.out.println(" ,^,                  ,^,    ");
                System.out.println("{##{   ____________   }##}   ");
                System.out.println(" {##--[            ]--##}    ");
                System.out.println("  {##[      .^.     ]##}     ");
                System.out.println("    | ______|_|______ |      ");
                System.out.println("    |[######|_|######]|      ");
                System.out.println("    |       | |       |      ");
                System.out.println("    | +   + | | +   + |      ");
                System.out.println("    |L +  + |_| +  + /|      ");
                System.out.println("   .+:L             /:+.     ");
                System.out.println("  +::::L___________/::::+    ");
                System.out.println(" +:::::::=========:::::::+   ");
                System.out.println("+:::::::::=========:::::::+ \n");
                System.out.println("+===========================================================+");
                System.out.println("> You are Pelinal Whitestrake the Empire's greatest Knight");
                System.out.println("> and the last descendant of the race of old Ehlnofey.");
                System.out.println("> The emperor has once again called you to aid the people of");
                System.out.println("> Tamriel in raiding the dangerous ruins of Blackreach.");
                System.out.println("+===========================================================+");
                System.out.println("Press Enter key to continue....");
                keyboard.nextLine();
                System.out.println("+=========================================================================+");
                System.out.println("> You accepted emperors plea for help and went to the province of Vvarndenfell");
                System.out.println("> Along with some of the empires soldiers.");
                System.out.println("> You and the soldiers then proceed to the center of the Vvardenfell province.");
                System.out.println("> Where the red mountain is located.");
                System.out.println("> The Emperor gave you a task of eliminating all of the automatons inside the dungeon");
                System.out.println("+=========================================================================+");
                System.out.println("Press Enter key to continue....");
                keyboard.nextLine();
                System.out.println("                                            /$$$$$$$,               ");
                System.out.println("                                           /$$$$$$$$$L              ");
                System.out.println("                         /####,          /            L,            ");
                System.out.println("                       /       L       /                L           ");
                System.out.println("         /####       /           L,  / ;                 L          ");
                System.out.println("       /      L    /    /          /  /                   L_        ");
                System.out.println("     /   /      L /               /            ,----,         L     ");
                System.out.println("   _/    /        L           __/             |      |          L,  ");
                System.out.println(" _/    ;      /,   ;        /                 |      |            L ");
                System.out.println("/___________________L_____/________L__________|______|_____________L\n");
                System.out.println("+=======================================================================+");
                System.out.println("> You arrived at the entrance of the dungeon and as you entered Blackreach");
                System.out.println("> The automatons that is guarding the ruins started to move and tried to");
                System.out.println("> eliminate intruders.");
                System.out.println("+=======================================================================+");
                keyboard.nextLine();
                System.out.println("\n\nMain Objective for this quest is to kill 10 Dwemer Automatons guarding the gate to the red mountain.\n\n");
                System.out.println("Goodluck adventurer and have fun playing!!");
                System.out.println("Press enter to start the game....\n\n\n\n\n\n");
                keyboard.nextLine();
            }
            case "2" ->  // Press 2 to exit the game and the program will end.
                    System.exit(0);
            default -> {
                System.out.println("\nInvalid command please select a proper option");
                System.exit(0);
            }
            // Any other option besides 1-3 is invalid and the program will end.
        }// End of switch statement.

        // label name of this while loop is ENEMY
        ENEMY:
        // This while loop will continue over and over.
        // while the player is still alive
        while (player.isAlive()) {

            // spawn random enemies from the spawnRandomEnemy method
            Enemy enemy = Enemy.spawnRandomEnemy();
            System.out.println("------------------------------------------------");
            System.out.println(enemy + " has appeared in front of you!!");
            System.out.println("------------------------------------------------");
            System.out.println("          ' '       ' '            ");
            System.out.println("            ' ;     ; '            ");
            System.out.println("              `.___.`              ");
            System.out.println("            ___|   |___            ");
            System.out.println("          _{^^^     ^^^}_          ");
            System.out.println(" {_{    _{  @@@     @@@  }_    }_} ");
            System.out.println("   ####{__               __}####}  ");
            System.out.println("         {_   {<+++>}   _}         ");
            System.out.println("          {__         __}          ");
            System.out.println("     |###|  {_________}  |###|     ");
            System.out.println("    |#|   L#L         L#|   |#|    ");
            System.out.println("   |#|   |#|           |#|   |#|   ");
            System.out.println("  |#|    |#|           |#|    |#|\n");

            // This while loop will continue over and over.
            // while the enemy is still alive
            while (enemy.isAlive()) {

                int playerMaxHealth = 250;  // Max player health value.
                int playerMaxMana = 100;  // Max  player mana value.
                System.out.println("+===================================+");
                System.out.println("\nYour character's Info:");
                System.out.println("HP: " + player.playerHealthLeft + "/" + playerMaxHealth); // Status of the player's current and max HP.
                System.out.println("MP: " + player.playerManaLeft + "/" + playerMaxMana); // Status of the player's current and max MP.
                System.out.println("Health Potions: " + player.healthPots); // Total amount of HP potions left of the player.
                System.out.println("Mana Potions: " + player.manaPots); // Total amount of MP potions left of the player.
                System.out.println("\nThe " + enemy + "'s Info:");
                System.out.println("HP: " + enemy.playerHealthLeft); // Status of the enemy's current HP.
                System.out.println("+===================================+\n");
                System.out.println("+--------Battle Options---------+"); // List of battle Options for the player
                System.out.println("[1.] Light Attack");
                System.out.println("[2.] Drink Health Potion");
                System.out.println("[3.] Drink Mana Potion");
                System.out.println("[4.] Physical Skill " + " <--DMG: " + player.physicalSkillDamage + " MP cost: 20-->");
                System.out.println("[5.] Magical Skill" + "   <--DMG: " + player.magicalSkillDamage + " MP cost: 30-->");
                System.out.println("[6.] Escape!");
                System.out.println("[7.] Auri-El's Blessing");
                System.out.println("+--------------------------------+");

                String input = keyboard.nextLine();
                // Using switch statements for the battle options that the user input has to choose from.
                // If one of the option matched then the associated block of code is executed.1
                switch (input) {
                    case ("1") -> {
                        player.attack(enemy);
                        enemy.attack(player);
                        if (player.isDead()) { // if the player is dead the program will end
                            System.out.println("You have taken too much damage!");
                            System.out.println("GAME OVER....");
                            System.exit(0);
                        }
                    }
                    case ("2") -> player.consumeHealthPotion(); // press 2 to use health potion from the consumeHealthPotion method
                    case ("3") -> player.consumeManaPotion(); // press 3 to use mana potion from the consumeManaPotion method
                    case ("4") -> {
                        player.pAttack(enemy);
                        enemy.attack(player);
                        if (player.isDead()) { // if the player is dead the program will end
                            System.out.println("You have taken too much damage!");
                            System.out.println("GAME OVER....");
                            System.exit(0);
                        }
                    }
                    case ("5") -> {
                        player.mAttack(enemy);
                        enemy.attack(player);
                        if (player.isDead()) { // if the player is dead the program will end
                            System.out.println("You have taken too much damage!");
                            System.out.println("GAME OVER....");
                            System.exit(0);
                        }
                    }
                    case ("6") -> {
                        int escapeChance = 40; // escape chance value set to 40%

                        // By generating a random number from 0-100, if the number generated is less than the
                        // Escape chance which is 50 then the player can escape.
                        // In other words we set the escape chance to 50%.
                        if (rand.nextInt(100) < escapeChance) { //
                            System.out.println("\nthe enemy blocked your escape attempt!!");
                            enemy.attack(player);
                        } else {
                            System.out.println("\nYou are successful on your escape attempt\n");
                            continue ENEMY; // if escape is successful then go back to the ENEMY while loop using continue
                        }
                    }
                    case ("7") -> player.heal();
                    default -> // Invalid command if the user press different buttons beside 1-6.
                            System.out.println("> Invalid command");
                }// End of switch statement.
            }// End of the GAME while loop.
            player.defeat(enemy);


            // Ask the player if they want to continue or exit the game.
            System.out.println("----------------------------------------------------");
            System.out.println("Do you like to continue playing or exit the game?");
            System.out.println("[1] Continue.");
            System.out.println("[2] Exit.");
            String input = keyboard.nextLine();

            // While the user input is not equal to 1 or 2 then the program will just keep looping
            // telling the user that it is an invalid command until the user select a proper option.
            while (!input.equals("1") && !input.equals("2")) {
                System.out.println("Invalid command!");
                input = keyboard.nextLine();
            }
            if (input.equals("1")) {
                System.out.println("You continue your exploration in the Blackreach\n");
            } else {
                System.out.println("You exit the arena.");
                break; // break the while ENEMY loop.
            }
        }
        System.out.println("============================");
        System.out.println("~ THANKS FOR PLAYING ARENA ~");
        System.out.println("============================");
    }
}

