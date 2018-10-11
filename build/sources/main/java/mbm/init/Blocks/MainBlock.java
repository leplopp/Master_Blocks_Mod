package mbm.init.Blocks;

import java.util.Random;

import net.minecraft.block.Block;
import net.minecraft.block.SoundType;
import net.minecraft.block.material.Material;
import net.minecraft.block.state.IBlockState;

public class MainBlock extends Block{
	
	private int num;

	public MainBlock(String name, Material materialIn, SoundType sound, float hardness, String tool, int level, float resistance, float lightlevel, int dropnum) {
		super(materialIn);
		
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

}
