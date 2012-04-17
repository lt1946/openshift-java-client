/******************************************************************************* 
 * Copyright (c) 2011 Red Hat, Inc. 
 * Distributed under license by Red Hat, Inc. All rights reserved. 
 * This program is made available under the terms of the 
 * Eclipse Public License v1.0 which accompanies this distribution, 
 * and is available at http://www.eclipse.org/legal/epl-v10.html 
 * 
 * Contributors: 
 * Red Hat, Inc. - initial API and implementation 
 ******************************************************************************/
package com.openshift.internal.client;

import java.util.List;
import java.util.Map;

import com.openshift.client.ICartridge;
import com.openshift.client.IJenkinsApplication;
import com.openshift.client.OpenShiftException;
import com.openshift.internal.client.response.unmarshalling.dto.Link;

/**
 * @author William DeCoste
 * @author Andre Dietisheim
 */
public class JenkinsApplication extends ApplicationResource implements IJenkinsApplication {


	public JenkinsApplication(String name, String uuid, String creationTime, String applicationUrl, String gitUrl,
			String cartridge, List<String> aliases, Map<String, Link> links, DomainResource domain) {
		super(name, uuid, creationTime, applicationUrl, gitUrl, cartridge, aliases, links, domain);
		// TODO Auto-generated constructor stub
	}

	public JenkinsApplication(String name, String uuid, String creationTime, String creationLog, String applicationUrl,
			String gitUrl, String cartridge, List<String> aliases, Map<String, Link> links, DomainResource domain) {
		super(name, uuid, creationTime, creationLog, applicationUrl, gitUrl, cartridge, aliases, links, domain);
		// TODO Auto-generated constructor stub
	}

	public String getHealthCheckUrl() {
		return getApplicationUrl() + "login?from=%2F";
	}
	
	public String getHealthCheckResponse() throws OpenShiftException {
		return "<html>";
	}
}
