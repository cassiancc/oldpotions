package cc.abbie.oldpotions.common.mixin;

import cc.abbie.oldpotions.common.OldPotionsCommon;
import net.minecraft.world.effect.MobEffect;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.Inject;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfoReturnable;

import static cc.abbie.oldpotions.common.OldPotionsCommon.config;

@Mixin(MobEffect.class)
public abstract class MobEffectMixin {
    @Inject(method = "getColor", at = @At("HEAD"), cancellable = true)
    private void oldpotions$modifyColor(CallbackInfoReturnable<Integer> cir) {
        if (config.oldColors) {
            Integer oldPotionColor = OldPotionsCommon.oldPotionColors.get((MobEffect) (Object) this);
            if (oldPotionColor != null) {
                cir.setReturnValue(oldPotionColor);
            }
        }
    }
}
