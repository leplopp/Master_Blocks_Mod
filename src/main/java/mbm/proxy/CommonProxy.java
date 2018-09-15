package mbm.proxy;

import java.io.File;

import mbm.handlers.RegistryHandler;
import net.minecraftforge.common.config.Configuration;
import net.minecraftforge.fml.common.Mod.EventHandler;
import net.minecraftforge.fml.common.event.FMLInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPostInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPreInitializationEvent;

public class CommonProxy 
{
	
	 public static Configuration config;
	 
	public void preInit(FMLPreInitializationEvent event)
	{
		RegistryHandler.Common();
		
	    File directory = event.getModConfigurationDirectory();
        config = new Configuration(new File(directory.getPath(), "mbm.cfg"));
        //mbm.util.config.readConfig();

	}
	
	public void init(FMLInitializationEvent event)
	{
		
	}
	
	public void postInit(FMLPostInitializationEvent event)
	{
		 if (config.hasChanged()) {
	            config.save();
	        }
	}

}
