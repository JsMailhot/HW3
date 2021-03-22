public class ExpectedCow extends Animal  {
	@Override
	public String name() {
		return "Cow";
	}

	@Override
	public String diet() {
		return "grass, hay, and corn";
	}

	@Override
	public String does() {
		return "milk and cheese";
	}
}