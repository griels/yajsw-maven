package org.rzo.yajsw.os.posix;

import org.apache.commons.configuration.BaseConfiguration;
import org.apache.commons.configuration.Configuration;
import org.jboss.netty.logging.InternalLogger;
import org.rzo.yajsw.os.JavaHome;

public class PosixJavaHome implements JavaHome
{
	Configuration	_config;
	InternalLogger _logger;

	public PosixJavaHome(Configuration config)
	{
		if (config != null)
			_config = config;
		else
			_config = new BaseConfiguration();
	}

	public String findJava(String wrapperJava, String customProcessName)
	{
		// find / -name java
		// TODO
		return wrapperJava == null ? "java" : wrapperJava;
	}
	
	public void setLogger(InternalLogger logger)
	{
		_logger = logger;
	}

}
