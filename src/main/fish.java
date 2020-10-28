package main;


public abstract class Fish extends Animal{
  Super();
  private String type;
  private String swim;
  private String gills;
  private String eggs;

  public Fish(String type, String swim, String gills, String eggs){
    this.type = type,
    this.swim = swim,
    this.gills, = gills,
    this.eggs = eggs,
  }
  public getType(){
    return type;
  }
  public void setType(String type){
    this.type = type;
  }
  public void setSwim(String swim){
    System.out.println("Splash Splash")
  };
  public void setGills(String gills){
    this.gills = gills;
  };
  public void setEggs(String eggs){
    this.eggs = eggs;
  };
}
