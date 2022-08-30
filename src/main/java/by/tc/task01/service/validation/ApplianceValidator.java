package by.tc.task01.service.validation;

import java.util.Map;

import by.tc.task01.entity.criteria.Criteria;
import by.tc.task01.entity.criteria.SearchCriteria;

public class ApplianceValidator {

	public static boolean criteriaValidator(Criteria criteria) throws ValidatorException {
		boolean markValidation = false;

		String nameAppliance = criteria.getGroupSearchName();
		if (nameAppliance == null) {
			throw new ValidatorException("The appliance is not selected");
		}

		switch (nameAppliance) {
		case "TabletPC":
			markValidation = tabletPCVerificator(criteria);
			break;
		case "Oven":
			markValidation = ovenVerificator(criteria);
			break;
		case "Laptop":
			markValidation = laptopVerificator(criteria);
			break;
		case "Refrigerator":
			markValidation = refrigeratorVerificator(criteria);
			break;
		case "VacuumCleaner":
			markValidation = vacuumCleanerVerificator(criteria);
			break;
		case "Speakers":
			markValidation = speakersCleanerVerificator(criteria);
			break;
		}
		return markValidation;
	}

	private static boolean tabletPCVerificator(Criteria criteria) {
		boolean markValidation = false;

		for (Map.Entry<String, Object> entry : criteria.getCriteria().entrySet()) {
			Object valueCriteria = entry.getValue();
			if (entry.getKey().toString().equals(SearchCriteria.TabletPC.FLASH_MEMORY_CAPACITY.toString())) {
				if (valueCriteria.getClass() == Double.class || valueCriteria.getClass() == Integer.class) {
					markValidation = true;
				}
			}
			if (entry.getKey().toString().equals(SearchCriteria.TabletPC.BATTERY_CAPACITY.toString())) {
				if (valueCriteria.getClass() == Double.class || valueCriteria.getClass() == Integer.class) {
					markValidation = true;
				}
			}
			if (entry.getKey().toString().equals(SearchCriteria.TabletPC.DISPLAY_INCHES.toString())) {
				if (valueCriteria.getClass() == Double.class || valueCriteria.getClass() == Integer.class) {
					markValidation = true;
				}
			}
			if (entry.getKey().toString().equals(SearchCriteria.TabletPC.MEMORY_ROM.toString())) {
				if (valueCriteria.getClass() == Double.class || valueCriteria.getClass() == Integer.class) {
					markValidation = true;
				}
			}
			if (entry.getKey().toString().equals(SearchCriteria.TabletPC.COLOR.toString())) {
				if (valueCriteria.getClass() == String.class) {
					markValidation = true;
				}
			}
			if (entry.getKey().toString().equals(SearchCriteria.TabletPC.COST.toString())) {
				if (valueCriteria.getClass() == Double.class || valueCriteria.getClass() == Integer.class) {
					markValidation = true;
				}
			}

		}

		return markValidation;
	}

	private static boolean ovenVerificator(Criteria criteria) {
		boolean markValidation = false;

		for (Map.Entry<String, Object> entry : criteria.getCriteria().entrySet()) {
			Object valueCriteria = entry.getValue();
			if (entry.getKey().toString().equals(SearchCriteria.Oven.POWER_CONSUMPTION.toString())) {
				if (valueCriteria.getClass() == Double.class || valueCriteria.getClass() == Integer.class) {
					markValidation = true;
				}
			}
			if (entry.getKey().toString().equals(SearchCriteria.Oven.WEIGHT.toString())) {
				if (valueCriteria.getClass() == Double.class || valueCriteria.getClass() == Integer.class) {
					markValidation = true;
				}
			}
			if (entry.getKey().toString().equals(SearchCriteria.Oven.CAPACITY.toString())) {
				if (valueCriteria.getClass() == Double.class || valueCriteria.getClass() == Integer.class) {
					markValidation = true;
				}
			}
			if (entry.getKey().toString().equals(SearchCriteria.Oven.DEPTH.toString())) {
				if (valueCriteria.getClass() == Double.class || valueCriteria.getClass() == Integer.class) {
					markValidation = true;
				}
			}
			if (entry.getKey().toString().equals(SearchCriteria.Oven.HEIGHT.toString())) {
				if (valueCriteria.getClass() == Double.class || valueCriteria.getClass() == Integer.class) {
					markValidation = true;
				}
			}
			if (entry.getKey().toString().equals(SearchCriteria.Oven.WIDTH.toString())) {
				if (valueCriteria.getClass() == Double.class || valueCriteria.getClass() == Integer.class) {
					markValidation = true;
				}
			}
			if (entry.getKey().toString().equals(SearchCriteria.Oven.COST.toString())) {
				if (valueCriteria.getClass() == Double.class || valueCriteria.getClass() == Integer.class) {
					markValidation = true;
				}
			}

		}

		return markValidation;
	}

