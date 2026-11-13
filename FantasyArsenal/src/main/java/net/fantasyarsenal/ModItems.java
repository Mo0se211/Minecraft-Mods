package net.fantasyarsenal;

import java.util.ArrayList;
import java.util.List;
import net.minecraft.ChatFormatting;
import net.minecraft.world.effect.MobEffectInstance;
import net.minecraft.world.effect.MobEffects;
import net.minecraft.world.item.AxeItem;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.Rarity;
import net.minecraft.world.item.SwordItem;
import net.minecraft.world.item.Tier;
import net.minecraft.world.item.Tiers;
import net.neoforged.neoforge.registries.DeferredItem;
import net.neoforged.neoforge.registries.DeferredRegister;

public final class ModItems {
    public static final DeferredRegister.Items ITEMS = DeferredRegister.createItems(FantasyArsenal.MODID);
    public static final List<DeferredItem<? extends Item>> WEAPONS = new ArrayList<>();

    public static final DeferredItem<RelicSwordItem> FROSTBITE_FANG = sword("frostbite_fang", Tiers.NETHERITE, 3, -2.6F, Rarity.RARE, new WeaponInfo("frostbite_fang", ChatFormatting.AQUA, ChatFormatting.AQUA, "Rare", new String[]{"Every strike chills the target.", "Sometimes unleashes a Frost Nova", "that freezes nearby monsters."}, (t, a) -> {  }));
    public static final DeferredItem<RelicSwordItem> ABYSSAL_CLAW = sword("abyssal_claw", Tiers.NETHERITE, 5, -2.8F, Rarity.EPIC, new WeaponInfo("abyssal_claw", ChatFormatting.DARK_AQUA, ChatFormatting.LIGHT_PURPLE, "Epic", new String[]{"Withers whatever it touches.", "Sometimes tears open a Void Rift,", "crushing monsters around the target."}, (t, a) -> {  }));
    public static final DeferredItem<RelicSwordItem> VENOMTHORN = sword("venomthorn", Tiers.NETHERITE, 2, -2.4F, Rarity.UNCOMMON, new WeaponInfo("venomthorn", ChatFormatting.GREEN, ChatFormatting.GREEN, "Uncommon", new String[]{"Poisons the target.", "Sometimes bursts into a Toxic Cloud."}, (t, a) -> {  }));
    public static final DeferredItem<RelicSwordItem> EMBERBRAND = sword("emberbrand", Tiers.NETHERITE, 3, -2.4F, Rarity.RARE, new WeaponInfo("emberbrand", ChatFormatting.GOLD, ChatFormatting.AQUA, "Rare", new String[]{"Sets foes ablaze.", "Sometimes erupts in a Flame Burst.", "Wielder burns for less time."}, (t, a) -> {  }));
    public static final DeferredItem<RelicSwordItem> STORMCALLER = sword("stormcaller", Tiers.NETHERITE, 4, -2.4F, Rarity.EPIC, new WeaponInfo("stormcaller", ChatFormatting.YELLOW, ChatFormatting.LIGHT_PURPLE, "Epic", new String[]{"Sometimes calls down lightning", "on the target.", "Wielder moves faster."}, (t, a) -> {  }));
    public static final DeferredItem<RelicSwordItem> TIDEBREAKER = sword("tidebreaker", Tiers.NETHERITE, 3, -2.5F, Rarity.RARE, new WeaponInfo("tidebreaker", ChatFormatting.AQUA, ChatFormatting.AQUA, "Rare", new String[]{"Slows the target.", "Sometimes crashes down as a Tidal Surge.", "Breathe and swim better while held."}, (t, a) -> {  }));
    public static final DeferredItem<RelicAxeItem> BLOODMOON_REAVER = axe("bloodmoon_reaver", 6.0F, -3.0F, Rarity.EPIC, new WeaponInfo("bloodmoon_reaver", ChatFormatting.DARK_RED, ChatFormatting.LIGHT_PURPLE, "Epic", new String[]{"Sometimes drains life from the target", "to heal the wielder.", "Grants extra max health."}, (t, a) -> {  }));
    public static final DeferredItem<RelicSwordItem> DAWNBRINGER = sword("dawnbringer", Tiers.NETHERITE, 3, -2.4F, Rarity.RARE, new WeaponInfo("dawnbringer", ChatFormatting.YELLOW, ChatFormatting.AQUA, "Rare", new String[]{"Deals heavy extra damage to the undead.", "Reveals targets with a glow.", "Grants extra armour."}, (t, a) -> {  }));
    public static final DeferredItem<RelicSwordItem> GRAVEMOURNE = sword("gravemourne", Tiers.NETHERITE, 5, -2.8F, Rarity.EPIC, new WeaponInfo("gravemourne", ChatFormatting.DARK_PURPLE, ChatFormatting.LIGHT_PURPLE, "Epic", new String[]{"Inflicts a strong wither.", "Sometimes harvests the soul of the target,", "shielding the wielder."}, (t, a) -> {  }));
    public static final DeferredItem<RelicSwordItem> GALEBLADE = sword("galeblade", Tiers.NETHERITE, 2, -2.2F, Rarity.UNCOMMON, new WeaponInfo("galeblade", ChatFormatting.WHITE, ChatFormatting.GREEN, "Uncommon", new String[]{"Hurls enemies back.", "Sometimes launches them into the air.", "Wielder is swift and light-footed."}, (t, a) -> {  }));
    public static final DeferredItem<RelicAxeItem> QUAKEHAMMER = axe("quakehammer", 7.0F, -3.2F, Rarity.EPIC, new WeaponInfo("quakehammer", ChatFormatting.GOLD, ChatFormatting.LIGHT_PURPLE, "Epic", new String[]{"Staggers the target.", "Sometimes sends out a Shockwave", "that hits all nearby monsters.", "Hard to knock back."}, (t, a) -> {  }));
    public static final DeferredItem<RelicSwordItem> PRISMSHARD = sword("prismshard", Tiers.NETHERITE, 3, -2.4F, Rarity.RARE, new WeaponInfo("prismshard", ChatFormatting.LIGHT_PURPLE, ChatFormatting.AQUA, "Rare", new String[]{"Sometimes shatters into Crystal Shards", "that hit nearby monsters.", "Wielder mines faster."}, (t, a) -> {  }));
    public static final DeferredItem<RelicSwordItem> SHADOWSTEP_DAGGER = sword("shadowstep_dagger", Tiers.DIAMOND, 2, -1.6F, Rarity.RARE, new WeaponInfo("shadowstep_dagger", ChatFormatting.DARK_GRAY, ChatFormatting.AQUA, "Rare", new String[]{"Very fast strikes that weaken foes.", "Sometimes lands a Shadow Strike", "for bonus damage.", "Wielder moves faster."}, (t, a) -> {  }));
    public static final DeferredItem<RelicSwordItem> SOULFLAME_EDGE = sword("soulflame_edge", Tiers.NETHERITE, 4, -2.4F, Rarity.EPIC, new WeaponInfo("soulflame_edge", ChatFormatting.AQUA, ChatFormatting.LIGHT_PURPLE, "Epic", new String[]{"Sets foes ablaze with soul fire", "and weakens them.", "Sometimes releases a Soul Burst."}, (t, a) -> {  }));
    public static final DeferredItem<RelicSwordItem> THORNROOT_GLAIVE = sword("thornroot_glaive", Tiers.NETHERITE, 3, -2.9F, Rarity.UNCOMMON, new WeaponInfo("thornroot_glaive", ChatFormatting.DARK_GREEN, ChatFormatting.GREEN, "Uncommon", new String[]{"Sometimes entangles the target in roots.", "Long reach."}, (t, a) -> {  }));
    public static final DeferredItem<RelicBowItem> STARFALL_BOW = bow("starfall_bow", Rarity.EPIC, new WeaponInfo("starfall_bow", ChatFormatting.LIGHT_PURPLE, ChatFormatting.LIGHT_PURPLE, "Epic", new String[]{"Arrows mark their target with a glow.", "Sometimes a star bursts on impact."}, (t, a) -> {  }));
    public static final DeferredItem<RelicAxeItem> DEPTHWARDEN_CLEAVER = axe("depthwarden_cleaver", 8.0F, -3.1F, Rarity.EPIC, new WeaponInfo("depthwarden_cleaver", ChatFormatting.DARK_AQUA, ChatFormatting.GOLD, "Legendary", new String[]{"Weakens and slows the target.", "Sometimes unleashes a Sonic Roar.", "Armour, health and steady footing."}, (t, a) -> {  }));

