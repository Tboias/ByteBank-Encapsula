public class TestaGetESet {
    public static void main(String[] args) {
        Conta conta = new Conta();
        conta.setNumero(1337);

        Cliente paulo = new Cliente();
        conta.setTitular(paulo);

        paulo.setNome("Paulo Silveira");
        paulo.setCpf("333.244.264.-99");
        paulo.setProfissao("Programador");

    }
}