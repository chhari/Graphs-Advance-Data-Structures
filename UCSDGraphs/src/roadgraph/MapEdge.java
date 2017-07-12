package roadgraph;

import geography.GeographicPoint;

public class MapEdge {
	GeographicPoint start;
	GeographicPoint end;
	String StreetName;
	double distance;
	String roadtype;

	public MapEdge(GeographicPoint start,GeographicPoint end,String StreetName,String roadtype,double distance) {
		// TODO Auto-generated constructor stub
		this.start = start;
		this.end = end;
		this.StreetName = StreetName;
		this.roadtype = roadtype;
		this.distance = distance;
	}

}