    private static DeferredItem<RelicSwordItem> sword(String id, Tier tier, int damage, float speed, Rarity rarity, WeaponInfo info) {
        DeferredItem<RelicSwordItem> item = ITEMS.register(id, () -> new RelicSwordItem(tier,
                new Item.Properties().rarity(rarity).fireResistant().attributes(SwordItem.createAttributes(tier, damage, speed)), info));
        WEAPONS.add(item);
        return item;
    }

    private static DeferredItem<RelicAxeItem> axe(String id, float damage, float speed, Rarity rarity, WeaponInfo info) {
        DeferredItem<RelicAxeItem> item = ITEMS.register(id, () -> new RelicAxeItem(Tiers.NETHERITE,
                new Item.Properties().rarity(rarity).fireResistant().attributes(AxeItem.createAttributes(Tiers.NETHERITE, damage, speed)), info));
        WEAPONS.add(item);
        return item;
    }

    private static DeferredItem<RelicBowItem> bow(String id, Rarity rarity, WeaponInfo info) {
        DeferredItem<RelicBowItem> item = ITEMS.register(id, () -> new RelicBowItem(
                new Item.Properties().rarity(rarity).fireResistant().durability(1200), info));
        WEAPONS.add(item);
        return item;
    }

    private ModItems() {}
}
