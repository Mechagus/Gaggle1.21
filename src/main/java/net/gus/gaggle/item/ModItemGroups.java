package net.gus.gaggle.item;

import net.fabricmc.fabric.api.itemgroup.v1.FabricItemGroup;
import net.gus.gaggle.Gaggle;
import net.gus.gaggle.block.ModBlocks;
import net.minecraft.item.ItemGroup;
import net.minecraft.item.ItemStack;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.text.Text;
import net.minecraft.util.Identifier;

public class ModItemGroups {
    public static final ItemGroup GAGGLE_ITEM_GROUP = Registry.register(Registries.ITEM_GROUP,
            Identifier.of(Gaggle.MOD_ID, "gaggle_items"),
            FabricItemGroup.builder().icon(() -> new ItemStack(ModBlocks.DUCKSTEEL_BLOCK))
                    .displayName(Text.translatable("itemgroup.gaggle.ducksteel_block_items"))
                    .entries((displayContext, entries) -> {
                        entries.add(ModBlocks.DUCKSTEEL_ORE);
                        entries.add(ModBlocks.DUCKSTEEL_DEEPSLATE_ORE);
                        entries.add(ModBlocks.DUCKSTEEL_BLOCK);
                        entries.add(ModBlocks.RAW_DUCKSTEEL_BLOCK);
                        entries.add(ModItems.DUCKSTEEL_INGOT);
                        entries.add(ModItems.RAW_DUCKSTEEL);
                    }).build());

    public static void registerItemGroups(){
        Gaggle.LOGGER.info("Registering Item Groups for" + Gaggle.MOD_ID);
    }
}
