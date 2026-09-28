class Artist{
	String name;
	int age;
	Artist() {
		super();
		this.name = "Not Given";
		this.age = 0;
	}
	Artist(String name, int age) {
		super();
		this.name = name;
		this.age = age;
	}
	String getName() {
		return name;
	}
	void setName(String name) {
		this.name = name;
	}
	int getAge() {
		return age;
	}
	void setAge(int age) {
		this.age = age;
	}
	
	void display() {
		System.out.println("Artist Name: "+name);
		System.out.println("Age: "+this.age);
	}
}

class Painter extends Artist{
	String paintingStyle;
	String mediumUsed;
	int numberOfPaintings;
	
	Painter() {
		super();
		this.paintingStyle = "Not Given";
		this.mediumUsed = "Not Given";
		this.numberOfPaintings = 0;
	}
	Painter(String name,int age,String paintingStyle, String mediumUsed, int numberOfPaintings) {
		super(name ,age);
		this.paintingStyle = paintingStyle;
		this.mediumUsed = mediumUsed;
		this.numberOfPaintings = numberOfPaintings;
	}
	String getPaintingStyle() {
		return paintingStyle;
	}
	void setPaintingStyle(String paintingStyle) {
		this.paintingStyle = paintingStyle;
	}
	String getMediumUsed() {
		return mediumUsed;
	}
	void setMediumUsed(String mediumUsed) {
		this.mediumUsed = mediumUsed;
	}
	int getNumberOfPaintings() {
		return numberOfPaintings;
	}
	void setNumberOfPaintings(int numberOfPaintings) {
		this.numberOfPaintings = numberOfPaintings;
	}
	
	void display() {
		super.display();
		System.out.println("Painting Style: "+paintingStyle);
		System.out.println("Medium Used: "+mediumUsed);
		System.out.println("Number Of Paintings: "+this.numberOfPaintings);
	}
	
}

class Musician extends Artist{
	String instrument;
	String musicGenre;
	int numberOfAlbums;
	
	Musician() {
		super();
		this.instrument = "Not Given";
		this.musicGenre ="Not Given";
		this.numberOfAlbums = 0;
	}
	Musician(String name, int age,String instrument, String musicGenre, int numberOfAlbums) {
		super(name,age);
		this.instrument = instrument;
		this.musicGenre = musicGenre;
		this.numberOfAlbums = numberOfAlbums;
	}
	String getInstrument() {
		return instrument;
	}
	void setInstrument(String instrument) {
		this.instrument = instrument;
	}
	String getMusicGenre() {
		return musicGenre;
	}
	void setMusicGenre(String musicGenre) {
		this.musicGenre = musicGenre;
	}
	int getNumberOfAlbums() {
		return numberOfAlbums;
	}
	void setNumberOfAlbums(int numberOfAlbums) {
		this.numberOfAlbums = numberOfAlbums;
	}
	
	void display() {
		super.display();
		System.out.println("Instrument: "+instrument);
		System.out.println("Music Genre: "+musicGenre);
		System.out.println("Number of Albums: "+this.numberOfAlbums);
	}
}

class Actor extends Artist{
	String filmIndustry;
	int numberOfMovies;
	
	Actor() {
		super();
		this.filmIndustry = "Not Given";
		this.numberOfMovies = 0;
	}
	Actor(String name,int age,String filmIndustry, int numberOfMovies) {
		super(name,age);
		this.filmIndustry = filmIndustry;
		this.numberOfMovies = numberOfMovies;
	}
	String getFilmIndustry() {
		return filmIndustry;
	}
	void setFilmIndustry(String filmIndustry) {
		this.filmIndustry = filmIndustry;
	}
	int getNumberOfMovies() {
		return numberOfMovies;
	}
	void setNumberOfMovies(int numberOfMovies) {
		this.numberOfMovies = numberOfMovies;
	}
	
	void display() {
		super.display();
		System.out.println("Film Industry: "+filmIndustry);
		System.out.println("Number of Movies: "+this.numberOfMovies);
	}
}
class ArtistTest {
public static void main(String[] args) {
	
	System.out.println("Painter's Details: ");
	Painter p1=new Painter("Rohit",23,"Realism","Oil",122);
	p1.display();
	System.out.println();
	 
	System.out.println("Musician's Details: ");
	Musician m1=new Musician("Taylor Swift",36,"Giitar","Pop",12);
	m1.display();
	System.out.println();
	
	System.out.println("Actor's Details: ");
	Actor a1= new Actor("Amitabh Banchan",83,"Bollywood",200);
	a1.display();
}
}
