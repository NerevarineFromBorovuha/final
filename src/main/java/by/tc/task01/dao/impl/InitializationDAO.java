package by.tc.task01.dao.impl;

import by.tc.task01.entity.Appliance;
import by.tc.task01.entity.Laptop;
import by.tc.task01.entity.Oven;
import by.tc.task01.entity.Refrigerator;
import by.tc.task01.entity.Speakers;
import by.tc.task01.entity.TabletPC;
import by.tc.task01.entity.VacuumCleaner;
import by.tc.task01.entity.criteria.SearchCriteria;

class InitializationDAO {
	private static final InitializationDAO instance = new InitializationDAO();

	private InitializationDAO() {
	}

	public static InitializationDAO getInstance() {
		return instance;
	}

	public Appliance tabletPCInitialization(String[] tabletPCArray) {
		TabletPC tabletPC = new TabletPC();
		for (int i = 1; i < tabletPCArray.length; i++) {
			if (tabletPCArray[i].equals(SearchCriteria.TabletPC.BATTERY_CAPACITY.toString())) {
				tabletPC.setBatteryCapacity(Double.parseDouble(tabletPCArray[i + 1]));
			} else if (tabletPCArray[i].equals(SearchCriteria.TabletPC.DISPLAY_INCHES.toString())) {
				tabletPC.setDisplayInches(Double.parseDouble(tabletPCArray[i + 1]));
			} else if (tabletPCArray[i].equals(SearchCriteria.TabletPC.MEMORY_ROM.toString())) {
				tabletPC.setMemory(Double.parseDouble(tabletPCArray[i + 1]));
			} else if (tabletPCArray[i].equals(SearchCriteria.TabletPC.FLASH_MEMORY_CAPACITY.toString())) {
				tabletPC.setFlashMemoryCapacity(Double.parseDouble(tabletPCArray[i + 1]));
			} else if (tabletPCArray[i].equals(SearchCriteria.TabletPC.COLOR.toString())) {
				tabletPC.setColor(tabletPCArray[i + 1]);
			} else if (tabletPCArray[i].equals(SearchCriteria.TabletPC.COST.toString())) {
				tabletPC.setCost(Double.parseDouble(tabletPCArray[i + 1]));

			}

		}
		return tabletPC;
	}

	public Appliance OvenInitialization(String[] ovenArray) {
		Oven oven = new Oven();
		for (int i = 1; i < ovenArray.length; i++) {
			if (ovenArray[i].equals(SearchCriteria.Oven.CAPACITY.toString())) {
				oven.setCapacity(Double.parseDouble(ovenArray[i + 1]));
			} else if (ovenArray[i].equals(SearchCriteria.Oven.POWER_CONSUMPTION.toString())) {
				oven.setPowerConsumption(Double.parseDouble(ovenArray[i + 1]));
			} else if (ovenArray[i].equals(SearchCriteria.Oven.WEIGHT.toString())) {
				oven.setWeight(Double.parseDouble(ovenArray[i + 1]));
			} else if (ovenArray[i].equals(SearchCriteria.Oven.DEPTH.toString())) {
				oven.setDepth(Double.parseDouble(ovenArray[i + 1]));
			} else if (ovenArray[i].equals(SearchCriteria.Oven.HEIGHT.toString())) {
				oven.setHeight(Double.parseDouble(ovenArray[i + 1]));
			} else if (ovenArray[i].equals(SearchCriteria.Oven.WIDTH.toString())) {
				oven.setWidth(Double.parseDouble(ovenArray[i + 1]));
			} else if (ovenArray[i].equals(SearchCriteria.Oven.COST.toString())) {
				oven.setCost(Double.parseDouble(ovenArray[i + 1]));
			}

		}
		return oven;
	}

	public Appliance LaptopInitialization(String[] laptopArray) {
		Laptop laptop = new Laptop();
		for (int i = 1; i < laptopArray.length; i++) {
			if (laptopArray[i].equals(SearchCriteria.Laptop.BATTERY_CAPACITY.toString())) {
				laptop.setBatteryCapacity(Double.parseDouble(laptopArray[i + 1]));
			} else if (laptopArray[i].equals(SearchCriteria.Laptop.OS.toString())) {
				laptop.setOperatingSystem(laptopArray[i + 1]);
			} else if (laptopArray[i].equals(SearchCriteria.Laptop.MEMORY_ROM.toString())) {
				laptop.setMemoryRom(Double.parseDouble(laptopArray[i + 1]));
			} else if (laptopArray[i].equals(SearchCriteria.Laptop.SYSTEM_MEMORY.toString())) {
				laptop.setSystemMemory(Double.parseDouble(laptopArray[i + 1]));
			} else if (laptopArray[i].equals(SearchCriteria.Laptop.CPU.toString())) {
				laptop.setCpu(Double.parseDouble(laptopArray[i + 1]));
			} else if (laptopArray[i].equals(SearchCriteria.Laptop.DISPLAY_INCHS.toString())) {
				laptop.setDisplayInchs(Double.parseDouble(laptopArray[i + 1]));
			} else if (laptopArray[i].equals(SearchCriteria.Laptop.COST.toString())) {
				laptop.setCost(Double.parseDouble(laptopArray[i + 1]));
			}

		}

		return laptop;

	}

