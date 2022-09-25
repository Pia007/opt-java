public class Main {
    public static void main(String[] args) throws Exception {

        // create a player object
        Player player = new Player();

        // manually set fields
        // Why? Because we don't have a constructor
        // player.name = "Jax";
        // player.health = 20;
        // player.weapon = "Sword";


        //test
        // int damage = 10;
        // player.loseHealth(damage);
        // System.out.println("Remaining health = " + player.healthRemaining());

        // damage = 11;
        // player.health = 200;
        // player.loseHealth(damage);
        // System.out.println("Remaining health = " + player.healthRemaining());

        // create a enhanced player object
        EnhancedPlayer enhancedPlayer = new EnhancedPlayer("Jax", 200, "Sword");
        System.out.println("Initial health is " + enhancedPlayer.getHealth());
    }
}

// Encapsulation
    // restrict access to certain components in an object
    // guard against external access from other classes
// Player class
    // will not use encapsulation
    // Issue1: Main has direct access to the fields
        // can overwrite the fields
        // example: player.health = 200;
    // Issue2: an internal change to a field in the Player class will cause in error in Main Class
        // example in Player Class
            // changed player.name to player.fullName will cause an error in Main Class
            // player.name = "Jax";
    // Issue3: because the fields are put in manually in Main - may forget to initialize them
    // Issue4: no way to validate the data
        // example: player.health = -20;
            // a constructor only allows access to data when the data is valid
    // Issue5: cannot define the max health per player
// EnhancedPlayer class
    // uses encapsulation
    // constructor validates health
        // can only access health through a getter
// NOTE: changed health to hitPoints and code will still run correctly in Main Class
    // because the getter is still called getHealth()
