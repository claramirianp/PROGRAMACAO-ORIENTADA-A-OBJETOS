class Funcionario {
    private String nome;
    private Double salario;
    private int registro;
 
    public Funcionario(String nome, Double salario, int registro) {
        this.nome = nome;
        this.salario = salario;
        this.registro = registro;
    }
 
    public String getNome() { return nome; }
    public void setNome(String nome) { this.nome = nome; }
    public Double getSalario() { return salario; }
    public void setSalario(Double salario) { this.salario = salario; }
    public int getRegistro() { return registro; }
    public void setRegistro(int registro) { this.registro = registro; }
 
    // Salário com desconto de 10% de impostos
    public Double calculaSalario() {
        return salario * 0.90;
    }
}
