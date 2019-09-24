package pe.edu.upn.demo.service.impl;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import pe.edu.upn.demo.model.entity.Regions;
import pe.edu.upn.demo.model.repository.RegionsRepository;
import pe.edu.upn.demo.service.RegionsService;

@Service
public class RegionsServiceImpl implements RegionsService {

	@Autowired
	private RegionsRepository regionRepository;
	
	@Transactional(readOnly = true)
	@Override
	public List<Regions> findAll() throws Exception {
		return regionRepository.findAll();
	}
	@Transactional(readOnly = true)
	@Override
	public Optional<Regions> findById(Integer id) throws Exception {
		return regionRepository.findById(id);
	}
	@Transactional
	@Override
	public Regions save(Regions entity) throws Exception {
		return regionRepository.save(entity);
	}
	@Transactional
	@Override
	public Regions update(Regions entity) throws Exception {
		return regionRepository.save(entity);
	}
	@Transactional
	@Override
	public void deleteById(Integer id) throws Exception {
		regionRepository.deleteById(id);
	}
	@Transactional
	@Override
	public void deleteAll() throws Exception {
		regionRepository.deleteAll();
	}
}
