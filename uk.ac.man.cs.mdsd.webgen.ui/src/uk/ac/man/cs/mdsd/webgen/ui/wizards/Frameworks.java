package uk.ac.man.cs.mdsd.webgen.ui.wizards;

public enum Frameworks {
	CODE_IGNITER("CodeIgniter"), KOHANA("Kohana"), SYMFONY("Symfony");
	
	private String name;

	private Frameworks(final String name) {
		this.name = name;
	}

	@Override
	public String toString() {
		return name;
	}

}
