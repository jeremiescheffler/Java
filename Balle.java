
public class Balle {
	
	private float posX, posY, vX, vY, rayon;
	
	public Balle(float posX, float posY, float vX, float vY, float rayon) {
		this.posX = posX;
		this.posY = posY;
		this.vX = vX;
		this.vY = vY;
		this.rayon = rayon;
	}
	
	
	public void majPosition(Espace spc) {
		
		vX = (spc.getVent() * spc.getTemps()) + vX;
		vY = (spc.getGravite() * spc.getTemps()) + vY;
		
		posY = posY + (vY * spc.getTemps()); // => y = y + (vY * TEMPS_INC);
		posX = posX + (vX * spc.getTemps());
		// / bounce off wall according to law of elastic collision
		if ((posY - rayon) <= 0 || (posY + rayon) >= spc.getTailleY()) {
			
			if((posY - rayon) <=0)
				posY = rayon; 
			else
				posY = spc.getTailleY() - rayon;
			
			vY = -vY;
		}
		if ((posX - rayon) <= 0.0 || (posX + rayon) >= spc.getTailleX()) {
			if((posX - rayon) <= 0)
				posX = rayon;
			else
				posX = spc.getTailleX() - rayon;	
			vX = -vX;
		}
	}


	public double getPosX() {
		// TODO Auto-generated method stub
		return posX;
	}


	public double getRayon() {
		// TODO Auto-generated method stub
		return rayon;
	}


	public double getPosY() {
		// TODO Auto-generated method stub
		return posY;
	}

	
	
	
	
	
	
	
	
}
