package by.tc.task01.entity;

import java.util.Objects;

public class Speakers extends Appliance {
	
	private double powerConsumption;
	private int numberOfSpeakers;
	private String frequencyRange;
	private double cordLength;

	public Speakers() {
		this(0, 0, 0, "", 0);

	}

	public Speakers(int cost, double powerConsumption, int numberOfSpeakers, String frequencyRange, double cordLength) {
		super(cost);
		this.powerConsumption = powerConsumption;
		this.numberOfSpeakers = numberOfSpeakers;
		this.frequencyRange = frequencyRange;
		this.cordLength = cordLength;

	}

	public double getPowerConsumption() {
		return powerConsumption;
	}

	public void setPowerConsumption(double powerConsumption) {
		this.powerConsumption = powerConsumption;
	}

	public int getNumberOfSpeakers() {
		return numberOfSpeakers;
	}

	public void setNumberOfSpeakers(int numberOfSpeakers) {
		this.numberOfSpeakers = numberOfSpeakers;
	}

	public String getFrequencyRange() {
		return frequencyRange;
	}

	public void setFrequencyRange(String frequencyRange) {
		this.frequencyRange = frequencyRange;
	}

	public double getCordLength() {
		return cordLength;
	}

	public void setCordLength(double cordLength) {
		this.cordLength = cordLength;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = super.hashCode();
		result = prime * result + Objects.hash(cordLength, frequencyRange, numberOfSpeakers, powerConsumption);
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
		Speakers other = (Speakers) obj;
		return Double.doubleToLongBits(cordLength) == Double.doubleToLongBits(other.cordLength)
				&& Objects.equals(frequencyRange, other.frequencyRange) && numberOfSpeakers == other.numberOfSpeakers
				&& Double.doubleToLongBits(powerConsumption) == Double.doubleToLongBits(other.powerConsumption);
	}

	@Override
	public String toString() {
		return "Speakers [powerConsumption=" + powerConsumption + ", numberOfSpeakers=" + numberOfSpeakers
				+ ", frequencyRange=" + frequencyRange + ", cordLength=" + cordLength + ", cost="
				+ super.getCost() + "]";
	}

}
