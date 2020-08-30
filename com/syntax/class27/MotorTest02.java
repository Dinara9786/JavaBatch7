CHildpackage com.syntax.class27;

public class MotorTest02 {
	
	public static void main(String[] args) {
		
		//new Drivable(); CE: cannot instantiate
		
		//new Motorcycle(); CE: cannot instantiate
		
		System.out.println("========Object of Motorcycle02=========");
		
		Motorcycle02 m = new Bike02 ();
		m.driving();
		m.breaking();
		m.operateVehicle();
		//Motorcycle.Drive = "not safe" CE: cannot change value of final variable
		System.out.println(Drivable02.DRIVE);// static variable accessible 
		
		System.out.println("========Object of Drivable02=========");
		
		Drivable02 d = new Bike02 ();
		d.driving();
		d.breaking();
		System.out.println(Drivable02.DRIVE);
						// interface  variable
		
		Vehicle02 v = new Bike02();//Vehicle02 -- > Motorcycle02 -- > Bike02
		v.operateVehicle();
		
		Bike02 b = new Bike02();
		b.breaking();
		b.driving();
		b.operateVehicle();
		
		// compiler looks first type
}
}