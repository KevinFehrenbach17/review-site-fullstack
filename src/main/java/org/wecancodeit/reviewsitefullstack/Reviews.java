package org.wecancodeit.reviewsitefullstack;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

@Entity
public class Reviews {

	@Id
	@GeneratedValue

	private Long id;
	private String rName;
	private String rDesc;

	public Reviews(String rName, String rDesc) {
		super();
		this.rName = rName;
		this.rDesc = rDesc;
	}

	public Reviews() {

	}

	public Long getId() {
		return id;
	}

	public String getrName() {
		return rName;
	}

	public String getrDesc() {
		return rDesc;
	}

}
