package switchcase;
import java.util.Scanner;
public class escola {
	public static void main(String[] args) {
		  Scanner in = new Scanner(System.in);
	        System.out.println("Qual é a idade do aluno ?");
	        int id = in.nextInt();
	        switch (id) {
	        case 6:
	        	System.out.println("Categoria: Dente de leite");
	        	break;
	        	
	        case 7:
	        	System.out.println("Categoria: Júnior");
	        	break;
	        	
	        case 8:
	        	System.out.println("Categoria: Júnior Max");
	        	break;
	        
	        case 9:
	        	System.out.println("Categoria: Júnior Master");
	        	break;  
	        	
	        case 10:
		      System.out.println("Categoria: Master");
		      break;
		      
	        default:
                System.out.println("ERRO: idade não permitida na escola, lamento.");
	        	
	        
	        }
	        
	       
	}
