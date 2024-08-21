package com;

public class Field<T> {
	private Class<T> type;
	private String name = null;
	private int attributes = 0;
	
	Field(String n, int attr, Class<T> c) {
		name = n;
		attributes |= attr;
		type = c;
	}
	
}
