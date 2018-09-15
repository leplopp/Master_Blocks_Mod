package mbm.init;

import mbm.Reference;
import mbm.mbm;
import net.minecraft.block.Block;
import net.minecraft.block.state.IBlockState;
import net.minecraft.client.renderer.block.model.ModelResourceLocation;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.Item;
import net.minecraft.item.ItemBlock;
import net.minecraft.util.ResourceLocation;
import net.minecraft.util.registry.RegistryNamespacedDefaultedByKey;
import net.minecraftforge.client.model.ModelLoader;
import net.minecraftforge.fml.common.registry.ForgeRegistries;

public class BlockRegister {
	

	public static void register()
	{


		registerBlock(BlockMaker.STONE_SLOPE,  mbm.tabmbm);
		registerBlock(BlockMaker.GRANITE_SLOPE,  mbm.tabmbm);
		registerBlock(BlockMaker.SMOOTH_GARNITE_SLOPE,  mbm.tabmbm);
		registerBlock(BlockMaker.DIORITE_SLOPE,  mbm.tabmbm);
		registerBlock(BlockMaker.SMOOTH_DIORITE_SLOPE,  mbm.tabmbm);
		registerBlock(BlockMaker.ANDESITE_SLOPE,  mbm.tabmbm);
		registerBlock(BlockMaker.SMOOTH_ANDESTITE_SLOPE,  mbm.tabmbm);
		registerBlock(BlockMaker.GRASS_SLOPE,  mbm.tabmbm);
		
		
		
		
		
		
		
		
		registerBlock(BlockMaker.GLASS_SLOPE,  mbm.tabmbm);
	
	}
	
	
	public static void registerBlock(Block block, CreativeTabs tab)
	{
		ForgeRegistries.BLOCKS.register(block);
		block.setCreativeTab(tab);
		ItemBlock item = new ItemBlock(block);
		item.setRegistryName(block.getRegistryName());
		ForgeRegistries.ITEMS.register(item);
		
		ModelLoader.setCustomModelResourceLocation(Item.getItemFromBlock(block), 0, new ModelResourceLocation(block.getRegistryName(), "inventory"));
	}
	
	public static void registerRender(Block block, int meta, String filename)
	{
		ModelLoader.setCustomModelResourceLocation(Item.getItemFromBlock(block), meta, new ModelResourceLocation(new ResourceLocation(Reference.MODID, filename), "inventory"));
	}

}
