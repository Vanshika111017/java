public class logicaloperator {
  public static void main(String[] args) {
    // logical and operator
    int bodyTemp = 97;
    if(bodyTemp>= 97){
      System.out.println("You have fever");
    }

    int a = 50;
    int b = 70;
    if((a>50) && (b <= 75)){
      System.out.println("Very good");
    }
    //  logical or operator

    int c = 90;
    int d = 100;
    if((c > 90) || (d < 100)){
      System.out.println("its all good");
    }

    boolean isitSunday = false;
    if(!isitSunday){
      System.out.println("It is not a sunday");
    }

    //  Assignment and equal to operator
    int mobilePrice = 500;
    if(mobilePrice == 500 || mobilePrice >= 450){
      System.out.println("Its under my budget");
    }

    //  ternary operator
    //  boolean isMarch = false;
    //  boolean isNoofDay31 = isMarch ? true : false ;
    //  isMarch = false;
    //  if(!isNoofDay31){
    //   System.out.println("Days are not 31");
    //  }

    //  int heightOfTruck = 50;

    //  boolean TruckAllowed = heightOfTruck == 50? true: false
    //  if(TruckAllowed){
    //   System.out.println("You can cross the bridge");
    //  }

  }
}

