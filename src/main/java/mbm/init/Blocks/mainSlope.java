package mbm.init.Blocks;

import java.util.Random;

import net.minecraft.block.Block;
import net.minecraft.block.BlockGlass;
import net.minecraft.block.BlockStairs;
import net.minecraft.block.SoundType;
import net.minecraft.block.material.Material;
import net.minecraft.block.state.IBlockState;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.util.BlockRenderLayer;
import net.minecraft.util.EnumFacing;
import net.minecraft.util.math.BlockPos;
import net.minecraft.world.IBlockAccess;

public class mainSlope extends BlockStairs {
	
	private int num;

	public mainSlope(String name, IBlockState modelState, Material materialIn, SoundType sound, float hardness, String tool, int level, float resistance, float lightlevel, int dropnum)  {
		super(modelState);
		
		this.useNeighborBrightness = true;
		
		setUnlocalizedName(name);
		setRegistryName(name);
		setSoundType(sound);
		setHardness(hardness);
		setHarvestLevel(tool, level);
		setResistance(resistance);
		setLightLevel(lightlevel);
		this.num = dropnum; 
	}

	@Override
	public int quantityDropped(Random random) {
		return this.num;
	}
	
	@Override
	public BlockRenderLayer getBlockLayer() {
		return BlockRenderLayer.CUTOUT;
	}
	@Override
	public boolean isFullCube(IBlockState state) {
		return false;
	}
	@Override
	public boolean isOpaqueCube(IBlockState state) {
		return false;
	}
	
	@Override
	public boolean doesSideBlockRendering(IBlockState state, IBlockAccess world, BlockPos pos, EnumFacing face) {
		return state.isTranslucent();
	}

}
