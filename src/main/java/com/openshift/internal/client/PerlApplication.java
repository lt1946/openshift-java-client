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

import com.openshift.client.ICartridge;
import com.openshift.client.IPerlApplication;

/**
 * @author William DeCoste
 * @author Andre Dietisheim
 */
public class PerlApplication extends Application implements IPerlApplication {

	public PerlApplication(String name, String uuid, String creationLog, String healthCheckPath, ICartridge cartridge,
			User user, IRestService service) {
		super(name, uuid, creationLog, healthCheckPath, cartridge, user, service);
	}

	public PerlApplication(String name, String uuid, ICartridge cartridge, ApplicationInfo applicationInfo, User user,
			IRestService service) {
		super(name, uuid, cartridge, applicationInfo, user, service);
	}
}