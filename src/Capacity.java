/**
 * Represents the capacity details of a system, including the number of horses.
 * @author Cathy Vo
 * @collaborators CoPILOT
 * @version 11/12/2025
 */
public class Capacity {
    private int numHorses; // Number of horses

    /**
     * Constructs a Capacity object with the specified number of horses.
     * @param numHorses the number of horses
     */
    public Capacity(int numHorses) {
        this.numHorses = numHorses;
    }

    /**
     * Gets the number of horses.
     * @return the number of horses
     */
    public int getNumHorses() {
        return numHorses;
    }

    /**
     * Sets the number of horses.
     * @param numHorses the new number of horses
     */
    public void setNumHorses(int numHorses) {
        this.numHorses = numHorses;
    }
}
