package by.tc.task01.entity;

import java.io.Serializable;
import java.util.Objects;

public class Appliance implements Serializable {
	private double cost;

	public Appliance() {
		cost = 0;
	}

	public Appliance(double cost) {
		this.cost = cost;
	}

	public double getCost() {
		return cost;
	}

	public void setCost(double cost) {
		this.cost = cost;
	}

	@Override
	public String toString() {
		return "Appliance [cost=" + cost + "]";
	}

	@Override
	public int hashCode() {
		return Objects.hash(cost);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Appliance other = (Appliance) obj;
		return cost == other.cost;
	}

}
