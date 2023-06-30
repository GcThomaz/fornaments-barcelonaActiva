public class Circle {

    //ATRIBUTTES
    private Point center;
    private int radius;

    //CONSTRUCTOR    
    public Circle(Point center, int radius) {
        this.center = center;
        this.radius = radius;
    }

    //GETTERS AND SETTERS
    public Point getCenter() {
        return center;
    }

    public void setCenter(Point center) {
        this.center = center;
    }

    public int getRadius() {
        return radius;
    }

    public void setRadius(int radius) {
        this.radius = radius;
    }
	
	public double distanceCenter(Circle circle) {
		double distanceX = Math.abs(this.center.getPositionX() - circle.center.getPositionX());
		double distanceY = Math.abs(this.center.getPositionY() - circle.center.getPositionY());
		double distance = Math.sqrt(Math.pow(distanceX, 2) + Math.pow(distanceY, 2));
		return distance;
	}
	
	public String equals(Circle circle) {
		if (this.center.getPositionX() == circle.center.getPositionX() 
				&& this.center.getPositionY() == circle.center.getPositionY() && this.radius == circle.getRadius()) {
			return "Are equals!!!";
		} else {
			return "Aren' equals!!!";
		}		
	}
	
	public String cocentricos(Circle circulo) {
		if (this.center.getPositionX() == circulo.center.getPositionX() 
				&& this.center.getPositionY() == circulo.center.getPositionY()) {
			return "They are cocentric!!!";
		} else {
			return "They aren't cocentric!!!";
		}
	}
	
	public String equalRadius(Circle circle) {
		if (this.radius == circle.getRadius()) {
			return "The radio is the same!!!";
		} else {
			return "the radio isn't the same";
		}
	}
	
	public String tangents(Circle circulo) {
		if (distanceCenter(circulo) == this.radius + circulo.getRadius()) {
			return "They are tangents!!!";
		} else {
			return "They aren't tangents!!!";
		}
	}
	
	public String secant(Circle circle) {
		if (distanceCenter(circle) < this.radius + circle.getRadius()) {
			return "They are secant";
		} else {
			return "They aren't secant";
		}
	}
	
	public String dontTouch(Circle circle) {
		if (distanceCenter(circle) > this.radius + circle.getRadius()){
			return "The circles touch each other!!!";
		} else {
			return "The circles doesn't touch each other!!!";
		}
	}
	}
