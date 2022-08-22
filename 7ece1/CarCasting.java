package com.jsp.pack3;
class Car{
	public void start() {}
	public void accelerate() {}
	public void stop()  {}
	
}
class Swift extends Car{
	public void start() {
		System.out.println("Swift starts with a key");
	}
	public void accelerate() {
		System.out.println("Accelerate using half clutch");
		
	}
	public void stop() {
		System.out.println("stop using key");
		
		
	}
	public void bluetooth() {
		System.out.println("Siwft bluetooth is on");
	}
}

	class BMW extends Car{
		public void start() {
			System.out.println("BMW starts with a button");
		}
		public void accelerate() {
			System.out.println("Accelerate using full clutch");
		}
		public void stop() {
			System.out.println("stop using clutch");
		}	
		public void musicplayer() {
			System.out.println("when i bored paly music");
		}
		public void bluetooth() {
			System.out.println("BMW bluetooth is on");
				
			}
		}
			
class Mastan extends Car{
	public void start() {
		System.out.println("mastan starts with a button");
	}
	public void accelerate() {
		System.out.println("Accelerate using mid clutch");
	}	
	public void stop() {
		System.out.println("stop using clutch");
		
	}
}
class Driver {
	public void drive(Car c )
{
		c.start();
		c.accelerate();
		c.stop();
}
	public void accessmusicplayer(Car c) {
		BMW b  = (BMW)c;
		b.musicplayer();
		
		
		
	}
	public void accessbluetooth(Car c  ) {
		if (c instanceof Swift) {
			Swift s = (Swift )c;
			s.bluetooth();
		}
		if (c instanceof BMW) {
			BMW b = (BMW )c;
			b.bluetooth();
		
				
		}
		
	}
}
		
	
	






public class CarCasting {
	public static void main(String[] args) {
		Driver d = new Driver();
		d.drive(new Swift());
		d.drive(new Mastan());
        d.drive(new BMW());
        d.accessmusicplayer(new Swift());
        d.accessbluetooth(new BMW());
        d.accessbluetooth(new Swift());
        //d.acaccessbluetooth(new Mastan());
        	
        }
        
		
	}





