class Bibliotecario extends Funcionario {
    private String cargo; // "JUNIOR" ou "SENIOR"
 
    public Bibliotecario(int registro, String cargo, String nome, Double salario) {
        super(nome, salario, registro);
        this.cargo = cargo;
    }
 
    public String getCargo() { return cargo; }
    public void setCargo(String cargo) { this.cargo = cargo; }
 
    @Override
    public Double calculaSalario() {
        double acrescimo = 0.0;
        if (cargo.equalsIgnoreCase("SENIOR")) {
            acrescimo = 0.30;
        } else if (cargo.equalsIgnoreCase("JUNIOR")) {
            acrescimo = 0.10;
        }
        // (salário + acréscimo) com 10% de imposto
        return getSalario() * (1 + acrescimo) * 0.90;
    }
 
    public String processarEmprestimo(String livro) {
        return "Empréstimo de " + livro + " processado por " + cargo + ".";
    }
}
 
