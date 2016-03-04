
public class Main {

	
	 static public void main(String [] args) throws InterruptedException {
		 
		 Espace terre = new Espace();
		 
		 Balle b = new Balle(15.0f, 45.0f, 0.0f,0.0f, 2.0f);
		 StdDraw.setXscale(0.0,terre.getTailleX());
		 StdDraw.setYscale(0.0,terre.getTailleY());
		 
		 while(true) {
			 
			 StdDraw.clear();
			 StdDraw.setPenColor(StdDraw.BLUE);
			 StdDraw.filledCircle(b.getPosX(), b.getPosY(), b.getRayon());
			 
			 b.majPosition(terre);
			 
			 StdDraw.show(30);
			 
		 }
	 }
}