	public Appliance RefrigeratorInitialization(String[] refrigeratorArray) {
		Refrigerator refrigerator = new Refrigerator();
		for (int i = 1; i < refrigeratorArray.length; i++) {
			if (refrigeratorArray[i].equals(SearchCriteria.Refrigerator.POWER_CONSUMPTION.toString())) {
				refrigerator.setPowerConsumption(Double.parseDouble(refrigeratorArray[i + 1]));
			} else if (refrigeratorArray[i].equals(SearchCriteria.Refrigerator.WEIGHT.toString())) {
				refrigerator.setWeight(Double.parseDouble(refrigeratorArray[i + 1]));
			} else if (refrigeratorArray[i].equals(SearchCriteria.Refrigerator.FREEZER_CAPACITY.toString())) {
				refrigerator.setFreezerCapacity(Double.parseDouble(refrigeratorArray[i + 1]));
			} else if (refrigeratorArray[i].equals(SearchCriteria.Refrigerator.OVERALL_CAPACITY.toString())) {
				refrigerator.setOverallCapacity(Double.parseDouble(refrigeratorArray[i + 1]));
			} else if (refrigeratorArray[i].equals(SearchCriteria.Refrigerator.HEIGHT.toString())) {
				refrigerator.setHeight(Double.parseDouble(refrigeratorArray[i + 1]));
			} else if (refrigeratorArray[i].equals(SearchCriteria.Refrigerator.WIDTH.toString())) {
				refrigerator.setWidth(Double.parseDouble(refrigeratorArray[i + 1]));
			} else if (refrigeratorArray[i].equals(SearchCriteria.Refrigerator.COST.toString())) {
				refrigerator.setCost(Double.parseDouble(refrigeratorArray[i + 1]));

			}
		}
		return refrigerator;
	}

	public Appliance VacuumCleanerInitialization(String[] vacuumCleanerArray) {
		VacuumCleaner vacuumCleaner = new VacuumCleaner();
		for (int i = 1; i < vacuumCleanerArray.length; i++) {
			if (vacuumCleanerArray[i].equals(SearchCriteria.VacuumCleaner.POWER_CONSUMPTION.toString())) {
				vacuumCleaner.setPowerConsumption(Double.parseDouble(vacuumCleanerArray[i + 1]));
			} else if (vacuumCleanerArray[i].equals(SearchCriteria.VacuumCleaner.FILTER_TYPE.toString())) {
				vacuumCleaner.setFilterType((vacuumCleanerArray[i + 1]));
			} else if (vacuumCleanerArray[i].equals(SearchCriteria.VacuumCleaner.BAG_TYPE.toString())) {
				vacuumCleaner.setBagType((vacuumCleanerArray[i + 1]));
			} else if (vacuumCleanerArray[i].equals(SearchCriteria.VacuumCleaner.WAND_TYPE.toString())) {
				vacuumCleaner.setWandType((vacuumCleanerArray[i + 1]));
			} else if (vacuumCleanerArray[i].equals(SearchCriteria.VacuumCleaner.MOTOR_SPEED_REGULATION.toString())) {
				vacuumCleaner.setMotorSpeedRegulation(Double.parseDouble(vacuumCleanerArray[i + 1]));
			} else if (vacuumCleanerArray[i].equals(SearchCriteria.VacuumCleaner.CLEANING_WIDTH.toString())) {
				vacuumCleaner.setCleaningWidth(Double.parseDouble(vacuumCleanerArray[i + 1]));
			} else if (vacuumCleanerArray[i].equals(SearchCriteria.VacuumCleaner.COST.toString())) {
				vacuumCleaner.setCost(Double.parseDouble(vacuumCleanerArray[i + 1]));

			}
		}

		return vacuumCleaner;

	}

	public Appliance SpeakersInitialization(String[] speakersArray) {
		Speakers speakers = new Speakers();
		for (int i = 1; i < speakersArray.length; i++) {
			if (speakersArray[i].equals(SearchCriteria.Speakers.POWER_CONSUMPTION.toString())) {
				speakers.setPowerConsumption(Double.parseDouble(speakersArray[i + 1]));
			} else if (speakersArray[i].equals(SearchCriteria.Speakers.NUMBER_OF_SPEAKERS.toString())) {
				speakers.setNumberOfSpeakers(Integer.parseInt(speakersArray[i + 1]));
			} else if (speakersArray[i].equals(SearchCriteria.Speakers.FREQUENCY_RANGE.toString())) {
				speakers.setFrequencyRange(speakersArray[i + 1]);
			} else if (speakersArray[i].equals(SearchCriteria.Speakers.CORD_LENGTH.toString())) {
				speakers.setCordLength(Double.parseDouble(speakersArray[i + 1]));
			} else if (speakersArray[i].equals(SearchCriteria.Speakers.COST.toString())) {
				speakers.setCost(Double.parseDouble(speakersArray[i + 1]));

			}

		}

		return speakers;
	}

}
