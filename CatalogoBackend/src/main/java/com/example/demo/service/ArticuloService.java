package com.example.demo.service;

import java.util.List;
import java.util.Optional;
import java.util.function.Function;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Example;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.domain.Sort;
import org.springframework.data.repository.query.FluentQuery.FetchableFluentQuery;
import org.springframework.stereotype.Service;

import com.example.demo.model.Articulo;
import com.example.demo.repository.ArticuloRepository;

@Service
public class ArticuloService implements ArticuloRepository{
	
	@Autowired
	private ArticuloRepository articuloRepsitory;
	
	@Override
	public <S extends Articulo> List<S> findAll(Example<S> example) {
		// TODO Auto-generated method stub
		return articuloRepsitory.findAll(example);
	}

	@Override
	public <S extends Articulo> List<S> findAll(Example<S> example, Sort sort) {
		return articuloRepsitory.findAll(example, sort);
	}

	@Override
	public <S extends Articulo> List<S> saveAll(Iterable<S> entities) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<Articulo> findAll() {
		// TODO Auto-generated method stub
		return articuloRepsitory.findAll();
	}

	@Override
	public List<Articulo> findAllById(Iterable<Long> ids) {
		return articuloRepsitory.findAllById(ids);
	}

	@Override
	public <S extends Articulo> S save(S entity) {
		return articuloRepsitory.save(entity);
	}

	@Override
	public Optional<Articulo> findById(Long id) {
		// TODO Auto-generated method stub
		return articuloRepsitory.findById(id);
	}

	@Override
	public boolean existsById(Long id) {
		return articuloRepsitory.existsById(id);
	}

	@Override
	public long count() {
		return articuloRepsitory.count();
	}

	@Override
	public void deleteById(Long id) {
		articuloRepsitory.deleteAllById(null);
		
	}

	@Override
	public void delete(Articulo entity) {
		articuloRepsitory.delete(entity);
		
	}

	@Override
	public void deleteAllById(Iterable<? extends Long> ids) {
		articuloRepsitory.deleteAllById(ids);
		
	}

	@Override
	public void deleteAll(Iterable<? extends Articulo> entities) {
		// TODO Auto-generated method stub
		articuloRepsitory.deleteAll(entities);
	}

	@Override
	public void deleteAll() {
		articuloRepsitory.deleteAll();
		
	}

	@Override
	public List<Articulo> findAll(Sort sort) {
		// TODO Auto-generated method stub
		return articuloRepsitory.findAll(sort);
	}

	@Override
	public Page<Articulo> findAll(Pageable pageable) {
		// TODO Auto-generated method stub
		return articuloRepsitory.findAll(pageable);
	}

	@Override
	public <S extends Articulo> Page<S> findAll(Example<S> example, Pageable pageable) {
		// TODO Auto-generated method stub
		return articuloRepsitory.findAll(example, pageable);
	}

	@Override
	public <S extends Articulo> long count(Example<S> example) {
		return articuloRepsitory.count(example);
	}

	@Override
	public <S extends Articulo> boolean exists(Example<S> example) {
		// TODO Auto-generated method stub
		return articuloRepsitory.exists(example);
	}

	@Override
	public <S extends Articulo, R> R findBy(Example<S> example, Function<FetchableFluentQuery<S>, R> queryFunction) {
		// TODO Auto-generated method stub
		return articuloRepsitory.findBy(example, queryFunction);
	}

	@Override
	public void flush() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public <S extends Articulo> S saveAndFlush(S entity) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public <S extends Articulo> List<S> saveAllAndFlush(Iterable<S> entities) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void deleteAllInBatch(Iterable<Articulo> entities) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void deleteAllByIdInBatch(Iterable<Long> ids) {
		articuloRepsitory.deleteAllByIdInBatch(ids);
		
	}

	@Override
	public void deleteAllInBatch() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public Articulo getOne(Long id) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Articulo getById(Long id) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Articulo getReferenceById(Long id) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public <S extends Articulo> Optional<S> findOne(Example<S> example) {
		return articuloRepsitory.findOne(example);
	}
	
}
