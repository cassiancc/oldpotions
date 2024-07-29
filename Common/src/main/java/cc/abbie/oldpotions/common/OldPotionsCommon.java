package cc.abbie.oldpotions.common;

import com.google.common.collect.ImmutableMap;
import net.minecraft.world.effect.MobEffect;
import net.minecraft.world.effect.MobEffects;

import java.util.Map;

public class OldPotionsCommon {
    public static final String MOD_ID = "oldpotions";
    public static OldPotionsConfig config;

    public static Map<MobEffect, Integer> oldPotionColors = ImmutableMap.<MobEffect, Integer>builder()
            .put(MobEffects.MOVEMENT_SPEED.value(), 8171462)
            .put(MobEffects.MOVEMENT_SLOWDOWN.value(), 5926017)
            .put(MobEffects.DIG_SPEED.value(), 14270531)
            .put(MobEffects.DIG_SLOWDOWN.value(), 4866583)
            .put(MobEffects.DAMAGE_BOOST.value(), 9643043)
            .put(MobEffects.HEAL.value(), 16262179)
            .put(MobEffects.HARM.value(), 4393481)
            .put(MobEffects.JUMP.value(), 2293580)
            .put(MobEffects.CONFUSION.value(), 5578058)
            .put(MobEffects.REGENERATION.value(), 13458603)
            .put(MobEffects.DAMAGE_RESISTANCE.value(), 10044730)
            .put(MobEffects.FIRE_RESISTANCE.value(), 14981690)
            .put(MobEffects.WATER_BREATHING.value(), 3035801)
            .put(MobEffects.INVISIBILITY.value(), 8356754)
            .put(MobEffects.BLINDNESS.value(), 2039587)
            .put(MobEffects.NIGHT_VISION.value(), 2039713)
            .put(MobEffects.HUNGER.value(), 5797459)
            .put(MobEffects.WEAKNESS.value(), 4738376)
            .put(MobEffects.POISON.value(), 5149489)
            .put(MobEffects.WITHER.value(), 3484199)
            .put(MobEffects.HEALTH_BOOST.value(), 16284963)
            .put(MobEffects.ABSORPTION.value(), 2445989)
            .put(MobEffects.SATURATION.value(), 16262179)
            .put(MobEffects.GLOWING.value(), 9740385)
            .put(MobEffects.LEVITATION.value(), 13565951)
            .put(MobEffects.LUCK.value(), 3381504)
            .put(MobEffects.UNLUCK.value(), 12624973)
            .put(MobEffects.SLOW_FALLING.value(), 16773073)
            .put(MobEffects.CONDUIT_POWER.value(), 1950417)
            .put(MobEffects.DOLPHINS_GRACE.value(), 8954814)
            .put(MobEffects.BAD_OMEN.value(), 745784)
            .put(MobEffects.HERO_OF_THE_VILLAGE.value(), 4521796)
            .put(MobEffects.DARKNESS.value(), 269699)
            .build();
}
