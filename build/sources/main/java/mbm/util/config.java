package mbm.util;

import org.apache.logging.log4j.Level;

import mbm.mbm;
import mbm.proxy.CommonProxy;
import net.minecraftforge.common.config.Configuration;

public class config {
	
	 private static final String CATEGORY_GENERAL = "general";

	    public static String test = "test";
	    public static int test_for;

	    public static void readConfig() {
	        Configuration cfg = CommonProxy.config;
	        try {
	            cfg.load();
	            initGeneralConfig(cfg);
	        } catch (Exception e1) {
	            mbm.logger.log(Level.ERROR, "Problem loading config file!", e1);
	        } finally {
	            if (cfg.hasChanged()) {
	                cfg.save();
	            }
	        }
	    }

	    private static void initGeneralConfig(Configuration cfg) {
	        cfg.addCustomCategoryComment(CATEGORY_GENERAL, "General configuration");
	        test = cfg.getString("realName", CATEGORY_GENERAL, test, "Set your real name here");
	        for(int i = 0; i<230; i++){
		        test_for = cfg.getInt("IDs", CATEGORY_GENERAL, test_for, i++, i++, "Set your Block IDs here");
	        }

	    }

}
