public class BinOps {
    public String sum(String a, String b) {
        int op1 = Integer.parseInt(a, 2);
        int op2 = Integer.parseInt(b, 2);
        return Integer.toBinaryString(op1 + op2);
    }

    public String mult(String a, String b) {
        int op1 = Integer.parseInt(a, 2);
        int op2 = Integer.parseInt(b, 2);
        return Integer.toBinaryString(op1 * op2);
    }
}
