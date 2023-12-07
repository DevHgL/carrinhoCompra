public class EstoqueProdutos
{
    private PrecoProdutos[] produtos;
    private int quantidadeProdutos;

    public EstoqueProdutos()
    {
        produtos = new PrecoProdutos[100];
        quantidadeProdutos = 0;
    }

    public void adicionaProduto(PrecoProdutos produto)
    {
        if(quantidadeProdutos < produtos.length)
        {
            produtos[quantidadeProdutos] = produto;
            quantidadeProdutos++;
        }
        else
        {
            System.out.println("Estoque cheio, não é possível adicionar mais produtos.");
        }
    }

    public PrecoProdutos getProduto(int indice)
    {
        if(indice >= 0 && indice < quantidadeProdutos)
        {
            return produtos[indice];
        }
        return null;
    }

    public int getQuantidadeProdutos()
    {
        return quantidadeProdutos;
    }
}