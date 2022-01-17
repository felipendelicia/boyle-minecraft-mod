package com.felipendelicia.boylemod.item;

import com.felipendelicia.boylemod.BoyleMod;
import net.minecraft.item.Item;
import net.minecraft.item.ItemGroup;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.fml.RegistryObject;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;

public class ModItems {
    public static final DeferredRegister<Item> ITEMS =
            DeferredRegister.create(ForgeRegistries.ITEMS, BoyleMod.MOD_ID);

    public static final RegistryObject<Item> ALUMINUM_INGOT = ITEMS.register("aluminum_ingot",
            () -> new Item(new Item.Properties().group(ModItemGroup.BOYLE_GROUP_ITEMS)));

    public static final RegistryObject<Item> COPPER_INGOT = ITEMS.register("copper_ingot",
            () -> new Item(new Item.Properties().group(ModItemGroup.BOYLE_GROUP_ITEMS)));

    public static final RegistryObject<Item> TIN_INGOT = ITEMS.register("tin_ingot",
            () -> new Item(new Item.Properties().group(ModItemGroup.BOYLE_GROUP_ITEMS)));

    public static final RegistryObject<Item> LEAD_INGOT = ITEMS.register("lead_ingot",
            () -> new Item(new Item.Properties().group(ModItemGroup.BOYLE_GROUP_ITEMS)));

    public static final RegistryObject<Item> NICKEL_INGOT = ITEMS.register("nickel_ingot",
            () -> new Item(new Item.Properties().group(ModItemGroup.BOYLE_GROUP_ITEMS)));

    public static final RegistryObject<Item> COBALT_INGOT = ITEMS.register("cobalt_ingot",
            () -> new Item(new Item.Properties().group(ModItemGroup.BOYLE_GROUP_ITEMS)));

    public static void register(IEventBus eventBus){
        ITEMS.register(eventBus);
    }
}
