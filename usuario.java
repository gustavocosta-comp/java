public class Usuario    {
    private String nome;
    
    public void setNome(String nome) {
        this.nome = nome;
    }
    public String getNome() {
        return nome;
    }
    public boolean eAutorizado () {
       return nome!=null && (nome.equalsIgnoreCase("Gustavo")||nome.equalsIgnoreCase("Pietro")||nome.equalsIgnoreCase("Orlando"));
    }
}
    
