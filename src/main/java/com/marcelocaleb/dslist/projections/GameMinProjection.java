package com.marcelocaleb.dslist.projections;

public interface GameMinProjection {
	
	//São métodos correspondestes a consulta.
	Long getId();
	String getTitle();
	Integer getYear();
	String getImgUrl();
	String getShortDescription();
	Integer getPosition();

}
