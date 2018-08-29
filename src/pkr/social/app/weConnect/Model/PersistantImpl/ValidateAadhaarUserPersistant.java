package pkr.social.app.weConnect.Model.PersistantImpl;

import org.apache.log4j.Logger;
import org.hibernate.Criteria;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.criterion.Projections;
import org.hibernate.criterion.Restrictions;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import pkr.social.app.weConnect.Entitlies.wc_UserEntity;
import pkr.social.app.weConnect.Model.IPersistant.IValidateAadharUserPersistance;

@Repository
public class ValidateAadhaarUserPersistant implements IValidateAadharUserPersistance {

	private static final Logger logger = Logger.getLogger(ValidateAadhaarUserPersistant.class);

	@Autowired
	private SessionFactory _sessionFactory;

	@Override
	public Long _validateAadhaarUserFromDataStore(String _uid) {
		Long aadhaarCount = 0l;
		try {
			Session session = _sessionFactory.openSession();
			Criteria _criteriaForAadharValidation = session.createCriteria(wc_UserEntity.class);
			_criteriaForAadharValidation.add(Restrictions.eq("uid", _uid));
			_criteriaForAadharValidation.setProjection(Projections.rowCount());
			aadhaarCount = (Long) _criteriaForAadharValidation.uniqueResult();

		} catch (Exception e) {
			logger.error("[ INFO ]:[ ERROR WHILE VALIDATING FOR DUPLICATE AADHAAR CARD ] " + e.getMessage());
		}
		return aadhaarCount;
	}

}
