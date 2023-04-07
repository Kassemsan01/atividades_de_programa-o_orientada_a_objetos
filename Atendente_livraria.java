import javax.swing.JOptionPane;
public class Atendente_livraria {
public static void main(String args[]) {
livraria cultura = new livraria();
String a, b, c, d, e, i;
int f, g;
double h;
JOptionPane.showMessageDialog(null, "Categoria: digite 1 para romance\n 2 para Espirita\n 3 para informatica");
a = JOptionPane.showInputDialog(null,"Codigo");
b = JOptionPane.showInputDialog(null, "Editora ");
c = JOptionPane.showInputDialog(null, "Autor ");
d = JOptionPane.showInputDialog(null, "Livro ");
e = JOptionPane.showInputDialog(null, "Quantidade ");
i = JOptionPane.showInputDialog(null, "Preço");
f = Integer.parseInt(a);
g = Integer.parseInt(e);
h = Double.parseDouble(i);
cultura.setEditora(b);
cultura.setAutor(c);
cultura.setLivro(d);
cultura.setQuantidade(g);
cultura.setPreco(h);
cultura.Informa_Livros(f);
}
}
