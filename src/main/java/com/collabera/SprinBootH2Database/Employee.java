package com.collabera.SprinBootH2Database;

import java.io.Serializable;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Employee implements Serializable {

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private long eid;
	private String name, addres, p_number;

	public long getEid() {
		return eid;
	}

	public void setEid(long eid) {
		this.eid = eid;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getAddres() {
		return addres;
	}

	public void setAddres(String addres) {
		this.addres = addres;
	}

	public String getP_number() {
		return p_number;
	}

	public void setP_number(String p_number) {
		this.p_number = p_number;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((addres == null) ? 0 : addres.hashCode());
		result = prime * result + (int) (eid ^ (eid >>> 32));
		result = prime * result + ((name == null) ? 0 : name.hashCode());
		result = prime * result + ((p_number == null) ? 0 : p_number.hashCode());
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Employee other = (Employee) obj;
		if (addres == null) {
			if (other.addres != null)
				return false;
		} else if (!addres.equals(other.addres))
			return false;
		if (eid != other.eid)
			return false;
		if (name == null) {
			if (other.name != null)
				return false;
		} else if (!name.equals(other.name))
			return false;
		if (p_number == null) {
			if (other.p_number != null)
				return false;
		} else if (!p_number.equals(other.p_number))
			return false;
		return true;
	}

	@Override
	public String toString() {
		return "Employee [eid=" + eid + ", name=" + name + ", addres=" + addres + ", p_number=" + p_number + "]";
	}

}
