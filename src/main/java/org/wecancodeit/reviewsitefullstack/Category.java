package org.wecancodeit.reviewsitefullstack;

import java.util.Collection;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.OneToMany;

@Entity
public class Category {

	@Id
	@GeneratedValue

	private Long id;

	private String cName;
	private String cDesc;

	@OneToMany(mappedBy = "category")
	private Collection<Reviews> reviews;

	public Category(String cName, String cDesc) {
		super();
		this.cName = cName;
		this.cDesc = cDesc;
	}

	public Category() {

	}

	public Long getId() {
		return id;
	}

	public String getcName() {
		return cName;
	}

	public String getcDesc() {
		return cDesc;
	}

	public Collection<Reviews> getReviews() {
		return reviews;
	}

}
