package cs112lectures;
//this is for the in class exercise 
public class Pokemon {
  // Can only be accessed by the inherited class
  private String name;
  private String color;
  private boolean hasTrainer;

  // Constructor
  public Pokemon(String nParam, String cParam) {
    this.name = nParam;
    this.color = cParam;
    this.hasTrainer = false;
  }

  public Pokemon(String nParam, String cParam, boolean hParam) {
	  this.name = nParam;
	  this.color = cParam;
	  this.hasTrainer = hParam;
  }
  
  // Default constructor
  public Pokemon() {
	  this.name = "";
	  this.color = "";
	  this.hasTrainer = false;
  }
  
  // Accessor
  public String getName() {
    return this.name;
  }
  
  public String getColor() {
	  return this.color;
  }
  
  public boolean hasTrainer() {
	  return this.hasTrainer;
  }
  
  // Mutator
  public void setName(String nParam) {
    this.name = nParam;
  }
  
  public void setColor(String cParam) {
	  this.color = cParam;
  }
  
  public void setHasTrainer(boolean hParam) {
	  this.hasTrainer = hParam;
  }
  

  // Method
  public String toString() {
    return "I am a Pokemon: " + this.name + " : " + this.color + " : " + this.hasTrainer();
  }
}
