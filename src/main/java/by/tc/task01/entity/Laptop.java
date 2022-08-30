package by.tc.task01.entity;

import java.util.Objects;

public class Laptop extends Appliance {
	private double batteryCapacity;
	private String operatingSystem;
	private double memoryRom;
	private double systemMemory;
	private double cpu;
	private double displayInchs;

	public Laptop() {
		this(0, 0, "", 0, 0, 0, 0);

	}

	public Laptop(double cost, double batteryCapacity, String operatingSystem, double memoryRom, double systemMemory, double cpu,
			double displayInchs) {
		super(cost);
		this.batteryCapacity = batteryCapacity;
		this.operatingSystem = operatingSystem;
		this.memoryRom = memoryRom;
		this.systemMemory = systemMemory;
		this.cpu = cpu;
		this.displayInchs = displayInchs;

	}

	public double getBatteryCapacity() {
		return batteryCapacity;
	}

	public void setBatteryCapacity(double batteryCapacity) {
		this.batteryCapacity = batteryCapacity;
	}

	public String getOperatingSystem() {
		return operatingSystem;
	}

	public void setOperatingSystem(String operatingSystem) {
		this.operatingSystem = operatingSystem;
	}

	public double getMemoryRom() {
		return memoryRom;
	}

	public void setMemoryRom(double memoryRom) {
		this.memoryRom = memoryRom;
	}

	public double getSystemMemory() {
		return systemMemory;
	}

	public void setSystemMemory(double systemMemory) {
		this.systemMemory = systemMemory;
	}

	public double getCpu() {
		return cpu;
	}

	public void setCpu(double cpu) {
		this.cpu = cpu;
	}

	public double getDisplayInchs() {
		return displayInchs;
	}

	public void setDisplayInchs(double displayInchs) {
		this.displayInchs = displayInchs;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = super.hashCode();
		result = prime * result
				+ Objects.hash(batteryCapacity, cpu, displayInchs, memoryRom, operatingSystem, systemMemory);
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
		Laptop other = (Laptop) obj;
		return Double.doubleToLongBits(batteryCapacity) == Double.doubleToLongBits(other.batteryCapacity)
				&& Double.doubleToLongBits(cpu) == Double.doubleToLongBits(other.cpu)
				&& displayInchs == other.displayInchs && memoryRom == other.memoryRom
				&& Objects.equals(operatingSystem, other.operatingSystem) && systemMemory == other.systemMemory;
	}

	@Override
	public String toString() {
		return "Laptop [batteryCapacity=" + batteryCapacity + ", operatingSystem=" + operatingSystem + ", memoryRom="
				+ memoryRom + ", systemMemory=" + systemMemory + ", cpu=" + cpu + ", displayInchs=" + displayInchs + ", cost="
				+ super.getCost() + "]";
	}

}
