
public class Boxeador extends Thread {
String nombre;
Pelea pelea;
int[] knockout= {0,0};
int boxeador;
int golpes;
public Boxeador(String nombre,Pelea pelea,int boxeador){
	this.nombre = nombre;
	this.pelea = pelea;
	this.boxeador = boxeador;
}
public String getNombre() {
	return nombre;
}
public void pegar(){
	golpes++;
}
public int getGolpes(){
	return golpes;
		}
public int getJugador(){
	return knockout[0];
		}
public void run(){
while (pelea.getGolpes()<100){

	pelea.pegar(this);
	/* Solucion que no funciono
	if (knockout[boxeador]>4 && boxeador== 0) {
		knockout[boxeador+1]=0;
		knockout[boxeador]++;
	}
	else if (knockout[boxeador]>=4 && boxeador== 0) {
		break;
	}
	
	if (knockout[boxeador]>=4 && boxeador == 1) {
		knockout[boxeador-1]=0;
		knockout[boxeador]++;
	}
	else if (knockout[boxeador]<4 && boxeador == 1) {
		break;
		
	}
	*/
	
}
}

}
