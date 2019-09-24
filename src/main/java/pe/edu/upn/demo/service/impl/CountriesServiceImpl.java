package pe.edu.upn.demo.service.impl;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import pe.edu.upn.demo.model.entity.Countries;
import pe.edu.upn.demo.model.repository.CountriesRepository;
import pe.edu.upn.demo.service.CountriesService;


@Service
public class CountriesServiceImpl implements CountriesService {

	@Autowired
	private CountriesRepository countrieRepository;
	
	@Transactional(readOnly = true)
	@Override
	public List<Countries> findAll() throws Exception {
		return countrieRepository.findAll();
	}
	@Transactional(readOnly = true)
	@Override
	public Optional<Countries> findById(String id) throws Exception {
		return countrieRepository.findById(id);
	}
	@Transactional
	@Override
	public Countries save(Countries entity) throws Exception {
		return countrieRepository.save(entity);
	}
	@Transactional
	@Override
	public Countries update(Countries entity) throws Exception {
		return countrieRepository.save(entity);
	}
	@Transactional
	@Override
	public void deleteById(String id) throws Exception {
		countrieRepository.deleteById(id);
	}
	@Transactional
	@Override
	public void deleteAll() throws Exception {
		countrieRepository.deleteAll();
	}
}
