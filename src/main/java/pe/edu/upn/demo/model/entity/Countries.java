package pe.edu.upn.demo.model.entity;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.Table;

@Entity
@Table(name="Countries")
public class Countries {
	@Id
	@Column(name="country_id",length=2,nullable=false)
	private String country_id;
	@Column(name="country_name",length=40,nullable=false)
	private String country_name;
	
	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "region_id")
	private Regions region;
	
	@OneToMany(mappedBy = "countrie", fetch = FetchType.LAZY)
	private List<Locations> locations;
	
	public Countries() {
		locations = new ArrayList<>();
	}
	
	public void addLocation(Locations location) {
		location.setCountrie(this);
		this.locations.add(location);
	}

	public String getCountry_id() {
		return country_id;
	}

	public void setCountry_id(String country_id) {
		this.country_id = country_id;
	}

	public String getCountry_name() {
		return country_name;
	}

	public void setCountry_name(String country_name) {
		this.country_name = country_name;
	}

	public Regions getRegion() {
		return region;
	}

	public void setRegion(Regions region) {
		this.region = region;
	}

	public List<Locations> getLocations() {
		return locations;
	}

	public void setLocations(List<Locations> locations) {
		this.locations = locations;
	}
}
