class Atendente extends Funcionario {
    private String turno; // "MANHA" ou "NOITE"
 
    public Atendente(int registro, String turno, String nome, Double salario) {
        super(nome, salario, registro);
        this.turno = turno;
    }
 
    public String getTurno() { return turno; }
    public void setTurno(String turno) { this.turno = turno; }
 
    @Override
    public Double calculaSalario() {
        double acrescimo = turno.equalsIgnoreCase("NOITE") ? 0.20 : 0.0;
        return getSalario() * (1 + acrescimo) * 0.90;
    }
 
    public String atenderUsuario(String usuario) {
        return "Usuário " + usuario + " atendido no turno " + turno + ".";
    }
}
 
