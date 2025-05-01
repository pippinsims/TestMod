package dev.zordin.testmod.Init;

import dev.zordin.testmod.TestMod;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.block.Blocks;
import net.minecraft.world.level.block.state.BlockBehaviour;
import net.minecraft.world.level.material.Material;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;

public class BlockInit {
    public static final DeferredRegister<Block> BLOCKS = DeferredRegister.create(ForgeRegistries.BLOCKS, TestMod.MODID);

    public static final RegistryObject<Block> SQUISHY_SQUIB = BLOCKS.register("squishy_squib", () -> new Block(BlockBehaviour.Properties.of(Material.BUBBLE_COLUMN).jumpFactor(13f).explosionResistance(40404040f).destroyTime(100f).strength(9876543210f,31f).noOcclusion()));
    public static final RegistryObject<Block> SQUISHY_SQUABBLE = BLOCKS.register("squishy_squabble", () -> new Block(BlockBehaviour.Properties.of(Material.BUILDABLE_GLASS).jumpFactor(1.6f).explosionResistance(4.2f).destroyTime(3.675f).strength(9.843f,1.035f)));
}
