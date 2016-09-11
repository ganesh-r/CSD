package MavenTest.MavenTest;

public class Car extends Vehicle
	{
		public Car(String val){
			this.speed = val;
		}
      public String carSpeed()
      {
    	  return this.speed = "20";
      }
		
		public static void main( String[] args )
			{
				Vehicle car = new Car("20");
		       //System.out.println(car.carSpeed());
		       System.out.println(car.getSpeed());
		       System.out.println(car.speed);
			}
	}
