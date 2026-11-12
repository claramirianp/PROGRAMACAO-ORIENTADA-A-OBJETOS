class Imobiliaria {
    private Imovel[] imoveis = new Imovel[10];
 
    public Imobiliaria() {
    }
 
    // Insere na primeira posição vazia
    private boolean adicionar(Imovel imovel) {
        for (int i = 0; i < imoveis.length; i++) {
            if (imoveis[i] == null) {
                imoveis[i] = imovel;
                return true;
            }
        }
        return false; // vetor cheio
    }
 
    public boolean adicionaImovel(Residencial r) { return adicionar(r); }
    public boolean adicionaImovel(Comercial c) { return adicionar(c); }
 
    public boolean excluiImovel(String descricao) {
        for (int i = 0; i < imoveis.length; i++) {
            if (imoveis[i] != null && imoveis[i].getDescricao().equals(descricao)) {
                imoveis[i] = null;
                return true;
            }
        }
        return false;
    }
 
    // Todos os imóveis cadastrados
    public Imovel[] disponiveis() {
        int qtd = 0;
        for (Imovel i : imoveis) {
            if (i != null) qtd++;
        }
        Imovel[] resultado = new Imovel[qtd];
        int pos = 0;
        for (Imovel i : imoveis) {
            if (i != null) {
                resultado[pos++] = i;
            }
        }
        return resultado;
    }
 
    public Residencial[] residenciais() {
        int qtd = 0;
        for (Imovel i : imoveis) {
            if (i instanceof Residencial) qtd++;
        }
        Residencial[] resultado = new Residencial[qtd];
        int pos = 0;
        for (Imovel i : imoveis) {
            if (i instanceof Residencial) {
                resultado[pos++] = (Residencial) i; // casting
            }
        }
        return resultado;
    }
 
    public Comercial[] comerciais() {
        int qtd = 0;
        for (Imovel i : imoveis) {
            if (i instanceof Comercial) qtd++;
        }
        Comercial[] resultado = new Comercial[qtd];
        int pos = 0;
        for (Imovel i : imoveis) {
            if (i instanceof Comercial) {
                resultado[pos++] = (Comercial) i; // casting
            }
        }
        return resultado;
    }
 
    public Imovel buscaImovel(String descricao) {
        for (Imovel i : imoveis) {
            if (i != null && i.getDescricao().equals(descricao)) {
                return i;
            }
        }
        return null;
    }
}
