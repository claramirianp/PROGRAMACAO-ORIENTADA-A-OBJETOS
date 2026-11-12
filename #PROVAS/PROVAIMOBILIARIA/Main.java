public class Main {
    public static void main(String[] args) {
        Imobiliaria imobiliaria = new Imobiliaria();
 
        Residencial casa = new Residencial("CASA", "LOCAÇÃO", 1000.0, "Casa Centro", true);
        Residencial apto = new Residencial("APARTAMENTO", "COMPRA", 200000.0, "Apto Vista Linda", true);
        Comercial loja = new Comercial("CENTRO", "COMPRA", 500000.0, "Loja Rua Principal", true);
        Comercial sala = new Comercial("BAIRRO", "LOCAÇÃO", 2000.0, "Sala Bairro Novo", true);
        Comercial inativo = new Comercial("CENTRO", "LOCAÇÃO", 3000.0, "Galpão Inativo", false);
 
        System.out.println("Add casa: " + imobiliaria.adicionaImovel(casa));
        System.out.println("Add apto: " + imobiliaria.adicionaImovel(apto));
        System.out.println("Add loja: " + imobiliaria.adicionaImovel(loja));
        System.out.println("Add sala: " + imobiliaria.adicionaImovel(sala));
        System.out.println("Add inativo: " + imobiliaria.adicionaImovel(inativo));
 
        System.out.println("\nPreços:");
        for (Imovel i : imobiliaria.disponiveis()) {
            System.out.printf("  [%c] %s: R$ %.2f%n", i.getTipo(), i.getDescricao(), i.calculaPreco());
        }
 
        System.out.println("\nResidenciais: " + imobiliaria.residenciais().length);
        for (Residencial r : imobiliaria.residenciais()) {
            System.out.println("  " + r.getDescricao() + " (" + r.getTipoResidencia() + ")");
        }
 
        System.out.println("\nComerciais: " + imobiliaria.comerciais().length);
        for (Comercial c : imobiliaria.comerciais()) {
            System.out.println("  " + c.getDescricao() + " (" + c.getLocalizacao() + ")");
        }
 
        System.out.println("\nBusca 'Casa Centro': " + imobiliaria.buscaImovel("Casa Centro").getDescricao());
        System.out.println("Busca 'Inexistente': " + imobiliaria.buscaImovel("Inexistente"));
 
        System.out.println("\nExcluir 'Casa Centro': " + imobiliaria.excluiImovel("Casa Centro"));
        System.out.println("Excluir 'Casa Centro' de novo: " + imobiliaria.excluiImovel("Casa Centro"));
        System.out.println("Total cadastrados: " + imobiliaria.disponiveis().length);
    }
}
