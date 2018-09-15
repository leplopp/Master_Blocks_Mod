package mbm.init;

import java.util.Random;

import mbm.Reference;
import mbm.init.Blocks.SlopeGrass;
import mbm.init.Blocks.mainSlope;
import net.minecraft.block.Block;
import net.minecraft.block.BlockGlass;
import net.minecraft.block.SoundType;
import net.minecraft.block.material.Material;
import net.minecraft.client.renderer.block.model.ModelResourceLocation;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.init.Blocks;
import net.minecraft.item.Item;
import net.minecraft.item.ItemBlock;
import net.minecraft.util.ResourceLocation;
import net.minecraftforge.client.model.ModelLoader;
import net.minecraftforge.fml.common.registry.ForgeRegistries;

public class Blockinit {

/**
 * mainSlope METHOD
 * 
 * mainSlope(name, BlockState, Material, setSoundType, setHardness, setHarvestLevel/ Tool, setHarvestLevel/ level, setResistance, setLightLevel, quantityDropped);
 * 
 * @HarvestLevel = Tool
 * {"pickaxe"/"axe"/"shovel"}
 * 
 * @HarvestLevel = Level
 * Wood:    0
 * Stone:   1
 * Iron:    2
 * Diamond: 3
 * Gold:    0
 * 
 */

public static void init(){

BlockMaker.STONE_SLOPE = new mainSlope("stone_slope", Blocks.STONE.getDefaultState(), Material.ROCK, SoundType.STONE, 1.5F, "pickaxe", 0, 10.0F, 0F, 1);
BlockMaker.GRANITE_SLOPE = new mainSlope("granite_slope", Blocks.STONE.getDefaultState(), Material.ROCK, SoundType.STONE, 1.5F, "pickaxe", 0, 10.0F, 0F, 1);
BlockMaker.SMOOTH_GARNITE_SLOPE = new mainSlope("smooth_granite_slope", Blocks.STONE.getDefaultState(), Material.ROCK, SoundType.STONE, 1.5F, "pickaxe", 0, 10.0F, 0F, 1);
BlockMaker.DIORITE_SLOPE = new mainSlope("diorite_slope", Blocks.STONE.getDefaultState(), Material.ROCK, SoundType.STONE, 1.5F, "pickaxe", 0, 10.0F, 0F, 1);
BlockMaker.SMOOTH_DIORITE_SLOPE = new mainSlope("smooth_diorite_slope", Blocks.STONE.getDefaultState(), Material.ROCK, SoundType.STONE, 1.5F, "pickaxe", 0, 10.0F, 0F, 1);
BlockMaker.ANDESITE_SLOPE = new mainSlope("andesite_slope", Blocks.STONE.getDefaultState(), Material.ROCK, SoundType.STONE, 1.5F, "pickaxe", 0, 10.0F, 0F, 1);
BlockMaker.SMOOTH_ANDESTITE_SLOPE = new mainSlope("smooth_andesite_slope", Blocks.STONE.getDefaultState(), Material.ROCK, SoundType.STONE, 1.5F, "pickaxe", 0, 10.0F, 0F, 1);
BlockMaker.GRASS_SLOPE = new SlopeGrass("grass_slope", Blocks.GRASS.getDefaultState(), Material.GRASS, SoundType.PLANT, 0.6F, "shovel", 0, 0.0F, 0F, 1);








BlockMaker.GLASS_SLOPE = new mainSlope("glass_slope", Blocks.GLASS.getDefaultState(), Material.GLASS, SoundType.GLASS, 0.3F, null, 0, 0.0F, 0F, 0);
}

}
