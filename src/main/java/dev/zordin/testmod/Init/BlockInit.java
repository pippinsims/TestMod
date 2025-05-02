package dev.zordin.testmod.Init;

import dev.zordin.testmod.TestMod;
import net.minecraft.world.item.BlockItem;
import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.world.item.Item;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.block.state.BlockBehaviour;
import net.minecraft.world.level.material.Material;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;

import java.util.function.Supplier;

public class BlockInit {
    public static final DeferredRegister<Block> BLOCKS = DeferredRegister.create(ForgeRegistries.BLOCKS, TestMod.MODID);

    public static final RegistryObject<Block> SQUISHY_SQUIB = register("squishy_squib",
            () -> new Block(BlockBehaviour.Properties.of(Material.BUBBLE_COLUMN).jumpFactor(13f).destroyTime(100f).strength(98.76543210f, 31f).noOcclusion().requiresCorrectToolForDrops()),
                  new Item.Properties().tab(CreativeModeTab.TAB_DECORATIONS));
    public static final RegistryObject<Block> SQUISHY_SQUABBLE = register("squishy_squabble",
            () -> new Block(BlockBehaviour.Properties.of(Material.BUILDABLE_GLASS).jumpFactor(1.6f).destroyTime(3.675f).strength(9.843f).requiresCorrectToolForDrops()),
                  new Item.Properties().tab(CreativeModeTab.TAB_DECORATIONS));

    private static <T extends Block> RegistryObject<T> register(String name, Supplier<T> supplier, Item.Properties properties) {
        RegistryObject<T> block = BLOCKS.register(name, supplier);
        ItemInit.ITEMS.register(name, () -> new BlockItem(block.get(), properties));
        return block;
    }
}
