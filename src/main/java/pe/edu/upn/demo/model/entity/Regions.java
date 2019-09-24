package pe.edu.upn.demo.model.entity;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;

@Entity
@Table(name="Regions")
public class Regions {
	@Id
	@Column(name="region_id",length=4,nullable=false)
	private Integer region_id;
	@Column(name="region_name",length=25,nullable=false)
	private String region_name;
	
	@OneToMany(mappedBy = "region", fetch = FetchType.LAZY)
	private List<Countries> countries;
	
	public Regions() {
		this.countries = new ArrayList<>();
	}
	
	public void addCountrie(Countries countrie) {
		countrie.setRegion(this);
		this.countries.add(countrie);
	}

	public Integer getRegion_id() {
		return region_id;
	}

	public void setRegion_id(Integer region_id) {
		this.region_id = region_id;
	}

	public String getRegion_name() {
		return region_name;
	}

	public void setRegion_name(String region_name) {
		this.region_name = region_name;
	}

	public List<Countries> getCountries() {
		return countries;
	}

	public void setCountries(List<Countries> countries) {
		this.countries = countries;
	} 
	
} 
