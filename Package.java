package algs;

import java.util.UUID;

public class Package {
	
	private UUID id;
	private String description;
	private Customer seneder;
	private Customer recipent;
	private int packageType;
	private int deliveryType;
	
	public Package(UUID id, String description, Customer seneder, Customer recipent, int packageType,
			int deliveryType) {
		super();
		this.id = id;
		this.description = description;
		this.seneder = seneder;
		this.recipent = recipent;
		this.packageType = packageType;
		this.deliveryType = deliveryType;
	}
	public UUID getId() {
		return id;
	}
	public void setId(UUID id) {
		this.id = id;
	}
	public String getDescription() {
		return description;
	}
	public void setDescription(String description) {
		this.description = description;
	}
	public Customer getSeneder() {
		return seneder;
	}
	public void setSeneder(Customer seneder) {
		this.seneder = seneder;
	}
	public Customer getRecipent() {
		return recipent;
	}
	public void setRecipent(Customer recipent) {
		this.recipent = recipent;
	}
	public int getPackageType() {
		return packageType;
	}
	public void setPackageType(int packageType) {
		this.packageType = packageType;
	}
	public int getDeliveryType() {
		return deliveryType;
	}
	public void setDeliveryType(int deliveryType) {
		this.deliveryType = deliveryType;
	}
	
	@Override
	public String toString() {
		return "Package [id=" + id + ", description=" + description + ", seneder=" + seneder + ", recipent=" + recipent
				+ ", packageType=" + packageType + ", deliveryType=" + deliveryType + "]";
	}
}
