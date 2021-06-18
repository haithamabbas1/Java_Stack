package ObkectMaster;

public class Test {

	public static void main(String[] args) {
		Samurai Haitham = new Samurai();
		Human Mutaz = new Human();
		Wizard Amro = new Wizard();
		
		Mutaz.attack(Haitham);
		System.out.print("After Mutaz's attack, Haitham health is: ");System.out.println(Haitham.health);
		
		Amro.fireball(Haitham);
		System.out.print("After Amro's fireball, Haitham health is: ");System.out.println(Haitham.health);
		
		
		Haitham.deathBlow(Amro);
		System.out.print("After Haitham DeathBlow, Amro health is: ");System.out.println(Amro.health);
		
		Haitham.NeckBreaker(Mutaz);
		System.out.print("After Haitham's NeckBreaker, Mutaz health is: "); System.out.println(Mutaz.health);
		
		System.out.print("Haitham's health is: ");System.out.println(Haitham.health);
		
		if(Haitham.health>0) {
			System.out.println("HAITHAM IS VICTORIOUS");
		}
		
	}

}
