public class CarrinhoCompra
{
    private PrecoProdutos[] carrinho;
    private int quantidadeItens;
    private EstoqueProdutos estoque;

    public CarrinhoCompra(EstoqueProdutos estoque)
    {
        carrinho = new PrecoProdutos[100];
        quantidadeItens = 0;
        this.estoque = estoque;
    }

    public void adicionaItem(String nomeProduto, int quantidade)
    {
        PrecoProdutos produto = encontraProdutoNoEstoque(nomeProduto);
        if(produto != null)
        {
            if(quantidade <= produto.getQuantidade())
            {
                for(int i = 0; i < quantidade; i++)
                {
                    carrinho[quantidadeItens] = produto;
                    quantidadeItens++;
                }
                System.out.println(quantidade + " " + nomeProduto + "(s) adicionado(s) ao carrinho.");
            }
            else
            {
                System.out.println("Quantidade insuficiente de " + nomeProduto + " no estoque.");
            }
        }
        else
        {
            System.out.println(nomeProduto + " não encontrado no estoque.");
        }
    }

    private PrecoProdutos encontraProdutoNoEstoque(String nomeProduto)
    {
        for(int i = 0; i < estoque.getQuantidadeProdutos(); i++)
        {
            if(estoque.getProduto(i).getNome().equalsIgnoreCase(nomeProduto))
            {
                return estoque.getProduto(i);
            }
        }
        return null;
    }

    public void finalizaCompra()
    {
        for(int i = 0; i < quantidadeItens; i++)
        {
            PrecoProdutos item = carrinho[i];
            item.setQuantidade(item.getQuantidade() - 1);
        }
        carrinho = new PrecoProdutos[100];
        quantidadeItens = 0;
    }

    public float calculaTotal()
    {
        float total = 0;
        PrecoProdutos item;
        for(int i = 0; i < quantidadeItens; i++)
        {
            item = carrinho[i];
            total += item.getValor();
        }
        return total;
    }
}