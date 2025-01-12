package cc.abbie.oldpotions.neoforge;

import cc.abbie.oldpotions.common.OldPotionsCommon;
import cc.abbie.oldpotions.common.OldPotionsConfig;
import cc.abbie.oldpotions.common.OldPotionsConfigScreen;
import net.neoforged.fml.ModLoadingContext;
import net.neoforged.fml.common.Mod;
import net.neoforged.fml.loading.FMLPaths;
import net.neoforged.neoforge.client.gui.IConfigScreenFactory;

@Mod(OldPotionsCommon.MOD_ID)
public class OldPotions {
    public OldPotions() {
        OldPotionsCommon.config = new OldPotionsConfig(FMLPaths.CONFIGDIR.get());
        ModLoadingContext.get().registerExtensionPoint(
                IConfigScreenFactory.class,
                () -> (client, parent) -> new OldPotionsConfigScreen(parent)
        );
    }
}