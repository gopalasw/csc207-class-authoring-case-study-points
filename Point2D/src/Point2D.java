
public class Point2D {

	
	public int x;
	public int y;
	
	public Point2D() {
		this.x = 0;
		this.y = 0;
	}
	
	public Point2D(int inputX, int inputY)
	{
		this.x = inputX;
		this.y = inputY;
	}
	
	public Point2D add(int dx, int dy)
	{
		Point2D sum = new Point2D(this.x + dx, this.y + dy);
		return sum;
	}
	
	public void translate(Point2D point)
	{
		this.x += point.x;
		this.y += point.y;
	}
	
	public double distance(int x, int y)
	{
		double distance = Math.sqrt(Math.pow((this.x - x), 2) +
									Math.pow((this.y - y), 2));
		
		return distance;
	}
	
	public String toString()
	{
		return "(" + this.x + ", " + this.y + ")"; 
	}
	

}
