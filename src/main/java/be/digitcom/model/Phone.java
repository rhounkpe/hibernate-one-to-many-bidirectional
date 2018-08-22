package be.digitcom.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.ForeignKey;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

import org.hibernate.annotations.NaturalId;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Data
@NoArgsConstructor
@AllArgsConstructor
@Table(name = "`phones`")
public class Phone {

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Long id;
	
	@NaturalId
	@Column(name = "`number`", unique = true)
	private String number;
	
	@ManyToOne
	@JoinColumn(
			name = "person_id", 
			foreignKey = @ForeignKey(name = "PERSON_ID_FK")
	)
	private Person person;

	public Phone(String number, Person person) {
		super();
		this.number = number;
		this.person = person;
	}
	
	
}
