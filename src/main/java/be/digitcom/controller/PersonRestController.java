package be.digitcom.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import be.digitcom.model.Person;
import be.digitcom.repository.IPersonRepository;

@RestController
@RequestMapping("/people")
public class PersonRestController {

	@Autowired
	private IPersonRepository iPersonRepository;
	
	@GetMapping(value = {"", "/"})
	public List<Person> getAll() {
		return iPersonRepository.findAll();
	}
}
