package mbm.init.Blocks;

import java.util.Random;

import net.minecraft.block.Block;
import net.minecraft.block.BlockGrass;
import net.minecraft.block.SoundType;
import net.minecraft.block.material.MapColor;
import net.minecraft.block.material.Material;
import net.minecraft.block.state.IBlockState;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.util.BlockRenderLayer;
import net.minecraft.util.EnumFacing;
import net.minecraft.util.math.BlockPos;
import net.minecraft.world.IBlockAccess;
import net.minecraftforge.fml.relauncher.Side;
import net.minecraftforge.fml.relauncher.SideOnly;

public class BlockFullGrass extends BlockGrass {

	private int num;
	
	public BlockFullGrass(String name, IBlockState modelState, Material materialIn, SoundType sound, float hardness, String tool, int level, float resistance, float lightlevel, int dropnum) {
		super();
		
		setUnlocalizedName(name);
		setRegistryName(name);
		setSoundType(sound);
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
	
	protected boolean canSilkHarvest() {

		return true;
	}
	@SideOnly(Side.CLIENT)
	public BlockRenderLayer getBlockLayer() {
		return BlockRenderLayer.CUTOUT_MIPPED;
	}

}
