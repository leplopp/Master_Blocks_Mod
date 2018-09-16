package mbm.util;

import mbm.Reference;
import mbm.init.BlockMaker;
import net.minecraft.block.state.IBlockState;
import net.minecraft.client.renderer.color.BlockColors;
import net.minecraft.client.renderer.color.IBlockColor;
import net.minecraft.client.renderer.color.IItemColor;
import net.minecraft.client.renderer.color.ItemColors;
import net.minecraft.item.ItemBlock;
import net.minecraft.world.ColorizerGrass;
import net.minecraft.world.biome.BiomeColorHelper;
import net.minecraftforge.client.event.ColorHandlerEvent;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.common.eventhandler.SubscribeEvent;

@Mod.EventBusSubscriber(modid = Reference.MODID)
public class ModColourManager {

		@SubscribeEvent
		public static void registerBlockColourHandlers(final ColorHandlerEvent.Block event) {
			final BlockColors blockColors = event.getBlockColors();

			// Use the grass colour of the biome or the default grass colour
			final IBlockColor grassColourHandler = (state, blockAccess, pos, tintIndex) -> {
				if (blockAccess != null && pos != null) {
					return BiomeColorHelper.getGrassColorAtPos(blockAccess, pos);
				}

				return ColorizerGrass.getGrassColor(0.5D, 1.0D);
			};

			blockColors.registerBlockColorHandler(grassColourHandler, BlockMaker.GRASS_SLOPE);
		}

		@SubscribeEvent
		public static void registerItemColourHandlers(final ColorHandlerEvent.Item event) {
			final BlockColors blockColors = event.getBlockColors();
			final ItemColors itemColors = event.getItemColors();

			// Use the Block's colour handler for an ItemBlock
			final IItemColor itemBlockColourHandler = (stack, tintIndex) -> {
				@SuppressWarnings("deprecation")
				final IBlockState state = ((ItemBlock) stack.getItem()).getBlock().getStateFromMeta(stack.getMetadata());
				return blockColors.colorMultiplier(state, null, null, tintIndex);
			};

			itemColors.registerItemColorHandler(itemBlockColourHandler,  BlockMaker.GRASS_SLOPE);
		}
	
}
