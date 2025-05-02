package dev.zordin.testmod.Init;

import dev.zordin.testmod.TestMod;
import net.minecraft.world.item.Item;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;

public class ItemInit {
    public static final DeferredRegister<Item> ITEMS = DeferredRegister.create(ForgeRegistries.ITEMS, TestMod.MODID);

    public static final RegistryObject<Item> EXAMPLE_ITEM = ITEMS.register("example_item", () -> new Item(new Item.Properties().tab(TestMod.TAB)));
    public static final RegistryObject<Item> EXAMPLE_ITEM2 = ITEMS.register("example_item_2", () -> new Item(new Item.Properties().tab(TestMod.TAB).durability(1)));
}
