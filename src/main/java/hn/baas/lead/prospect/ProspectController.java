package hn.baas.lead.prospect;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ProspectController {
	
	@Autowired
	private ProspectService prospectServ;
	
	@PostMapping("/prospects")
	public ResponseEntity<Object> createProspect(@RequestBody Prospect prospect){
		prospectServ.save(prospect);
		return new ResponseEntity<>("Prospect was created Succesfully",HttpStatus.OK);
	}
	
	@GetMapping("/prospects")
	public ResponseEntity<List<Prospect>> findByProspectEmail(@RequestParam(required = false)String prospectMail){
		List<Prospect> prospectList = null;
		if(prospectMail == null){
			prospectList = prospectServ.findAll();
		}
		else{
			prospectList = prospectServ.findByProspectEmail(prospectMail);
		}
		return new ResponseEntity<List<Prospect>>(prospectList,HttpStatus.OK);
	}
	
	@DeleteMapping("/prospects")
	public ResponseEntity<Object> deleteProspect(@RequestParam(required = true)String prospectId){
		prospectServ.delete(prospectId);
		return new ResponseEntity<>("Prospect was deleted Successfully",HttpStatus.OK);
	}
	
}