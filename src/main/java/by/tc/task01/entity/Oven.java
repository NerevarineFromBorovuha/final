package by.tc.task01.entity;

import java.util.Objects;

public class Oven extends Appliance {

	private double powerConsumption;
	private double weight;
	private double capacity;
	private double depth;
	private double height;
	private double width;

	public Oven() {
		this(0, 0, 0, 0, 0, 0, 0);

	}

	public Oven(double cost, double powerConsumption, double weight, double capacity, double depth, double height, double width) {
		super(cost);
		this.powerConsumption = powerConsumption;
		this.weight = weight;
		this.capacity = capacity;
		this.depth = depth;
		this.height = height;
		this.width = width;
	}

	public double getPowerConsumption() {
		return powerConsumption;
	}

	public void setPowerConsumption(double powerConsumption) {
		this.powerConsumption = powerConsumption;
	}

	public double getWeight() {
		return weight;
	}

	public void setWeight(double weight) {
		this.weight = weight;
	}

	public double getCapacity() {
		return capacity;
	}

	public void setCapacity(double capacity) {
		this.capacity = capacity;
	}

	public double getDepth() {
		return depth;
	}

	public void setDepth(double depth) {
		this.depth = depth;
	}

	public double getHeight() {
		return height;
	}

	public void setHeight(double height) {
		this.height = height;
	}

	public double getWidth() {
		return width;
	}

	public void setWidth(double width) {
		this.width = width;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = super.hashCode();
		result = prime * result + Objects.hash(capacity, depth, height, powerConsumption, weight, width);
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (!super.equals(obj))
			return false;
		if (getClass() != obj.getClass())
			return false;
		Oven other = (Oven) obj;
		return capacity == other.capacity && depth == other.depth
				&& Double.doubleToLongBits(height) == Double.doubleToLongBits(other.height)
				&& powerConsumption == other.powerConsumption && weight == other.weight
				&& Double.doubleToLongBits(width) == Double.doubleToLongBits(other.width);
	}

	@Override
	public String toString() {
		return "Oven [powerConsumption=" + powerConsumption + ", weight=" + weight + ", capacity=" + capacity
				+ ", depth=" + depth + ", height=" + height + ", width=" + width + ", cost="
						+ super.getCost() + "]";
	}

}
