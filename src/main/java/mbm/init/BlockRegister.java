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
		registerBlock(BlockMaker.FULL_GRASS,  CreativeTabs.BUILDING_BLOCKS);
		registerBlock(BlockMaker.DIRT_SLOPE,  mbm.tabmbm);
		registerBlock(BlockMaker.COARSE_DIRT_SLOPE,  mbm.tabmbm);
		registerBlock(BlockMaker.PODZOL_SLOPE,  mbm.tabmbm);
		registerBlock(BlockMaker.COBBLESTONE_SLOPE,  mbm.tabmbm);
		registerBlock(BlockMaker.FULL_PODZOL,  CreativeTabs.BUILDING_BLOCKS);
		registerBlock(BlockMaker.OAK_PLANKS_SLOPE,  mbm.tabmbm);
		registerBlock(BlockMaker.SPRUCE_PLANKS_SLOPE,  mbm.tabmbm);
		registerBlock(BlockMaker.BIRCH_PLANKS_SLOPE,  mbm.tabmbm);
		registerBlock(BlockMaker.JUNGLE_PLANKS_SLOPE,  mbm.tabmbm);
		registerBlock(BlockMaker.ACACIA_PLANKS_SLOPE,  mbm.tabmbm);
		registerBlock(BlockMaker.DARK_OAK_PLANKS_SLOPE,  mbm.tabmbm);
		registerBlock(BlockMaker.BEDROCK_SLOPE,  mbm.tabmbm);
		registerBlock(BlockMaker.SAND_SLOPE,  mbm.tabmbm);
		registerBlock(BlockMaker.RED_SAND_SLOPE,  mbm.tabmbm);
		registerBlock(BlockMaker.GRAVEL_SLOPE,  mbm.tabmbm);
		registerBlock(BlockMaker.GOLD_ORE_SLOPE,  mbm.tabmbm);
		registerBlock(BlockMaker.IRON_ORE_SLOPE,  mbm.tabmbm);
		registerBlock(BlockMaker.COAL_ORE_SLOPE,  mbm.tabmbm);
		registerBlock(BlockMaker.LAPIS_ORE_SLOPE,  mbm.tabmbm);
		registerBlock(BlockMaker.DIAMOND_ORE_SLOPE,  mbm.tabmbm);
		registerBlock(BlockMaker.REDSTONE_ORE_SLOPE,  mbm.tabmbm);
		registerBlock(BlockMaker.EMERALD_ORE_SLOPE,  mbm.tabmbm);
		registerBlock(BlockMaker.QUARTZ_ORE_SLOPE,  mbm.tabmbm);
		registerBlock(BlockMaker.OAK_LOG_SLOPE,  mbm.tabmbm);
		registerBlock(BlockMaker.SPRUCE_LOG_SLOPE,  mbm.tabmbm);
		registerBlock(BlockMaker.BIRCH_LOG_SLOPE,  mbm.tabmbm);
		registerBlock(BlockMaker.JUNGLE_LOG_SLOPE,  mbm.tabmbm);
		registerBlock(BlockMaker.ACACIA_LOG_SLOPE,  mbm.tabmbm);
		registerBlock(BlockMaker.DARK_OAK_LOG_SLOPE,  mbm.tabmbm);
		
		
		
		//registerBlock(BlockMaker.GLASS_SLOPE,  mbm.tabmbm);
	
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
