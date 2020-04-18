
package net.mcreator.aaaaaaaaaaaaaaaaaa.item;

import net.minecraftforge.fml.relauncher.SideOnly;
import net.minecraftforge.fml.relauncher.Side;
import net.minecraftforge.fml.common.registry.GameRegistry;
import net.minecraftforge.common.util.EnumHelper;
import net.minecraftforge.client.model.ModelLoader;
import net.minecraftforge.client.event.ModelRegistryEvent;

import net.minecraft.util.ResourceLocation;
import net.minecraft.item.ItemArmor;
import net.minecraft.item.Item;
import net.minecraft.inventory.EntityEquipmentSlot;
import net.minecraft.client.renderer.block.model.ModelResourceLocation;

import net.mcreator.aaaaaaaaaaaaaaaaaa.creativetab.TabNokai;
import net.mcreator.aaaaaaaaaaaaaaaaaa.ElementsAaaaaaaaaaaaaaaaaa;

@ElementsAaaaaaaaaaaaaaaaaa.ModElement.Tag
public class ItemNokia extends ElementsAaaaaaaaaaaaaaaaaa.ModElement {
	@GameRegistry.ObjectHolder("aaaaaaaaaaaaaaaaaa:nokiahelmet")
	public static final Item helmet = null;
	@GameRegistry.ObjectHolder("aaaaaaaaaaaaaaaaaa:nokiabody")
	public static final Item body = null;
	@GameRegistry.ObjectHolder("aaaaaaaaaaaaaaaaaa:nokialegs")
	public static final Item legs = null;
	@GameRegistry.ObjectHolder("aaaaaaaaaaaaaaaaaa:nokiaboots")
	public static final Item boots = null;
	public ItemNokia(ElementsAaaaaaaaaaaaaaaaaa instance) {
		super(instance, 11);
	}

	@Override
	public void initElements() {
		ItemArmor.ArmorMaterial enuma = EnumHelper.addArmorMaterial("NOKIA", "aaaaaaaaaaaaaaaaaa:nokia armor", 61, new int[]{19, 21, 11, 10}, 14,
				(net.minecraft.util.SoundEvent) net.minecraft.util.SoundEvent.REGISTRY.getObject(new ResourceLocation("")), 5f);
		elements.items.add(() -> new ItemArmor(enuma, 0, EntityEquipmentSlot.HEAD).setUnlocalizedName("nokiahelmet").setRegistryName("nokiahelmet")
				.setCreativeTab(TabNokai.tab));
		elements.items.add(() -> new ItemArmor(enuma, 0, EntityEquipmentSlot.CHEST).setUnlocalizedName("nokiabody").setRegistryName("nokiabody")
				.setCreativeTab(TabNokai.tab));
		elements.items.add(() -> new ItemArmor(enuma, 0, EntityEquipmentSlot.LEGS).setUnlocalizedName("nokialegs").setRegistryName("nokialegs")
				.setCreativeTab(TabNokai.tab));
		elements.items.add(() -> new ItemArmor(enuma, 0, EntityEquipmentSlot.FEET).setUnlocalizedName("nokiaboots").setRegistryName("nokiaboots")
				.setCreativeTab(TabNokai.tab));
	}

	@SideOnly(Side.CLIENT)
	@Override
	public void registerModels(ModelRegistryEvent event) {
		ModelLoader.setCustomModelResourceLocation(helmet, 0, new ModelResourceLocation("aaaaaaaaaaaaaaaaaa:nokiahelmet", "inventory"));
		ModelLoader.setCustomModelResourceLocation(body, 0, new ModelResourceLocation("aaaaaaaaaaaaaaaaaa:nokiabody", "inventory"));
		ModelLoader.setCustomModelResourceLocation(legs, 0, new ModelResourceLocation("aaaaaaaaaaaaaaaaaa:nokialegs", "inventory"));
		ModelLoader.setCustomModelResourceLocation(boots, 0, new ModelResourceLocation("aaaaaaaaaaaaaaaaaa:nokiaboots", "inventory"));
	}
}
