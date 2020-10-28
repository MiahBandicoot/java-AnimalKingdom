package main;


public abstract class Mammal extends Animal{
  Super();
  private String type;
  private String walk;
  private String lungs;
  private String liveBirths;

  public Mammal(String type, String walk, String lungs, String liveBirths){
    this.type = type,
    this.walk = walk,
    this.lungs, = lungs,
    this.liveBirths = liveBirths,
  }
  public getType(){
    return type;
  }
  public void setType(String type){
    this.type = type;
  }
  public void setWalk(String walk){
    System.out.println("Walk")
  };
  public void setLungs(String lungs){
    this.lungs = lungs;
  };
  public void setLiveBirths(String liveBirths){
    this.liveBirths = liveBirths;
  };
}
