package hn.baas.lead.prospect;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ProspectService {
	
	@Autowired
	private ProspectRepository prospectRepo;
	
	
	public Prospect save(Prospect prspct){
		Prospect entity = prospectRepo.save(prspct);
		return entity;
	}
	public List<Prospect> findAll(){
		return prospectRepo.findAll();
	}
//	public Prospect findByProspectMail(String prospectMail) {
//		Iterable<Prospect> prospectLs = prospectRepo.findAll();
//		for(Prospect p : prospectLs) {
//			if(p.getProspectEmail().equals(prospectMail)) {
//				return p;
//			}
//		}
//		return null;
//	}
	public void delete(String prospectId) {
		prospectRepo.deleteById(prospectId);
	}
	
	
	public Prospect findById(String prospectId) {
		Optional<Prospect> entity = prospectRepo.findById(prospectId);
		if(entity.isPresent()) {
			return entity.get();
		}
		else {
			return null;
		}
	}
	
	
	public List<Prospect> findByProspectEmail(String prospectMail){
		return prospectRepo.findByProspectEmail(prospectMail);
	}

}
