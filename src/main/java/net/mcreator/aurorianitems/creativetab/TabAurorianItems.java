
package net.mcreator.aurorianitems.creativetab;

import net.minecraftforge.fml.relauncher.SideOnly;
import net.minecraftforge.fml.relauncher.Side;

import net.minecraft.item.ItemStack;
import net.minecraft.creativetab.CreativeTabs;

import net.mcreator.aurorianitems.item.ItemDiamondNecklace;
import net.mcreator.aurorianitems.ElementsAurorianItems;

@ElementsAurorianItems.ModElement.Tag
public class TabAurorianItems extends ElementsAurorianItems.ModElement {
	public TabAurorianItems(ElementsAurorianItems instance) {
		super(instance, 2);
	}

	@Override
	public void initElements() {
		tab = new CreativeTabs("tabaurorianitems") {
			@SideOnly(Side.CLIENT)
			@Override
			public ItemStack getTabIconItem() {
				return new ItemStack(ItemDiamondNecklace.block, (int) (1));
			}

			@SideOnly(Side.CLIENT)
			public boolean hasSearchBar() {
				return false;
			}
		};
	}
	public static CreativeTabs tab;
}
