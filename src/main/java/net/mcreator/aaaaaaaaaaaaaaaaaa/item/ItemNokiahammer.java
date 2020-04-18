
package net.mcreator.aaaaaaaaaaaaaaaaaa.item;

import net.minecraftforge.fml.relauncher.SideOnly;
import net.minecraftforge.fml.relauncher.Side;
import net.minecraftforge.fml.common.registry.GameRegistry;
import net.minecraftforge.common.util.EnumHelper;
import net.minecraftforge.client.model.ModelLoader;
import net.minecraftforge.client.event.ModelRegistryEvent;

import net.minecraft.item.ItemStack;
import net.minecraft.item.ItemPickaxe;
import net.minecraft.item.Item;
import net.minecraft.client.renderer.block.model.ModelResourceLocation;

import net.mcreator.aaaaaaaaaaaaaaaaaa.creativetab.TabNokai;
import net.mcreator.aaaaaaaaaaaaaaaaaa.ElementsAaaaaaaaaaaaaaaaaa;

import java.util.Set;
import java.util.HashMap;

@ElementsAaaaaaaaaaaaaaaaaa.ModElement.Tag
public class ItemNokiahammer extends ElementsAaaaaaaaaaaaaaaaaa.ModElement {
	@GameRegistry.ObjectHolder("aaaaaaaaaaaaaaaaaa:nokiahammer")
	public static final Item block = null;
	public ItemNokiahammer(ElementsAaaaaaaaaaaaaaaaaa instance) {
		super(instance, 12);
	}

	@Override
	public void initElements() {
		elements.items.add(() -> new ItemPickaxe(EnumHelper.addToolMaterial("NOKIAHAMMER", 25, 408, 16.5f, 10.5f, 32)) {
			{
				this.attackSpeed = -1.2f;
			}
			public Set<String> getToolClasses(ItemStack stack) {
				HashMap<String, Integer> ret = new HashMap<String, Integer>();
				ret.put("pickaxe", 25);
				return ret.keySet();
			}
		}.setUnlocalizedName("nokiahammer").setRegistryName("nokiahammer").setCreativeTab(TabNokai.tab));
	}

	@SideOnly(Side.CLIENT)
	@Override
	public void registerModels(ModelRegistryEvent event) {
		ModelLoader.setCustomModelResourceLocation(block, 0, new ModelResourceLocation("aaaaaaaaaaaaaaaaaa:nokiahammer", "inventory"));
	}
}
