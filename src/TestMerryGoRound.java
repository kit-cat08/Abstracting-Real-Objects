
/**
 * TestMerryGoRound class to test the MerryGoRound class functionality.
 * @author Cathy Vo
 * @collaborators CoPILOT
 * @version 11/13/2025
 */
public class TestMerryGoRound {
    public static void main(String[] args) throws Exception {
        // Create MerryGoRound objects and test methods
        // Create Capacity object
        Capacity capacity = new Capacity(100);
        // Create MerryGoRound objects
        MerryGoRound merryGoRound = new MerryGoRound(20, 20, 5, 10, false, capacity);
        MerryGoRound merryGoRound2 = new MerryGoRound(10, 10, 7);
        // Test toString method and other functionalities
        System.out.println(merryGoRound.toString());
        System.out.println(merryGoRound2.toString());
        merryGoRound.cleaning();
        merryGoRound.theme("Winter Wonderland");
        merryGoRound2.spinning();
        merryGoRound2.lightColors("Green", "Red");
    }
}
