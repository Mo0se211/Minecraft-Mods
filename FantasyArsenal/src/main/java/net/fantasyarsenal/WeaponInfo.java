package net.fantasyarsenal;

import java.util.List;
import net.minecraft.ChatFormatting;
import net.minecraft.network.chat.Component;
import net.minecraft.world.entity.LivingEntity;

/** Display and on-hit data shared by every relic weapon. */
public record WeaponInfo(ChatFormatting color, ChatFormatting tierColor, String tierName, String[] lore, OnHit onHit) {

    @FunctionalInterface
    public interface OnHit {
        void apply(LivingEntity target, LivingEntity attacker);
    }

    public void addLore(List<Component> tooltip) {
        tooltip.add(Component.literal(tierName + " Relic").withStyle(tierColor, ChatFormatting.BOLD));
        for (String line : lore) {
            tooltip.add(Component.literal(line).withStyle(ChatFormatting.GRAY));
        }
    }
}
