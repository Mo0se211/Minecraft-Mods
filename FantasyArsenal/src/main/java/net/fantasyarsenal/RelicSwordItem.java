package net.fantasyarsenal;

import java.util.List;
import net.minecraft.network.chat.Component;
import net.minecraft.world.entity.LivingEntity;
import net.minecraft.world.item.SwordItem;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.Tier;
import net.minecraft.world.item.TooltipFlag;

public class RelicSwordItem extends SwordItem {
    private final WeaponInfo info;

    public RelicSwordItem(Tier tier, Item.Properties properties, WeaponInfo info) {
        super(tier, properties);
        this.info = info;
    }

    @Override
    public boolean hurtEnemy(ItemStack stack, LivingEntity target, LivingEntity attacker) {
        if (!target.level().isClientSide()) {
            info.onHit().apply(target, attacker);
        }
        return super.hurtEnemy(stack, target, attacker);
    }

    @Override
    public Component getName(ItemStack stack) {
        return Component.translatable(this.getDescriptionId(stack)).withStyle(info.color());
    }

    @Override
    public void appendHoverText(ItemStack stack, Item.TooltipContext context, List<Component> tooltip, TooltipFlag flag) {
        info.addLore(tooltip);
        super.appendHoverText(stack, context, tooltip, flag);
    }
}
