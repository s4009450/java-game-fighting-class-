import java.util.Scanner;
import java.util.Random;

/* basicly i cannot figure out how to make this call all these methods for fighting and classes and stuff, so i just put everything in the main file, and it works, but its messy as hell */

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Random rand = new Random();

        System.out.println("Welcome to my stupid battle program!");
        System.out.println("Please select an option:\n1. Fight Goblin\n 2. Fight Orc \n 3. fight GOD ");
        boolean gameRunning = true;

        int choice = scanner.nextInt();
        switch (choice) {
            case 1:
                System.out.println("You have chosen to fight a Goblin!");
                Enemy player = new Enemy(100, 5, 20, "player"); // fixed stats for player
                Enemy goblin = new Enemy(rand.nextInt(50) + 50, rand.nextInt(5) + 1, rand.nextInt(15) + 5, "goblin");// random stats for goblin
                while (gameRunning && player.isAlive() && goblin.isAlive()) {
                    System.out.println("\nChoose your action:");
                    System.out.println("1. Light Attack");
                    System.out.println("2. Heavy Attack");
                    System.out.println("3. Use Health Potion");
                    System.out.println("4. Give Up");

                            int action = scanner.nextInt();

                            switch (action) {
                                case 1:
                                    goblin.takeDamage(player.attack / 2);
                                    break;
                                case 2:
                                    goblin.takeDamage(player.attack);
                                    break;
                                case 3:
                                    player.health += 20;
                                    System.out.println("You used a health potion. Health is now: " + player.health);
                                    break;
                                case 4:
                                    System.out.println("You gave up!");
                                    gameRunning = false;
                                    continue;
                                default:
                                    System.out.println("Invalid action.");
                            }
                            
                            if (goblin.isAlive()) {

                                int rand2 = rand.nextInt(5) + 1;

                                if (rand2 == 1) {
                                    System.out.println("Smiling, the Goblin swings it's sharp blade at you !");
                                } else if (rand2 == 2) {
                                    System.out.println("The goblin smiles, launching at you with it's sharp blade !");
                                } else if (rand2 == 3) {
                                    System.out.println("Shouting, the Goblin slashes at you!");
                                } else if (rand2 == 4) {
                                    System.out.println("The Goblin charges forward, it's dagger aiming for your neck!");
                                } else if (rand2 == 5) {
                                    System.out.println("The " + goblin.name + " lets out a guttural roar and attacks!");
                                }

                            
                                player.takeDamage(goblin.attack);
                            } else {
                                System.out.println("You defeated the goblin!");
                                gameRunning = false;
                            }

                            if (!player.isAlive()) {
                                System.out.println("You have been defeated!");
                                gameRunning = false;
                            }
                        }

                        scanner.close();
                    
                break;
            case 2:
                System.out.println("You have chosen to fight an Orc!");
                Enemy player2 = new Enemy(100, 5, 20, "player"); // fixed stats for player
                Enemy orc = new Enemy(rand.nextInt(80) + 50, rand.nextInt(5) + 1, rand.nextInt(15) + 5, "orc");// random stats for orc
                while (gameRunning && player2.isAlive() && orc.isAlive()) {
                    System.out.println("\nChoose your action:");
                    System.out.println("1. Light Attack");
                    System.out.println("2. Heavy Attack");
                    System.out.println("3. Use Health Potion");
                    System.out.println("4. Give Up");

                            int action = scanner.nextInt();

                            switch (action) {
                                case 1:
                                    orc.takeDamage(player2.attack / 2);
                                    break;
                                case 2:
                                    orc.takeDamage(player2.attack);
                                    break;
                                case 3:
                                    player2.health += 20;
                                    System.out.println("You used a health potion. Health is now: " + player2.health);
                                    break;
                                case 4:
                                    System.out.println("You gave up!");
                                    gameRunning = false;
                                    continue;
                                default:
                                    System.out.println("Invalid action.");
                            }
                            
                            if (orc.isAlive()) {

                                int rand2 = rand.nextInt(5) + 1;

                                if (rand2 == 1) {
                                    System.out.println("Smiling, the Orc swings it's sharp blade at you !");
                                } else if (rand2 == 2) {
                                    System.out.println("The Orc smiles, launching at you with it's sharp blade !");
                                } else if (rand2 == 3) {
                                    System.out.println("Shouting, the Orc slashes at you!");
                                } else if (rand2 == 4) {
                                    System.out.println("The Orc charges forward, it's dagger aiming for your neck!");
                                } else if (rand2 == 5) {
                                    System.out.println("The " + orc.name + " lets out a guttural roar and attacks!");
                                }

                                player2.takeDamage(orc.attack);
                            } else {
                                System.out.println("You defeated the orc!");
                                gameRunning = false;
                            }

                            if (!player2.isAlive()) {
                                System.out.println("You have been defeated!");
                                gameRunning = false;
                            }
                        }

                        scanner.close();
                break;
            case 3:
                System.out.println("You have chosen to fight GOD!");
                Enemy player3 = new Enemy(100, 50, 20, "player"); // fixed stats for player
                Enemy god = new Enemy(rand.nextInt(500) + 500, rand.nextInt(5) + 1, rand.nextInt(15) + 5, "god");// random stats for god
                while (gameRunning && player3.isAlive() && god.isAlive()) {
                    System.out.println("\nChoose your action:");
                    System.out.println("1. patetic Light Attack");
                    System.out.println("2. patetic Heavy Attack");
                    System.out.println("3. Use patetic Health Potion");
                    System.out.println("4. Admit you are patetic, Give Up");

                            int action = scanner.nextInt();

                            switch (action) {
                                case 1:
                                    god.takeDamage(player3.attack / 2);
                                    break;
                                case 2:
                                    god.takeDamage(player3.attack);
                                    break;
                                case 3:
                                    player3.health += 20;
                                    System.out.println("You used a health potion. Health is now: " + player3.health);
                                    break;
                                case 4:
                                    System.out.println("You gave up!");
                                    gameRunning = false;
                                    continue;
                                default:
                                    System.out.println("Invalid action.");
                            }

                            if (god.isAlive()) {

                                int rand2 = rand.nextInt(5) + 1;

                                if (rand2 == 1) {
                                    System.out.println("God snaps his fingers !");
                                } else if (rand2 == 2) {
                                    System.out.println("God smiles dissapointedly ! the shame it causes you, brings you to your knees");
                                } else if (rand2 == 3) {
                                    System.out.println("Shouting, the Orc slashes at you!");
                                } else if (rand2 == 4) {
                                    System.out.println("God laughs, the sound of his laughter is enough to break your spirit");
                                } else if (rand2 == 5) {
                                    System.out.println("The " + god.name + " lets out a guttural roar and attacks!");
                                }

                                player3.takeDamage(god.attack);
                            } else {
                                System.out.println("You defeated the orc!");
                                gameRunning = false;
                            }

                            if (!player3.isAlive()) {
                                System.out.println("You have been defeated!");
                                gameRunning = false;
                            }
                        }

                        scanner.close();
                break;
            default:
                Enemy player4 = new Enemy(100, 5, 20, "player"); // fixed stats for player
                System.out.println("Invalid choice. Exiting game.");
                scanner.close();
                return;
        }  


    }
}
