public class cadastro_coisas_padaria {
private String forno;
private String farinha;
private double preco;
private static String pao;

cadastro_coisas_padaria(String forno, String farinha, double preco){
    this.forno = forno;
    this.farinha = farinha;
    this.preco = preco;
}

static{
    pao = "pão de queijo";
}

public void mostrarpadaria(){
    System.out.println("\n" + "Forno:" + "\t" + forno + "\n" +
    "Farinha:" + "\t" + farinha + "\n" + "Preço:" + "\t" + preco + "\n" +
    "Pão:" + "\t" + pao);
}

}