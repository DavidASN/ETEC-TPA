package laço;
public class Anosaltura {
public static void main(String[] args) {
double joaoAltura = 1.34, pedroAltura = 1.45;
int anos = 0;
while(joaoAltura<pedroAltura) {
joaoAltura += 0.025;
pedroAltura += 0.02;
anos +=1;
}
	System.out.println("João vai ficar mais alto que pedro em "+anos+" anos"); 
	System.out.println("João terá " +joaoAltura);
	System.out.println("Pedro terá "+pedroAltura);
}
}
