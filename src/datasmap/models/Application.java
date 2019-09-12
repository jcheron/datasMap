package datasmap.models;

import java.util.ArrayList;
import java.util.List;

public class Application {
	private static List<Place> places;
	
	public static List<Place> loadDefaultPlaces(){
		places=new ArrayList<Place>();
		places.add(null);
		return places;
	}
}
