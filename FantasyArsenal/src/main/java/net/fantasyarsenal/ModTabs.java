package net.fantasyarsenal;

import com.mojang.brigadier.StringReader;
import net.minecraft.commands.arguments.item.ItemParser;
import net.minecraft.core.registries.Registries;
import net.minecraft.network.chat.Component;
import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.world.item.ItemStack;
import net.neoforged.neoforge.registries.DeferredHolder;
import net.neoforged.neoforge.registries.DeferredRegister;

public final class ModTabs {
    public static final DeferredRegister<CreativeModeTab> TABS = DeferredRegister.create(Registries.CREATIVE_MODE_TAB, FantasyArsenal.MODID);

    public static final DeferredHolder<CreativeModeTab, CreativeModeTab> RELICS = TABS.register("relics", () -> CreativeModeTab.builder()
            .title(Component.translatable("itemGroup.fantasyarsenal.relics"))
            .icon(() -> new ItemStack(ModItems.DEPTHWARDEN_CLEAVER.get()))
            .displayItems((params, output) -> {
                for (var weapon : ModItems.WEAPONS) {
                    output.accept(weapon.get());
                }
                // Armor is built here, inside the world, so its enchantments and trims link to the real registries.
                ItemParser parser = new ItemParser(params.holders());
                for (String text : ArmorStacks.ITEMS) {
                    try {
                        ItemParser.ItemResult result = parser.parse(new StringReader(text));
                        ItemStack stack = new ItemStack(result.item(), 1);
                        stack.applyComponents(result.components());
                        output.accept(stack);
                    } catch (Exception e) {
                        FantasyArsenal.LOGGER.error("Fantasy Arsenal: could not build a creative tab item", e);
                    }
                }
            })
            .build());

    private ModTabs() {}
}
