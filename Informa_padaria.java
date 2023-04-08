public class Informa_padaria {
    public static void main(String[] args) {
        cadastro_coisas_padaria a = new cadastro_coisas_padaria();

        a.setForno("Brastemp");
        a.setFarinha("Dona Benta");
        a.setPreco(20.00);
        
        System.out.println("Forno: " + a.getForno());
        System.out.println("Farinha: " + a.getFarinha());
        System.out.println("preço: " + a.getpreco());
        a.mostrarpao();

    }
    
}
