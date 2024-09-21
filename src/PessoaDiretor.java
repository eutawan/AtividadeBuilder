public class PessoaDiretor {
    private PessoaBuilder builder;

    public PessoaDiretor(PessoaBuilder builder){
        this.builder = builder;
    }

    public Pessoa masculino(){
        return builder
                .definirNome("Tawan")
                .definirCpf("019.155.773-40")
                .definirEmail("tawan@gmail.com")
                .definirIdade(20)
                .definirRg("23554363224235")
                .definirEndereco("Rua Troca de Tapa - 365")
                .definirTelefone("(88) 999244496")
                .construir();
    }
    public Pessoa feminino(){
        return builder
                .definirNome("Rosângela")
                .definirCpf("604661999-36")
                .definirEmail("rosangela@gmail.com")
                .definirIdade(31)
                .definirRg("764765786875")
                .definirEndereco("Rua BeboCego - 388")
                .definirTelefone("(88) 933466788")
                .construir();
    }
}
