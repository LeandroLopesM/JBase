package com;

public class Line {
	Field[] fields;
	public void addField( Field f ) {
		resize( fields.length + 1 );
	}
	
	private void resize( int ns ) {
		Field[] t = new Field[ns];
		
		int i = 0;
		for(Field f : fields) {
			t[i] = f;
			i++;
		}
		
	}
}
