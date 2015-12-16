package org.camunda.bpm.unittest;

import java.io.Serializable;

public class Partner implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 5485796464209026292L;
	private String name;
	private Integer alter;
	private Boolean aktiv;

	public Partner() {
		
		// TODO Auto-generated constructor stub
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Integer getAlter() {
		return alter;
	}

	public void setAlter(Integer alter) {
		this.alter = alter;
	}

	public Boolean getAktiv() {
		return aktiv;
	}

	public void setAktiv(Boolean aktiv) {
		this.aktiv = aktiv;
	}

}
