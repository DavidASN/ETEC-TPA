package matriz;

import java.util.Random;

public class Matriz4 {
    public static void main(String[] args) {
        Random ran = new Random();

        int d[][] = new int[4][4];

    
        for (int i = 0; i < 4; i++) {
            for (int j = 0; j < 4; j++) {
                d[i][j] = ran.nextInt(75) + 1;
            }
        }

        for (int i = 0; i < 4; i++) {
            System.out.println();
            for (int j = 0; j < 4; j++) {
                System.out.print("[ " + d[i][j] + "] ");
            }
        }

        int pontos = 0;
        for (int k = 0; k < 16; k++) {
            int numeroSorteado = ran.nextInt(75) + 1;
            System.out.println("\nNúmero sorteado: " + numeroSorteado);

            for (int i = 0; i < 4; i++) {
                for (int j = 0; j < 4; j++) {
                    if (numeroSorteado == d[i][j]) {
                        pontos++;
                        break;
                    }
                }
            }
        }


        if (pontos == 16) {
            System.out.println("BINGO!!!");
        } else {
            System.out.println("Perdeu");
        }
    }
}


