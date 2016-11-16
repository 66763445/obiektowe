package agh.cs.lab3;

public class Car {
	private MapDirection carMapDirection;
	private Position carMapPosition;
	private IWorldMap map;
	
	public Car(IWorldMap map) {
		this.carMapDirection = MapDirection.North;
		this.carMapPosition = new Position(2,2);
	}
	
	public Car() {
		this.carMapDirection = MapDirection.North;
		this.carMapPosition = new Position(2,2);		
	}
	
	public Car(IWorldMap map, int x, int y) {
		this.carMapDirection = MapDirection.North;
		this.carMapPosition = new Position(x,y);
	}
	
	Position getPosition() {
		return this.carMapPosition;
	}
	
	public String toString() {
		switch(this.carMapDirection) {
		case North:
			return "N";
		case South:
			return "S";
		case East:
			return "E";
		case West:
			return "W";
		default:
			return "ERROR!";
		}
		
	}
	
	public void move(MoveDirection direction) {
		switch(direction) {
		case Right:
			this.carMapDirection = this.carMapDirection.next();
		case Left:
			this.carMapDirection = this.carMapDirection.previous();
		case Backward:
			switch(this.carMapDirection){
			case North:
				Position next = this.carMapPosition.add(new Position(0,-1));
				if(this.map.canMoveTo(next))
				this.carMapPosition = next;
			case South:
				next = this.carMapPosition.add(new Position(0,1));
				if(this.map.canMoveTo(next))
				this.carMapPosition = next;
			case East:
				next = this.carMapPosition.add(new Position(-1,0));
				if(this.map.canMoveTo(next));
				this.carMapPosition = next;
			case West:
				next = this.carMapPosition.add(new Position(1,0));
				if(this.map.canMoveTo(next))
				this.carMapPosition = next;
			}
			
		case Forward:
			switch(this.carMapDirection){
			case North:
				if(this.carMapPosition.y != 4)
				this.carMapPosition = this.carMapPosition.add(new Position(0,1));
			case South:
				if(this.carMapPosition.y != 0)
				this.carMapPosition = this.carMapPosition.add(new Position(0,-1));
			case East:
				this.carMapPosition = this.carMapPosition.add(new Position(1,0));
			case West:
				this.carMapPosition = this.carMapPosition.add(new Position(-1,0));
			}
			
		}
		if(direction == MoveDirection.Backward)
		return;
	}
	
}
