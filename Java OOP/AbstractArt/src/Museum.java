import java.util.ArrayList;
public class Museum {

	public static void main(String[] args) {
		Art paint1= new Painting();
		Art paint2= new Painting();
		Art paint3= new Painting();
		Art sculpture1= new Scultpture();
		Art sculpture2= new Scultpture();
		ArrayList<Art> museum = new ArrayList<Art> ();
		museum.add(paint1);
		museum.add(paint2);
		museum.add(paint3);
		museum.add(sculpture1);
		museum.add(sculpture2);
		for (int i=0; i< museum.size(); i++) {
			museum.get(i).viewArt();
		}
	}

}
