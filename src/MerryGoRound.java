/**
 * Represents a Merry-Go-Round with various attributes such as light brightness,
 * duration, spin speed, horse speed, cleanliness, and capacity.
 * @author Cathy Vo
 * @version 11/12/2025
 */
public class MerryGoRound {
    private int lightBrightness; // Light brightness level
    private int duration; // Duration of operation in minutes
    private int spinSpeed; // Spin speed in RPM
    private int horseSpeed; // Vertical horse movement speed
    private boolean isClean; // Cleanliness status
    private int capacity; // Maximum capacity of riders

    /**
     * Constructs a MerryGoRound object with the specified attributes.
     *
     * @param lightBrightness the brightness of the lights
     * @param duration the duration of operation in minutes
     * @param spinSpeed the spin speed in RPM
     * @param horseSpeed the vertical horse movement speed
     * @param isClean the cleanliness status
     * @param capacity the maximum capacity of riders
     */
    public MerryGoRound(int lightBrightness, int duration, int spinSpeed, int horseSpeed, boolean isClean, int capacity) {
        this.lightBrightness = lightBrightness;
        this.duration = duration;
        this.spinSpeed = spinSpeed;
        this.horseSpeed = horseSpeed;
        this.isClean = isClean;
        this.capacity = capacity;
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
        this.capacity = 50;
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
    public int getCapacity() {
        return capacity;
    }

    /**
     * Sets the maximum capacity of riders.
     *
     * @param capacity the new capacity
     */
    public void setCapacity(int capacity) {
        this.capacity = capacity;
    }
}
