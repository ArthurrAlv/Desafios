import java.util.Scanner;
import java.time.LocalDate;
class Main { 
  public static void main(String args[]) { 
	int dia, mes, ano, id, mesnow, dianow;
	String nome;
	  System.out.println("Olá qual o seu nome:");
    Scanner ler = new Scanner(System.in);
	    nome = ler.nextLine();
    System.out.println(nome+", agora digite a sua data de nascimento:");

    System.out.printf("\n");
    
    System.out.printf("Dia: ");
      dia = ler.nextInt();
    
    System.out.printf("\
    
    System.out.printf("Mês: ");
      mes = ler.nextInt();
    
    System.out.printf("\n");
    
    System.out.printf("Ano: ");
      ano = ler.nextInt();
    
    System.out.printf("\n");
    
    LocalDate localDate = LocalDate.now();
    id = localDate.getYear();
    mesnow =  localDate.getMonthValue();
    dianow =  localDate.getDayOfWeek().ordinal();
    id= id - ano;
  if(mesnow<mes && dianow<dia)
    id--;
    else{
      
    }
    System.out.println("Você tem "+id+" anos.");
	

}
}	
