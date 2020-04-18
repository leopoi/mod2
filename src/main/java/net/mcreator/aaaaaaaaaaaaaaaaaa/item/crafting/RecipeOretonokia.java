
package net.mcreator.aaaaaaaaaaaaaaaaaa.item.crafting;

import net.minecraftforge.fml.common.registry.GameRegistry;
import net.minecraftforge.fml.common.event.FMLInitializationEvent;

import net.minecraft.item.ItemStack;

import net.mcreator.aaaaaaaaaaaaaaaaaa.item.ItemNokiaingot;
import net.mcreator.aaaaaaaaaaaaaaaaaa.block.BlockNokiaore;
import net.mcreator.aaaaaaaaaaaaaaaaaa.ElementsAaaaaaaaaaaaaaaaaa;

@ElementsAaaaaaaaaaaaaaaaaa.ModElement.Tag
public class RecipeOretonokia extends ElementsAaaaaaaaaaaaaaaaaa.ModElement {
	public RecipeOretonokia(ElementsAaaaaaaaaaaaaaaaaa instance) {
		super(instance, 3);
	}

	@Override
	public void init(FMLInitializationEvent event) {
		GameRegistry.addSmelting(new ItemStack(BlockNokiaore.block, (int) (1)), new ItemStack(ItemNokiaingot.block, (int) (1)), 0F);
	}
}
