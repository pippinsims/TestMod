package dev.zordin.testmod.Init;

import dev.zordin.testmod.TestMod;
import net.minecraft.world.effect.MobEffectInstance;
import net.minecraft.world.effect.MobEffects;
import net.minecraft.world.food.FoodProperties;
import net.minecraft.world.item.Item;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;

public class ItemInit {
    public static final DeferredRegister<Item> ITEMS = DeferredRegister.create(ForgeRegistries.ITEMS, TestMod.MODID);

    public static final RegistryObject<Item> EXAMPLE_ITEM = ITEMS.register("example_item",
            () -> new Item(new Item.Properties().tab(TestMod.TAB)));
    public static final RegistryObject<Item> EXAMPLE_ITEM2 = ITEMS.register("example_item_2",
            () -> new Item(new Item.Properties().tab(TestMod.TAB).durability(1)));

    public static final RegistryObject<Item> KRUNCHY_MUNCHY = ITEMS.register("krunchy_munchy",
            () -> new Item(new Item.Properties().tab(TestMod.TAB).food(Foods.KRUNCHY_MUNCHY)));

    public static class Foods {
        public static final FoodProperties KRUNCHY_MUNCHY = new FoodProperties.Builder()
                .nutrition(1)
                .saturationMod(0.2f)
                .fast()
                .alwaysEat()
                .effect(() -> new MobEffectInstance(MobEffects.DAMAGE_RESISTANCE, 100, 3), 1.0f)
                .build();
    }
}
