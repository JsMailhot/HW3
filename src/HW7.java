public class HW7 {
	public static void main(String[] args) {
		AnimalClassTester qa = new AnimalClassTester();
		
		Animal example = new Animal() {
			@Override
			public String name() {
				return null;
			}

			@Override
			public String diet() {
				return null;
			}

			@Override
			public String does() {
				return null;
			}
		};
		if (qa.testAnimalObject(example)) {
			System.out.println("Animal class passes");
		} else {
			System.out.println(">>>>Animal class Failed!<<<<");
		}
		
		Tyrannosaur clarence = new Tyrannosaur();
		if (qa.testAnimalObject(clarence)) {
			System.out.println("Tyrranosaur class passes");
		} else {
			System.out.println(">>>>Tyrranosaur class Failed!<<<<");
		}
		
		Penguin opus = new Penguin();
		if (qa.testAnimalObject(opus)) {
			System.out.println("Penguin class passes");
		} else {
			System.out.println(">>>>Penguin class Failed!<<<<");
		}
		
		Cow mrsolearys = new Cow();
		if (qa.testAnimalObject(mrsolearys)) {
			System.out.println("Cow class passes");
		} else {
			System.out.println(">>>>Cow class Failed!<<<<");
		}
		
		TreeClimbingOctopus sandmanrichard = new TreeClimbingOctopus();
		if (qa.testAnimalObject(sandmanrichard)) {
			System.out.println("TreeClimbingOctopus class passes");
		} else {
			System.out.println(">>>>TreeClimbingOctopus class Failed!<<<<");
		}
	}
}
