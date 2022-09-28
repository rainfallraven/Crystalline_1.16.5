package com.rainfallraven.crystalline.item;

import com.rainfallraven.crystalline.Crystalline;
import net.minecraft.item.Item;
import net.minecraft.item.ItemGroup;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.fml.RegistryObject;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;

public class ModItems {

    public static final DeferredRegister<Item> ITEMS =
            DeferredRegister.create(ForgeRegistries.ITEMS, Crystalline.MOD_ID);

    public static final RegistryObject<Item> AMETHYST_GEMSTONE = ITEMS.register("amethyst_gemstone",
            () -> new Item(new Item.Properties().group(ItemGroup.MATERIALS)));

    public static void register(IEventBus eventBus) {
        ITEMS.register(eventBus);
    }
}
