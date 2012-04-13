package org.rzo.yajsw.os.posix;

import org.apache.commons.configuration.Configuration;
import org.rzo.yajsw.os.Mouse;
import org.rzo.yajsw.os.OperatingSystem;

public abstract class OperatingSystemPosix extends OperatingSystem
{
	@Override
	public boolean setWorkingDir(String name)
	{
		return new PosixProcess().setWorkingDirectory(name);
	}
	@Override
	public Mouse mouseInstance()
	{
		return PosixMouse.instance();
	}
	
	@Override
	public Object getServiceFailureActions(Configuration config)
	{
		return null;
	}





}
