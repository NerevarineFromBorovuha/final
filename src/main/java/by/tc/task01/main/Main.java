package by.tc.task01.main;

import static by.tc.task01.entity.criteria.SearchCriteria.*;

import java.util.List;

import by.tc.task01.entity.Appliance;
import by.tc.task01.entity.criteria.Criteria;
import by.tc.task01.entity.criteria.SearchCriteria;
import by.tc.task01.service.ApplianceService;
import by.tc.task01.service.ServiceException;
import by.tc.task01.service.ServiceFactory;
import by.tc.task01.service.validation.ValidatorException;

public class Main {

	public static void main(String[] args) throws ServiceException {
		List<Appliance> appliances;

		ServiceFactory factory = ServiceFactory.getInstance();
		ApplianceService service = factory.getApplianceService();

		//////////////////////////////////////////////////////////////////

//		Criteria criteriaOven = new Criteria(Oven.class.getSimpleName());
//		criteriaOven.add(Oven.CAPACITY.toString(), 33);
//
//		appliances = service.find(criteriaOven);
//		
//		PrintApplianceInfo.print(appliances);

		//////////////////////////////////////////////////////////////////

		Criteria criteriaTabletPC = new Criteria(TabletPC.class.getSimpleName());
		//Criteria criteriaTabletPC = new Criteria();
		criteriaTabletPC.add(TabletPC.FLASH_MEMORY_CAPACITY.toString(), 2);
		criteriaTabletPC.add(TabletPC.MEMORY_ROM.toString(), 7000);
		//criteriaTabletPC.add(TabletPC.COLOR.toString(), "blue");

		try {
			appliances = service.find(criteriaTabletPC);
			PrintApplianceInfo.print(appliances);
		} catch (ValidatorException e) {
			throw new ServiceException(e);
		}

		

	}

}
