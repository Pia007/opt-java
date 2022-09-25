public class EnhancedPlayer {

    //fields
    private String name;
    private int hitPoints = 100;
    private String weapon;

    // constructor
    public EnhancedPlayer(String name, int health, String weapon) {
        this.name = name;

        // basic validation for health
        if (health > 0 && health <= 250) {
            this.hitPoints = health;
        }
        this.weapon = weapon;
    }

    // methods
    public void loseHealth(int damage) {
        this.hitPoints = this.hitPoints - damage;
        if (this.hitPoints <= 0) {
            System.out.println("Player knocked out");

            // reduce number of lives remaining for the player
        }
    }

    // getter for heath
    public int getHealth() {
        return hitPoints;
    }

}

// EnhancePlayer will use encapsulation
// define fields as private
// initially defines health to 100
// constructor
//  only assigns health to the field if it is > 0 and <= 200
// can add validation to name fields
