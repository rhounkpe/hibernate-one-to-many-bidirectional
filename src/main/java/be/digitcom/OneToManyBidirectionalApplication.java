package be.digitcom;

import java.util.ArrayList;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

import antlr.collections.List;
import be.digitcom.model.Person;
import be.digitcom.model.Phone;
import be.digitcom.repository.IPersonRepository;
import be.digitcom.repository.IPhoneRepository;

@SpringBootApplication
public class OneToManyBidirectionalApplication {

	@Autowired
	private IPersonRepository personRepository;
	
	@Autowired
	private IPhoneRepository phoneRepository;
	

	
	public static void main(String[] args) {
		SpringApplication.run(OneToManyBidirectionalApplication.class, args);
	}
	
	@Bean
	CommandLineRunner runIt() {
		
		return args -> {
			//List<Phone> phones = new ArrayList<>();
			Person rufin = new Person("Rufin");
			Person metogbe = new Person("Mêtogbé");
			
			Phone phone1 = new Phone("0484979320", rufin);
			Phone phone2 = new Phone("0484979321", rufin);
			
			//phones.add(phone1);
			//phones.add(phone2);
			
			personRepository.save(rufin);
			personRepository.save(metogbe);
			//rufin.setPhones(phones);
			

		};
	}
}
