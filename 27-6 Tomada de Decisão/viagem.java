package atividadeTpa;
import java.util.Scanner;
public class viagem {
	public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int despacho, assento, vol;
        double preco, total;
        String respBagagem, respAssento;

        despacho = 0;
        assento = 0;

        System.out.print("Digite o preço: ");
        preco = input.nextDouble();

        System.out.print("Deseja despachar bagagem? (sim/não): ");
        respBagagem = input.next();

        if (respBagagem.equals("sim")) {
            System.out.print("Digite o volume da bagagem: ");
            vol = input.nextInt();
            despacho = vol * 90;
        }

        System.out.print("Deseja escolher assento? (sim/não): ");
        respAssento = input.next();

        if (respAssento.equals("sim")) {
            assento = 60;
        }

        total = preco + despacho + assento;
        System.out.println("Total: " + total);

        input.close();
    }
}
