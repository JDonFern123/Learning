package com.strange.learn.utility;

import org.apache.logging.log4j.Level;

import com.strange.learn.reference.Reference;

import cpw.mods.fml.common.FMLLog;

public class LogHelper
{
	public static void log (Level logLevel, Object object)
	{
		FMLLog.log(Reference.MOD_NAME, logLevel, String.valueOf(object));
	}
	
	public static void all(Object object) { log(Level.ALL,object); }
	//Not sure if shows by default
	
	public static void debug(Object object) { log(Level.DEBUG, object); }
	//Does not show by default
	
	public static void error (Object object) { log(Level.ERROR, object); }
	
	public static void fatal(Object object) { log(Level.FATAL, object); }
	
	public static void info(Object object) { log(Level.INFO, object); }
	
	public static void off(Object object) { log(Level.OFF, object); }
	
	public static void trace(Object object) { log(Level.TRACE, object); }
	//Does not show by default
	
	public static void warn(Object object) { log(Level.WARN, object); }
	
}
