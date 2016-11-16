package agh.cs.lab3;

public class CarSystem {
	
	public static void main(String[] args) {
		/*Position position1 = new Position(1,1);
		System.out.println(position1);
		Position position2 = new Position(3,2);
		System.out.println(position2);
		System.out.println(position1.add(position2));
		
		System.out.println();
		if(position1.smaller(position2))
			System.out.println(position1.toString()+" jest mniejszy niz "+position2.toString());
		if(position1.larger(position2))
			System.out.println(position1.toString()+" jest wiekszy niz "+position2.toString());
		
		MapDirection mapdirection1 = MapDirection.North;
		System.out.println(mapdirection1.toString());
		for(int i = 0; i < 3; i++){
		mapdirection1 = mapdirection1.next();
		System.out.println(mapdirection1.toString());
		}
		
		for(int i = 0; i < 3; i++){
			mapdirection1 = mapdirection1.previous();
			System.out.println(mapdirection1.toString());
			}
		Car car1 = new Car();
		System.out.println(car1.toString());*/
		MoveDirection[] directions = new OptionsParser().parse(args);
		IWorldMap map = new RectangularMap(10, 5);
		map.add(new Car(map));
		map.add(new Car(map,3,4));
		map.run(directions);
		
	}

}
