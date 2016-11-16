package agh.cs.lab3;

import java.util.ArrayList;

public class RectangularMap implements IWorldMap {
	
	private int width;
	private int height;
	ArrayList<Car> cars = new ArrayList<>();
	
	public RectangularMap(int width, int height){
		this.width = width;
		this.height = height;
	}
	
	@Override
	public boolean canMoveTo(Position position) {
		if(position.x > this.width)
			return false;
		
		if(position.y > this.height)
			return false;
		
		if(this.isOccupied(position))
			return false;
		
		return true;
	}

	@Override
	public boolean add(Car car) {
		if(this.isOccupied(car.getPosition()))
		return false;
		cars.add(car);
		return true;
	}

	@Override
	public void run(MoveDirection[] directions) {
		

	}

	@Override
	public boolean isOccupied(Position position) {
		for(Car car : this.cars)
			if(car.getPosition().equals(position))
				return true;
		return false;
	}

	@Override
	public Object objectAt(Position position) {
		// TODO Auto-generated method stub
		return null;
	}
	public String toString() {
		return new MapVisualizer().dump(this,new Position(0,0),new Position(width, height));
	}

}
