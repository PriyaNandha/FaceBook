package com.config.facebook;

import java.io.IOException;


public class FbConfigHelper {
	
	private FbConfigHelper() {
		
	}
	
	public static FbConfigReader getInstance() throws IOException {
		
		FbConfigReader amzreader = new FbConfigReader();
		
		return amzreader;
		
	}
	

}
