public class Calculation {
	private double velocity = 0 , angle = 0;
	private double resultR = 0, resultT1 = 0, resultT2 = 0, resultH = 0;
	public Calculation (){
		velocity = 0;
		angle = 0;
		resultR = 0;
		resultT1 = 0;
		resultT2 = 0;
		resultH = 0;
	}
	
	public void setVelocity (double V){
		velocity = V;
	}
	
	public void setAngle (double A){
		angle = A;
	}
	
	public double range (){
		resultR = (velocity*velocity*Math.sin(2*angle*Math.PI/180))/9.8;
		return resultR;
	}
	
	public double totalTime (){
		resultT1 = (2*velocity*Math.sin(angle*Math.PI/180))/9.8;
		return resultT1;
	}
	
	public double maxHeightTime (){
		resultT2 = (velocity*Math.sin(angle*Math.PI/180))/9.8;
		return resultT2;
	}
	
	public double maxHeight (){
		resultH = ((velocity*Math.sin(angle*Math.PI/180))*(velocity*Math.sin(angle*Math.PI/180)))/(2*9.8);
		return resultH;
	}

}

