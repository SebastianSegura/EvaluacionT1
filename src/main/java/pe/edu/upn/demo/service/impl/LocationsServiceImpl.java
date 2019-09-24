package pe.edu.upn.demo.service.impl;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import pe.edu.upn.demo.model.entity.Locations;
import pe.edu.upn.demo.model.repository.LocationsRepository;
import pe.edu.upn.demo.service.LocationsService;

@Service
public class LocationsServiceImpl implements LocationsService {

	@Autowired
	private LocationsRepository locationRepository;
	
	@Transactional(readOnly = true)
	@Override
	public List<Locations> findAll() throws Exception {
		return locationRepository.findAll();
	}
	@Transactional(readOnly = true)
	@Override
	public Optional<Locations> findById(Integer id) throws Exception {
		return locationRepository.findById(id);
	}
	@Transactional
	@Override
	public Locations save(Locations entity) throws Exception {
		return locationRepository.save(entity);
	}
	@Transactional
	@Override
	public Locations update(Locations entity) throws Exception {
		return locationRepository.save(entity);
	}
	@Transactional
	@Override
	public void deleteById(Integer id) throws Exception {
		locationRepository.deleteById(id);
	}
	@Transactional
	@Override
	public void deleteAll() throws Exception {
		locationRepository.deleteAll();
	}
}
