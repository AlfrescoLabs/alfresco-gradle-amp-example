/*
 * Copyright (C) 2005-2012 Alfresco Software Limited.
 * 
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *     http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package com.example.ampgradleexample;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import java.io.IOException;
import java.io.InputStream;
import java.util.Properties;

/**
 * Simple class which gets a message from a properties file.
 */
public class MyMessage {

	private static final Log logger = LogFactory.getLog(MyMessage.class);
	
	public String getMessage() {
		String message = null;
		try {
			Properties properties = getProperties();
			logger.debug("found properties file, retrieving message");
			message = properties.getProperty("message");
		} catch (IOException e) {
			message = e.getMessage();
		}
		return message;
	}
	
	private Properties getProperties() throws IOException {
		String className = this.getClass().getName();
        className = className.replace('$', '-').replace('.', '/') + ".properties";
        InputStream inputStream = getClass().getClassLoader().getResourceAsStream(className);
        if(inputStream == null) {
        	throw new IOException(className + " not found");
        }
    	Properties properties = new Properties();
    	properties.load(inputStream);
    	return properties;
	}

}
