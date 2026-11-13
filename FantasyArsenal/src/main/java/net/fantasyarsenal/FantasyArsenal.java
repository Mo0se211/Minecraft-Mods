package net.fantasyarsenal;

import com.mojang.logging.LogUtils;
import net.neoforged.bus.api.IEventBus;
import net.neoforged.fml.ModContainer;
import net.neoforged.fml.common.Mod;
import org.slf4j.Logger;

@Mod(FantasyArsenal.MODID)
public class FantasyArsenal {
    public static final String MODID = "fantasyarsenal";
    public static final Logger LOGGER = LogUtils.getLogger();

    public FantasyArsenal(IEventBus modEventBus, ModContainer modContainer) {
        ModItems.ITEMS.register(modEventBus);
        ModTabs.TABS.register(modEventBus);
    }
}
