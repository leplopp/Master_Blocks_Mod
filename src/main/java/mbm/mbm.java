package mbm;

import org.apache.http.util.Args;
import org.apache.logging.log4j.Logger;

import ca.weblite.objc.Client;
import mbm.init.BlockMaker;
import mbm.proxy.CommonProxy;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.init.Blocks;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.common.Mod.EventHandler;
import net.minecraftforge.fml.common.Mod.Instance;
import net.minecraftforge.fml.common.SidedProxy;
import net.minecraftforge.fml.common.event.FMLInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPostInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPreInitializationEvent;
import net.minecraftforge.fml.relauncher.Side;
import net.minecraftforge.fml.relauncher.SideOnly;

@Mod(modid = Reference.MODID, name = Reference.NAME, version = Reference.VERSION, dependencies="after:*", useMetadata = true)
public class mbm
{
	
	@SidedProxy(clientSide = Reference.CLIENTPROXY, serverSide = Reference.COMMONPROXY)
	public static CommonProxy proxy;
	
	@SideOnly(Side.CLIENT)
	@Instance
	public static mbm INSTANCE;
    public static Logger logger;

    @EventHandler
	public static void preInit(FMLPreInitializationEvent event)
	{
    
		proxy.preInit(event);
		  logger = event.getModLog();
	}
	
	@EventHandler
	public static void init(FMLInitializationEvent event)
	{
		proxy.init(event);
	}
	
	@EventHandler
	public static void postInit(FMLPostInitializationEvent event)
	{
		proxy.postInit(event);
	}
	
	public static final CreativeTabs tabmbm = new CreativeTabs("tabmbm") {

		@Override
		public ItemStack getTabIconItem() {
			return new ItemStack(BlockMaker.STRUCTURE_SLOPE) ;
		
		}
		
	};
}

		

