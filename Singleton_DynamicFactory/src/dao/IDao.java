package dao;

import java.util.List;

public interface IDao <T>{ // generics
	
	void save(T t);
	
	T getOne(int id);
	
	

}