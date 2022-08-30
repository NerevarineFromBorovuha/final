package by.tc.task01.entity;

import java.util.Objects;

public class TabletPC extends Appliance {

	private double batteryCapacity;
	private double displayInches;
	private double memory;
	private double flashMemoryCapacity;
	private String color;

	public TabletPC(double cost, double batteryCapacity, double displayInches, double memory,
			double flashMemoryCapacity, String color) {
		super(cost);
		this.batteryCapacity = batteryCapacity;
		this.displayInches = displayInches;
		this.memory = memory;
		this.flashMemoryCapacity = flashMemoryCapacity;
		this.color = color;

	}

	public TabletPC() {
		this(0, 0, 0, 0, 0, "");
	}

	public double getBatteryCapacity() {
		return batteryCapacity;
	}

	public void setBatteryCapacity(double batteryCapacity) {
		this.batteryCapacity = batteryCapacity;
	}

	public double getDisplayInches() {
		return displayInches;
	}

	public void setDisplayInches(double displayInches) {
		this.displayInches = displayInches;
	}

	public double getMemory() {
		return memory;
	}

	public void setMemory(double memory) {
		this.memory = memory;
	}

	public double getFlashMemoryCapacity() {
		return flashMemoryCapacity;
	}

	public void setFlashMemoryCapacity(double flashMemoryCapacity) {
		this.flashMemoryCapacity = flashMemoryCapacity;
	}

	public String getColor() {
		return color;
	}

	public void setColor(String color) {
		this.color = color;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = super.hashCode();
		result = prime * result + Objects.hash(batteryCapacity, color, displayInches, flashMemoryCapacity, memory);
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
		TabletPC other = (TabletPC) obj;
		return Double.doubleToLongBits(batteryCapacity) == Double.doubleToLongBits(other.batteryCapacity)
				&& Objects.equals(color, other.color)
				&& Double.doubleToLongBits(displayInches) == Double.doubleToLongBits(other.displayInches)
				&& Double.doubleToLongBits(flashMemoryCapacity) == Double.doubleToLongBits(other.flashMemoryCapacity)
				&& Double.doubleToLongBits(memory) == Double.doubleToLongBits(other.memory);
	}

	@Override
	public String toString() {
		return "TabletPC [batteryCapacity=" + batteryCapacity + ", displayInches=" + displayInches + ", memory="
				+ memory + ", flashMemoryCapacity=" + flashMemoryCapacity + ", color=" + color + ", cost="
				+ super.getCost() + "]";
	}

}
