package com.felipendelicia.boylemod.block;

import com.felipendelicia.boylemod.BoyleMod;
import com.felipendelicia.boylemod.item.ModItemGroup;
import com.felipendelicia.boylemod.item.ModItems;
import net.minecraft.block.AbstractBlock;
import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import net.minecraft.item.BlockItem;
import net.minecraft.item.Item;
import net.minecraftforge.common.ToolType;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.fml.RegistryObject;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;

import java.util.function.Supplier;

public class ModBlocks {

    public static final DeferredRegister<Block> BLOCKS = DeferredRegister.create(ForgeRegistries.BLOCKS, BoyleMod.MOD_ID);

    public static final RegistryObject<Block> ALUMINUM_BLOCK = registerBlock("aluminum_block",
            () -> new Block(AbstractBlock.Properties.create(Material.IRON)
                    .harvestLevel(0)
                    .harvestTool(ToolType.PICKAXE)
                    .setRequiresTool()
                    .hardnessAndResistance(2f)));

    public static final RegistryObject<Block> COPPER_BLOCK = registerBlock("copper_block",
            () -> new Block(AbstractBlock.Properties.create(Material.IRON)
                    .harvestLevel(0)
                    .harvestTool(ToolType.PICKAXE)
                    .setRequiresTool()
                    .hardnessAndResistance(2f)));

    public static final RegistryObject<Block> TIN_BLOCK = registerBlock("tin_block",
            () -> new Block(AbstractBlock.Properties.create(Material.IRON)
                    .harvestLevel(0)
                    .harvestTool(ToolType.PICKAXE)
                    .setRequiresTool()
                    .hardnessAndResistance(2f)));

    private static <T extends Block>RegistryObject<T> registerBlock(String name, Supplier<T> block){
        RegistryObject<T> toReturn = BLOCKS.register(name, block);
        registerBlockItem(name, toReturn);
        return toReturn;
    }

    private static <T extends Block> void registerBlockItem(String name, RegistryObject<T> block){
        ModItems.ITEMS.register(name, () -> new BlockItem(block.get(),
                new Item.Properties().group(ModItemGroup.BOYLE_GROUP_BLOCKS)));
    }

    public static void register(IEventBus eventBus){
        BLOCKS.register(eventBus);
    }

}
