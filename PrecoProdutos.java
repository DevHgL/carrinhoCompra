public class PrecoProdutos
{
    private String nome;
    private float valor;
    private int quantidade;

    // Construtor para inicializar os atributos da classe com valores fornecidos
    public PrecoProdutos(String nome, float valor, int quantidade)
    {
        this.nome = nome;
        this.valor = valor;
        this.quantidade = quantidade;
    }

    // Método para obter o nome do produto
    public String getNome()
    {
        return nome;
    }

    // Método para obter o valor do produto
    public float getValor()
    {
        return valor;
    }

    // Método para obter a quantidade do produto
    public int getQuantidade()
    {
        return quantidade;
    }

    // Método para definir a quantidade do produto
    public void setQuantidade(int quantidade)
    {
        this.quantidade = quantidade;
    }

    // Método para definir o valor do produto
    public void setValor(int valor)
    {
        this.valor = valor;
    }
}
