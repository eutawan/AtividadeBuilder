public class Main {
    public static void main(String[] args) {
        PessoaBuilder pessoaBuilder = new PessoaConcretBuilder();
        PessoaDiretor pessoaDiretor = new PessoaDiretor(pessoaBuilder);

        Pessoa pessoaMasc = pessoaDiretor.masculino();
        System.out.println("Masculino: " + pessoaMasc);

        Pessoa pessoaFemin = pessoaDiretor.feminino();
        System.out.println("Feminino: " + pessoaFemin);

    }
}