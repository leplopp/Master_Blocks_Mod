package mbm.init.Blocks;

import java.util.Random;

import mbm.Reference;
import mbm.mbm;
import mbm.init.BlockMaker;
import net.minecraft.block.Block;
import net.minecraft.block.BlockGrass;
import net.minecraft.block.BlockStairs;
import net.minecraft.block.SoundType;
import net.minecraft.block.material.MapColor;
import net.minecraft.block.material.Material;
import net.minecraft.block.state.IBlockState;
import net.minecraft.client.renderer.color.BlockColors;
import net.minecraft.client.renderer.color.IBlockColor;
import net.minecraft.client.renderer.color.IItemColor;
import net.minecraft.client.renderer.color.ItemColors;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.item.ItemBlock;
import net.minecraft.item.ItemStack;
import net.minecraft.util.BlockRenderLayer;
import net.minecraft.util.EnumFacing;
import net.minecraft.util.math.BlockPos;
import net.minecraft.world.ColorizerGrass;
import net.minecraft.world.IBlockAccess;
import net.minecraft.world.World;
import net.minecraft.world.biome.BiomeColorHelper;
import net.minecraftforge.client.event.ColorHandlerEvent;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.common.eventhandler.SubscribeEvent;
import net.minecraftforge.fml.relauncher.Side;
import net.minecraftforge.fml.relauncher.SideOnly;

public class SlopeGrass extends BlockStairs {
	
	private int num;

	public SlopeGrass(String name, IBlockState modelState, Material materialIn, SoundType sound, float hardness, String tool, int level, float resistance, float lightlevel, int dropnum)  {
		super(modelState);
		
		this.useNeighborBrightness = true;
		
		setUnlocalizedName(name);
		setRegistryName(name);
		setSoundType(sound);
		setCreativeTab(CreativeTabs.BUILDING_BLOCKS);
		setHardness(hardness);
		setHarvestLevel(tool, level);
		setResistance(resistance);
		setLightLevel(lightlevel);
		this.num = dropnum; 
	}

	public int quantityDropped(Random random) {
		return this.num;
	}
	
	@Override
	public MapColor getMapColor(IBlockState state, IBlockAccess worldIn, BlockPos pos) {
		return MapColor.GRASS;
	}

	public boolean isFullCube() {
		return false;
	}

	protected boolean canSilkHarvest() {

		return true;
	}
	
	@SideOnly(Side.CLIENT)
	public BlockRenderLayer getBlockLayer() {
		return BlockRenderLayer.CUTOUT_MIPPED;
	}
	
	@Override
	public boolean doesSideBlockRendering(IBlockState state, IBlockAccess world, BlockPos pos, EnumFacing face) {
		return state.isTranslucent();
	}
	
}
