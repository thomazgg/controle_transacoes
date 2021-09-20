public class Main {
    public static void main(String[] args) throws Exception {

        Conta c1 = new Conta(1);

        c1.setIdConta(1);

        System.out.println(c1.vista(50.00));

    }
}