	private static boolean laptopVerificator(Criteria criteria) {
		boolean markValidation = false;

		for (Map.Entry<String, Object> entry : criteria.getCriteria().entrySet()) {
			Object valueCriteria = entry.getValue();
			if (entry.getKey().toString().equals(SearchCriteria.Laptop.BATTERY_CAPACITY.toString())) {
				if (valueCriteria.getClass() == Double.class || valueCriteria.getClass() == Integer.class) {
					markValidation = true;
				}
			}
			if (entry.getKey().toString().equals(SearchCriteria.Laptop.OS.toString())) {
				if (valueCriteria.getClass() == String.class) {
					markValidation = true;
				}
			}
			if (entry.getKey().toString().equals(SearchCriteria.Laptop.MEMORY_ROM.toString())) {
				if (valueCriteria.getClass() == Double.class || valueCriteria.getClass() == Integer.class) {
					markValidation = true;
				}
			}
			if (entry.getKey().toString().equals(SearchCriteria.Laptop.SYSTEM_MEMORY.toString())) {
				if (valueCriteria.getClass() == Double.class || valueCriteria.getClass() == Integer.class) {
					markValidation = true;
				}
			}
			if (entry.getKey().toString().equals(SearchCriteria.Laptop.CPU.toString())) {
				if (valueCriteria.getClass() == Double.class || valueCriteria.getClass() == Integer.class) {
					markValidation = true;
				}
			}
			if (entry.getKey().toString().equals(SearchCriteria.Laptop.DISPLAY_INCHS.toString())) {
				if (valueCriteria.getClass() == Double.class || valueCriteria.getClass() == Integer.class) {
					markValidation = true;
				}
			}
			if (entry.getKey().toString().equals(SearchCriteria.Laptop.COST.toString())) {
				if (valueCriteria.getClass() == Double.class || valueCriteria.getClass() == Integer.class) {
					markValidation = true;
				}
			}

		}

		return markValidation;
	}

	private static boolean refrigeratorVerificator(Criteria criteria) {
		boolean markValidation = false;

		for (Map.Entry<String, Object> entry : criteria.getCriteria().entrySet()) {
			Object valueCriteria = entry.getValue();
			if (entry.getKey().toString().equals(SearchCriteria.Refrigerator.POWER_CONSUMPTION.toString())) {
				if (valueCriteria.getClass() == Double.class || valueCriteria.getClass() == Integer.class) {
					markValidation = true;
				}
			}
			if (entry.getKey().toString().equals(SearchCriteria.Refrigerator.WEIGHT.toString())) {
				if (valueCriteria.getClass() == Double.class || valueCriteria.getClass() == Integer.class) {
					markValidation = true;
				}
			}
			if (entry.getKey().toString().equals(SearchCriteria.Refrigerator.FREEZER_CAPACITY.toString())) {
				if (valueCriteria.getClass() == Double.class || valueCriteria.getClass() == Integer.class) {
					markValidation = true;
				}
			}
			if (entry.getKey().toString().equals(SearchCriteria.Refrigerator.OVERALL_CAPACITY.toString())) {
				if (valueCriteria.getClass() == Double.class || valueCriteria.getClass() == Integer.class) {
					markValidation = true;
				}
			}
			if (entry.getKey().toString().equals(SearchCriteria.Refrigerator.HEIGHT.toString())) {
				if (valueCriteria.getClass() == Double.class || valueCriteria.getClass() == Integer.class) {
					markValidation = true;
				}
			}
			if (entry.getKey().toString().equals(SearchCriteria.Refrigerator.WIDTH.toString())) {
				if (valueCriteria.getClass() == Double.class || valueCriteria.getClass() == Integer.class) {
					markValidation = true;
				}
			}
			if (entry.getKey().toString().equals(SearchCriteria.Refrigerator.COST.toString())) {
				if (valueCriteria.getClass() == Double.class || valueCriteria.getClass() == Integer.class) {
					markValidation = true;
				}
			}

		}

		return markValidation;
	}

