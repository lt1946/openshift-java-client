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

import java.util.Map;

import com.openshift.client.ICartridge;
import com.openshift.client.IJBossASApplication;
import com.openshift.client.OpenShiftException;
import com.openshift.internal.client.response.unmarshalling.dto.Link;

/**
 * @author William DeCoste
 * @author Andre Dietisheim
 */
public class JBossASApplication extends Application implements IJBossASApplication {

	

	public JBossASApplication(String name, String uuid, String creationTime, ICartridge cartridge,
			Map<String, Link> links, Domain domain) {
		super(name, uuid, creationTime, cartridge, links, domain);
		// TODO Auto-generated constructor stub
	}

	public JBossASApplication(String name, String uuid, String creationTime, String creationLog, ICartridge cartridge,
			Map<String, Link> links, Domain domain) {
		super(name, uuid, creationTime, creationLog, cartridge, links, domain);
		// TODO Auto-generated constructor stub
	}

	public String threadDump() throws OpenShiftException {
		throw new UnsupportedOperationException();
//		service.threadDumpApplication(name, cartridge, getInternalUser());
//		
//		return "stdout.log";
	}
	
	public String getHealthCheckUrl() throws OpenShiftException {
		return getApplicationUrl() + "/health";
	}
	
	public String getHealthCheckResponse() throws OpenShiftException {
		return "1";
	}

}
