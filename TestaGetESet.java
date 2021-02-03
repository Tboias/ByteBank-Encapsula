public class TestaGetESet {
    public static void main(String[] args) {
        Conta contaDoPaulo = new Conta(1337, 7562);
        contaDoPaulo.setNumero(1337);

        // Agora em duas linhas :
        Cliente titularDaConta = contaDoPaulo.getTitular();
        titularDaConta.setProfissao(" Programador ");
        titularDaConta.setNome(" Paulo Henrique ");

        System.out.println(titularDaConta.getProfissao());
        System.out.println(titularDaConta.getNome());

    }
}