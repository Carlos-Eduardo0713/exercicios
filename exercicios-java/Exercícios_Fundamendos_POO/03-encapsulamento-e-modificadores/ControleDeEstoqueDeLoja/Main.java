public class Main {
    public static void main(String[] args) {

        Produto produto1 = new Produto("Bicicleta", 900, 10);
        System.out.println("Dados iniciais do produto1:");
        System.out.println(produto1);

        produto1.aplicarDesconto(10);
        System.out.println("\nDados após aplicar 10% de desconto:");
        System.out.println(produto1);

        System.out.println("\nTestando getters:");
        System.out.println(produto1.getPreco());
        System.out.println(produto1.getNome());
        System.out.println(produto1.getQuantidadeEstoque());

        System.out.println("\nTestando setters válidos (diminução no preço e aumento de estoque):");
        produto1.setPreco(799);
        produto1.setQuantidadeEstoque(20);
        System.out.println(produto1);

        System.out.println("\nTestando setters inválidos (preço e estoque negativos):");
        produto1.setPreco(-500);
        produto1.setQuantidadeEstoque(-10);
        System.out.println("Dados não foram alterados:");
        System.out.println(produto1);

    }
}
