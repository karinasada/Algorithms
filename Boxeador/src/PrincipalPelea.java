
public class PrincipalPelea extends Thread {
	
	public static void main(String[] args){
	Pelea pelea = new Pelea();
	Boxeador box1 =new Boxeador("Mario",pelea,0);
	Boxeador box2 =new Boxeador("Luigi",pelea,1);
	box1.start();
	box2.start();
	try {
		box1.join();
		box1.join();
	} catch (InterruptedException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
	System.out.println("Fin del combate" );
	if(box1.getGolpes() > box2.getGolpes()){
		System.out.println("Ganó: " + box1.getNombre());
	}
	else if(box1.getGolpes() < box2.getGolpes()){
		System.out.println("Ganó: " + box2.getNombre());
	}
	else {
		System.out.println("Empate");
	}
	}
}
