package ba.edu.ibu.oop.cinematicketsystem;

public class Movies {

	private String movieTitle;
	private String movieGenre;
	private int stageID;
	private double movieRuntime, movieStart, movieEnd;
	
	public String getMovieTitle() {
		return movieTitle;
	}

	public void setMovieTitle(String movieTitle) {
		this.movieTitle = movieTitle;
	}

	public String getMovieGenre() {
		return movieGenre;
	}

	public void setMovieGenre(String movieGenre) {
		this.movieGenre = movieGenre;
	}

	public int getStageID() {
		return stageID;
	}

	public void setStageID(int stageID) {
		this.stageID = stageID;
	}

	public double getMovieRuntime() {
		return movieRuntime;
	}

	public void setMovieRuntime(double movieRuntime) {
		this.movieRuntime = movieRuntime;
	}

	public double getMovieStart() {
		return movieStart;
	}

	public void setMovieStart(double movieStart) {
		this.movieStart = movieStart;
	}

	public double getMovieEnd() {
		return movieEnd;
	}

	public void setMovieEnd(double movieEnd) {
		this.movieEnd = movieEnd;
	}


	
	public Movies(){
		this("title","genre",0,0,0,0);
	}
	
	public Movies(String movieTitle, String movieGenre, int stageID, double movieRuntime, double movieStart,
			double movieEnd) {
		super();
		this.movieTitle = movieTitle;
		this.movieGenre = movieGenre;
		this.stageID = stageID;
		this.movieRuntime = movieRuntime;
		this.movieStart = movieStart;
		this.movieEnd = movieEnd;
	}

}

