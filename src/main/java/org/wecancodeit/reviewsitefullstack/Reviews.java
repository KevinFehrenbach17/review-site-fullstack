package org.wecancodeit.reviewsitefullstack;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Lob;
import javax.persistence.ManyToOne;

@Entity
public class Reviews {

	@Id
	@GeneratedValue

	private Long id;
	private String rName;
	private String rDesc;

	@ManyToOne
	private Category category;

	public Reviews() {

	}

	public Reviews(String rName, String rDesc, Category category) {
		this.rName = rName;
		this.rDesc = rDesc;
		this.category = category;
	}

	public Long getId() {
		return id;
	}

	public String getrName() {
		return rName;
	}

	@Lob
	public String getrDesc() {
		return rDesc;
	}

}
