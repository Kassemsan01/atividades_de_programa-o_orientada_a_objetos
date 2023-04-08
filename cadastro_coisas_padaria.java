public class cadastro_coisas_padaria {
private String forno;
private String farinha;
private double preco;
private static String pao;

public void setForno(String forno){
    this.forno = forno;
}

public void setFarinha(String farinha){
    this.farinha = farinha;
}

public void setPreco(double preco){
    this.preco = preco;
}

static{
    pao = "pão de queijo";
}

public String getForno(){
    return forno;
}

public String getFarinha(){
    return farinha;
}

public double getpreco(){
    return preco;
}

public void mostrarpao(){
    System.out.println("Pão:" + pao);
}

}