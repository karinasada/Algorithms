public class Pelea extends Thread{
static int golpes;

public Pelea(){
	golpes = 0;
}
	public int getGolpes(){
	return golpes;
		}

public synchronized void pegar(Boxeador boxeador){
	boxeador.pegar();
	golpes++;
	System.out.println("Pegada de: " + boxeador.getNombre()+ " golpes " + getGolpes());
		
		}
	//return golpes;
}

