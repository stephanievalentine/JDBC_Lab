
public class Character {
	private int id;
	private String name;
	private String universe;
	private boolean inVersion1;
	private boolean inVersion4;
	private String notes;
	
	/**
	 * Constructor for Characters with IDs already
	 */
	public Character(int id, String name, String universe, boolean inVersion1, boolean inVersion4, String notes) {
		this.id = id;
		this.name = name;
		this.universe = universe;
		this.inVersion1 = inVersion1;
		this.inVersion4 = inVersion4;
		this.notes = notes;
	}
	
	/**
	 * Constructor for Characters without IDS already.
	 */
	public Character(String name, String universe, boolean inVersion1, boolean inVersion4, String notes) {
		this.id = -1;
		this.name = name;
		this.universe = universe;
		this.inVersion1 = inVersion1;
		this.inVersion4 = inVersion4;
		this.notes = notes;
	}
	
	/**
	 * @return the id
	 */
	public int getId() {
		return id;
	}
	/**
	 * @param id the id to set
	 */
	public void setId(int id) {
		this.id = id;
	}
	/**
	 * @return the name
	 */
	public String getName() {
		return name;
	}
	/**
	 * @param name the name to set
	 */
	public void setName(String name) {
		this.name = name;
	}
	/**
	 * @return the universe
	 */
	public String getUniverse() {
		return universe;
	}
	/**
	 * @param universe the universe to set
	 */
	public void setUniverse(String universe) {
		this.universe = universe;
	}
	/**
	 * @return the inVersion1
	 */
	public boolean isInVersion1() {
		return inVersion1;
	}
	/**
	 * @param inVersion1 the inVersion1 to set
	 */
	public void setInVersion1(boolean inVersion1) {
		this.inVersion1 = inVersion1;
	}
	/**
	 * @return the inVersion4
	 */
	public boolean isInVersion4() {
		return inVersion4;
	}
	/**
	 * @param inVersion4 the inVersion4 to set
	 */
	public void setInVersion4(boolean inVersion4) {
		this.inVersion4 = inVersion4;
	}
	/**
	 * @return the notes
	 */
	public String getNotes() {
		return notes;
	}
	/**
	 * @param notes the notes to set
	 */
	public void setNotes(String notes) {
		this.notes = notes;
	}
	
	@Override
	public String toString() {
		String toReturn = "";
		toReturn += "ID: " + id;
		toReturn += "\n  Name: " + name;
		toReturn += "\n  Universe: " + universe;
		toReturn += "\n  In Version 1: " + inVersion1;
		toReturn += "\n  In Version 4: " + inVersion4;
		toReturn += "\n  Notes: " + notes;
		return toReturn;
	}
}
