/**
 * Represents a Merry-Go-Round with various attributes such as light brightness,
 * duration, spin speed, horse speed, cleanliness, and capacity.
 * @author Cathy Vo
 * @collaborators CoPILOT
 * @version 11/12/2025
 */
public class MerryGoRound {
    private int lightBrightness; // Light brightness level
    private int duration; // Duration of operation in minutes
    private int spinSpeed; // Spin speed in RPM
    private int horseSpeed; // Vertical horse movement speed
    private boolean isClean; // Cleanliness status
    private Capacity capacity1; // Maximum capacity of riders

    /**
     * Constructs a MerryGoRound object with the specified attributes.
     *
     * @param lightBrightness the brightness of the lights
     * @param duration the duration of operation in minutes
     * @param spinSpeed the spin speed in RPM
     * @param horseSpeed the vertical horse movement speed
     * @param isClean the cleanliness status
     * @param capacity the maximum capacity of riders from the Capacity class
     */
    public MerryGoRound(int lightBrightness, int duration, int spinSpeed, int horseSpeed, boolean isClean, Capacity capacity) {
        this.lightBrightness = lightBrightness;
        this.duration = duration;
        this.spinSpeed = spinSpeed;
        this.horseSpeed = horseSpeed;
        this.isClean = isClean;
        this.capacity1 = capacity;
    }
    /**
     * Constructs a MerryGoRound object with the specified attributes and defualts lightBrightness to 20, capacity to 50, and isClean to true.
     *
     * @param duration the duration of operation in minutes
     * @param spinSpeed the spin speed in RPM
     * @param horseSpeed the vertical horse movement speed
     */
    public MerryGoRound( int duration, int spinSpeed, int horseSpeed) {
        this.lightBrightness = 20;
        this.duration = duration;
        this.spinSpeed = spinSpeed;
        this.horseSpeed = horseSpeed;
        this.isClean = true;
        this.capacity1 = new Capacity(50);
    }

    /**
     * Gets the light brightness level.
     *
     * @return the light brightness level
     */
    public int getLightBrightness() {
        return lightBrightness;
    }

    /**
     * Sets the light brightness level.
     *
     * @param lightBrightness the new light brightness level
     */
    public void setLightBrightness(int lightBrightness) {
        this.lightBrightness = lightBrightness;
    }

    /**
     * Gets the duration of operation in minutes.
     *
     * @return the duration of operation
     */
    public int getDuration() {
        return duration;
    }

    /**
     * Sets the duration of operation in minutes.
     *
     * @param duration the new duration of operation
     */
    public void setDuration(int duration) {
        this.duration = duration;
    }

    /**
     * Gets the spin speed in RPM.
     *
     * @return the spin speed
     */
    public int getSpinSpeed() {
        return spinSpeed;
    }

    /**
     * Sets the spin speed in RPM.
     *
     * @param spinSpeed the new spin speed
     */
    public void setSpinSpeed(int spinSpeed) {
        this.spinSpeed = spinSpeed;
    }

    /**
     * Gets the vertical horse movement speed.
     *
     * @return the horse speed
     */
    public int getHorseSpeed() {
        return horseSpeed;
    }

    /**
     * Sets the vertical horse movement speed.
     *
     * @param horseSpeed the new horse speed
     */
    public void setHorseSpeed(int horseSpeed) {
        this.horseSpeed = horseSpeed;
    }

    /**
     * Checks if the Merry-Go-Round is clean.
     *
     * @return true if clean, false otherwise
     */
    public boolean isClean() {
        return isClean;
    }

    /**
     * Sets the cleanliness status of the Merry-Go-Round.
     *
     * @param isClean the new cleanliness status
     */
    public void setClean(boolean isClean) {
        this.isClean = isClean;
    }

    /**
     * Gets the maximum capacity of riders.
     *
     * @return the capacity
     */
    public Capacity getCapacity() {
        return capacity1;
    }

    /**
     * Sets the maximum capacity of riders.
     *
     * @param capacity the new capacity
     */
    public void setCapacity(int capacity) {
        capacity1.setNumHorses(capacity);
    }
    /**
     * Returns a string representation of the Merry-Go-Round object.
     */
    public String toString(){
        return "MerryGoRound [lightBrightness=" + lightBrightness + ", duration=" + duration + ", spinSpeed=" + spinSpeed
                + ", horseSpeed=" + horseSpeed + ", isClean=" + isClean + ", capacity=" + capacity1.getNumHorses() + "]";
    }

    /*
     * Simulates the spinning action of the Merry-Go-Round by printing "weee" for the amount of times of the duration
     */
    public void spinning(){
        for (int i = 0; i < duration; i++) {
            System.out.print("weee ");
        }
        System.out.println();
    }
    /*
     * Cleans the Merry-Go-Round by setting isClean to true and printing a message updating the cleaning process to the user
     */
    public void cleaning(){
        if(!isClean){
            System.out.println("Cleaning the Merry-Go-Round...");
            isClean = true;
            System.out.println("The Merry-Go-Round is now clean.");
        } else {
            System.out.println("The Merry-Go-Round is already clean.");
        }
    }
    /*
     * Allows the user to set the colors of the light to 2 colors.
     * @param color The first color of the light
     * @param color2 The second color of the light
     */
    public void lightColors (String color, String color2){
        System.out.println("The Merry-Go-Round lights are now " + color + " & "+ color2 +"!");
    }
    /*
     * Allows the user to set the theme of the Merry-Go-Round.
     * @param theme The theme of the Merry-Go-Round
     */
    public void theme (String theme){
        System.out.println("The Merry-Go-Round theme is now set to " + theme + "!");
    }
}
