package ba.edu.ibu.oop.cinematicketsystem;

public class Stages {
	
	private int stageID, noOfRows, noOfColumns;
	
	public Stages(int stageID, int noOfRows, int noOfColumns) {
		super();
		this.stageID = stageID;
		this.noOfRows = noOfRows;
		this.noOfColumns = noOfColumns;
	}

	public int getStageID() {
		return stageID;
	}

	public void setStageID(int stageID) {
		this.stageID = stageID;
	}

	public int getNoOfRows() {
		return noOfRows;
	}

	public void setNoOfRows(int noOfRows) {
		this.noOfRows = noOfRows;
	}

	public int getNoOfColumns() {
		return noOfColumns;
	}

	public void setNoOfColumns(int noOfColumns) {
		this.noOfColumns = noOfColumns;
	}

	
	
	
	

}
