package bundle2.impl;

import org.osgi.framework.BundleActivator;
import org.osgi.framework.BundleContext;

import bundle1.api.Bundle1Interface;
import bundle1.impl.Bundle1Implementation;

public class Bundle2Implementation implements BundleActivator {

	public Bundle2Implementation() {
	}

	@Override
	public void start(BundleContext context) throws Exception {

		Bundle1Interface bundle1 = new Bundle1Implementation();
		System.out.println(bundle1.helo("Bundle2Implementation"));

	}

	@Override
	public void stop(BundleContext context) throws Exception {
	}
}
