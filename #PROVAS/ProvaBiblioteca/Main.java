public class Main {
    public static void main(String[] args) {
        Biblioteca biblioteca = new Biblioteca();
 
        Bibliotecario ana = new Bibliotecario(1, "SENIOR", "Ana", 1000.0);
        Auxiliar bruno = new Auxiliar(2, "ACERVO", "Bruno", 1000.0);
        Atendente carla = new Atendente(3, "NOITE", "Carla", 1000.0);
 
        System.out.println("Cadastro Ana: " + biblioteca.adicionaFuncionario(ana));
        System.out.println("Cadastro Bruno: " + biblioteca.adicionaFuncionario(bruno));
        System.out.println("Cadastro Carla: " + biblioteca.adicionaFuncionario(carla));
 
        System.out.printf("%nSalário Ana: R$ %.2f%n", biblioteca.mostraSalario("Ana"));
        System.out.printf("Salário Bruno: R$ %.2f%n", biblioteca.mostraSalario("Bruno"));
        System.out.printf("Salário Carla: R$ %.2f%n", biblioteca.mostraSalario("Carla"));
        System.out.printf("Salário inexistente: R$ %.2f%n", biblioteca.mostraSalario("Zeca"));
 
        System.out.println();
        System.out.println(biblioteca.executaTarefa(biblioteca.buscaFuncionario("Ana"), "Dom Casmurro"));
        System.out.println(biblioteca.executaTarefa(biblioteca.buscaFuncionario("Bruno"), "Romance"));
        System.out.println(biblioteca.executaTarefa(biblioteca.buscaFuncionario("Carla"), "João"));
 
        System.out.println("\nExcluir Bruno: " + biblioteca.excluiFuncionario("Bruno"));
        System.out.println("Excluir Bruno de novo: " + biblioteca.excluiFuncionario("Bruno"));
        System.out.println("Busca Bruno: " + biblioteca.buscaFuncionario("Bruno"));
    }
}
