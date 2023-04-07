import javax.swing.JOptionPane;
public class livraria {
private String editora;
private String autor;
private String livro;
private int quantidade;
private double preco;
String a, b, c, d, e, i;
int f, g;
double h;
public void setEditora(String editora) {
this.editora = editora;
}
public void setAutor(String autor) {
this.autor = autor; 
}
public void setLivro(String livro) {
this.livro = livro;
}
public void setQuantidade(int quantidade) {
this.quantidade = quantidade;
}
public void setPreco(double preco) {
this.preco = preco;
}
public String getEditora() {
return editora;
}
public String getAutor() {
return autor;
}
public String getLivro() {
return livro;
}

public int getQuantidade() {
return quantidade;
}
public double getpreco() {
return preco;
}
public void Informa_Livros(int codigo) {
switch(codigo) {
case 1: JOptionPane.showMessageDialog(null,"Categoria Romance\n" + "Livro: " + livro + "\nEditora " + editora + "\nAutor:" + autor + "\nQuantidade:" + quantidade + "\nPreÃ§o R$:" + preco ,"", JOptionPane.PLAIN_MESSAGE); break;
case 2:JOptionPane.showMessageDialog(null,"Categoria Espirita\n" + "Livro: " + livro + "\nEditora " + editora + "\nAutor:" + autor + "\nQuantidade:" + quantidade + "\nPreÃ§o R$:" + preco ,"", JOptionPane.PLAIN_MESSAGE); break;
case 3: JOptionPane.showMessageDialog(null,"Categoria Informatica\n" + "Livro: " + livro + "\nEditora " + editora + "\nAutor:" + autor + "\nQuantidade:" + quantidade + "\nPreÃ§o R$:" + preco ,"", JOptionPane.PLAIN_MESSAGE); break;
default: System.out.println("Codigo nao corresponde a nenhuma categoria de livro");
}
}
}
