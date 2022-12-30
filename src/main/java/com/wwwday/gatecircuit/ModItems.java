package com.wwwday.gatecircuit;

import net.minecraft.item.BlockItem;
import net.minecraft.item.Item;
import net.minecraft.item.ItemGroup;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.fml.RegistryObject;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;


public class ModItems {
    public static final DeferredRegister<Item> ITEMS = DeferredRegister.create(ForgeRegistries.ITEMS, Gatecircuit.MOD_ID);

    public static final RegistryObject<Item> NAND = ITEMS.register("nand",
            () -> new BlockItem(ModBlocks.NAND.get(), new Item.Properties().tab(ItemGroup.TAB_REDSTONE)));

    public static final RegistryObject<Item> AND = ITEMS.register("and",
            () -> new BlockItem(ModBlocks.AND.get(), new Item.Properties().tab(ItemGroup.TAB_REDSTONE)));

    public static final RegistryObject<Item> OR = ITEMS.register("or",
            () -> new BlockItem(ModBlocks.OR.get(), new Item.Properties().tab(ItemGroup.TAB_REDSTONE)));

    public static final RegistryObject<Item> NOR = ITEMS.register("nor",
            () -> new BlockItem(ModBlocks.NOR.get(), new Item.Properties().tab(ItemGroup.TAB_REDSTONE)));

    public static final RegistryObject<Item> NOT = ITEMS.register("not",
            () -> new BlockItem(ModBlocks.NOT.get(), new Item.Properties().tab(ItemGroup.TAB_REDSTONE)));

    public static final RegistryObject<Item> XOR = ITEMS.register("xor",
            () -> new BlockItem(ModBlocks.XOR.get(), new Item.Properties().tab(ItemGroup.TAB_REDSTONE)));

    public static final RegistryObject<Item> XNOR = ITEMS.register("xnor",
            () -> new BlockItem(ModBlocks.XNOR.get(), new Item.Properties().tab(ItemGroup.TAB_REDSTONE)));

    public static void register(IEventBus eventBus) {
        ITEMS.register(eventBus);
    }
}
