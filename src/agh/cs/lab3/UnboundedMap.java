package agh.cs.lab3;

import java.util.ArrayList;

public class UnboundedMap implements IWorldMap {

	private ArrayList<HayStack> stacks = new ArrayList<>();
	private ArrayList<Car> cars = new ArrayList<>();
	
	public UnboundedMap(ArrayList<HayStack> stacks1){
		this.stacks.addAll(stacks1);
	}
	
	@Override
	public boolean canMoveTo(Position position) {
		if(this.isOccupied(position))
			return false;
		
		return true;
	}

	@Override
	public boolean add(Car car) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public void run(MoveDirection[] directions) {
		// TODO Auto-generated method stub

	}

	@Override
	public boolean isOccupied(Position position) {
		for(Car car : this.cars)
			if(car.getPosition().equals(position))
				return true;
		for(HayStack stack : this.stacks)
			if(stack.getPosition().equals(position))
				return true;
		return false;
	}

	@Override
	public Object objectAt(Position position) {
		// TODO Auto-generated method stub
		return null;
	}

	public String toString() {
		int n = this.cars.get(0).getPosition().y,
			e = this.cars.get(0).getPosition().x,
			s = this.cars.get(0).getPosition().y,
			w = this.cars.get(0).getPosition().x;
		
		for(Car car : this.cars) {
			if(car.getPosition().x > e)
				e = car.getPosition().x;
			if(car.getPosition().x < w)
				w = car.getPosition().x;
			if(car.getPosition().y > n)
				n = car.getPosition().y;
			if(car.getPosition().y < s)
				s = car.getPosition().y;
		}
		
		for(HayStack stack : this.stacks) {
			if(stack.getPosition().x > e)
				e = stack.getPosition().x;
			if(stack.getPosition().x < w)
				w = stack.getPosition().x;
			if(stack.getPosition().y > n)
				n = stack.getPosition().y;
			if(stack.getPosition().y < s)
				s = stack.getPosition().y;
		}	
			
		return new MapVisualizer().dump(this,new Position(w,s),new Position(e,n));
	}

}
