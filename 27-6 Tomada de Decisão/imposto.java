package git;
 import java.util.Scanner;
 public class imposto {
public static void main(String[] args) {
Scanner ler = new Scanner(System.in);
double sal, imposto;
System.out.print("Informe o seu salário: ");
sal=ler.nextDouble();
if (sal<=1903.98){
imposto = 0;
System.out.print("Seu imposto de renda é 0");

}else if (sal<=2826.65){
imposto = (sal*7.5)/100 -142.80;

System.out.print ("Seu imposto de renda é"+imposto);

}else if (sal<=3751.05) { imposto=(sal*15)/100 -354.80;

System.out.print("Seu imposto de renda é"+imposto);
}else if (sal<=4664.68) {
	imposto=(sal*22.5)/100-636.13;
System.out.print("Seu imposto de renda é"+imposto);

}else if (sal>4664.68) {
imposto=(sal*27.5)/100-869.36;

System.out.print("Seu imposto de renda é"+imposto);


}
}
}
