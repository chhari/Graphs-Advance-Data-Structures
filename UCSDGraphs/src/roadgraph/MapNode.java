package roadgraph;

import java.util.ArrayList;

import geography.GeographicPoint;

public class MapNode {

	GeographicPoint location;
	ArrayList<MapEdge> edges;
	public MapNode(GeographicPoint location) {
		this.location = location;
		edges = new ArrayList<>();
		
	}
	
	public GeographicPoint getLocation(){
		
		return location;
	}
	public boolean isSameLocation(GeographicPoint pointIn) {
		if (!pointIn.equals(null)) {
		return(location.x == pointIn.x &&
		location.y == pointIn.y);
		}
		return false;
	}
}
