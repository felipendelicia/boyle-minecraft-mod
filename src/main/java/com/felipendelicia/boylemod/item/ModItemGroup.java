package com.felipendelicia.boylemod.item;

import net.minecraft.item.ItemGroup;
import net.minecraft.item.ItemStack;
import com.felipendelicia.boylemod.block.ModBlocks;

public class ModItemGroup {
    public static final ItemGroup BOYLE_GROUP_ITEMS = new ItemGroup("BoyleMod:Items") {
        @Override
        public ItemStack createIcon() {
            return new ItemStack(ModItems.COBALT_INGOT.get());
        }
    };
    public static final ItemGroup BOYLE_GROUP_BLOCKS = new ItemGroup("BoyleMod:Blocks") {
        @Override
        public ItemStack createIcon() {
            return new ItemStack(ModBlocks.ALUMINUM_BLOCK.get());
        }
    };
}
