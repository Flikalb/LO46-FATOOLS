package fr.utbm.tx52.fatools.constructs;

public class FAState extends AbstractFANode {

	/**
	 * 
	 */
	private static final long serialVersionUID = 6543243896004895161L;

	public static final String PROPERTY_ACCEPTING = "accepting";

	private boolean isAccepting = false;


	public FAState() {
		super();
	}

	public FAState(String name) {
		super(name);
	}

	@Override
	public FANodeType getType() {
		return FANodeType.STATE;
	}

	public boolean isAccepting() {
		return this.isAccepting;
	}

	public void setAccepting(boolean accepting) {
		this.isAccepting=accepting;
	}	
	
}
