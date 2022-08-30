package by.tc.task01.dao.impl;

import java.io.BufferedReader;
import java.io.File;

import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;

import by.tc.task01.dao.ApplianceDAO;
import by.tc.task01.dao.DAOException;
import by.tc.task01.entity.Appliance;

import by.tc.task01.entity.criteria.Criteria;

public class FileApplianceDAOImpl implements ApplianceDAO {
	private static final String NAME_SOURCE = "Appliances_db.txt";

	@Override
	public List<Appliance> find(Criteria criteria) throws DAOException {

		List<Appliance> finishListAppliance = new ArrayList<Appliance>();
		ClassLoader loader = FileApplianceDAOImpl.class.getClassLoader();
		File filePath = new File(loader.getResource(NAME_SOURCE).getFile());

		try (BufferedReader bufferedReader = new BufferedReader(new FileReader(filePath));) {

			while (bufferedReader.ready()) {
				String foolLine = bufferedReader.readLine();
				if (foolLine.contains(criteria.getGroupSearchName()) || criteria.getGroupSearchName() == null) {
					boolean flag = true;

					for (Map.Entry<String, Object> entry : criteria.getCriteria().entrySet()) {

						String criteriaSearch = entry.getKey() + "=" + entry.getValue();
						if (!foolLine.contains(criteriaSearch)) {
							flag = false;
						}

					}
					if (flag) {
						finishListAppliance.add(searchAndCreateAppliances(foolLine));

					}

				}
			}

		} catch (IOException e) {
			throw new DAOException(e);
		}

		return finishListAppliance;
	}

	private Appliance searchAndCreateAppliances(String foolLine) throws DAOException {

		Appliance applianceSearch = new Appliance();
		InitializationDAO initDAO = InitializationDAO.getInstance();

		String[] wordsArray = foolLine.split("\\s*(\\:|=|,)\\s*");

		switch (wordsArray[0]) {
		case "TabletPC":
			applianceSearch = initDAO.tabletPCInitialization(wordsArray);
			break;
		case "Oven":
			applianceSearch = initDAO.OvenInitialization(wordsArray);
			break;
		case "Laptop":
			applianceSearch = initDAO.LaptopInitialization(wordsArray);
			break;
		case "Refrigerator":
			applianceSearch = initDAO.RefrigeratorInitialization(wordsArray);
			break;
		case "VacuumCleaner":
			applianceSearch = initDAO.VacuumCleanerInitialization(wordsArray);
			break;
		case "Speakers":
			applianceSearch = initDAO.SpeakersInitialization(wordsArray);
			break;
		default:
			throw new DAOException("Data error");

		}

		return applianceSearch;
	}

}
