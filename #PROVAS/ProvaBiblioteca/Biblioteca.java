class Biblioteca {
    private Funcionario[] funcionarios = new Funcionario[10];
 
    // Método auxiliar: insere na primeira posição livre
    private boolean adicionar(Funcionario f) {
        for (int i = 0; i < funcionarios.length; i++) {
            if (funcionarios[i] == null) {
                funcionarios[i] = f;
                return true;
            }
        }
        return false; // vetor cheio
    }
 
    public boolean adicionaFuncionario(Bibliotecario b) { return adicionar(b); }
    public boolean adicionaFuncionario(Auxiliar a) { return adicionar(a); }
    public boolean adicionaFuncionario(Atendente at) { return adicionar(at); }
 
    public boolean excluiFuncionario(String nome) {
        for (int i = 0; i < funcionarios.length; i++) {
            if (funcionarios[i] != null && funcionarios[i].getNome().equals(nome)) {
                funcionarios[i] = null;
                return true;
            }
        }
        return false;
    }
    
    public Funcionario buscaFuncionario(String nome) {
        for (Funcionario f : funcionarios) {
            if (f != null && f.getNome().equals(nome)) {
                return f;
            }
        }
        return null;
    }
 
    public Double mostraSalario(String nome) {
        Funcionario f = buscaFuncionario(nome);
        if (f == null) {
            return 0.0;
        }
        return f.calculaSalario();
    }
 
    // Casting (downcast) protegido por instanceof
    public String executaTarefa(Funcionario f, String parametro) {
        if (f instanceof Bibliotecario) {
            return ((Bibliotecario) f).processarEmprestimo(parametro);
        } else if (f instanceof Auxiliar) {
            return ((Auxiliar) f).organizarLivros(parametro);
        } else if (f instanceof Atendente) {
            return ((Atendente) f).atenderUsuario(parametro);
        }
        return "Tarefa não disponível para este funcionário.";
    }
}

