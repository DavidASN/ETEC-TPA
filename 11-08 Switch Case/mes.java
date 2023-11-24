package javaProject;
import java.util.*;
public class mes {
public static void main(String[] args) {
Scanner ler = new Scanner(System.in);
 
System.out.println("Digite o Valor do mês, Janeiro(1) desembro(12)");
int mes = ler.nextInt();
while(mes < 0 || mes > 12) {
System.out.println("Apenas meses dentro de 1 e 12, tente de novo");
System.out.println("Digite o Valor do mês, Janeiro(1) Dezembro(12)");
mes = ler.nextInt();
}
switch(mes) {
case 1:
case 3:
case 5:
case 7:
case 8:
case 12:
System.out.println("O mes "+mes+" tem 31 dias");
break;
case 4:
case 6:
case 9:
case 11:
System.out.println("O mes "+mes+" tem 30 dias");
break;
case 2:
System.out.println("Em que ano estamos?");
int ano = ler.nextInt();
if(ano%4 == 0) {
System.out.println("O mes "+mes+" tem 29 dias");
}else {
System.out.println("O mes "+mes+" tem 28 dias");
}
 
 
}
}
 
}
