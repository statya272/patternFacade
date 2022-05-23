public class Main {
    public static void main(String[] args) {
        BinOps bins = new BinOps();
        String demoSum = bins.sum("10010", "1111");
        System.out.println(demoSum);
        String demoMult = bins.mult("10110", "1010");
        System.out.println(demoMult);
    }
}
