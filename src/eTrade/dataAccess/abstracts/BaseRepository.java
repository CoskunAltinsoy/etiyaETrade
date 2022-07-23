package eTrade.dataAccess.abstracts;

import java.util.List;

import eTrade.entities.concretes.Product;

public interface BaseRepository<T> {
	void add(T  entity);
	void delete(T entity);
	void update(T entity);
	List<T> getAll();
	T getById(int id);

}
