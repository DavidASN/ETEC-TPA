package javaProject;
import java.util.*;
public class circulação {
public static void main(String[] args) {
Scanner ler=new Scanner(System.in);
int nP;
System.out.println("Por favor digite o último número da placa do seu carro");
nP= ler.nextInt();
while(nP<1 || nP>9){
System.out.println("Numeros menores que 10 e maiores q zero por favor");
System.out.println("Por favor digite o último número da placa do seu carro");
nP= ler.nextInt();
}
switch(nP) {
case 1:
case 2:
System.out.println("Não circula na segunda");
break;
case 3:
case 4:
System.out.println("Não circula na terça");
break;
case 5:
case 6:
System.out.println("Não circula na quarta");
break;
case 7:
case 8:
System.out.println("Não circula na quinta");
break;
case 9:
case 0:
System.out.println("Não circula na sexta");
 
}
}
}
