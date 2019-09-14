package com.market.pattern;
import java.util.List;

public interface IRepository<T> {
		
	List <T> getAll();
	void add (T name);
	void delete(T name);
	void update (T name);
}
