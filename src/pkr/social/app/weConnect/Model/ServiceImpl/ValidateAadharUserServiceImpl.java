package pkr.social.app.weConnect.Model.ServiceImpl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import pkr.social.app.weConnect.Model.IPersistant.IValidateAadharUserPersistance;
import pkr.social.app.weConnect.Model.IService.IValidateAadharUser;

@Service
public class ValidateAadharUserServiceImpl implements IValidateAadharUser {

	@Autowired
	private IValidateAadharUserPersistance validateAadharUserFromdataStore;

	@Override
	public boolean _validateAadhaarUser(String _uid) {

		Long aadhaarCount = validateAadharUserFromdataStore._validateAadhaarUserFromDataStore(_uid);
		if (aadhaarCount <= 0)
			return true;
		else
			return false;
	}

}
