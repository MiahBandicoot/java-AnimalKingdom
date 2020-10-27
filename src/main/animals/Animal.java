package main;

public interface Animal{
  protected String name;
  protected int id;
  protected int year;
  void food(int units);
  void move();
  void breath();
  void reproduce();

  public String getName(){
    return name;
  }
  public int getId(){
    return id;
  }
  public int getYear(){
    return year;
  }
  public int getFood(){
    return food;
  }
}
