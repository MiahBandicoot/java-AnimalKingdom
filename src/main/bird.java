package main;

public abstract class Bird extends Animal{
  Super();
  private String type;
  private String fly;
  private String lungs;
  private String eggs;


  public Bird(String type, String fly, String lungs, String eggs){
    this.type = type,
    this.fly = fly,
    this.lungs, = lungs,
    this.eggs = eggs,
  }
  public getType(){
    return type;
  }
  public void setType(String type){
    this.type = type;
  }
  public void setWalk(String fly){
    System.out.println("Flap Flap")
  };
  public void setLungs(String lungs){
    this.lungs = lungs;
  };
  public void setLiveBirths(String eggs){
    this.eggs = eggs;
  };
  void fly();
  void lungs();
  void eggs();
}
