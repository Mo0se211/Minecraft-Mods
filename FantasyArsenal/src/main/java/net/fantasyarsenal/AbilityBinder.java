package net.fantasyarsenal;

import net.minecraft.core.component.DataComponents;
import net.minecraft.core.registries.Registries;
import net.minecraft.resources.ResourceKey;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.enchantment.Enchantment;
import net.minecraft.world.item.enchantment.ItemEnchantments;
import net.minecraft.world.level.Level;

/**
 * Each relic's abilities, passives and held particles live in a hidden data-driven enchantment
 * (data/fantasyarsenal/enchantment/<id>.json). This attaches it to the real item the first time
 * the item sits in an inventory, so creative-tab copies get the same powers as looted ones.
 */
public final class AbilityBinder {
    public static void bind(ItemStack stack, Level level, String id) {
        if (level.isClientSide()) return;
        ResourceKey<Enchantment> key = ResourceKey.create(Registries.ENCHANTMENT,
                ResourceLocation.fromNamespaceAndPath(FantasyArsenal.MODID, id));
        level.registryAccess().registryOrThrow(Registries.ENCHANTMENT).getHolder(key).ifPresent(holder -> {
            ItemEnchantments current = stack.getOrDefault(DataComponents.ENCHANTMENTS, ItemEnchantments.EMPTY);
            if (current.getLevel(holder) > 0) return;
            ItemEnchantments.Mutable updated = new ItemEnchantments.Mutable(current);
            updated.set(holder, 1);
            stack.set(DataComponents.ENCHANTMENTS, updated.toImmutable().withTooltip(false));
            stack.set(DataComponents.ENCHANTMENT_GLINT_OVERRIDE, false);
        });
    }

    private AbilityBinder() {}
}
