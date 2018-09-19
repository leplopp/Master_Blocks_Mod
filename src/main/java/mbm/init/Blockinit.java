package mbm.init;

import java.util.Random;

import mbm.Reference;
import mbm.init.Blocks.BlockFullGrass;
import mbm.init.Blocks.MainBlock;
import mbm.init.Blocks.SlopeGrass;
import mbm.init.Blocks.StructureBlock;
import mbm.init.Blocks.MainSlope;
import net.minecraft.block.Block;
import net.minecraft.block.BlockGlass;
import net.minecraft.block.BlockGrass;
import net.minecraft.block.BlockLadder;
import net.minecraft.block.BlockPlanks;
import net.minecraft.block.SoundType;
import net.minecraft.block.material.Material;
import net.minecraft.client.renderer.block.model.ModelResourceLocation;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.init.Blocks;
import net.minecraft.item.Item;
import net.minecraft.item.ItemBlock;
import net.minecraft.item.ItemShears;
import net.minecraft.util.ResourceLocation;
import net.minecraftforge.client.model.ModelLoader;
import net.minecraftforge.fml.common.registry.ForgeRegistries;

public class Blockinit {

/**
 * Main METHOD
 * 
 * MainSlope(name, BlockState, Material, setSoundType, setHardness, setHarvestLevel/ Tool, setHarvestLevel/ level, setResistance, setLightLevel, quantityDropped);
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
	
BlockMaker.STRUCTURE_BLOCK = new StructureBlock("structure_block", false, Material.WOOD, SoundType.WOOD, 2.0F, "axe", 0, 5.0F, 0F, 1);
	
BlockMaker.STRUCTURE_SLOPE = new MainSlope("structure_slope", BlockMaker.STRUCTURE_BLOCK.getDefaultState(), Material.WOOD, SoundType.WOOD, 2.0F, "axe", 0, 5.0F, 0F, 1);

BlockMaker.STONE_SLOPE = new MainSlope("stone_slope", Blocks.STONE.getDefaultState(), Material.ROCK, SoundType.STONE, 1.5F, "pickaxe", 0, 10.0F, 0F, 1 );
BlockMaker.GRANITE_SLOPE = new MainSlope("granite_slope", Blocks.STONE.getDefaultState(), Material.ROCK, SoundType.STONE, 1.5F, "pickaxe", 0, 10.0F, 0F, 1);
BlockMaker.SMOOTH_GARNITE_SLOPE = new MainSlope("smooth_granite_slope", Blocks.STONE.getDefaultState(), Material.ROCK, SoundType.STONE, 1.5F, "pickaxe", 0, 10.0F, 0F, 1);
BlockMaker.DIORITE_SLOPE = new MainSlope("diorite_slope", Blocks.STONE.getDefaultState(), Material.ROCK, SoundType.STONE, 1.5F, "pickaxe", 0, 10.0F, 0F, 1);
BlockMaker.SMOOTH_DIORITE_SLOPE = new MainSlope("smooth_diorite_slope", Blocks.STONE.getDefaultState(), Material.ROCK, SoundType.STONE, 1.5F, "pickaxe", 0, 10.0F, 0F, 1);
BlockMaker.ANDESITE_SLOPE = new MainSlope("andesite_slope", Blocks.STONE.getDefaultState(), Material.ROCK, SoundType.STONE, 1.5F, "pickaxe", 0, 10.0F, 0F, 1);
BlockMaker.SMOOTH_ANDESTITE_SLOPE = new MainSlope("smooth_andesite_slope", Blocks.STONE.getDefaultState(), Material.ROCK, SoundType.STONE, 1.5F, "pickaxe", 0, 10.0F, 0F, 1);
BlockMaker.GRASS_SLOPE = new SlopeGrass("grass_slope", Blocks.GRASS.getDefaultState(), Material.GRASS, SoundType.PLANT, 0.6F, "shovel", 0, 0.0F, 0F, 1);
BlockMaker.FULL_GRASS = new BlockFullGrass("full_grass", Blocks.GRASS.getDefaultState(), Material.GRASS, SoundType.PLANT, 0.6F, "shovel", 0, 0.0F, 0F, 1);
BlockMaker.DIRT_SLOPE = new MainSlope("dirt_slope", Blocks.DIRT.getDefaultState(), Material.GROUND, SoundType.GROUND, 0.5F, "shovel", 0, 0.0F, 0F, 1);
BlockMaker.COARSE_DIRT_SLOPE = new MainSlope("coarse_dirt_slope", Blocks.DIRT.getDefaultState(), Material.GROUND, SoundType.GROUND, 0.5F, "shovel", 0, 0.0F, 0F, 1);
BlockMaker.PODZOL_SLOPE = new MainSlope("podzol_slope", Blocks.DIRT.getDefaultState(), Material.GROUND, SoundType.GROUND, 0.5F, "shovel", 0, 0.0F, 0F, 1);
BlockMaker.FULL_PODZOL = new MainBlock("full_podzol", Material.GROUND, SoundType.GROUND, 0.5F, "shovel", 0, 0.0F, 0F, 1);
BlockMaker.COBBLESTONE_SLOPE = new MainSlope("cobblestone_slope", Blocks.COBBLESTONE.getDefaultState(), Material.ROCK, SoundType.STONE, 2.0F, "pickaxe", 0, 10.0F, 0F, 1);
BlockMaker.OAK_PLANKS_SLOPE = new MainSlope("oak_planks_slope", Blocks.PLANKS.getDefaultState(), Material.WOOD, SoundType.WOOD, 2.0F, "axe", 0, 5.0F, 0F, 1);
BlockMaker.SPRUCE_PLANKS_SLOPE = new MainSlope("spruce_planks_slope", Blocks.PLANKS.getDefaultState(), Material.WOOD, SoundType.WOOD, 2.0F, "axe", 0, 5.0F, 0F, 1);
BlockMaker.BIRCH_PLANKS_SLOPE = new MainSlope("birch_planks_slope", Blocks.PLANKS.getDefaultState(), Material.WOOD, SoundType.WOOD, 2.0F, "axe", 0, 5.0F, 0F, 1);
BlockMaker.JUNGLE_PLANKS_SLOPE = new MainSlope("jungle_planks_slope", Blocks.PLANKS.getDefaultState(), Material.WOOD, SoundType.WOOD, 2.0F, "axe", 0, 5.0F, 0F, 1);
BlockMaker.ACACIA_PLANKS_SLOPE = new MainSlope("acacia_planks_slope", Blocks.PLANKS.getDefaultState(), Material.WOOD, SoundType.WOOD, 2.0F, "axe", 0, 5.0F, 0F, 1);
BlockMaker.DARK_OAK_PLANKS_SLOPE = new MainSlope("dark_oak_planks_slope", Blocks.PLANKS.getDefaultState(), Material.WOOD, SoundType.WOOD, 2.0F, "axe", 0, 5.0F, 0F, 1);
BlockMaker.BEDROCK_SLOPE = new MainSlope("bedrock_slope", Blocks.BEDROCK.getDefaultState(), Material.ROCK, SoundType.STONE, 0.0F, null, 0, 6000000.0F, 0F, 0).setBlockUnbreakable();
BlockMaker.SAND_SLOPE = new MainSlope("sand_slope", Blocks.SAND.getDefaultState(), Material.SAND, SoundType.SAND, 0.5F, "shovel", 0, 0.0F, 0F, 1);
BlockMaker.RED_SAND_SLOPE = new MainSlope("red_sand_slope", Blocks.SAND.getDefaultState(), Material.SAND, SoundType.SAND, 0.5F, "shovel", 0, 0.0F, 0F, 1);
BlockMaker.GRAVEL_SLOPE = new MainSlope("gravel_slope", Blocks.GRAVEL.getDefaultState(), Material.GROUND, SoundType.GROUND, 0.6F, "shovel", 0, 0.0F, 0F, 1);
BlockMaker.GOLD_ORE_SLOPE = new MainSlope("gold_ore_slope", Blocks.GOLD_ORE.getDefaultState(), Material.ROCK, SoundType.STONE, 3.0F, "pickaxe", 2, 5.0F, 0F, 1);
BlockMaker.IRON_ORE_SLOPE = new MainSlope("iron_ore_slope", Blocks.IRON_ORE.getDefaultState(), Material.ROCK, SoundType.STONE, 3.0F, "pickaxe", 1, 5.0F, 0F, 1);
BlockMaker.COAL_ORE_SLOPE = new MainSlope("coal_ore_slope", Blocks.COAL_ORE.getDefaultState(), Material.ROCK, SoundType.STONE, 3.0F, "pickaxe", 0, 5.0F, 0F, 1);
BlockMaker.LAPIS_ORE_SLOPE = new MainSlope("lapis_ore_slope", Blocks.LAPIS_ORE.getDefaultState(), Material.ROCK, SoundType.STONE, 3.0F, "pickaxe", 2, 5.0F, 0F, 1);
BlockMaker.DIAMOND_ORE_SLOPE = new MainSlope("diamond_ore_slope", Blocks.DIAMOND_ORE.getDefaultState(), Material.ROCK, SoundType.STONE, 3.0F, "pickaxe", 2, 5.0F, 0F, 1);
BlockMaker.REDSTONE_ORE_SLOPE = new MainSlope("redstone_ore_slope", Blocks.REDSTONE_ORE.getDefaultState(), Material.ROCK, SoundType.STONE, 3.0F, "pickaxe", 2, 5.0F, 0F, 1);
BlockMaker.EMERALD_ORE_SLOPE = new MainSlope("emerald_ore_slope", Blocks.EMERALD_ORE.getDefaultState(), Material.ROCK, SoundType.STONE, 3.0F, "pickaxe", 2, 5.0F, 0F, 1);
BlockMaker.QUARTZ_ORE_SLOPE = new MainSlope("quartz_ore_slope", Blocks.QUARTZ_ORE.getDefaultState(), Material.ROCK, SoundType.STONE, 3.0F, "pickaxe", 0, 5.0F, 0F, 1);
BlockMaker.OAK_LOG_SLOPE = new MainSlope("oak_log_slope", Blocks.LOG.getDefaultState(), Material.WOOD, SoundType.WOOD, 2.0F, "axe", 0, 5.0F, 0F, 1);
BlockMaker.SPRUCE_LOG_SLOPE = new MainSlope("spruce_log_slope", Blocks.LOG.getDefaultState(), Material.WOOD, SoundType.WOOD, 2.0F, "axe", 0, 5.0F, 0F, 1);
BlockMaker.BIRCH_LOG_SLOPE = new MainSlope("birch_log_slope", Blocks.LOG.getDefaultState(), Material.WOOD, SoundType.WOOD, 2.0F, "axe", 0, 5.0F, 0F, 1);
BlockMaker.JUNGLE_LOG_SLOPE = new MainSlope("jungle_log_slope", Blocks.LOG.getDefaultState(), Material.WOOD, SoundType.WOOD, 2.0F, "axe", 0, 5.0F, 0F, 1);
BlockMaker.ACACIA_LOG_SLOPE = new MainSlope("acacia_log_slope", Blocks.LOG2.getDefaultState(), Material.WOOD, SoundType.WOOD, 2.0F, "axe", 0, 5.0F, 0F, 1);
BlockMaker.DARK_OAK_LOG_SLOPE = new MainSlope("dark_oak_log_slope", Blocks.LOG2.getDefaultState(), Material.WOOD, SoundType.WOOD, 2.0F, "axe", 0, 5.0F, 0F, 1);
BlockMaker.SPONGE_SLOPE = new MainSlope("sponge_slope", Blocks.STONE.getDefaultState(), Material.SPONGE, SoundType.PLANT, 0.6F, null, 0, 0.0F, 0F, 1);
BlockMaker.WET_SPONGE_SLOPE= new MainSlope("wet_sponge_slope", Blocks.STONE.getDefaultState(), Material.SPONGE, SoundType.PLANT, 0.6F, null, 0, 0.0F, 0F, 1);
BlockMaker.GLASS_SLOPE = new MainSlope("glass_slope", Blocks.GLASS.getDefaultState(), Material.GLASS, SoundType.GLASS, 0.3F, null, 0, 0.0F, 0F, 0);
//Ore Blocks 
BlockMaker.LAPIS_BLOCK_SLOPE = new MainSlope("lapis_block_slope", Blocks.LAPIS_BLOCK.getDefaultState(), Material.ROCK, SoundType.STONE, 3.0F, "pickaxe", 1, 5.0F, 0F, 1);
BlockMaker.GOLD_BLOCK_SLOPE = new MainSlope("gold_block_slope", Blocks.GOLD_BLOCK.getDefaultState(), Material.IRON, SoundType.METAL, 3.0F, "pickaxe", 1, 10.0F, 0F, 1);
BlockMaker.IRON_BLOCK_SLOPE = new MainSlope("iron_block_slope", Blocks.IRON_BLOCK.getDefaultState(), Material.IRON, SoundType.METAL, 5.0F, "pickaxe", 1, 10.0F, 0F, 1);
BlockMaker.DIAMOND_BLOCK_SLOPE = new MainSlope("diamant_block_slope", Blocks.DIAMOND_BLOCK.getDefaultState(), Material.IRON, SoundType.METAL, 5.0F, "pickaxe", 2, 10.0F, 0F, 1);
BlockMaker.EMERALD_BLOCK_SLOPE = new MainSlope("emerald_block_slope", Blocks.EMERALD_BLOCK.getDefaultState(), Material.IRON, SoundType.METAL, 5.0F, "pickaxe", 2, 10.0F, 0F, 1);
BlockMaker.REDSTONE_BLOCK_SLOPE = new MainSlope("redstone_block_slope", Blocks.REDSTONE_BLOCK.getDefaultState(), Material.IRON, SoundType.METAL, 5F, "pickaxe", 1, 10.0F, 0F, 1);
BlockMaker.COAL_BLOCK_SLOPE = new MainSlope("coal_block_slope", Blocks.COAL_BLOCK.getDefaultState(), Material.ROCK, SoundType.STONE, 5F, "pickaxe", 0, 10.0F, 0F, 1);
//Sandstone
BlockMaker.SANDSTONE_SLOPE = new MainSlope("sandstone_slope", Blocks.SANDSTONE.getDefaultState(), Material.ROCK, SoundType.STONE, 0.8F, "pickaxe", 0, 0.0F, 0F, 1);
BlockMaker.CHISELED_SANDSTONE_SLOPE = new MainSlope("chiseled_sandstone_slope", Blocks.SANDSTONE.getDefaultState(), Material.ROCK, SoundType.STONE, 0.8F, "pickaxe", 0, 0.0F, 0F, 1);
BlockMaker.SMOOTH_SANDSTONE_SLOPE = new MainSlope("smooth_sandstone_slope", Blocks.SANDSTONE.getDefaultState(), Material.ROCK, SoundType.STONE, 0.8F, "pickaxe", 0, 0.0F, 0F, 1);
//Wool
BlockMaker.WHITE_WOOL_SLOPE = new MainSlope("white_wool_slope", Blocks.WOOL.getDefaultState(), Material.CLOTH, SoundType.CLOTH, 0.8F, null, 0, 0.0F, 0F, 1);
BlockMaker.ORANGE_WOOL_SLOPE= new MainSlope("orange_wool_slope", Blocks.WOOL.getDefaultState(), Material.CLOTH, SoundType.CLOTH, 0.8F, null, 0, 0.0F, 0F, 1);
BlockMaker.MAGENTA_WOOL_SLOPE = new MainSlope("magenta_wool_slope", Blocks.WOOL.getDefaultState(), Material.CLOTH, SoundType.CLOTH, 0.8F, null, 0, 0.0F, 0F, 1);
BlockMaker.LIGHT_BLUE_WOOL_SLOPE = new MainSlope("light_blue_wool_slope", Blocks.WOOL.getDefaultState(), Material.CLOTH, SoundType.CLOTH, 0.8F, null, 0, 0.0F, 0F, 1);
BlockMaker.YELLOW_WOOL_SLOPE = new MainSlope("yellow_wool_slope", Blocks.WOOL.getDefaultState(), Material.CLOTH, SoundType.CLOTH, 0.8F, null, 0, 0.0F, 0F, 1);
BlockMaker.LIME_WOOL_SLOPE = new MainSlope("lime_wool_slope", Blocks.WOOL.getDefaultState(), Material.CLOTH, SoundType.CLOTH, 0.8F, null, 0, 0.0F, 0F, 1);
BlockMaker.PINK_WOOL_SLOPE = new MainSlope("pink_wool_slope", Blocks.WOOL.getDefaultState(), Material.CLOTH, SoundType.CLOTH, 0.8F, null, 0, 0.0F, 0F, 1);
BlockMaker.GRAY_WOOL_SLOPE = new MainSlope("gray_wool_slope", Blocks.WOOL.getDefaultState(), Material.CLOTH, SoundType.CLOTH, 0.8F, null, 0, 0.0F, 0F, 1);
BlockMaker.SILVER_WOOL_SLOPE = new MainSlope("silver_wool_slope", Blocks.WOOL.getDefaultState(), Material.CLOTH, SoundType.CLOTH, 0.8F, null, 0, 0.0F, 0F, 1);
BlockMaker.CYAN_WOOL_SLOPE = new MainSlope("cyan_wool_slope", Blocks.WOOL.getDefaultState(), Material.CLOTH, SoundType.CLOTH, 0.8F, null, 0, 0.0F, 0F, 1);
BlockMaker.PURPLE_WOOL_SLOPE = new MainSlope("purple_wool_slope", Blocks.WOOL.getDefaultState(), Material.CLOTH, SoundType.CLOTH, 0.8F, null, 0, 0.0F, 0F, 1);
BlockMaker.BLUE_WOOL_SLOPE = new MainSlope("blue_wool_slope", Blocks.WOOL.getDefaultState(), Material.CLOTH, SoundType.CLOTH, 0.8F, null, 0, 0.0F, 0F, 1);
BlockMaker.BROWN_WOOL_SLOPE = new MainSlope("brown_wool_slope", Blocks.WOOL.getDefaultState(), Material.CLOTH, SoundType.CLOTH, 0.8F, null, 0, 0.0F, 0F, 1);
BlockMaker.GREEN_WOOL_SLOPE = new MainSlope("green_wool_slope", Blocks.WOOL.getDefaultState(), Material.CLOTH, SoundType.CLOTH, 0.8F, null, 0, 0.0F, 0F, 1);
BlockMaker.RED_WOOL_SLOPE = new MainSlope("red_wool_slope", Blocks.WOOL.getDefaultState(), Material.CLOTH, SoundType.CLOTH, 0.8F, null, 0, 0.0F, 0F, 1);
BlockMaker.BLACK_WOOL_SLOPE = new MainSlope("black_wool_slope", Blocks.WOOL.getDefaultState(), Material.CLOTH, SoundType.CLOTH, 0.8F, null, 0, 0.0F, 0F, 1);
//Brick
BlockMaker.BRICK_BLOCK_SLOPE = new MainSlope("brick_block_slope", Blocks.BRICK_BLOCK.getDefaultState(), Material.ROCK, SoundType.STONE, 2.0F, "pickaxe", 0, 10.0F, 0F, 1);
//Bookshelf
/*BlockMaker.ANDESITE_SLOPE = new MainSlope("andesite_slope", Blocks.STONE.getDefaultState(), Material.ROCK, SoundType.STONE, 1.5F, "pickaxe", 0, 10.0F, 0F, 1);
//Mossy Cobblestone
BlockMaker.ANDESITE_SLOPE = new MainSlope("andesite_slope", Blocks.STONE.getDefaultState(), Material.ROCK, SoundType.STONE, 1.5F, "pickaxe", 0, 10.0F, 0F, 1);
//Obsidian
BlockMaker.ANDESITE_SLOPE = new MainSlope("andesite_slope", Blocks.STONE.getDefaultState(), Material.ROCK, SoundType.STONE, 1.5F, "pickaxe", 0, 10.0F, 0F, 1);
//Ice 
BlockMaker.ANDESITE_SLOPE = new MainSlope("andesite_slope", Blocks.STONE.getDefaultState(), Material.ROCK, SoundType.STONE, 1.5F, "pickaxe", 0, 10.0F, 0F, 1);
BlockMaker.ANDESITE_SLOPE = new MainSlope("andesite_slope", Blocks.STONE.getDefaultState(), Material.ROCK, SoundType.STONE, 1.5F, "pickaxe", 0, 10.0F, 0F, 1);
//Snow
BlockMaker.ANDESITE_SLOPE = new MainSlope("andesite_slope", Blocks.STONE.getDefaultState(), Material.ROCK, SoundType.STONE, 1.5F, "pickaxe", 0, 10.0F, 0F, 1);
//Clay
BlockMaker.ANDESITE_SLOPE = new MainSlope("andesite_slope", Blocks.STONE.getDefaultState(), Material.ROCK, SoundType.STONE, 1.5F, "pickaxe", 0, 10.0F, 0F, 1);
//Pumkin
BlockMaker.ANDESITE_SLOPE = new MainSlope("andesite_slope", Blocks.STONE.getDefaultState(), Material.ROCK, SoundType.STONE, 1.5F, "pickaxe", 0, 10.0F, 0F, 1);
BlockMaker.ANDESITE_SLOPE = new MainSlope("andesite_slope", Blocks.STONE.getDefaultState(), Material.ROCK, SoundType.STONE, 1.5F, "pickaxe", 0, 10.0F, 0F, 1);
//Netherrack
BlockMaker.ANDESITE_SLOPE = new MainSlope("andesite_slope", Blocks.STONE.getDefaultState(), Material.ROCK, SoundType.STONE, 1.5F, "pickaxe", 0, 10.0F, 0F, 1);
//SoulSand
BlockMaker.ANDESITE_SLOPE = new MainSlope("andesite_slope", Blocks.STONE.getDefaultState(), Material.ROCK, SoundType.STONE, 1.5F, "pickaxe", 0, 10.0F, 0F, 1);
//Glowstone
BlockMaker.ANDESITE_SLOPE = new MainSlope("andesite_slope", Blocks.STONE.getDefaultState(), Material.ROCK, SoundType.STONE, 1.5F, "pickaxe", 0, 10.0F, 0F, 1);
//Stained Glass
BlockMaker.ANDESITE_SLOPE = new MainSlope("andesite_slope", Blocks.STONE.getDefaultState(), Material.ROCK, SoundType.STONE, 1.5F, "pickaxe", 0, 10.0F, 0F, 1);
BlockMaker.ANDESITE_SLOPE = new MainSlope("andesite_slope", Blocks.STONE.getDefaultState(), Material.ROCK, SoundType.STONE, 1.5F, "pickaxe", 0, 10.0F, 0F, 1);
BlockMaker.ANDESITE_SLOPE = new MainSlope("andesite_slope", Blocks.STONE.getDefaultState(), Material.ROCK, SoundType.STONE, 1.5F, "pickaxe", 0, 10.0F, 0F, 1);
BlockMaker.ANDESITE_SLOPE = new MainSlope("andesite_slope", Blocks.STONE.getDefaultState(), Material.ROCK, SoundType.STONE, 1.5F, "pickaxe", 0, 10.0F, 0F, 1);
BlockMaker.ANDESITE_SLOPE = new MainSlope("andesite_slope", Blocks.STONE.getDefaultState(), Material.ROCK, SoundType.STONE, 1.5F, "pickaxe", 0, 10.0F, 0F, 1);
BlockMaker.ANDESITE_SLOPE = new MainSlope("andesite_slope", Blocks.STONE.getDefaultState(), Material.ROCK, SoundType.STONE, 1.5F, "pickaxe", 0, 10.0F, 0F, 1);
BlockMaker.ANDESITE_SLOPE = new MainSlope("andesite_slope", Blocks.STONE.getDefaultState(), Material.ROCK, SoundType.STONE, 1.5F, "pickaxe", 0, 10.0F, 0F, 1);
BlockMaker.ANDESITE_SLOPE = new MainSlope("andesite_slope", Blocks.STONE.getDefaultState(), Material.ROCK, SoundType.STONE, 1.5F, "pickaxe", 0, 10.0F, 0F, 1);
BlockMaker.ANDESITE_SLOPE = new MainSlope("andesite_slope", Blocks.STONE.getDefaultState(), Material.ROCK, SoundType.STONE, 1.5F, "pickaxe", 0, 10.0F, 0F, 1);
BlockMaker.ANDESITE_SLOPE = new MainSlope("andesite_slope", Blocks.STONE.getDefaultState(), Material.ROCK, SoundType.STONE, 1.5F, "pickaxe", 0, 10.0F, 0F, 1);
BlockMaker.ANDESITE_SLOPE = new MainSlope("andesite_slope", Blocks.STONE.getDefaultState(), Material.ROCK, SoundType.STONE, 1.5F, "pickaxe", 0, 10.0F, 0F, 1);
BlockMaker.ANDESITE_SLOPE = new MainSlope("andesite_slope", Blocks.STONE.getDefaultState(), Material.ROCK, SoundType.STONE, 1.5F, "pickaxe", 0, 10.0F, 0F, 1);
BlockMaker.ANDESITE_SLOPE = new MainSlope("andesite_slope", Blocks.STONE.getDefaultState(), Material.ROCK, SoundType.STONE, 1.5F, "pickaxe", 0, 10.0F, 0F, 1);
BlockMaker.ANDESITE_SLOPE = new MainSlope("andesite_slope", Blocks.STONE.getDefaultState(), Material.ROCK, SoundType.STONE, 1.5F, "pickaxe", 0, 10.0F, 0F, 1);
BlockMaker.ANDESITE_SLOPE = new MainSlope("andesite_slope", Blocks.STONE.getDefaultState(), Material.ROCK, SoundType.STONE, 1.5F, "pickaxe", 0, 10.0F, 0F, 1);
BlockMaker.ANDESITE_SLOPE = new MainSlope("andesite_slope", Blocks.STONE.getDefaultState(), Material.ROCK, SoundType.STONE, 1.5F, "pickaxe", 0, 10.0F, 0F, 1);
//Stonebrick
BlockMaker.ANDESITE_SLOPE = new MainSlope("andesite_slope", Blocks.STONE.getDefaultState(), Material.ROCK, SoundType.STONE, 1.5F, "pickaxe", 0, 10.0F, 0F, 1);
BlockMaker.ANDESITE_SLOPE = new MainSlope("andesite_slope", Blocks.STONE.getDefaultState(), Material.ROCK, SoundType.STONE, 1.5F, "pickaxe", 0, 10.0F, 0F, 1);
BlockMaker.ANDESITE_SLOPE = new MainSlope("andesite_slope", Blocks.STONE.getDefaultState(), Material.ROCK, SoundType.STONE, 1.5F, "pickaxe", 0, 10.0F, 0F, 1);
BlockMaker.ANDESITE_SLOPE = new MainSlope("andesite_slope", Blocks.STONE.getDefaultState(), Material.ROCK, SoundType.STONE, 1.5F, "pickaxe", 0, 10.0F, 0F, 1);
//Melon Block
BlockMaker.ANDESITE_SLOPE = new MainSlope("andesite_slope", Blocks.STONE.getDefaultState(), Material.ROCK, SoundType.STONE, 1.5F, "pickaxe", 0, 10.0F, 0F, 1);
//Mycelium
BlockMaker.ANDESITE_SLOPE = new MainSlope("andesite_slope", Blocks.STONE.getDefaultState(), Material.ROCK, SoundType.STONE, 1.5F, "pickaxe", 0, 10.0F, 0F, 1);
//Netherbrick
BlockMaker.ANDESITE_SLOPE = new MainSlope("andesite_slope", Blocks.STONE.getDefaultState(), Material.ROCK, SoundType.STONE, 1.5F, "pickaxe", 0, 10.0F, 0F, 1);
//End Stone
BlockMaker.ANDESITE_SLOPE = new MainSlope("andesite_slope", Blocks.STONE.getDefaultState(), Material.ROCK, SoundType.STONE, 1.5F, "pickaxe", 0, 10.0F, 0F, 1);
//Quartz
BlockMaker.ANDESITE_SLOPE = new MainSlope("andesite_slope", Blocks.STONE.getDefaultState(), Material.ROCK, SoundType.STONE, 1.5F, "pickaxe", 0, 10.0F, 0F, 1);
BlockMaker.ANDESITE_SLOPE = new MainSlope("andesite_slope", Blocks.STONE.getDefaultState(), Material.ROCK, SoundType.STONE, 1.5F, "pickaxe", 0, 10.0F, 0F, 1);
BlockMaker.ANDESITE_SLOPE = new MainSlope("andesite_slope", Blocks.STONE.getDefaultState(), Material.ROCK, SoundType.STONE, 1.5F, "pickaxe", 0, 10.0F, 0F, 1);
//Stained Hardened Clay 
BlockMaker.ANDESITE_SLOPE = new MainSlope("andesite_slope", Blocks.STONE.getDefaultState(), Material.ROCK, SoundType.STONE, 1.5F, "pickaxe", 0, 10.0F, 0F, 1);
BlockMaker.ANDESITE_SLOPE = new MainSlope("andesite_slope", Blocks.STONE.getDefaultState(), Material.ROCK, SoundType.STONE, 1.5F, "pickaxe", 0, 10.0F, 0F, 1);
BlockMaker.ANDESITE_SLOPE = new MainSlope("andesite_slope", Blocks.STONE.getDefaultState(), Material.ROCK, SoundType.STONE, 1.5F, "pickaxe", 0, 10.0F, 0F, 1);
BlockMaker.ANDESITE_SLOPE = new MainSlope("andesite_slope", Blocks.STONE.getDefaultState(), Material.ROCK, SoundType.STONE, 1.5F, "pickaxe", 0, 10.0F, 0F, 1);
BlockMaker.ANDESITE_SLOPE = new MainSlope("andesite_slope", Blocks.STONE.getDefaultState(), Material.ROCK, SoundType.STONE, 1.5F, "pickaxe", 0, 10.0F, 0F, 1);
BlockMaker.ANDESITE_SLOPE = new MainSlope("andesite_slope", Blocks.STONE.getDefaultState(), Material.ROCK, SoundType.STONE, 1.5F, "pickaxe", 0, 10.0F, 0F, 1);
BlockMaker.ANDESITE_SLOPE = new MainSlope("andesite_slope", Blocks.STONE.getDefaultState(), Material.ROCK, SoundType.STONE, 1.5F, "pickaxe", 0, 10.0F, 0F, 1);
BlockMaker.ANDESITE_SLOPE = new MainSlope("andesite_slope", Blocks.STONE.getDefaultState(), Material.ROCK, SoundType.STONE, 1.5F, "pickaxe", 0, 10.0F, 0F, 1);
BlockMaker.ANDESITE_SLOPE = new MainSlope("andesite_slope", Blocks.STONE.getDefaultState(), Material.ROCK, SoundType.STONE, 1.5F, "pickaxe", 0, 10.0F, 0F, 1);
BlockMaker.ANDESITE_SLOPE = new MainSlope("andesite_slope", Blocks.STONE.getDefaultState(), Material.ROCK, SoundType.STONE, 1.5F, "pickaxe", 0, 10.0F, 0F, 1);
BlockMaker.ANDESITE_SLOPE = new MainSlope("andesite_slope", Blocks.STONE.getDefaultState(), Material.ROCK, SoundType.STONE, 1.5F, "pickaxe", 0, 10.0F, 0F, 1);
BlockMaker.ANDESITE_SLOPE = new MainSlope("andesite_slope", Blocks.STONE.getDefaultState(), Material.ROCK, SoundType.STONE, 1.5F, "pickaxe", 0, 10.0F, 0F, 1);
BlockMaker.ANDESITE_SLOPE = new MainSlope("andesite_slope", Blocks.STONE.getDefaultState(), Material.ROCK, SoundType.STONE, 1.5F, "pickaxe", 0, 10.0F, 0F, 1);
BlockMaker.ANDESITE_SLOPE = new MainSlope("andesite_slope", Blocks.STONE.getDefaultState(), Material.ROCK, SoundType.STONE, 1.5F, "pickaxe", 0, 10.0F, 0F, 1);
BlockMaker.ANDESITE_SLOPE = new MainSlope("andesite_slope", Blocks.STONE.getDefaultState(), Material.ROCK, SoundType.STONE, 1.5F, "pickaxe", 0, 10.0F, 0F, 1);
BlockMaker.ANDESITE_SLOPE = new MainSlope("andesite_slope", Blocks.STONE.getDefaultState(), Material.ROCK, SoundType.STONE, 1.5F, "pickaxe", 0, 10.0F, 0F, 1);
//Prismarine
BlockMaker.ANDESITE_SLOPE = new MainSlope("andesite_slope", Blocks.STONE.getDefaultState(), Material.ROCK, SoundType.STONE, 1.5F, "pickaxe", 0, 10.0F, 0F, 1);
BlockMaker.ANDESITE_SLOPE = new MainSlope("andesite_slope", Blocks.STONE.getDefaultState(), Material.ROCK, SoundType.STONE, 1.5F, "pickaxe", 0, 10.0F, 0F, 1);
BlockMaker.ANDESITE_SLOPE = new MainSlope("andesite_slope", Blocks.STONE.getDefaultState(), Material.ROCK, SoundType.STONE, 1.5F, "pickaxe", 0, 10.0F, 0F, 1);
//Sea Lantern 
BlockMaker.ANDESITE_SLOPE = new MainSlope("andesite_slope", Blocks.STONE.getDefaultState(), Material.ROCK, SoundType.STONE, 1.5F, "pickaxe", 0, 10.0F, 0F, 1);
//Hay Block
BlockMaker.ANDESITE_SLOPE = new MainSlope("andesite_slope", Blocks.STONE.getDefaultState(), Material.ROCK, SoundType.STONE, 1.5F, "pickaxe", 0, 10.0F, 0F, 1);
//Hardened Clay
BlockMaker.ANDESITE_SLOPE = new MainSlope("andesite_slope", Blocks.STONE.getDefaultState(), Material.ROCK, SoundType.STONE, 1.5F, "pickaxe", 0, 10.0F, 0F, 1);
//Red Sandstone
BlockMaker.ANDESITE_SLOPE = new MainSlope("andesite_slope", Blocks.STONE.getDefaultState(), Material.ROCK, SoundType.STONE, 1.5F, "pickaxe", 0, 10.0F, 0F, 1);
BlockMaker.ANDESITE_SLOPE = new MainSlope("andesite_slope", Blocks.STONE.getDefaultState(), Material.ROCK, SoundType.STONE, 1.5F, "pickaxe", 0, 10.0F, 0F, 1);
BlockMaker.ANDESITE_SLOPE = new MainSlope("andesite_slope", Blocks.STONE.getDefaultState(), Material.ROCK, SoundType.STONE, 1.5F, "pickaxe", 0, 10.0F, 0F, 1);
//Purpur Block
BlockMaker.ANDESITE_SLOPE = new MainSlope("andesite_slope", Blocks.STONE.getDefaultState(), Material.ROCK, SoundType.STONE, 1.5F, "pickaxe", 0, 10.0F, 0F, 1);
BlockMaker.ANDESITE_SLOPE = new MainSlope("andesite_slope", Blocks.STONE.getDefaultState(), Material.ROCK, SoundType.STONE, 1.5F, "pickaxe", 0, 10.0F, 0F, 1);
//End Stone Bricks
BlockMaker.ANDESITE_SLOPE = new MainSlope("andesite_slope", Blocks.STONE.getDefaultState(), Material.ROCK, SoundType.STONE, 1.5F, "pickaxe", 0, 10.0F, 0F, 1);
//Magma Block
BlockMaker.ANDESITE_SLOPE = new MainSlope("andesite_slope", Blocks.STONE.getDefaultState(), Material.ROCK, SoundType.STONE, 1.5F, "pickaxe", 0, 10.0F, 0F, 1);
//Nether Wart Block
BlockMaker.ANDESITE_SLOPE = new MainSlope("andesite_slope", Blocks.STONE.getDefaultState(), Material.ROCK, SoundType.STONE, 1.5F, "pickaxe", 0, 10.0F, 0F, 1);
//Red Nether Brick
BlockMaker.ANDESITE_SLOPE = new MainSlope("andesite_slope", Blocks.STONE.getDefaultState(), Material.ROCK, SoundType.STONE, 1.5F, "pickaxe", 0, 10.0F, 0F, 1);
//Bone Block
BlockMaker.ANDESITE_SLOPE = new MainSlope("andesite_slope", Blocks.STONE.getDefaultState(), Material.ROCK, SoundType.STONE, 1.5F, "pickaxe", 0, 10.0F, 0F, 1);
//Note Block 
BlockMaker.ANDESITE_SLOPE = new MainSlope("andesite_slope", Blocks.STONE.getDefaultState(), Material.ROCK, SoundType.STONE, 1.5F, "pickaxe", 0, 10.0F, 0F, 1);
//TNT 
BlockMaker.ANDESITE_SLOPE = new MainSlope("andesite_slope", Blocks.STONE.getDefaultState(), Material.ROCK, SoundType.STONE, 1.5F, "pickaxe", 0, 10.0F, 0F, 1);
//Redstone Lamp 
BlockMaker.ANDESITE_SLOPE = new MainSlope("andesite_slope", Blocks.STONE.getDefaultState(), Material.ROCK, SoundType.STONE, 1.5F, "pickaxe", 0, 10.0F, 0F, 1);
//Mushroom Block
BlockMaker.ANDESITE_SLOPE = new MainSlope("andesite_slope", Blocks.STONE.getDefaultState(), Material.ROCK, SoundType.STONE, 1.5F, "pickaxe", 0, 10.0F, 0F, 1);
BlockMaker.ANDESITE_SLOPE = new MainSlope("andesite_slope", Blocks.STONE.getDefaultState(), Material.ROCK, SoundType.STONE, 1.5F, "pickaxe", 0, 10.0F, 0F, 1);
BlockMaker.ANDESITE_SLOPE = new MainSlope("andesite_slope", Blocks.STONE.getDefaultState(), Material.ROCK, SoundType.STONE, 1.5F, "pickaxe", 0, 10.0F, 0F, 1);
BlockMaker.ANDESITE_SLOPE = new MainSlope("andesite_slope", Blocks.STONE.getDefaultState(), Material.ROCK, SoundType.STONE, 1.5F, "pickaxe", 0, 10.0F, 0F, 1);
//Concrete
BlockMaker.ANDESITE_SLOPE = new MainSlope("andesite_slope", Blocks.STONE.getDefaultState(), Material.ROCK, SoundType.STONE, 1.5F, "pickaxe", 0, 10.0F, 0F, 1);
BlockMaker.ANDESITE_SLOPE = new MainSlope("andesite_slope", Blocks.STONE.getDefaultState(), Material.ROCK, SoundType.STONE, 1.5F, "pickaxe", 0, 10.0F, 0F, 1);
BlockMaker.ANDESITE_SLOPE = new MainSlope("andesite_slope", Blocks.STONE.getDefaultState(), Material.ROCK, SoundType.STONE, 1.5F, "pickaxe", 0, 10.0F, 0F, 1);
BlockMaker.ANDESITE_SLOPE = new MainSlope("andesite_slope", Blocks.STONE.getDefaultState(), Material.ROCK, SoundType.STONE, 1.5F, "pickaxe", 0, 10.0F, 0F, 1);
BlockMaker.ANDESITE_SLOPE = new MainSlope("andesite_slope", Blocks.STONE.getDefaultState(), Material.ROCK, SoundType.STONE, 1.5F, "pickaxe", 0, 10.0F, 0F, 1);
BlockMaker.ANDESITE_SLOPE = new MainSlope("andesite_slope", Blocks.STONE.getDefaultState(), Material.ROCK, SoundType.STONE, 1.5F, "pickaxe", 0, 10.0F, 0F, 1);
BlockMaker.ANDESITE_SLOPE = new MainSlope("andesite_slope", Blocks.STONE.getDefaultState(), Material.ROCK, SoundType.STONE, 1.5F, "pickaxe", 0, 10.0F, 0F, 1);
BlockMaker.ANDESITE_SLOPE = new MainSlope("andesite_slope", Blocks.STONE.getDefaultState(), Material.ROCK, SoundType.STONE, 1.5F, "pickaxe", 0, 10.0F, 0F, 1);
BlockMaker.ANDESITE_SLOPE = new MainSlope("andesite_slope", Blocks.STONE.getDefaultState(), Material.ROCK, SoundType.STONE, 1.5F, "pickaxe", 0, 10.0F, 0F, 1);
BlockMaker.ANDESITE_SLOPE = new MainSlope("andesite_slope", Blocks.STONE.getDefaultState(), Material.ROCK, SoundType.STONE, 1.5F, "pickaxe", 0, 10.0F, 0F, 1);
BlockMaker.ANDESITE_SLOPE = new MainSlope("andesite_slope", Blocks.STONE.getDefaultState(), Material.ROCK, SoundType.STONE, 1.5F, "pickaxe", 0, 10.0F, 0F, 1);
BlockMaker.ANDESITE_SLOPE = new MainSlope("andesite_slope", Blocks.STONE.getDefaultState(), Material.ROCK, SoundType.STONE, 1.5F, "pickaxe", 0, 10.0F, 0F, 1);
BlockMaker.ANDESITE_SLOPE = new MainSlope("andesite_slope", Blocks.STONE.getDefaultState(), Material.ROCK, SoundType.STONE, 1.5F, "pickaxe", 0, 10.0F, 0F, 1);
BlockMaker.ANDESITE_SLOPE = new MainSlope("andesite_slope", Blocks.STONE.getDefaultState(), Material.ROCK, SoundType.STONE, 1.5F, "pickaxe", 0, 10.0F, 0F, 1);
BlockMaker.ANDESITE_SLOPE = new MainSlope("andesite_slope", Blocks.STONE.getDefaultState(), Material.ROCK, SoundType.STONE, 1.5F, "pickaxe", 0, 10.0F, 0F, 1);
BlockMaker.ANDESITE_SLOPE = new MainSlope("andesite_slope", Blocks.STONE.getDefaultState(), Material.ROCK, SoundType.STONE, 1.5F, "pickaxe", 0, 10.0F, 0F, 1);
//Concrete Powder 
BlockMaker.ANDESITE_SLOPE = new MainSlope("andesite_slope", Blocks.STONE.getDefaultState(), Material.ROCK, SoundType.STONE, 1.5F, "pickaxe", 0, 10.0F, 0F, 1);
BlockMaker.ANDESITE_SLOPE = new MainSlope("andesite_slope", Blocks.STONE.getDefaultState(), Material.ROCK, SoundType.STONE, 1.5F, "pickaxe", 0, 10.0F, 0F, 1);
BlockMaker.ANDESITE_SLOPE = new MainSlope("andesite_slope", Blocks.STONE.getDefaultState(), Material.ROCK, SoundType.STONE, 1.5F, "pickaxe", 0, 10.0F, 0F, 1);
BlockMaker.ANDESITE_SLOPE = new MainSlope("andesite_slope", Blocks.STONE.getDefaultState(), Material.ROCK, SoundType.STONE, 1.5F, "pickaxe", 0, 10.0F, 0F, 1);
BlockMaker.ANDESITE_SLOPE = new MainSlope("andesite_slope", Blocks.STONE.getDefaultState(), Material.ROCK, SoundType.STONE, 1.5F, "pickaxe", 0, 10.0F, 0F, 1);
BlockMaker.ANDESITE_SLOPE = new MainSlope("andesite_slope", Blocks.STONE.getDefaultState(), Material.ROCK, SoundType.STONE, 1.5F, "pickaxe", 0, 10.0F, 0F, 1);
BlockMaker.ANDESITE_SLOPE = new MainSlope("andesite_slope", Blocks.STONE.getDefaultState(), Material.ROCK, SoundType.STONE, 1.5F, "pickaxe", 0, 10.0F, 0F, 1);
BlockMaker.ANDESITE_SLOPE = new MainSlope("andesite_slope", Blocks.STONE.getDefaultState(), Material.ROCK, SoundType.STONE, 1.5F, "pickaxe", 0, 10.0F, 0F, 1);
BlockMaker.ANDESITE_SLOPE = new MainSlope("andesite_slope", Blocks.STONE.getDefaultState(), Material.ROCK, SoundType.STONE, 1.5F, "pickaxe", 0, 10.0F, 0F, 1);
BlockMaker.ANDESITE_SLOPE = new MainSlope("andesite_slope", Blocks.STONE.getDefaultState(), Material.ROCK, SoundType.STONE, 1.5F, "pickaxe", 0, 10.0F, 0F, 1);
BlockMaker.ANDESITE_SLOPE = new MainSlope("andesite_slope", Blocks.STONE.getDefaultState(), Material.ROCK, SoundType.STONE, 1.5F, "pickaxe", 0, 10.0F, 0F, 1);
BlockMaker.ANDESITE_SLOPE = new MainSlope("andesite_slope", Blocks.STONE.getDefaultState(), Material.ROCK, SoundType.STONE, 1.5F, "pickaxe", 0, 10.0F, 0F, 1);
BlockMaker.ANDESITE_SLOPE = new MainSlope("andesite_slope", Blocks.STONE.getDefaultState(), Material.ROCK, SoundType.STONE, 1.5F, "pickaxe", 0, 10.0F, 0F, 1);
BlockMaker.ANDESITE_SLOPE = new MainSlope("andesite_slope", Blocks.STONE.getDefaultState(), Material.ROCK, SoundType.STONE, 1.5F, "pickaxe", 0, 10.0F, 0F, 1);
BlockMaker.ANDESITE_SLOPE = new MainSlope("andesite_slope", Blocks.STONE.getDefaultState(), Material.ROCK, SoundType.STONE, 1.5F, "pickaxe", 0, 10.0F, 0F, 1);
BlockMaker.ANDESITE_SLOPE = new MainSlope("andesite_slope", Blocks.STONE.getDefaultState(), Material.ROCK, SoundType.STONE, 1.5F, "pickaxe", 0, 10.0F, 0F, 1);
//Leaves
BlockMaker.ANDESITE_SLOPE = new MainSlope("andesite_slope", Blocks.STONE.getDefaultState(), Material.ROCK, SoundType.STONE, 1.5F, "pickaxe", 0, 10.0F, 0F, 1);
BlockMaker.ANDESITE_SLOPE = new MainSlope("andesite_slope", Blocks.STONE.getDefaultState(), Material.ROCK, SoundType.STONE, 1.5F, "pickaxe", 0, 10.0F, 0F, 1);
BlockMaker.ANDESITE_SLOPE = new MainSlope("andesite_slope", Blocks.STONE.getDefaultState(), Material.ROCK, SoundType.STONE, 1.5F, "pickaxe", 0, 10.0F, 0F, 1);
BlockMaker.ANDESITE_SLOPE = new MainSlope("andesite_slope", Blocks.STONE.getDefaultState(), Material.ROCK, SoundType.STONE, 1.5F, "pickaxe", 0, 10.0F, 0F, 1);
BlockMaker.ANDESITE_SLOPE = new MainSlope("andesite_slope", Blocks.STONE.getDefaultState(), Material.ROCK, SoundType.STONE, 1.5F, "pickaxe", 0, 10.0F, 0F, 1);
BlockMaker.ANDESITE_SLOPE = new MainSlope("andesite_slope", Blocks.STONE.getDefaultState(), Material.ROCK, SoundType.STONE, 1.5F, "pickaxe", 0, 10.0F, 0F, 1);
//Monster Egg Stone
BlockMaker.ANDESITE_SLOPE = new MainSlope("andesite_slope", Blocks.STONE.getDefaultState(), Material.ROCK, SoundType.STONE, 1.5F, "pickaxe", 0, 10.0F, 0F, 1);
BlockMaker.ANDESITE_SLOPE = new MainSlope("andesite_slope", Blocks.STONE.getDefaultState(), Material.ROCK, SoundType.STONE, 1.5F, "pickaxe", 0, 10.0F, 0F, 1);
BlockMaker.ANDESITE_SLOPE = new MainSlope("andesite_slope", Blocks.STONE.getDefaultState(), Material.ROCK, SoundType.STONE, 1.5F, "pickaxe", 0, 10.0F, 0F, 1);
BlockMaker.ANDESITE_SLOPE = new MainSlope("andesite_slope", Blocks.STONE.getDefaultState(), Material.ROCK, SoundType.STONE, 1.5F, "pickaxe", 0, 10.0F, 0F, 1);
BlockMaker.ANDESITE_SLOPE = new MainSlope("andesite_slope", Blocks.STONE.getDefaultState(), Material.ROCK, SoundType.STONE, 1.5F, "pickaxe", 0, 10.0F, 0F, 1);
BlockMaker.ANDESITE_SLOPE = new MainSlope("andesite_slope", Blocks.STONE.getDefaultState(), Material.ROCK, SoundType.STONE, 1.5F, "pickaxe", 0, 10.0F, 0F, 1);
//Glazed Terracotta
BlockMaker.ANDESITE_SLOPE = new MainSlope("andesite_slope", Blocks.STONE.getDefaultState(), Material.ROCK, SoundType.STONE, 1.5F, "pickaxe", 0, 10.0F, 0F, 1);
BlockMaker.ANDESITE_SLOPE = new MainSlope("andesite_slope", Blocks.STONE.getDefaultState(), Material.ROCK, SoundType.STONE, 1.5F, "pickaxe", 0, 10.0F, 0F, 1);
BlockMaker.ANDESITE_SLOPE = new MainSlope("andesite_slope", Blocks.STONE.getDefaultState(), Material.ROCK, SoundType.STONE, 1.5F, "pickaxe", 0, 10.0F, 0F, 1);
BlockMaker.ANDESITE_SLOPE = new MainSlope("andesite_slope", Blocks.STONE.getDefaultState(), Material.ROCK, SoundType.STONE, 1.5F, "pickaxe", 0, 10.0F, 0F, 1);
BlockMaker.ANDESITE_SLOPE = new MainSlope("andesite_slope", Blocks.STONE.getDefaultState(), Material.ROCK, SoundType.STONE, 1.5F, "pickaxe", 0, 10.0F, 0F, 1);
BlockMaker.ANDESITE_SLOPE = new MainSlope("andesite_slope", Blocks.STONE.getDefaultState(), Material.ROCK, SoundType.STONE, 1.5F, "pickaxe", 0, 10.0F, 0F, 1);
BlockMaker.ANDESITE_SLOPE = new MainSlope("andesite_slope", Blocks.STONE.getDefaultState(), Material.ROCK, SoundType.STONE, 1.5F, "pickaxe", 0, 10.0F, 0F, 1);
BlockMaker.ANDESITE_SLOPE = new MainSlope("andesite_slope", Blocks.STONE.getDefaultState(), Material.ROCK, SoundType.STONE, 1.5F, "pickaxe", 0, 10.0F, 0F, 1);
BlockMaker.ANDESITE_SLOPE = new MainSlope("andesite_slope", Blocks.STONE.getDefaultState(), Material.ROCK, SoundType.STONE, 1.5F, "pickaxe", 0, 10.0F, 0F, 1);
BlockMaker.ANDESITE_SLOPE = new MainSlope("andesite_slope", Blocks.STONE.getDefaultState(), Material.ROCK, SoundType.STONE, 1.5F, "pickaxe", 0, 10.0F, 0F, 1);
BlockMaker.ANDESITE_SLOPE = new MainSlope("andesite_slope", Blocks.STONE.getDefaultState(), Material.ROCK, SoundType.STONE, 1.5F, "pickaxe", 0, 10.0F, 0F, 1);
BlockMaker.ANDESITE_SLOPE = new MainSlope("andesite_slope", Blocks.STONE.getDefaultState(), Material.ROCK, SoundType.STONE, 1.5F, "pickaxe", 0, 10.0F, 0F, 1);
BlockMaker.ANDESITE_SLOPE = new MainSlope("andesite_slope", Blocks.STONE.getDefaultState(), Material.ROCK, SoundType.STONE, 1.5F, "pickaxe", 0, 10.0F, 0F, 1);
BlockMaker.ANDESITE_SLOPE = new MainSlope("andesite_slope", Blocks.STONE.getDefaultState(), Material.ROCK, SoundType.STONE, 1.5F, "pickaxe", 0, 10.0F, 0F, 1);
BlockMaker.ANDESITE_SLOPE = new MainSlope("andesite_slope", Blocks.STONE.getDefaultState(), Material.ROCK, SoundType.STONE, 1.5F, "pickaxe", 0, 10.0F, 0F, 1);
BlockMaker.ANDESITE_SLOPE = new MainSlope("andesite_slope", Blocks.STONE.getDefaultState(), Material.ROCK, SoundType.STONE, 1.5F, "pickaxe", 0, 10.0F, 0F, 1);
*/
}

}
