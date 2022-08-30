package by.tc.task01.service;

import java.util.List;

import by.tc.task01.entity.Appliance;
import by.tc.task01.entity.criteria.Criteria;
import by.tc.task01.service.validation.ValidatorException;

public interface ApplianceService {	
	
	List<Appliance> find(Criteria criteria) throws ServiceException, ValidatorException ;
	
}
