package generics.wildcards;

import java.util.ArrayList;
import java.util.List;

public class GenericTest {
	public static void drawShapes(List<? extends Shape> shapesList){ //? can be rectangle or circle  
		for(Shape shape : shapesList) {
			shape.drawShape();
		}
	}
	public static void main(String[] args) {
		List<Rectangle> rectaList = new ArrayList<>();
		rectaList.add(new Rectangle());

		List<Circle> cirList = new ArrayList<>();
		cirList.add(new Circle());
		cirList.add(new Circle());

		drawShapes(rectaList);
		drawShapes(cirList);
	}

	

}
