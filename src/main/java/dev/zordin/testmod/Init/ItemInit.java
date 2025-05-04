package dev.zordin.testmod.Init;

import dev.zordin.testmod.TestMod;
import dev.zordin.testmod.base.ModArmorMaterial;
import net.minecraft.sounds.SoundEvents;
import net.minecraft.world.effect.MobEffectInstance;
import net.minecraft.world.effect.MobEffects;
import net.minecraft.world.entity.EquipmentSlot;
import net.minecraft.world.food.FoodProperties;
import net.minecraft.world.item.*;
import net.minecraft.world.item.crafting.Ingredient;
import net.minecraftforge.common.ForgeTier;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;

public class ItemInit {
    public static final DeferredRegister<Item> ITEMS = DeferredRegister.create(ForgeRegistries.ITEMS, TestMod.MODID);

    public static final RegistryObject<Item> EXAMPLE_ITEM = ITEMS.register("example_item",
            () -> new Item(props()));
    public static final RegistryObject<Item> EXAMPLE_ITEM2 = ITEMS.register("example_item_2",
            () -> new Item(props().durability(1)));

    public static final RegistryObject<Item> KRUNCHY_MUNCHY = ITEMS.register("krunchy_munchy",
            () -> new Item(props().food(Foods.KRUNCHY_MUNCHY)));

    public static final RegistryObject<SwordItem> DATA_SCYTHE = ITEMS.register("data_scythe",
            () -> new SwordItem(ToolTiers.DATA, 62, -3.8f, props()));

    public static final RegistryObject<ShovelItem> DATA_EXHUMER = ITEMS.register("data_exhumer",
            () -> new ShovelItem(ToolTiers.DATA, 1, -2f, props()));

    public static final RegistryObject<PickaxeItem> DATA_CRUNCHER = ITEMS.register("data_cruncher",
            () -> new PickaxeItem(ToolTiers.DATA, 2, -2.3f, props()));

    public static final RegistryObject<AxeItem> DATA_BREAKER = ITEMS.register("data_breaker",
            () -> new AxeItem(ToolTiers.DATA, 4, -2.5f, props()));

    public static final RegistryObject<ArmorItem> DATA_HELM = ITEMS.register("data_helm",
            () -> new ArmorItem(ArmorTiers.DATA, EquipmentSlot.HEAD, props()));
    public static final RegistryObject<ArmorItem> DATA_VEST = ITEMS.register("data_vest",
            () -> new ArmorItem(ArmorTiers.DATA, EquipmentSlot.CHEST, props()));
    public static final RegistryObject<ArmorItem> DATA_GREAVES = ITEMS.register("data_greaves",
            () -> new ArmorItem(ArmorTiers.DATA, EquipmentSlot.LEGS, props()));
    public static final RegistryObject<ArmorItem> DATA_STRIDERS = ITEMS.register("data_striders",
            () -> new ArmorItem(ArmorTiers.DATA, EquipmentSlot.FEET, props()));

    private static Item.Properties props() {
        return new Item.Properties().tab(TestMod.TAB);
    }

    public static class Foods {
        public static final FoodProperties KRUNCHY_MUNCHY = new FoodProperties.Builder()
                .nutrition(1)
                .saturationMod(0.2f)
                .fast()
                .alwaysEat()
                .effect(() -> new MobEffectInstance(MobEffects.DAMAGE_RESISTANCE, 100, 3), 1.0f)
                .build();
    }

    public static class ToolTiers {
        public static final Tier DATA = new ForgeTier(
                5,
                3000,
                20f,
                7,
                30,
                null,
                () -> Ingredient.of(ItemInit.KRUNCHY_MUNCHY.get()));
    }

    public static class ArmorTiers {
        public static final ArmorMaterial DATA = new ModArmorMaterial(
                "data",
                300,
                new int[] { 4, 7, 9, 4},
                30,
                SoundEvents.ELDER_GUARDIAN_CURSE,
                4,
                0.15f,
                () -> Ingredient.of(ItemInit.KRUNCHY_MUNCHY.get()));
    }
}
