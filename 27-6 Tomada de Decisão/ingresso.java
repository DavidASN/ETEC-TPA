import java.util.Scanner;
public class ingresso {
	public static void main(String[] args) {
		Scanner ler = new Scanner(System.in);
		double iT, estud;
		String resp;
		System.out.print("Digite o preço do ingresso");
		iT = ler.nextDouble();
		System.out.print("Você é estudante?");
		resp = ler.next();
		if (resp.equalsIgnoreCase("Não")) {
			System.out.print("Este é o preço do ingresso"+iT);
		}else if (resp.equalsIgnoreCase("Sim")) {
		estud = (iT*50)/100;
		System.out.print("Este é o preço do ingresso"+estud);
		}
		}
	}
