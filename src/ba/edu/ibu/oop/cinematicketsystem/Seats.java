package ba.edu.ibu.oop.cinematicketsystem;

public class Seats {
		
	private int rowCoorditane, columnCoordinate;
	boolean reserved = false;
	
	public Seats(int rowCoorditane, int columnCoordinate, boolean reserved) {
		super();
		this.rowCoorditane = rowCoorditane;
		this.columnCoordinate = columnCoordinate;
		this.reserved = reserved;
	}

	public int getRowCoorditane() {
		return rowCoorditane;
	}

	public void setRowCoorditane(int rowCoorditane) {
		this.rowCoorditane = rowCoorditane;
	}

	public int getColumnCoordinate() {
		return columnCoordinate;
	}

	public void setColumnCoordinate(int columnCoordinate) {
		this.columnCoordinate = columnCoordinate;
	}

	public boolean isReserved() {
		return reserved;
	}

	public void setReserved(boolean reserved) {
		this.reserved = reserved;
	}
	
	
	
		
	
	
}
