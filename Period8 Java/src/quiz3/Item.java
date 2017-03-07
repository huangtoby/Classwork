package quiz3;

public class Item {
	
	private String description;
	private boolean purchased;
	
	public Item(String description) {
		this.description = description;
		purchased = false;
	}
	
	public void setPurchaseed(boolean b){
		this.purchased = b;
	}

	public boolean isPurchased() {
		return purchased;
	}

	public String getDescription() {
		return description;
	}

}
