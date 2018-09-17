package mbm.init;

import java.util.Random;

import mbm.Reference;
import mbm.init.Blocks.BlockFullGrass;
import mbm.init.Blocks.BlockFullPodzol;
import mbm.init.Blocks.SlopeGrass;
import mbm.init.Blocks.mainSlope;
import net.minecraft.block.Block;
import net.minecraft.block.BlockGrass;
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
 * "null" does not set a tool
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

BlockMaker.STONE_SLOPE = new mainSlope("stone_slope", Blocks.STONE.getDefaultState(), Material.ROCK, SoundType.STONE, 1.5F, "pickaxe", 0, 10.0F, 0F, 1 );
BlockMaker.GRANITE_SLOPE = new mainSlope("granite_slope", Blocks.STONE.getDefaultState(), Material.ROCK, SoundType.STONE, 1.5F, "pickaxe", 0, 10.0F, 0F, 1);
BlockMaker.SMOOTH_GARNITE_SLOPE = new mainSlope("smooth_granite_slope", Blocks.STONE.getDefaultState(), Material.ROCK, SoundType.STONE, 1.5F, "pickaxe", 0, 10.0F, 0F, 1);
BlockMaker.DIORITE_SLOPE = new mainSlope("diorite_slope", Blocks.STONE.getDefaultState(), Material.ROCK, SoundType.STONE, 1.5F, "pickaxe", 0, 10.0F, 0F, 1);
BlockMaker.SMOOTH_DIORITE_SLOPE = new mainSlope("smooth_diorite_slope", Blocks.STONE.getDefaultState(), Material.ROCK, SoundType.STONE, 1.5F, "pickaxe", 0, 10.0F, 0F, 1);
BlockMaker.ANDESITE_SLOPE = new mainSlope("andesite_slope", Blocks.STONE.getDefaultState(), Material.ROCK, SoundType.STONE, 1.5F, "pickaxe", 0, 10.0F, 0F, 1);
BlockMaker.SMOOTH_ANDESTITE_SLOPE = new mainSlope("smooth_andesite_slope", Blocks.STONE.getDefaultState(), Material.ROCK, SoundType.STONE, 1.5F, "pickaxe", 0, 10.0F, 0F, 1);
BlockMaker.GRASS_SLOPE = new SlopeGrass("grass_slope", Blocks.GRASS.getDefaultState(), Material.GRASS, SoundType.PLANT, 0.6F, "shovel", 0, 0.0F, 0F, 1);
BlockMaker.FULL_GRASS = new BlockFullGrass("full_grass", Blocks.GRASS.getDefaultState(), Material.GRASS, SoundType.PLANT, 0.6F, "shovel", 0, 0.0F, 0F, 1);
BlockMaker.DIRT_SLOPE = new mainSlope("dirt_slope", Blocks.DIRT.getDefaultState(), Material.GROUND, SoundType.GROUND, 0.5F, "shovel", 0, 0.0F, 0F, 1);
BlockMaker.COARSE_DIRT_SLOPE = new mainSlope("coarse_dirt_slope", Blocks.DIRT.getDefaultState(), Material.GROUND, SoundType.GROUND, 0.5F, "shovel", 0, 0.0F, 0F, 1);
BlockMaker.PODZOL_SLOPE = new mainSlope("podzol_slope", Blocks.DIRT.getDefaultState(), Material.GROUND, SoundType.GROUND, 0.5F, "shovel", 0, 0.0F, 0F, 1);
BlockMaker.FULL_PODZOL = new BlockFullPodzol("full_podzol", Blocks.DIRT.getDefaultState(), Material.GROUND, SoundType.GROUND, 0.5F, "shovel", 0, 0.0F, 0F, 1);
BlockMaker.COBBLESTONE_SLOPE = new mainSlope("cobblestone_slope", Blocks.COBBLESTONE.getDefaultState(), Material.ROCK, SoundType.STONE, 2.0F, "pickaxe", 0, 10.0F, 0F, 1);
BlockMaker.OAK_PLANKS_SLOPE = new mainSlope("oak_planks_slope", Blocks.PLANKS.getDefaultState(), Material.WOOD, SoundType.WOOD, 2.0F, "axe", 0, 5.0F, 0F, 1);
BlockMaker.SPRUCE_PLANKS_SLOPE = new mainSlope("spruce_planks_slope", Blocks.PLANKS.getDefaultState(), Material.WOOD, SoundType.WOOD, 2.0F, "axe", 0, 5.0F, 0F, 1);
BlockMaker.BIRCH_PLANKS_SLOPE = new mainSlope("birch_planks_slope", Blocks.PLANKS.getDefaultState(), Material.WOOD, SoundType.WOOD, 2.0F, "axe", 0, 5.0F, 0F, 1);
BlockMaker.JUNGLE_PLANKS_SLOPE = new mainSlope("jungle_planks_slope", Blocks.PLANKS.getDefaultState(), Material.WOOD, SoundType.WOOD, 2.0F, "axe", 0, 5.0F, 0F, 1);
BlockMaker.ACACIA_PLANKS_SLOPE = new mainSlope("acacia_planks_slope", Blocks.PLANKS.getDefaultState(), Material.WOOD, SoundType.WOOD, 2.0F, "axe", 0, 5.0F, 0F, 1);
BlockMaker.DARK_OAK_PLANKS_SLOPE = new mainSlope("dark_oak_planks_slope", Blocks.PLANKS.getDefaultState(), Material.WOOD, SoundType.WOOD, 2.0F, "axe", 0, 5.0F, 0F, 1);
BlockMaker.BEDROCK_SLOPE = new mainSlope("bedrock_slope", Blocks.BEDROCK.getDefaultState(), Material.ROCK, SoundType.STONE, 0.0F, null, 0, 6000000.0F, 0F, 0).setBlockUnbreakable();
BlockMaker.SAND_SLOPE = new mainSlope("sand_slope", Blocks.SAND.getDefaultState(), Material.SAND, SoundType.SAND, 0.5F, "shovel", 0, 0.0F, 0F, 1);
BlockMaker.RED_SAND_SLOPE = new mainSlope("red_sand_slope", Blocks.SAND.getDefaultState(), Material.SAND, SoundType.SAND, 0.5F, "shovel", 0, 0.0F, 0F, 1);
BlockMaker.GRAVEL_SLOPE = new mainSlope("gravel_slope", Blocks.GRAVEL.getDefaultState(), Material.GROUND, SoundType.GROUND, 0.6F, "shovel", 0, 0.0F, 0F, 1);
BlockMaker.GOLD_ORE_SLOPE = new mainSlope("gold_ore_slope", Blocks.GOLD_ORE.getDefaultState(), Material.ROCK, SoundType.STONE, 3.0F, "pickaxe", 2, 5.0F, 0F, 1);
BlockMaker.IRON_ORE_SLOPE = new mainSlope("iron_ore_slope", Blocks.IRON_ORE.getDefaultState(), Material.ROCK, SoundType.STONE, 3.0F, "pickaxe", 1, 5.0F, 0F, 1);
BlockMaker.COAL_ORE_SLOPE = new mainSlope("coal_ore_slope", Blocks.COAL_ORE.getDefaultState(), Material.ROCK, SoundType.STONE, 3.0F, "pickaxe", 0, 5.0F, 0F, 1);
BlockMaker.LAPIS_ORE_SLOPE = new mainSlope("lapis_ore_slope", Blocks.LAPIS_ORE.getDefaultState(), Material.ROCK, SoundType.STONE, 3.0F, "pickaxe", 2, 5.0F, 0F, 1);
BlockMaker.DIAMOND_ORE_SLOPE = new mainSlope("diamond_ore_slope", Blocks.DIAMOND_ORE.getDefaultState(), Material.ROCK, SoundType.STONE, 3.0F, "pickaxe", 2, 5.0F, 0F, 1);
BlockMaker.REDSTONE_ORE_SLOPE = new mainSlope("redstone_ore_slope", Blocks.REDSTONE_ORE.getDefaultState(), Material.ROCK, SoundType.STONE, 3.0F, "pickaxe", 2, 5.0F, 0F, 1);
BlockMaker.EMERALD_ORE_SLOPE = new mainSlope("emerald_ore_slope", Blocks.EMERALD_ORE.getDefaultState(), Material.ROCK, SoundType.STONE, 3.0F, "pickaxe", 2, 5.0F, 0F, 1);
BlockMaker.QUARTZ_ORE_SLOPE = new mainSlope("quartz_ore_slope", Blocks.QUARTZ_ORE.getDefaultState(), Material.ROCK, SoundType.STONE, 3.0F, "pickaxe", 0, 5.0F, 0F, 1);
BlockMaker.OAK_LOG_SLOPE = new mainSlope("oak_log_slope", Blocks.LOG.getDefaultState(), Material.WOOD, SoundType.WOOD, 2.0F, "axe", 0, 5.0F, 0F, 1);
BlockMaker.SPRUCE_LOG_SLOPE = new mainSlope("spruce_log_slope", Blocks.LOG.getDefaultState(), Material.WOOD, SoundType.WOOD, 2.0F, "axe", 0, 5.0F, 0F, 1);
BlockMaker.BIRCH_LOG_SLOPE = new mainSlope("birch_log_slope", Blocks.LOG.getDefaultState(), Material.WOOD, SoundType.WOOD, 2.0F, "axe", 0, 5.0F, 0F, 1);
BlockMaker.JUNGLE_LOG_SLOPE = new mainSlope("jungle_log_slope", Blocks.LOG.getDefaultState(), Material.WOOD, SoundType.WOOD, 2.0F, "axe", 0, 5.0F, 0F, 1);
BlockMaker.ACACIA_LOG_SLOPE = new mainSlope("acacia_log_slope", Blocks.LOG2.getDefaultState(), Material.WOOD, SoundType.WOOD, 2.0F, "axe", 0, 5.0F, 0F, 1);
BlockMaker.DARK_OAK_LOG_SLOPE = new mainSlope("dark_oak_log_slope", Blocks.LOG2.getDefaultState(), Material.WOOD, SoundType.WOOD, 2.0F, "axe", 0, 5.0F, 0F, 1);
//sponge
BlockMaker.SPONGE_SLOPE = new mainSlope("sponge_slope", Blocks.STONE.getDefaultState(), Material.SPONGE, SoundType.PLANT, 0.6F, null, 0, 0.0F, 0F, 1);
BlockMaker.WET_SPONGE_SLOPE= new mainSlope("wet_sponge_slope", Blocks.STONE.getDefaultState(), Material.SPONGE, SoundType.PLANT, 0.6F, null, 0, 0.0F, 0F, 1);
//Glass
BlockMaker.GLASS_SLOPE = new mainSlope("glass_slope", Blocks.GLASS.getDefaultState(), Material.GLASS, SoundType.GLASS, 0.3F, null, 0, 0.0F, 0F, 0);
//Ore Blocks 
/*BlockMaker.ANDESITE_SLOPE = new mainSlope("andesite_slope", Blocks.STONE.getDefaultState(), Material.ROCK, SoundType.STONE, 1.5F, "pickaxe", 0, 10.0F, 0F, 1);
BlockMaker.ANDESITE_SLOPE = new mainSlope("andesite_slope", Blocks.STONE.getDefaultState(), Material.ROCK, SoundType.STONE, 1.5F, "pickaxe", 0, 10.0F, 0F, 1);
BlockMaker.ANDESITE_SLOPE = new mainSlope("andesite_slope", Blocks.STONE.getDefaultState(), Material.ROCK, SoundType.STONE, 1.5F, "pickaxe", 0, 10.0F, 0F, 1);
BlockMaker.ANDESITE_SLOPE = new mainSlope("andesite_slope", Blocks.STONE.getDefaultState(), Material.ROCK, SoundType.STONE, 1.5F, "pickaxe", 0, 10.0F, 0F, 1);
BlockMaker.ANDESITE_SLOPE = new mainSlope("andesite_slope", Blocks.STONE.getDefaultState(), Material.ROCK, SoundType.STONE, 1.5F, "pickaxe", 0, 10.0F, 0F, 1);
BlockMaker.ANDESITE_SLOPE = new mainSlope("andesite_slope", Blocks.STONE.getDefaultState(), Material.ROCK, SoundType.STONE, 1.5F, "pickaxe", 0, 10.0F, 0F, 1);
BlockMaker.ANDESITE_SLOPE = new mainSlope("andesite_slope", Blocks.STONE.getDefaultState(), Material.ROCK, SoundType.STONE, 1.5F, "pickaxe", 0, 10.0F, 0F, 1);
//Sandstone
BlockMaker.ANDESITE_SLOPE = new mainSlope("andesite_slope", Blocks.STONE.getDefaultState(), Material.ROCK, SoundType.STONE, 1.5F, "pickaxe", 0, 10.0F, 0F, 1);
BlockMaker.ANDESITE_SLOPE = new mainSlope("andesite_slope", Blocks.STONE.getDefaultState(), Material.ROCK, SoundType.STONE, 1.5F, "pickaxe", 0, 10.0F, 0F, 1);
BlockMaker.ANDESITE_SLOPE = new mainSlope("andesite_slope", Blocks.STONE.getDefaultState(), Material.ROCK, SoundType.STONE, 1.5F, "pickaxe", 0, 10.0F, 0F, 1);
//Wool
BlockMaker.ANDESITE_SLOPE = new mainSlope("andesite_slope", Blocks.STONE.getDefaultState(), Material.ROCK, SoundType.STONE, 1.5F, "pickaxe", 0, 10.0F, 0F, 1);
BlockMaker.ANDESITE_SLOPE = new mainSlope("andesite_slope", Blocks.STONE.getDefaultState(), Material.ROCK, SoundType.STONE, 1.5F, "pickaxe", 0, 10.0F, 0F, 1);
BlockMaker.ANDESITE_SLOPE = new mainSlope("andesite_slope", Blocks.STONE.getDefaultState(), Material.ROCK, SoundType.STONE, 1.5F, "pickaxe", 0, 10.0F, 0F, 1);
BlockMaker.ANDESITE_SLOPE = new mainSlope("andesite_slope", Blocks.STONE.getDefaultState(), Material.ROCK, SoundType.STONE, 1.5F, "pickaxe", 0, 10.0F, 0F, 1);
BlockMaker.ANDESITE_SLOPE = new mainSlope("andesite_slope", Blocks.STONE.getDefaultState(), Material.ROCK, SoundType.STONE, 1.5F, "pickaxe", 0, 10.0F, 0F, 1);
BlockMaker.ANDESITE_SLOPE = new mainSlope("andesite_slope", Blocks.STONE.getDefaultState(), Material.ROCK, SoundType.STONE, 1.5F, "pickaxe", 0, 10.0F, 0F, 1);
BlockMaker.ANDESITE_SLOPE = new mainSlope("andesite_slope", Blocks.STONE.getDefaultState(), Material.ROCK, SoundType.STONE, 1.5F, "pickaxe", 0, 10.0F, 0F, 1);
BlockMaker.ANDESITE_SLOPE = new mainSlope("andesite_slope", Blocks.STONE.getDefaultState(), Material.ROCK, SoundType.STONE, 1.5F, "pickaxe", 0, 10.0F, 0F, 1);
BlockMaker.ANDESITE_SLOPE = new mainSlope("andesite_slope", Blocks.STONE.getDefaultState(), Material.ROCK, SoundType.STONE, 1.5F, "pickaxe", 0, 10.0F, 0F, 1);
BlockMaker.ANDESITE_SLOPE = new mainSlope("andesite_slope", Blocks.STONE.getDefaultState(), Material.ROCK, SoundType.STONE, 1.5F, "pickaxe", 0, 10.0F, 0F, 1);
BlockMaker.ANDESITE_SLOPE = new mainSlope("andesite_slope", Blocks.STONE.getDefaultState(), Material.ROCK, SoundType.STONE, 1.5F, "pickaxe", 0, 10.0F, 0F, 1);
BlockMaker.ANDESITE_SLOPE = new mainSlope("andesite_slope", Blocks.STONE.getDefaultState(), Material.ROCK, SoundType.STONE, 1.5F, "pickaxe", 0, 10.0F, 0F, 1);
BlockMaker.ANDESITE_SLOPE = new mainSlope("andesite_slope", Blocks.STONE.getDefaultState(), Material.ROCK, SoundType.STONE, 1.5F, "pickaxe", 0, 10.0F, 0F, 1);
BlockMaker.ANDESITE_SLOPE = new mainSlope("andesite_slope", Blocks.STONE.getDefaultState(), Material.ROCK, SoundType.STONE, 1.5F, "pickaxe", 0, 10.0F, 0F, 1);
BlockMaker.ANDESITE_SLOPE = new mainSlope("andesite_slope", Blocks.STONE.getDefaultState(), Material.ROCK, SoundType.STONE, 1.5F, "pickaxe", 0, 10.0F, 0F, 1);
BlockMaker.ANDESITE_SLOPE = new mainSlope("andesite_slope", Blocks.STONE.getDefaultState(), Material.ROCK, SoundType.STONE, 1.5F, "pickaxe", 0, 10.0F, 0F, 1);
//Brick
BlockMaker.ANDESITE_SLOPE = new mainSlope("andesite_slope", Blocks.STONE.getDefaultState(), Material.ROCK, SoundType.STONE, 1.5F, "pickaxe", 0, 10.0F, 0F, 1);
//Bookshelf
BlockMaker.ANDESITE_SLOPE = new mainSlope("andesite_slope", Blocks.STONE.getDefaultState(), Material.ROCK, SoundType.STONE, 1.5F, "pickaxe", 0, 10.0F, 0F, 1);
//Mossy Cobblestone
BlockMaker.ANDESITE_SLOPE = new mainSlope("andesite_slope", Blocks.STONE.getDefaultState(), Material.ROCK, SoundType.STONE, 1.5F, "pickaxe", 0, 10.0F, 0F, 1);
//Obsidian
BlockMaker.ANDESITE_SLOPE = new mainSlope("andesite_slope", Blocks.STONE.getDefaultState(), Material.ROCK, SoundType.STONE, 1.5F, "pickaxe", 0, 10.0F, 0F, 1);
//Ice 
BlockMaker.ANDESITE_SLOPE = new mainSlope("andesite_slope", Blocks.STONE.getDefaultState(), Material.ROCK, SoundType.STONE, 1.5F, "pickaxe", 0, 10.0F, 0F, 1);
BlockMaker.ANDESITE_SLOPE = new mainSlope("andesite_slope", Blocks.STONE.getDefaultState(), Material.ROCK, SoundType.STONE, 1.5F, "pickaxe", 0, 10.0F, 0F, 1);
//Snow
BlockMaker.ANDESITE_SLOPE = new mainSlope("andesite_slope", Blocks.STONE.getDefaultState(), Material.ROCK, SoundType.STONE, 1.5F, "pickaxe", 0, 10.0F, 0F, 1);
//Clay
BlockMaker.ANDESITE_SLOPE = new mainSlope("andesite_slope", Blocks.STONE.getDefaultState(), Material.ROCK, SoundType.STONE, 1.5F, "pickaxe", 0, 10.0F, 0F, 1);
//Pumkin
BlockMaker.ANDESITE_SLOPE = new mainSlope("andesite_slope", Blocks.STONE.getDefaultState(), Material.ROCK, SoundType.STONE, 1.5F, "pickaxe", 0, 10.0F, 0F, 1);
BlockMaker.ANDESITE_SLOPE = new mainSlope("andesite_slope", Blocks.STONE.getDefaultState(), Material.ROCK, SoundType.STONE, 1.5F, "pickaxe", 0, 10.0F, 0F, 1);
//Netherrack
BlockMaker.ANDESITE_SLOPE = new mainSlope("andesite_slope", Blocks.STONE.getDefaultState(), Material.ROCK, SoundType.STONE, 1.5F, "pickaxe", 0, 10.0F, 0F, 1);
//SoulSand
BlockMaker.ANDESITE_SLOPE = new mainSlope("andesite_slope", Blocks.STONE.getDefaultState(), Material.ROCK, SoundType.STONE, 1.5F, "pickaxe", 0, 10.0F, 0F, 1);
//Glowstone
BlockMaker.ANDESITE_SLOPE = new mainSlope("andesite_slope", Blocks.STONE.getDefaultState(), Material.ROCK, SoundType.STONE, 1.5F, "pickaxe", 0, 10.0F, 0F, 1);
//Stained Glass
BlockMaker.ANDESITE_SLOPE = new mainSlope("andesite_slope", Blocks.STONE.getDefaultState(), Material.ROCK, SoundType.STONE, 1.5F, "pickaxe", 0, 10.0F, 0F, 1);
BlockMaker.ANDESITE_SLOPE = new mainSlope("andesite_slope", Blocks.STONE.getDefaultState(), Material.ROCK, SoundType.STONE, 1.5F, "pickaxe", 0, 10.0F, 0F, 1);
BlockMaker.ANDESITE_SLOPE = new mainSlope("andesite_slope", Blocks.STONE.getDefaultState(), Material.ROCK, SoundType.STONE, 1.5F, "pickaxe", 0, 10.0F, 0F, 1);
BlockMaker.ANDESITE_SLOPE = new mainSlope("andesite_slope", Blocks.STONE.getDefaultState(), Material.ROCK, SoundType.STONE, 1.5F, "pickaxe", 0, 10.0F, 0F, 1);
BlockMaker.ANDESITE_SLOPE = new mainSlope("andesite_slope", Blocks.STONE.getDefaultState(), Material.ROCK, SoundType.STONE, 1.5F, "pickaxe", 0, 10.0F, 0F, 1);
BlockMaker.ANDESITE_SLOPE = new mainSlope("andesite_slope", Blocks.STONE.getDefaultState(), Material.ROCK, SoundType.STONE, 1.5F, "pickaxe", 0, 10.0F, 0F, 1);
BlockMaker.ANDESITE_SLOPE = new mainSlope("andesite_slope", Blocks.STONE.getDefaultState(), Material.ROCK, SoundType.STONE, 1.5F, "pickaxe", 0, 10.0F, 0F, 1);
BlockMaker.ANDESITE_SLOPE = new mainSlope("andesite_slope", Blocks.STONE.getDefaultState(), Material.ROCK, SoundType.STONE, 1.5F, "pickaxe", 0, 10.0F, 0F, 1);
BlockMaker.ANDESITE_SLOPE = new mainSlope("andesite_slope", Blocks.STONE.getDefaultState(), Material.ROCK, SoundType.STONE, 1.5F, "pickaxe", 0, 10.0F, 0F, 1);
BlockMaker.ANDESITE_SLOPE = new mainSlope("andesite_slope", Blocks.STONE.getDefaultState(), Material.ROCK, SoundType.STONE, 1.5F, "pickaxe", 0, 10.0F, 0F, 1);
BlockMaker.ANDESITE_SLOPE = new mainSlope("andesite_slope", Blocks.STONE.getDefaultState(), Material.ROCK, SoundType.STONE, 1.5F, "pickaxe", 0, 10.0F, 0F, 1);
BlockMaker.ANDESITE_SLOPE = new mainSlope("andesite_slope", Blocks.STONE.getDefaultState(), Material.ROCK, SoundType.STONE, 1.5F, "pickaxe", 0, 10.0F, 0F, 1);
BlockMaker.ANDESITE_SLOPE = new mainSlope("andesite_slope", Blocks.STONE.getDefaultState(), Material.ROCK, SoundType.STONE, 1.5F, "pickaxe", 0, 10.0F, 0F, 1);
BlockMaker.ANDESITE_SLOPE = new mainSlope("andesite_slope", Blocks.STONE.getDefaultState(), Material.ROCK, SoundType.STONE, 1.5F, "pickaxe", 0, 10.0F, 0F, 1);
BlockMaker.ANDESITE_SLOPE = new mainSlope("andesite_slope", Blocks.STONE.getDefaultState(), Material.ROCK, SoundType.STONE, 1.5F, "pickaxe", 0, 10.0F, 0F, 1);
BlockMaker.ANDESITE_SLOPE = new mainSlope("andesite_slope", Blocks.STONE.getDefaultState(), Material.ROCK, SoundType.STONE, 1.5F, "pickaxe", 0, 10.0F, 0F, 1);
//Stonebrick
BlockMaker.ANDESITE_SLOPE = new mainSlope("andesite_slope", Blocks.STONE.getDefaultState(), Material.ROCK, SoundType.STONE, 1.5F, "pickaxe", 0, 10.0F, 0F, 1);
BlockMaker.ANDESITE_SLOPE = new mainSlope("andesite_slope", Blocks.STONE.getDefaultState(), Material.ROCK, SoundType.STONE, 1.5F, "pickaxe", 0, 10.0F, 0F, 1);
BlockMaker.ANDESITE_SLOPE = new mainSlope("andesite_slope", Blocks.STONE.getDefaultState(), Material.ROCK, SoundType.STONE, 1.5F, "pickaxe", 0, 10.0F, 0F, 1);
BlockMaker.ANDESITE_SLOPE = new mainSlope("andesite_slope", Blocks.STONE.getDefaultState(), Material.ROCK, SoundType.STONE, 1.5F, "pickaxe", 0, 10.0F, 0F, 1);
//Melon Block
BlockMaker.ANDESITE_SLOPE = new mainSlope("andesite_slope", Blocks.STONE.getDefaultState(), Material.ROCK, SoundType.STONE, 1.5F, "pickaxe", 0, 10.0F, 0F, 1);
//Mycelium
BlockMaker.ANDESITE_SLOPE = new mainSlope("andesite_slope", Blocks.STONE.getDefaultState(), Material.ROCK, SoundType.STONE, 1.5F, "pickaxe", 0, 10.0F, 0F, 1);
//Netherbrick
BlockMaker.ANDESITE_SLOPE = new mainSlope("andesite_slope", Blocks.STONE.getDefaultState(), Material.ROCK, SoundType.STONE, 1.5F, "pickaxe", 0, 10.0F, 0F, 1);
//End Stone
BlockMaker.ANDESITE_SLOPE = new mainSlope("andesite_slope", Blocks.STONE.getDefaultState(), Material.ROCK, SoundType.STONE, 1.5F, "pickaxe", 0, 10.0F, 0F, 1);
//Quartz
BlockMaker.ANDESITE_SLOPE = new mainSlope("andesite_slope", Blocks.STONE.getDefaultState(), Material.ROCK, SoundType.STONE, 1.5F, "pickaxe", 0, 10.0F, 0F, 1);
BlockMaker.ANDESITE_SLOPE = new mainSlope("andesite_slope", Blocks.STONE.getDefaultState(), Material.ROCK, SoundType.STONE, 1.5F, "pickaxe", 0, 10.0F, 0F, 1);
BlockMaker.ANDESITE_SLOPE = new mainSlope("andesite_slope", Blocks.STONE.getDefaultState(), Material.ROCK, SoundType.STONE, 1.5F, "pickaxe", 0, 10.0F, 0F, 1);
//Stained Hardened Clay 
BlockMaker.ANDESITE_SLOPE = new mainSlope("andesite_slope", Blocks.STONE.getDefaultState(), Material.ROCK, SoundType.STONE, 1.5F, "pickaxe", 0, 10.0F, 0F, 1);
BlockMaker.ANDESITE_SLOPE = new mainSlope("andesite_slope", Blocks.STONE.getDefaultState(), Material.ROCK, SoundType.STONE, 1.5F, "pickaxe", 0, 10.0F, 0F, 1);
BlockMaker.ANDESITE_SLOPE = new mainSlope("andesite_slope", Blocks.STONE.getDefaultState(), Material.ROCK, SoundType.STONE, 1.5F, "pickaxe", 0, 10.0F, 0F, 1);
BlockMaker.ANDESITE_SLOPE = new mainSlope("andesite_slope", Blocks.STONE.getDefaultState(), Material.ROCK, SoundType.STONE, 1.5F, "pickaxe", 0, 10.0F, 0F, 1);
BlockMaker.ANDESITE_SLOPE = new mainSlope("andesite_slope", Blocks.STONE.getDefaultState(), Material.ROCK, SoundType.STONE, 1.5F, "pickaxe", 0, 10.0F, 0F, 1);
BlockMaker.ANDESITE_SLOPE = new mainSlope("andesite_slope", Blocks.STONE.getDefaultState(), Material.ROCK, SoundType.STONE, 1.5F, "pickaxe", 0, 10.0F, 0F, 1);
BlockMaker.ANDESITE_SLOPE = new mainSlope("andesite_slope", Blocks.STONE.getDefaultState(), Material.ROCK, SoundType.STONE, 1.5F, "pickaxe", 0, 10.0F, 0F, 1);
BlockMaker.ANDESITE_SLOPE = new mainSlope("andesite_slope", Blocks.STONE.getDefaultState(), Material.ROCK, SoundType.STONE, 1.5F, "pickaxe", 0, 10.0F, 0F, 1);
BlockMaker.ANDESITE_SLOPE = new mainSlope("andesite_slope", Blocks.STONE.getDefaultState(), Material.ROCK, SoundType.STONE, 1.5F, "pickaxe", 0, 10.0F, 0F, 1);
BlockMaker.ANDESITE_SLOPE = new mainSlope("andesite_slope", Blocks.STONE.getDefaultState(), Material.ROCK, SoundType.STONE, 1.5F, "pickaxe", 0, 10.0F, 0F, 1);
BlockMaker.ANDESITE_SLOPE = new mainSlope("andesite_slope", Blocks.STONE.getDefaultState(), Material.ROCK, SoundType.STONE, 1.5F, "pickaxe", 0, 10.0F, 0F, 1);
BlockMaker.ANDESITE_SLOPE = new mainSlope("andesite_slope", Blocks.STONE.getDefaultState(), Material.ROCK, SoundType.STONE, 1.5F, "pickaxe", 0, 10.0F, 0F, 1);
BlockMaker.ANDESITE_SLOPE = new mainSlope("andesite_slope", Blocks.STONE.getDefaultState(), Material.ROCK, SoundType.STONE, 1.5F, "pickaxe", 0, 10.0F, 0F, 1);
BlockMaker.ANDESITE_SLOPE = new mainSlope("andesite_slope", Blocks.STONE.getDefaultState(), Material.ROCK, SoundType.STONE, 1.5F, "pickaxe", 0, 10.0F, 0F, 1);
BlockMaker.ANDESITE_SLOPE = new mainSlope("andesite_slope", Blocks.STONE.getDefaultState(), Material.ROCK, SoundType.STONE, 1.5F, "pickaxe", 0, 10.0F, 0F, 1);
BlockMaker.ANDESITE_SLOPE = new mainSlope("andesite_slope", Blocks.STONE.getDefaultState(), Material.ROCK, SoundType.STONE, 1.5F, "pickaxe", 0, 10.0F, 0F, 1);
//Prismarine
BlockMaker.ANDESITE_SLOPE = new mainSlope("andesite_slope", Blocks.STONE.getDefaultState(), Material.ROCK, SoundType.STONE, 1.5F, "pickaxe", 0, 10.0F, 0F, 1);
BlockMaker.ANDESITE_SLOPE = new mainSlope("andesite_slope", Blocks.STONE.getDefaultState(), Material.ROCK, SoundType.STONE, 1.5F, "pickaxe", 0, 10.0F, 0F, 1);
BlockMaker.ANDESITE_SLOPE = new mainSlope("andesite_slope", Blocks.STONE.getDefaultState(), Material.ROCK, SoundType.STONE, 1.5F, "pickaxe", 0, 10.0F, 0F, 1);
//Sea Lantern 
BlockMaker.ANDESITE_SLOPE = new mainSlope("andesite_slope", Blocks.STONE.getDefaultState(), Material.ROCK, SoundType.STONE, 1.5F, "pickaxe", 0, 10.0F, 0F, 1);
//Hay Block
BlockMaker.ANDESITE_SLOPE = new mainSlope("andesite_slope", Blocks.STONE.getDefaultState(), Material.ROCK, SoundType.STONE, 1.5F, "pickaxe", 0, 10.0F, 0F, 1);
//Hardened Clay
BlockMaker.ANDESITE_SLOPE = new mainSlope("andesite_slope", Blocks.STONE.getDefaultState(), Material.ROCK, SoundType.STONE, 1.5F, "pickaxe", 0, 10.0F, 0F, 1);
//Red Sandstone
BlockMaker.ANDESITE_SLOPE = new mainSlope("andesite_slope", Blocks.STONE.getDefaultState(), Material.ROCK, SoundType.STONE, 1.5F, "pickaxe", 0, 10.0F, 0F, 1);
BlockMaker.ANDESITE_SLOPE = new mainSlope("andesite_slope", Blocks.STONE.getDefaultState(), Material.ROCK, SoundType.STONE, 1.5F, "pickaxe", 0, 10.0F, 0F, 1);
BlockMaker.ANDESITE_SLOPE = new mainSlope("andesite_slope", Blocks.STONE.getDefaultState(), Material.ROCK, SoundType.STONE, 1.5F, "pickaxe", 0, 10.0F, 0F, 1);
//Purpur Block
BlockMaker.ANDESITE_SLOPE = new mainSlope("andesite_slope", Blocks.STONE.getDefaultState(), Material.ROCK, SoundType.STONE, 1.5F, "pickaxe", 0, 10.0F, 0F, 1);
BlockMaker.ANDESITE_SLOPE = new mainSlope("andesite_slope", Blocks.STONE.getDefaultState(), Material.ROCK, SoundType.STONE, 1.5F, "pickaxe", 0, 10.0F, 0F, 1);
//End Stone Bricks
BlockMaker.ANDESITE_SLOPE = new mainSlope("andesite_slope", Blocks.STONE.getDefaultState(), Material.ROCK, SoundType.STONE, 1.5F, "pickaxe", 0, 10.0F, 0F, 1);
//Magma Block
BlockMaker.ANDESITE_SLOPE = new mainSlope("andesite_slope", Blocks.STONE.getDefaultState(), Material.ROCK, SoundType.STONE, 1.5F, "pickaxe", 0, 10.0F, 0F, 1);
//Nether Wart Block
BlockMaker.ANDESITE_SLOPE = new mainSlope("andesite_slope", Blocks.STONE.getDefaultState(), Material.ROCK, SoundType.STONE, 1.5F, "pickaxe", 0, 10.0F, 0F, 1);
//Red Nether Brick
BlockMaker.ANDESITE_SLOPE = new mainSlope("andesite_slope", Blocks.STONE.getDefaultState(), Material.ROCK, SoundType.STONE, 1.5F, "pickaxe", 0, 10.0F, 0F, 1);
//Bone Block
BlockMaker.ANDESITE_SLOPE = new mainSlope("andesite_slope", Blocks.STONE.getDefaultState(), Material.ROCK, SoundType.STONE, 1.5F, "pickaxe", 0, 10.0F, 0F, 1);
//Note Block 
BlockMaker.ANDESITE_SLOPE = new mainSlope("andesite_slope", Blocks.STONE.getDefaultState(), Material.ROCK, SoundType.STONE, 1.5F, "pickaxe", 0, 10.0F, 0F, 1);
//TNT 
BlockMaker.ANDESITE_SLOPE = new mainSlope("andesite_slope", Blocks.STONE.getDefaultState(), Material.ROCK, SoundType.STONE, 1.5F, "pickaxe", 0, 10.0F, 0F, 1);
//Redstone Lamp 
BlockMaker.ANDESITE_SLOPE = new mainSlope("andesite_slope", Blocks.STONE.getDefaultState(), Material.ROCK, SoundType.STONE, 1.5F, "pickaxe", 0, 10.0F, 0F, 1);
//Mushroom Block
BlockMaker.ANDESITE_SLOPE = new mainSlope("andesite_slope", Blocks.STONE.getDefaultState(), Material.ROCK, SoundType.STONE, 1.5F, "pickaxe", 0, 10.0F, 0F, 1);
BlockMaker.ANDESITE_SLOPE = new mainSlope("andesite_slope", Blocks.STONE.getDefaultState(), Material.ROCK, SoundType.STONE, 1.5F, "pickaxe", 0, 10.0F, 0F, 1);
BlockMaker.ANDESITE_SLOPE = new mainSlope("andesite_slope", Blocks.STONE.getDefaultState(), Material.ROCK, SoundType.STONE, 1.5F, "pickaxe", 0, 10.0F, 0F, 1);
BlockMaker.ANDESITE_SLOPE = new mainSlope("andesite_slope", Blocks.STONE.getDefaultState(), Material.ROCK, SoundType.STONE, 1.5F, "pickaxe", 0, 10.0F, 0F, 1);
//Concrete
BlockMaker.ANDESITE_SLOPE = new mainSlope("andesite_slope", Blocks.STONE.getDefaultState(), Material.ROCK, SoundType.STONE, 1.5F, "pickaxe", 0, 10.0F, 0F, 1);
BlockMaker.ANDESITE_SLOPE = new mainSlope("andesite_slope", Blocks.STONE.getDefaultState(), Material.ROCK, SoundType.STONE, 1.5F, "pickaxe", 0, 10.0F, 0F, 1);
BlockMaker.ANDESITE_SLOPE = new mainSlope("andesite_slope", Blocks.STONE.getDefaultState(), Material.ROCK, SoundType.STONE, 1.5F, "pickaxe", 0, 10.0F, 0F, 1);
BlockMaker.ANDESITE_SLOPE = new mainSlope("andesite_slope", Blocks.STONE.getDefaultState(), Material.ROCK, SoundType.STONE, 1.5F, "pickaxe", 0, 10.0F, 0F, 1);
BlockMaker.ANDESITE_SLOPE = new mainSlope("andesite_slope", Blocks.STONE.getDefaultState(), Material.ROCK, SoundType.STONE, 1.5F, "pickaxe", 0, 10.0F, 0F, 1);
BlockMaker.ANDESITE_SLOPE = new mainSlope("andesite_slope", Blocks.STONE.getDefaultState(), Material.ROCK, SoundType.STONE, 1.5F, "pickaxe", 0, 10.0F, 0F, 1);
BlockMaker.ANDESITE_SLOPE = new mainSlope("andesite_slope", Blocks.STONE.getDefaultState(), Material.ROCK, SoundType.STONE, 1.5F, "pickaxe", 0, 10.0F, 0F, 1);
BlockMaker.ANDESITE_SLOPE = new mainSlope("andesite_slope", Blocks.STONE.getDefaultState(), Material.ROCK, SoundType.STONE, 1.5F, "pickaxe", 0, 10.0F, 0F, 1);
BlockMaker.ANDESITE_SLOPE = new mainSlope("andesite_slope", Blocks.STONE.getDefaultState(), Material.ROCK, SoundType.STONE, 1.5F, "pickaxe", 0, 10.0F, 0F, 1);
BlockMaker.ANDESITE_SLOPE = new mainSlope("andesite_slope", Blocks.STONE.getDefaultState(), Material.ROCK, SoundType.STONE, 1.5F, "pickaxe", 0, 10.0F, 0F, 1);
BlockMaker.ANDESITE_SLOPE = new mainSlope("andesite_slope", Blocks.STONE.getDefaultState(), Material.ROCK, SoundType.STONE, 1.5F, "pickaxe", 0, 10.0F, 0F, 1);
BlockMaker.ANDESITE_SLOPE = new mainSlope("andesite_slope", Blocks.STONE.getDefaultState(), Material.ROCK, SoundType.STONE, 1.5F, "pickaxe", 0, 10.0F, 0F, 1);
BlockMaker.ANDESITE_SLOPE = new mainSlope("andesite_slope", Blocks.STONE.getDefaultState(), Material.ROCK, SoundType.STONE, 1.5F, "pickaxe", 0, 10.0F, 0F, 1);
BlockMaker.ANDESITE_SLOPE = new mainSlope("andesite_slope", Blocks.STONE.getDefaultState(), Material.ROCK, SoundType.STONE, 1.5F, "pickaxe", 0, 10.0F, 0F, 1);
BlockMaker.ANDESITE_SLOPE = new mainSlope("andesite_slope", Blocks.STONE.getDefaultState(), Material.ROCK, SoundType.STONE, 1.5F, "pickaxe", 0, 10.0F, 0F, 1);
BlockMaker.ANDESITE_SLOPE = new mainSlope("andesite_slope", Blocks.STONE.getDefaultState(), Material.ROCK, SoundType.STONE, 1.5F, "pickaxe", 0, 10.0F, 0F, 1);
//Concrete Powder 
BlockMaker.ANDESITE_SLOPE = new mainSlope("andesite_slope", Blocks.STONE.getDefaultState(), Material.ROCK, SoundType.STONE, 1.5F, "pickaxe", 0, 10.0F, 0F, 1);
BlockMaker.ANDESITE_SLOPE = new mainSlope("andesite_slope", Blocks.STONE.getDefaultState(), Material.ROCK, SoundType.STONE, 1.5F, "pickaxe", 0, 10.0F, 0F, 1);
BlockMaker.ANDESITE_SLOPE = new mainSlope("andesite_slope", Blocks.STONE.getDefaultState(), Material.ROCK, SoundType.STONE, 1.5F, "pickaxe", 0, 10.0F, 0F, 1);
BlockMaker.ANDESITE_SLOPE = new mainSlope("andesite_slope", Blocks.STONE.getDefaultState(), Material.ROCK, SoundType.STONE, 1.5F, "pickaxe", 0, 10.0F, 0F, 1);
BlockMaker.ANDESITE_SLOPE = new mainSlope("andesite_slope", Blocks.STONE.getDefaultState(), Material.ROCK, SoundType.STONE, 1.5F, "pickaxe", 0, 10.0F, 0F, 1);
BlockMaker.ANDESITE_SLOPE = new mainSlope("andesite_slope", Blocks.STONE.getDefaultState(), Material.ROCK, SoundType.STONE, 1.5F, "pickaxe", 0, 10.0F, 0F, 1);
BlockMaker.ANDESITE_SLOPE = new mainSlope("andesite_slope", Blocks.STONE.getDefaultState(), Material.ROCK, SoundType.STONE, 1.5F, "pickaxe", 0, 10.0F, 0F, 1);
BlockMaker.ANDESITE_SLOPE = new mainSlope("andesite_slope", Blocks.STONE.getDefaultState(), Material.ROCK, SoundType.STONE, 1.5F, "pickaxe", 0, 10.0F, 0F, 1);
BlockMaker.ANDESITE_SLOPE = new mainSlope("andesite_slope", Blocks.STONE.getDefaultState(), Material.ROCK, SoundType.STONE, 1.5F, "pickaxe", 0, 10.0F, 0F, 1);
BlockMaker.ANDESITE_SLOPE = new mainSlope("andesite_slope", Blocks.STONE.getDefaultState(), Material.ROCK, SoundType.STONE, 1.5F, "pickaxe", 0, 10.0F, 0F, 1);
BlockMaker.ANDESITE_SLOPE = new mainSlope("andesite_slope", Blocks.STONE.getDefaultState(), Material.ROCK, SoundType.STONE, 1.5F, "pickaxe", 0, 10.0F, 0F, 1);
BlockMaker.ANDESITE_SLOPE = new mainSlope("andesite_slope", Blocks.STONE.getDefaultState(), Material.ROCK, SoundType.STONE, 1.5F, "pickaxe", 0, 10.0F, 0F, 1);
BlockMaker.ANDESITE_SLOPE = new mainSlope("andesite_slope", Blocks.STONE.getDefaultState(), Material.ROCK, SoundType.STONE, 1.5F, "pickaxe", 0, 10.0F, 0F, 1);
BlockMaker.ANDESITE_SLOPE = new mainSlope("andesite_slope", Blocks.STONE.getDefaultState(), Material.ROCK, SoundType.STONE, 1.5F, "pickaxe", 0, 10.0F, 0F, 1);
BlockMaker.ANDESITE_SLOPE = new mainSlope("andesite_slope", Blocks.STONE.getDefaultState(), Material.ROCK, SoundType.STONE, 1.5F, "pickaxe", 0, 10.0F, 0F, 1);
BlockMaker.ANDESITE_SLOPE = new mainSlope("andesite_slope", Blocks.STONE.getDefaultState(), Material.ROCK, SoundType.STONE, 1.5F, "pickaxe", 0, 10.0F, 0F, 1);
//Leaves
BlockMaker.ANDESITE_SLOPE = new mainSlope("andesite_slope", Blocks.STONE.getDefaultState(), Material.ROCK, SoundType.STONE, 1.5F, "pickaxe", 0, 10.0F, 0F, 1);
BlockMaker.ANDESITE_SLOPE = new mainSlope("andesite_slope", Blocks.STONE.getDefaultState(), Material.ROCK, SoundType.STONE, 1.5F, "pickaxe", 0, 10.0F, 0F, 1);
BlockMaker.ANDESITE_SLOPE = new mainSlope("andesite_slope", Blocks.STONE.getDefaultState(), Material.ROCK, SoundType.STONE, 1.5F, "pickaxe", 0, 10.0F, 0F, 1);
BlockMaker.ANDESITE_SLOPE = new mainSlope("andesite_slope", Blocks.STONE.getDefaultState(), Material.ROCK, SoundType.STONE, 1.5F, "pickaxe", 0, 10.0F, 0F, 1);
BlockMaker.ANDESITE_SLOPE = new mainSlope("andesite_slope", Blocks.STONE.getDefaultState(), Material.ROCK, SoundType.STONE, 1.5F, "pickaxe", 0, 10.0F, 0F, 1);
BlockMaker.ANDESITE_SLOPE = new mainSlope("andesite_slope", Blocks.STONE.getDefaultState(), Material.ROCK, SoundType.STONE, 1.5F, "pickaxe", 0, 10.0F, 0F, 1);
//Monster Egg Stone
BlockMaker.ANDESITE_SLOPE = new mainSlope("andesite_slope", Blocks.STONE.getDefaultState(), Material.ROCK, SoundType.STONE, 1.5F, "pickaxe", 0, 10.0F, 0F, 1);
BlockMaker.ANDESITE_SLOPE = new mainSlope("andesite_slope", Blocks.STONE.getDefaultState(), Material.ROCK, SoundType.STONE, 1.5F, "pickaxe", 0, 10.0F, 0F, 1);
BlockMaker.ANDESITE_SLOPE = new mainSlope("andesite_slope", Blocks.STONE.getDefaultState(), Material.ROCK, SoundType.STONE, 1.5F, "pickaxe", 0, 10.0F, 0F, 1);
BlockMaker.ANDESITE_SLOPE = new mainSlope("andesite_slope", Blocks.STONE.getDefaultState(), Material.ROCK, SoundType.STONE, 1.5F, "pickaxe", 0, 10.0F, 0F, 1);
BlockMaker.ANDESITE_SLOPE = new mainSlope("andesite_slope", Blocks.STONE.getDefaultState(), Material.ROCK, SoundType.STONE, 1.5F, "pickaxe", 0, 10.0F, 0F, 1);
BlockMaker.ANDESITE_SLOPE = new mainSlope("andesite_slope", Blocks.STONE.getDefaultState(), Material.ROCK, SoundType.STONE, 1.5F, "pickaxe", 0, 10.0F, 0F, 1);
//Glazed Terracotta
BlockMaker.ANDESITE_SLOPE = new mainSlope("andesite_slope", Blocks.STONE.getDefaultState(), Material.ROCK, SoundType.STONE, 1.5F, "pickaxe", 0, 10.0F, 0F, 1);
BlockMaker.ANDESITE_SLOPE = new mainSlope("andesite_slope", Blocks.STONE.getDefaultState(), Material.ROCK, SoundType.STONE, 1.5F, "pickaxe", 0, 10.0F, 0F, 1);
BlockMaker.ANDESITE_SLOPE = new mainSlope("andesite_slope", Blocks.STONE.getDefaultState(), Material.ROCK, SoundType.STONE, 1.5F, "pickaxe", 0, 10.0F, 0F, 1);
BlockMaker.ANDESITE_SLOPE = new mainSlope("andesite_slope", Blocks.STONE.getDefaultState(), Material.ROCK, SoundType.STONE, 1.5F, "pickaxe", 0, 10.0F, 0F, 1);
BlockMaker.ANDESITE_SLOPE = new mainSlope("andesite_slope", Blocks.STONE.getDefaultState(), Material.ROCK, SoundType.STONE, 1.5F, "pickaxe", 0, 10.0F, 0F, 1);
BlockMaker.ANDESITE_SLOPE = new mainSlope("andesite_slope", Blocks.STONE.getDefaultState(), Material.ROCK, SoundType.STONE, 1.5F, "pickaxe", 0, 10.0F, 0F, 1);
BlockMaker.ANDESITE_SLOPE = new mainSlope("andesite_slope", Blocks.STONE.getDefaultState(), Material.ROCK, SoundType.STONE, 1.5F, "pickaxe", 0, 10.0F, 0F, 1);
BlockMaker.ANDESITE_SLOPE = new mainSlope("andesite_slope", Blocks.STONE.getDefaultState(), Material.ROCK, SoundType.STONE, 1.5F, "pickaxe", 0, 10.0F, 0F, 1);
BlockMaker.ANDESITE_SLOPE = new mainSlope("andesite_slope", Blocks.STONE.getDefaultState(), Material.ROCK, SoundType.STONE, 1.5F, "pickaxe", 0, 10.0F, 0F, 1);
BlockMaker.ANDESITE_SLOPE = new mainSlope("andesite_slope", Blocks.STONE.getDefaultState(), Material.ROCK, SoundType.STONE, 1.5F, "pickaxe", 0, 10.0F, 0F, 1);
BlockMaker.ANDESITE_SLOPE = new mainSlope("andesite_slope", Blocks.STONE.getDefaultState(), Material.ROCK, SoundType.STONE, 1.5F, "pickaxe", 0, 10.0F, 0F, 1);
BlockMaker.ANDESITE_SLOPE = new mainSlope("andesite_slope", Blocks.STONE.getDefaultState(), Material.ROCK, SoundType.STONE, 1.5F, "pickaxe", 0, 10.0F, 0F, 1);
BlockMaker.ANDESITE_SLOPE = new mainSlope("andesite_slope", Blocks.STONE.getDefaultState(), Material.ROCK, SoundType.STONE, 1.5F, "pickaxe", 0, 10.0F, 0F, 1);
BlockMaker.ANDESITE_SLOPE = new mainSlope("andesite_slope", Blocks.STONE.getDefaultState(), Material.ROCK, SoundType.STONE, 1.5F, "pickaxe", 0, 10.0F, 0F, 1);
BlockMaker.ANDESITE_SLOPE = new mainSlope("andesite_slope", Blocks.STONE.getDefaultState(), Material.ROCK, SoundType.STONE, 1.5F, "pickaxe", 0, 10.0F, 0F, 1);
BlockMaker.ANDESITE_SLOPE = new mainSlope("andesite_slope", Blocks.STONE.getDefaultState(), Material.ROCK, SoundType.STONE, 1.5F, "pickaxe", 0, 10.0F, 0F, 1);
*/
}

}
