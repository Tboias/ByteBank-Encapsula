
public class TestaValores {
    public static void main(String[] args) {
        Conta conta = new Conta(1337, 24226);

        conta.setAgencia(0);
        conta.setNumero(0);

        System.out.println(conta.getAgencia());
        System.out.println(conta.getNumero());
    }
}