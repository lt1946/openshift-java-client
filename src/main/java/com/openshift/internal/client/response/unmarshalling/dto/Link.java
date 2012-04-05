/******************************************************************************* 
 * Copyright (c) 2012 Red Hat, Inc. 
 * Distributed under license by Red Hat, Inc. All rights reserved. 
 * This program is made available under the terms of the 
 * Eclipse Public License v1.0 which accompanies this distribution, 
 * and is available at http://www.eclipse.org/legal/epl-v10.html 
 * 
 * Contributors: 
 * Red Hat, Inc. - initial API and implementation 
 ******************************************************************************/
package com.openshift.internal.client.response.unmarshalling.dto;

import java.util.List;

import com.openshift.client.HttpMethod;

/**
 * The Class Link.
 *
 * @author Xavier Coulon
 */
public class Link {

	/** The rel. */
	private final String rel;
	
	/** The href. */
	private final String href;
	
	/** The http method. */
	private final HttpMethod httpMethod;
	
	/** The required params. */
	private final List<LinkParameter> requiredParams;
	
	/** The optional params. */
	private final List<LinkParameter> optionalParams;
	
	public Link(final String rel, final String href, final HttpMethod httpMethod) {
		this(rel, href, httpMethod, null, null);
	}

	public Link(final String rel, final String href, final String httpMethod,
			final List<LinkParameter> requiredParams, final List<LinkParameter> optionalParams) {
		this(rel, href, HttpMethod.valueOf(httpMethod), requiredParams, optionalParams);
	}
	
	/**
	 * Instantiates a new link.
	 *
	 * @param rel the rel
	 * @param href the href
	 * @param httpMethod the http method
	 * @param requiredParams the required params
	 * @param optionalParams the optional params
	 */
	public Link(final String rel, final String href, final HttpMethod httpMethod,
			final List<LinkParameter> requiredParams, final List<LinkParameter> optionalParams) {
		this.rel = rel;
		this.href = href;
		this.httpMethod = httpMethod;
		this.requiredParams = requiredParams;
		this.optionalParams = optionalParams;
	}

	/**
	 * Gets the rel.
	 *
	 * @return the rel
	 */
	public final String getRel() {
		return rel;
	}

	/**
	 * Gets the href.
	 *
	 * @return the href
	 */
	public final String getHref() {
		return href;
	}

	/**
	 * Gets the http method.
	 *
	 * @return the httpMethod
	 */
	public final HttpMethod getHttpMethod() {
		return httpMethod;
	}

	/**
	 * Gets the required params.
	 *
	 * @return the requiredParams
	 */
	public final List<LinkParameter> getRequiredParams() {
		return requiredParams;
	}

	/**
	 * Gets the optional params.
	 *
	 * @return the optionalParams
	 */
	public final List<LinkParameter> getOptionalParams() {
		return optionalParams;
	}

}