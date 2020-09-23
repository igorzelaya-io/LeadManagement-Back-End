package hn.baas.lead.prospect;

import java.util.List;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ProspectRepository extends CrudRepository<Prospect,String> {
	public List<Prospect> findByProspectEmail(String prospectMail);
	
	
	@Override
	List<Prospect> findAll();
}
