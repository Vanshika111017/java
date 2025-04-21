public class methodoverloading {
    public static void main(String args[]){
      String Name = "Vanshika";
      int Age = 20;
      char Grade = 'A';
      double height = 179.5;
      DisplayDetails(Name, Age, Grade, height);
    }
  
  public static void DisplayDetails(String UserName, int UserAge, char Grade, double height ) {
    System.out.println("The Name is:"+ UserName + " Age is: " + UserAge + " The Grade and height are:" + Grade + "and" + height + "resp.");
    
  }
}
