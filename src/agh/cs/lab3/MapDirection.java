package agh.cs.lab3;

public enum MapDirection {
	North,
	East,
	South,
	West;
	
	public String toString(){
	    switch(this) {
	      case North: return "P�noc";
	      case South: return "Po�udnie";
	      case East: return "Wsch�d";
	      case West: return "Zach�d";
	      default:
	    	  return "Kierunek Nieznany";
	    }
	}
	
	public MapDirection next() {
		return MapDirection.values()[(this.ordinal()+1)%4];
	    
	}
	
	public MapDirection previous() {
		switch(this) {
	      case North: return West;
	      case South: return East;
	      case East: return North;
	      case West: return South;
	      	default:
	      		return null;
	    }
	}
}
