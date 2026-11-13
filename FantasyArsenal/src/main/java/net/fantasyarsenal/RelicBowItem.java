package net.fantasyarsenal;

import java.util.List;
import net.minecraft.network.chat.Component;
import net.minecraft.world.item.BowItem;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.TooltipFlag;

public class RelicBowItem extends BowItem {
    private final WeaponInfo info;

    public RelicBowItem(Item.Properties properties, WeaponInfo info) {
        super(properties);
        this.info = info;
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
