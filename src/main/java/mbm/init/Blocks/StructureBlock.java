package mbm.init.Blocks;

import net.minecraft.block.SoundType;
import net.minecraft.block.material.Material;
import net.minecraft.block.state.IBlockState;
import net.minecraft.entity.Entity;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.util.BlockRenderLayer;
import net.minecraft.util.EnumFacing;
import net.minecraft.util.math.BlockPos;
import net.minecraft.world.IBlockAccess;
import net.minecraft.world.World;

public class StructureBlock extends MainBlock {

	public StructureBlock(String name, boolean ignoreSimilarity, Material materialIn, SoundType sound, float hardness,
			String tool, int level, float resistance, float lightlevel, int dropnum) {
		super(name, materialIn, sound, hardness, tool, level, resistance, lightlevel, dropnum);
	}

	@Override
	public BlockRenderLayer getBlockLayer() {
		return BlockRenderLayer.CUTOUT;
	}
	
	@Override
	public boolean isOpaqueCube(IBlockState state) {
		return false;
	}
	
	protected boolean canSilkHarvest() {

		return true;
	}


	@Override
	public boolean doesSideBlockRendering(IBlockState state, IBlockAccess world, BlockPos pos, EnumFacing face) {
		return state.isTranslucent();
	}

}
