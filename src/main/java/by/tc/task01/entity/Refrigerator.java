package by.tc.task01.entity;

import java.util.Objects;

public class Refrigerator extends Appliance {
	private double powerConsumption;
	private double weight;
	private double freezerCapacity;
	private double overallCapacity;
	private double height;
	private double width;

	public Refrigerator() {
		this(0, 0, 0, 0, 0, 0, 0);

	}

	public Refrigerator(int cost, double powerConsumption, double weight, double freezerCapacity,
			double overallCapacity, double height, double width) {
		super(cost);
		this.powerConsumption = powerConsumption;
		this.weight = weight;
		this.freezerCapacity = freezerCapacity;
		this.overallCapacity = overallCapacity;
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

	public double getFreezerCapacity() {
		return freezerCapacity;
	}

	public void setFreezerCapacity(double freezerCapacity) {
		this.freezerCapacity = freezerCapacity;
	}

	public double getOverallCapacity() {
		return overallCapacity;
	}

	public void setOverallCapacity(double overallCapacity) {
		this.overallCapacity = overallCapacity;
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
		result = prime * result
				+ Objects.hash(freezerCapacity, height, overallCapacity, powerConsumption, weight, width);
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
		Refrigerator other = (Refrigerator) obj;
		return Double.doubleToLongBits(freezerCapacity) == Double.doubleToLongBits(other.freezerCapacity)
				&& Double.doubleToLongBits(height) == Double.doubleToLongBits(other.height)
				&& Double.doubleToLongBits(overallCapacity) == Double.doubleToLongBits(other.overallCapacity)
				&& Double.doubleToLongBits(powerConsumption) == Double.doubleToLongBits(other.powerConsumption)
				&& Double.doubleToLongBits(weight) == Double.doubleToLongBits(other.weight)
				&& Double.doubleToLongBits(width) == Double.doubleToLongBits(other.width);
	}

	@Override
	public String toString() {
		return "Refrigerator [powerConsumption=" + powerConsumption + ", weight=" + weight + ", freezerCapacity="
				+ freezerCapacity + ", overallCapacity=" + overallCapacity + ", height=" + height + ", width=" + width + ", cost="
				+ super.getCost() + "]";
	}

}
