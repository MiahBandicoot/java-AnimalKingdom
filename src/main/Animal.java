package main;

public interface Animal{
  protected String name;
  protected int id;
  protected int year;
  protected void food(int units);
  protected void move();
  protected void breath();
  protected void reproduce();

  // public String getName(){
  //   return name;
  // }
  // public int getId(){
  //   return id;
  // }
  // public int getYear(){
  //   return year;
  // }
  // public int getFood(){
  //   return food;
  // }
}