	private static boolean vacuumCleanerVerificator(Criteria criteria) {
		boolean markValidation = false;

		for (Map.Entry<String, Object> entry : criteria.getCriteria().entrySet()) {
			Object valueCriteria = entry.getValue();
			if (entry.getKey().toString().equals(SearchCriteria.VacuumCleaner.POWER_CONSUMPTION.toString())) {
				if (valueCriteria.getClass() == Double.class || valueCriteria.getClass() == Integer.class) {
					markValidation = true;
				}
			}
			if (entry.getKey().toString().equals(SearchCriteria.VacuumCleaner.FILTER_TYPE.toString())) {
				if (valueCriteria.getClass() == String.class) {
					markValidation = true;
				}
			}
			if (entry.getKey().toString().equals(SearchCriteria.VacuumCleaner.BAG_TYPE.toString())) {
				if (valueCriteria.getClass() == String.class) {
					markValidation = true;
				}
			}
			if (entry.getKey().toString().equals(SearchCriteria.VacuumCleaner.WAND_TYPE.toString())) {
				if (valueCriteria.getClass() == String.class) {
					markValidation = true;
				}
			}
			if (entry.getKey().toString().equals(SearchCriteria.VacuumCleaner.MOTOR_SPEED_REGULATION.toString())) {
				if (valueCriteria.getClass() == Double.class || valueCriteria.getClass() == Integer.class) {
					markValidation = true;
				}
			}
			if (entry.getKey().toString().equals(SearchCriteria.VacuumCleaner.CLEANING_WIDTH.toString())) {
				if (valueCriteria.getClass() == Double.class || valueCriteria.getClass() == Integer.class) {
					markValidation = true;
				}
			}
			if (entry.getKey().toString().equals(SearchCriteria.VacuumCleaner.COST.toString())) {
				if (valueCriteria.getClass() == Double.class || valueCriteria.getClass() == Integer.class) {
					markValidation = true;
				}
			}

		}

		return markValidation;
	}

	private static boolean speakersCleanerVerificator(Criteria criteria) {
		boolean markValidation = false;

		for (Map.Entry<String, Object> entry : criteria.getCriteria().entrySet()) {
			Object valueCriteria = entry.getValue();
			if (entry.getKey().toString().equals(SearchCriteria.Speakers.POWER_CONSUMPTION.toString())) {
				if (valueCriteria.getClass() == Double.class || valueCriteria.getClass() == Integer.class) {
					markValidation = true;
				}
			}
			if (entry.getKey().toString().equals(SearchCriteria.Speakers.FREQUENCY_RANGE.toString())) {
				if (valueCriteria.getClass() == String.class) {
					markValidation = true;
				}
			}
			if (entry.getKey().toString().equals(SearchCriteria.Speakers.NUMBER_OF_SPEAKERS.toString())) {
				if (valueCriteria.getClass() == Integer.class) {
					markValidation = true;
				}
			}
			if (entry.getKey().toString().equals(SearchCriteria.Speakers.CORD_LENGTH.toString())) {
				if (valueCriteria.getClass() == Double.class || valueCriteria.getClass() == Integer.class) {
					markValidation = true;
				}
			}
			if (entry.getKey().toString().equals(SearchCriteria.Speakers.COST.toString())) {
				if (valueCriteria.getClass() == Double.class || valueCriteria.getClass() == Integer.class) {
					markValidation = true;
				}
			}

		}

		return markValidation;
	}

}
