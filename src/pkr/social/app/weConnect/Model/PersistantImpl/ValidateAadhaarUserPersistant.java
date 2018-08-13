package pkr.social.app.weConnect.Model.PersistantImpl;



import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import pkr.social.app.weConnect.Model.IPersistant.IValidateAadharUserPersistance;

@Repository
public class ValidateAadhaarUserPersistant implements IValidateAadharUserPersistance {

	@Autowired
	private SessionFactory _sessionFactory;

	@Override
	public boolean _validateAadhaarUserFromDataStore(String _uid) {

		Session session=_sessionFactory.openSession();
		Transaction transaction=null;
		transaction=session.beginTransaction();
		/*session.get*/
		
		return false;
	}

}
