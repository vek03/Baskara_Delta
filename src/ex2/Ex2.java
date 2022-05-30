package ex2;

//importa todas as classes contidas em swing e awt
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

/**
 *
 * @author Victor Cardoso
 * Vek Histories
 */

//sua classe herda da classe JFrame que contém todas as funções de interface
public class Ex2 extends JFrame
{
    //declarando objetos de rotulo
    JLabel rotulo1,rotulo2, rotulo3, exibir, exibir2, titulo1, titulo2;
    //declarando objetos de caixa de texto
    JTextField texto1,texto2, texto3;
    //declarando objeto botão de finalizar programa
    JButton calcular, limpar;
    
    //método construtor contendo todos os atributos da janela de interface
    public Ex2()
    {
        //função que chama a super classe do JFrame
        super("Fórmula de Baskara");
        
        //Container é uma classe que contem todos os obejtos
        Container tela = getContentPane();
        
        //declara o layout como nulo para poder modificá-lo
        setLayout(null);
        
        //instancia de objetos com os valores predefinidos
        rotulo1 = new JLabel("Valor de a: ");
        rotulo2 = new JLabel("Valor de b: ");
        rotulo3 = new JLabel("Valor de c: ");
        exibir = new JLabel("");
        exibir2 = new JLabel("");
        titulo1 = new JLabel("Fórmula de Bhaskara");
        titulo2 = new JLabel("ax² + bx + c = 0");
        
        //instancia de objetos de caixa de texto com tamanho predefinido
        texto1 = new JTextField(15);
        texto2 = new JTextField(15);
        texto3 = new JTextField(15);
        
        //instancia do objeto botão para sair 
        calcular = new JButton("Calcular");
        limpar = new JButton("Limpar");
        
        //lugar da janela onde será impresso: margem direita, altura(de cima para baixo), tamanho em caracteres, grossura.  
        //legenda local
        titulo1.setBounds(55,20,200,20);
        titulo2.setBounds(90,35,100,20);
        rotulo1.setBounds(20,60,80,20);
        rotulo2.setBounds(20,90,80,20);
        rotulo3.setBounds(20,120,80,20);
        
        //resultado local
        exibir.setBounds(20,150,500,20);
        exibir2.setBounds(20,170,500,20);
        
        //caixa de texto local
        texto1.setBounds(86,60,70,20);
        texto2.setBounds(86,90,70,20);
        texto3.setBounds(86,120,70,20);
       
        //botões local
        calcular.setBounds(20,210,100,20);
        limpar.setBounds(150,210,100,20);
        
        titulo1.setFont(new Font("Arial", Font.BOLD, 17));
        titulo2.setFont(new Font("Arial", Font.ROMAN_BASELINE, 14));
        
        //método para limpar caixas de texto
        limpar.addActionListener
        (
            new ActionListener()
            {
                public void actionPerformed(ActionEvent e)
                {
                    exibir.setVisible(false);
                    exibir2.setVisible(false);
                    texto1.setText(null);
                    texto2.setText(null);
                    texto3.setText(null);
                    texto1.requestFocus();//passa o foco para está caixa de texto
                }
            }
        );
        
        //método para calculkar a baskara
        calcular.addActionListener
        (
            new ActionListener()
            {
                public void actionPerformed(ActionEvent e)
                {
                    double a, b, c, d, x1, x2;
                    a = Double.parseDouble(texto1.getText());
                    b = Double.parseDouble(texto2.getText());
                    c = Double.parseDouble(texto3.getText());
                    d = Math.pow(b, 2) - 4 * a * c;
                    x1 = (-b + (Math.sqrt(d))) / 2 * a;
                    x2 = (-b - (Math.sqrt(d))) / 2 * a;;
                    exibir.setVisible(true);
                    exibir2.setVisible(true);
                    exibir.setText("x1: " + x1);
                    exibir2.setText("x2: " + x2);
                    
                }
            }
        );
          
        
        //visibilidade do resultado apenas quando calculo for efetuado
        exibir.setVisible(false);
        exibir2.setVisible(false);
        
        //exibição de tudo
        tela.add(rotulo1);
        tela.add(rotulo2);
        tela.add(rotulo3);
        tela.add(exibir);
        tela.add(exibir2);
        tela.add(titulo1);
        tela.add(titulo2);
        
        tela.add(texto1);
        tela.add(texto2);
        tela.add(texto3);
        
        tela.add(calcular);
        tela.add(limpar);
        
        //declarando o tamanho em que a janela deve abrir
        setSize(300, 300);
        
        //visibilidade da janela
        setVisible(true);
        
        //define o local do monitor em que será aberta a janela
        setLocationRelativeTo(null);
    }
    
    //método main
    public static void main(String[] args) 
    {
        //intância de objeto(classe com os atributos)
        Ex2 app = new Ex2();
        //chamando a janela
        app.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }
    
}
