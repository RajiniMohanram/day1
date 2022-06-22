package com.proj.app;

public interface Dao<T,K> {
	boolean add(T value);
	void show();
	T find(K id);
}
