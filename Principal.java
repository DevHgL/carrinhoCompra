public class Principal
{
    public static void main(String[] args) 
    {
        EstoqueProdutos estoque = new EstoqueProdutos();
        estoque.adicionaProduto(new PrecoProdutos("monitor", 1_450, 20));
        estoque.adicionaProduto(new PrecoProdutos("telefone", 3_000, 300));
        estoque.adicionaProduto(new PrecoProdutos("teclado", 400, 50));
        estoque.adicionaProduto(new PrecoProdutos("mouse", 350, 50));
        
        CarrinhoCompra carrinho = new CarrinhoCompra(estoque);
        carrinho.adicionaItem("monitor", 2);
        carrinho.adicionaItem("telefone", 5);
        carrinho.adicionaItem("teclado", 2);             

        System.out.printf("A soma dos produtos: R$ %.2f%n", carrinho.calculaTotal());

        carrinho.finalizaCompra();

        System.out.printf("A soma dos produtos apos a compra: R$ %.2f%n", carrinho.calculaTotal());

        for (int i = 0; i < estoque.getQuantidadeProdutos();i++)
        {
            System.out.println("Quantidade atual de " + estoque.getProduto(i).getNome()+ " no estoque: " + estoque.getProduto(i).getQuantidade());
        }
    }
}