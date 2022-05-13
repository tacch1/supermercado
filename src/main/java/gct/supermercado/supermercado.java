
package gct.supermercado;
import java.util.Scanner;

public class supermercado {
    public static void main(String[] args){
    
    Scanner input = new Scanner(System.in);
    
    produto p = new produto();
    pessoa pe = new pessoa();
    cliente c = new cliente();
    funcionario f = new funcionario();
    String variavel;
    
    int cont = 0, cmd = 0, i = 0, add, moa,num;
    
while(cmd != 10){
    
   System.out.println("Qual a operação deseja realizar?");
   System.out.println("1.Adicionar produtos novos");
   System.out.println("2.Modificar quantidades ou precos de produtos existentes");
   System.out.println("3.Adicionar funcionario");
   System.out.println("4.Modificar preço");
   System.out.println("5.Modificar salários");
   System.out.println("6.Demitir funcionario");
   cmd = input.nextInt();
   p.cmd = cmd;

   
    if(cmd == 1){
        System.out.println("Quantos produtos quer adicionar?");
        add = input.nextInt();
        add = add +cont;
            while (cont != add){
            System.out.println("Nome do produto" +i+ "?");
            input.nextLine();
            p.nomeproduto[i] = input.nextLine();
            System.out.println("Quanto custa" +i+ "?");
            p.preco[i] = input.nextFloat();
            System.out.println("Qual a quantidade?" +i+"?");
            p.quantidade[i] = input.nextInt();
            
            p.getProduto();
            
            cont++;
            i++;
            }
    }
    if(cmd == 2){
        System.out.println("Deseja fazer o que?");
        System.out.println("1. Modificar quantidade");
        System.out.println("2. Modificar preço");
        
        moa = input.nextInt();
        if(moa == 1){
            System.out.println("Deseja modificar qual produto? Digite o numero cadastrado");
            num = input.nextInt();
            System.out.println("O produto que deseja alterar é este?");
        }
        
    }

  }
}
}