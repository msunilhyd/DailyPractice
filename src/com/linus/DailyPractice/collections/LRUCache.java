package com.linus.DailyPractice.collections;

import java.util.LinkedHashMap;

public class LRUCache<K, V> extends LinkedHashMap<K, V>{
	
	private static final long serialVersionUID = -4622177786359540728L;
	private int size;
	
	private LRUCache(int size)
	{
		super(size, 0.75f, true);
		this.size = size;
	}
	
	/*
	@Override
	protected boolean removeEldestEntry(java.util.Map.Entry<K, V> eldest) {
		return size() > size;
	} */
	
	@Override
	protected boolean removeEldestEntry(java.util.Map.Entry<K, V> eldest) {
		return size() > size;
	}
	
	public static <K, V> LRUCache<K, V> newInstance(int size){
		return new LRUCache<>(size);
	}
	
}
