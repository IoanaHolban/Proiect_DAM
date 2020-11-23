package dam.tam4.service;

import java.util.Optional;

import javax.transaction.Transactional;
import org.springframework.stereotype.Service;

import dam.tam4.domain.Candidate;
import dam.tam4.domain.Internship;
import dam.tam4.repository.CandidateRepository;
import dam.tam4.repository.InternshipRepository;

@Service
@Transactional
public class InternshipService {
private final InternshipRepository iRepository;
	
	public InternshipService(InternshipRepository iRepository) {
		this.iRepository = iRepository;
	}
	
	public void addCandidate(Internship i) {
		Internship newInternship=new Internship();
		newInternship.setInternshipId(null);
		newInternship.setName(i.getName());
		newInternship.setType(i.getType());
		newInternship.setStartDate(i.getStartDate());
		newInternship.setEndDate(i.getEndDate());
		newInternship.setIsPaid(i.getIsPaid());
		newInternship.setCandidates(i.getCandidates());
		
		iRepository.save(newInternship);
	}
	
	public void deleteCandidate(Internship i) {
		iRepository.delete(i);
	}
	


}
