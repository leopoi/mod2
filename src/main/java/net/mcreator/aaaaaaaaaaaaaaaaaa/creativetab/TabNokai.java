
package net.mcreator.aaaaaaaaaaaaaaaaaa.creativetab;

import net.minecraftforge.fml.relauncher.SideOnly;
import net.minecraftforge.fml.relauncher.Side;

import net.minecraft.item.ItemStack;
import net.minecraft.creativetab.CreativeTabs;

import net.mcreator.aaaaaaaaaaaaaaaaaa.item.ItemNokia3310;
import net.mcreator.aaaaaaaaaaaaaaaaaa.ElementsAaaaaaaaaaaaaaaaaa;

@ElementsAaaaaaaaaaaaaaaaaa.ModElement.Tag
public class TabNokai extends ElementsAaaaaaaaaaaaaaaaaa.ModElement {
	public TabNokai(ElementsAaaaaaaaaaaaaaaaaa instance) {
		super(instance, 4);
	}

	@Override
	public void initElements() {
		tab = new CreativeTabs("tabnokai") {
			@SideOnly(Side.CLIENT)
			@Override
			public ItemStack getTabIconItem() {
				return new ItemStack(ItemNokia3310.block, (int) (1));
			}

			@SideOnly(Side.CLIENT)
			public boolean hasSearchBar() {
				return false;
			}
		};
	}
	public static CreativeTabs tab;
}
