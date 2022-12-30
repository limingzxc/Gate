package com.wwwday.gatecircuit;

import com.wwwday.gatecircuit.redstone.*;
import net.minecraft.block.AbstractBlock;
import net.minecraft.block.Block;
import net.minecraft.block.SoundType;
import net.minecraft.block.material.Material;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.fml.RegistryObject;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;

public class ModBlocks {
    public static final DeferredRegister<Block> BLOCKS = DeferredRegister.create(ForgeRegistries.BLOCKS, Gatecircuit.MOD_ID);


    public static final RegistryObject<Block> NAND = BLOCKS.register("nand",
            () -> new Nand(AbstractBlock.Properties.of(Material.DECORATION).instabreak().sound(SoundType.WOOD)));

    public static final RegistryObject<Block> AND = BLOCKS.register("and",
            () -> new And(AbstractBlock.Properties.of(Material.DECORATION).instabreak().sound(SoundType.WOOD)));

    public static final RegistryObject<Block> OR = BLOCKS.register("or",
            () -> new Or(AbstractBlock.Properties.of(Material.DECORATION).instabreak().sound(SoundType.WOOD)));

    public static final RegistryObject<Block> NOR = BLOCKS.register("nor",
            () -> new Nor(AbstractBlock.Properties.of(Material.DECORATION).instabreak().sound(SoundType.WOOD)));

    public static final RegistryObject<Block> NOT = BLOCKS.register("not",
            () -> new Not(AbstractBlock.Properties.of(Material.DECORATION).instabreak().sound(SoundType.WOOD)));

    public static final RegistryObject<Block> XOR = BLOCKS.register("xor",
            () -> new Xor(AbstractBlock.Properties.of(Material.DECORATION).instabreak().sound(SoundType.WOOD)));

    public static final RegistryObject<Block> XNOR = BLOCKS.register("xnor",
            () -> new Xnor(AbstractBlock.Properties.of(Material.DECORATION).instabreak().sound(SoundType.WOOD)));

    public static void register(IEventBus eventBus) {
        BLOCKS.register(eventBus);
    }

}
