class Auxiliar extends Funcionario {
    private String setor; // "ACERVO" ou "LIMPEZA"
 
    public Auxiliar(int registro, String setor, String nome, Double salario) {
        super(nome, salario, registro);
        this.setor = setor;
    }
 
    public String getSetor() { return setor; }
    public void setSetor(String setor) { this.setor = setor; }
 
    @Override
    public Double calculaSalario() {
        double acrescimo = 0.0;
        if (setor.equalsIgnoreCase("ACERVO")) {
            acrescimo = 0.15;
        } else if (setor.equalsIgnoreCase("LIMPEZA")) {
            acrescimo = 0.05;
        }
        return getSalario() * (1 + acrescimo) * 0.90;
    }
 
    public String organizarLivros(String genero) {
        return "Livros de " + genero + " organizados no " + setor + ".";
    }
}
