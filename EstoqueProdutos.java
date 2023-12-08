public class EstoqueProdutos
{
    private PrecoProdutos[] produtos;
    private int quantidadeProdutos;

    // Construtor que inicializa o array 'produtos' com espaço para 100 itens e define a quantidade inicial como zero
    public EstoqueProdutos()
    {
        produtos = new PrecoProdutos[100];
        quantidadeProdutos = 0;
    }

    // Método para adicionar um produto ao estoque
    public void adicionaProduto(PrecoProdutos produto)
    {
        // Verifica se ainda há espaço disponível no estoque
        if(quantidadeProdutos < produtos.length)
        {
            // Adiciona o produto ao array 'produtos' e incrementa a quantidade de produtos
            produtos[quantidadeProdutos] = produto;
            quantidadeProdutos++;
        }
        else
        {
            // Exibe uma mensagem se o estoque estiver cheio
            System.out.println("Estoque cheio, não é possível adicionar mais produtos.");
        }
    }

    // Método para obter um produto do estoque com base no índice
    public PrecoProdutos getProduto(int indice)
    {
        // Verifica se o índice é válido
        if(indice >= 0 && indice < quantidadeProdutos)
        {
            // Retorna o produto no índice especificado
            return produtos[indice];
        }
        // Retorna null se o índice for inválido
        return null;
    }

    // Método para obter a quantidade total de produtos no estoque
    public int getQuantidadeProdutos()
    {
        // Retorna a quantidade atual de produtos no estoque
        return quantidadeProdutos;
    }
}
