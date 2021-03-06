package com.ethan.java.dellhotdeals.entity;

import java.util.Date;
import java.util.List;

/**
 * Class representing an instance of a Web object
 */
public class DealPageEntity {

	private String uri = null;
	private List<String> content = null;
	private List<String> prices  = null;
	//private String content = null;
	private String contentType = null;
	private Date timestamp = null;
	private int statusCode = 0;
	
	/**
	 * Constructor
	 * 
	 * @param content The string representing the content of the object
	 * @param contentType The MIME type of the object
	 * @param date The date the content was retrieved
	 */
	public DealPageEntity(String uri, List<String> content, List<String> prices, String contentType,
			Date timestamp, int statusCode) {
		
		if(uri == null || content == null || timestamp == null) {
			throw new IllegalArgumentException("content, timestamp and uri parameters cannot be null");
		}
		this.uri = uri;
		this.content = content;
		this.prices = prices;
		this.contentType = contentType;
		this.timestamp = timestamp;
		this.statusCode = statusCode;
	}
	
	
	/**
	 * Get the URI
	 * 
	 * @return the uri
	 */
	public String getUri() {
		return uri;
	}

	/**
	 * Set the URI
	 * 
	 * @param uri the uri to set
	 */
	public void setUri(String uri) {
		this.uri = uri;
	}


	/**
	 * Get the content
	 * 
	 * @return the content
	 */
	public List<String> getContent() {
		return content;
	}
	
	/**
	 * Set the content
	 * 
	 * @param content the content to set
	 */
	public void setContent(List<String> content) {
		this.content = content;
	}
	
	/**
	 * Get the prices
	 * 
	 * @return the prices
	 */
	public List<String> getPrices() {
		return prices;
	}
	
	/**
	 * Set the prices
	 * 
	 * @param content the content to set
	 */
	public void setPrices(List<String> prices) {
		this.prices = prices;
	}
	
	/**
	 * Get the content type
	 * 
	 * @return the contentType
	 */
	public String getContentType() {
		return contentType;
	}

	/**
	 * Set the content type
	 * 
	 * @param contentType the contentType to set
	 */
	public void setContentType(String contentType) {
		this.contentType = contentType;
	}

	/**
	 * Get the timestamp the content was retrieved
	 * 
	 * @return the timestamp
	 */
	public Date getTimestamp() {
		return timestamp;
	}
	
	/**
	 * Set the timestamp the content was retrieved
	 * 
	 * @param timestamp the timestamp to set
	 */
	public void setTimestamp(Date timestamp) {
		this.timestamp = timestamp;
	}

	/**
	 * Get the status code
	 * 
	 * @return the statusCode
	 */
	public int getStatusCode() {
		return statusCode;
	}

	/**
	 * Set the status code
	 * 
	 * @param statusCode the statusCode to set
	 */
	public void setStatusCode(int statusCode) {
		this.statusCode = statusCode;
	}
	
}