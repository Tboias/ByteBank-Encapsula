
public class TestaValores {
    public static void main(String[] args) {
        Conta conta = new Conta(1337, 24226);
        Conta conta2 = new Conta(1337, 2656);

        System.out.println(" O total da Conta é : " + Conta.getTotal());
    }
}