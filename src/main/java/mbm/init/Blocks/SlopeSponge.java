package mbm.init.Blocks;

import java.util.List;
import java.util.Queue;

import com.google.common.collect.Lists;

import mbm.init.BlockMaker;
import net.minecraft.block.Block;
import net.minecraft.block.SoundType;
import net.minecraft.block.material.Material;
import net.minecraft.block.properties.PropertyBool;
import net.minecraft.block.state.IBlockState;
import net.minecraft.init.Blocks;
import net.minecraft.util.EnumFacing;
import net.minecraft.util.Tuple;
import net.minecraft.util.math.BlockPos;
import net.minecraft.world.World;

public class SlopeSponge extends MainSlope{
	
	
	public SlopeSponge(String name, IBlockState modelState, Material materialIn, SoundType sound, float hardness,
			String tool, int level, float resistance, float lightlevel, int dropnum) {
		super(name, modelState, materialIn, sound, hardness, tool, level, resistance, lightlevel, dropnum);
	}

	    private boolean absorb(World worldIn, BlockPos pos)
	    {
	        Queue<Tuple<BlockPos, Integer>> queue = Lists.<Tuple<BlockPos, Integer>>newLinkedList();
	        List<BlockPos> list = Lists.<BlockPos>newArrayList();
	        queue.add(new Tuple(pos, Integer.valueOf(0)));
	        int i = 0;

	        while (!queue.isEmpty())
	        {
	            Tuple<BlockPos, Integer> tuple = (Tuple)queue.poll();
	            BlockPos blockpos = tuple.getFirst();
	            int j = ((Integer)tuple.getSecond()).intValue();

	            for (EnumFacing enumfacing : EnumFacing.values())
	            {
	                BlockPos blockpos1 = blockpos.offset(enumfacing);

	                if (worldIn.getBlockState(blockpos1).getMaterial() == Material.WATER)
	                {
	                    worldIn.setBlockState(blockpos1, Blocks.AIR.getDefaultState(), 2);
	                    list.add(blockpos1);
	                    ++i;

	                    if (j < 6)
	                    {
	                        queue.add(new Tuple(blockpos1, j + 1));
	                    }
	                }
	            }

	            if (i > 64)
	            {
	                break;
	            }
	        }

	        for (BlockPos blockpos2 : list)
	        {
	            worldIn.notifyNeighborsOfStateChange(blockpos2, Blocks.AIR, false);
	        }

	        return i > 0;
	    }


}
