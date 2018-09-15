package mbm.handlers;

import mbm.init.BlockRegister;
import mbm.init.Blockinit;

public class RegistryHandler {
	
	public static void Client()
	{	
	}
	
	public static void Common()
	{
		
		Blockinit.init();
		BlockRegister.register();

	}

}
