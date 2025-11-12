public class App {
    public static void main(String[] args) throws Exception {
        Capacity capacity = new Capacity(100);
       MerryGoRound merryGoRound = new MerryGoRound(20, 20, 5, 10, false, capacity);
       MerryGoRound merryGoRound2 = new MerryGoRound(10, 10, 7);
       System.out.println(merryGoRound.toString());
       System.out.println(merryGoRound2.toString());
        merryGoRound.cleaning();
        merryGoRound.theme("Winter Wonderland");
        merryGoRound2.spinning();
        merryGoRound2.lightColors("Green", "Red");
    }
}
