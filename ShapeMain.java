package Shape;

public class ShapeMain
{
	public static void main(String[] args)
	{
		Square square = new Square(2);
		System.out.println(square);
		System.out.println(square.getArea());
		System.out.println(square.getPerimeter());
	}
}
