package model;

public class CadastrarProduto {
    private String nome, estacionamento;
    private int codigoDoProdutos, quantidade, formaDePagamento, setor;
    private double valorUnitario;


    public CadastrarProduto(){}

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getEstacionamento() {
        return estacionamento;
    }

    public void setEstacionamento(String estacionamento) {
        this.estacionamento = estacionamento;
    }

    public int getSetor() {
        return setor;
    }

    public void setSetor(int setor) {
        this.setor = setor;
    }

    public int getCodigoDoProdutos() {
        return codigoDoProdutos;
    }

    public void setCodigoDoProdutos(int codigoDoProdutos) {
        this.codigoDoProdutos = codigoDoProdutos;
    }

    public int getQuantidade() {
        return quantidade;
    }

    public void setQuantidade(int quantidade) {
        this.quantidade = quantidade;
    }

    public int getFormaDePagamento() {
        return formaDePagamento;
    }

    public void setFormaDePagamento(int formaDePagamento) {
        this.formaDePagamento = formaDePagamento;
    }

    public double getValorUnitario() {
        return valorUnitario;
    }

    public void setValorUnitario(double valorUnitario) {
        this.valorUnitario = valorUnitario;
    }

    public double calcularProduto(){
        return this.valorUnitario * this.quantidade;
    }

    public double calcuarTotalDaCompra(){

        double subTotal = 0;
        double juros = 0;
        double desconto = 0;
        if (this.formaDePagamento == 1) { // cartão 3% + acréscimo
            juros = (this.calcularProduto() * 0.03); // 10,00
            if (this.estacionamento.equalsIgnoreCase("Sim")) {
                subTotal = juros + 6.00; //16,00
                return calcularProduto() + subTotal;
            } else {
                return calcularProduto() + juros;
            }
        } else { // dinheiro  10% - desconto
    }

    public String SelecionarSetor(){
        String escolha;
        switch (this.setor){
            case 1:
                escolha="Padaria";
                break;
            case 2:
                escolha="Açougue";
                break;
            case 3:
                escolha="Mercearia";
                break;
            case 4:
                escolha="Bebidas";
                break;
            case 5:
                escolha="Laticinios";
                break;
            case 6:
                escolha="HortFrutti";
                break;
            default:
                escolha = "Limpeza";
                break;
        }return escolha;
        
    @Override
    public String toString() {
        return "------------ Nota Fiscal ---------------" +
                "\nCódigo: "+this.codigoDoProdutos +
                "\nProduto: " +this.nome+
                "\nQuantidade: " + this.quantidade +
                "\nValorUnitario: " +this.valorUnitario +
                "\nForma de Pagamento: " + formaDePagamento +
                "\nSetor: " + this.setor +
                "\nEstacionamento: " + estacionamento +
                "\n-------------------------------------";
    }
}
