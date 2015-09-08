import static org.junit.Assert.*;

import org.junit.Test;

public class Point2DTest {
  @Test
  
  public void testAdd()
  {
	  Point2D p1 = new Point2D();
	  Point2D p2 = p1.add(3, 5);
	  assertEquals("p2.x = 3", 3, p2.x);
	  assertEquals("p2.y = 5", 5, p2.y);
  }
  
  public void testTranslate() {
	  Point2D p1 = new Point2D();
	  Point2D p2 = new Point2D(5, 5);
	  p1.translate(p2);
	  assertEquals("p1.x = 5", 5, p1.x);
	  assertEquals("p1.y = 5", 5, p1.y);
  }
  
  public void testDistance() {
	  
	  Point2D p1 = new Point2D();
	  double dist = p1.distance(5, 0);
	  assertEquals("dist = 5", 5.0, dist, .1);
  }
  
  public void testToString() {
	  Point2D p1 = new Point2D(8, 3);
	  String point1 = p1.toString();
	  assertEquals("String = (8, 3)", "(8, 3)", point1);
  }
}