package com.codisimus.plugins.phatloots.events;

import org.bukkit.entity.LivingEntity;
import org.bukkit.inventory.EntityEquipment;

/**
 * Called when a mob is spawned and given a weapon/armor
 *
 * @author Cody
 */
public class PreMobEquipEvent extends PreLootEvent {
    private LivingEntity mob;

    /**
     * Creates a new event with the given data
     *
     * @param mob The mob whose equipment was modified
     * @param lootingBonus The bonus amount of looting probability
     */
    public PreMobEquipEvent(LivingEntity mob, double lootingBonus) {
        this.mob = mob;
        this.lootingBonus = lootingBonus;
    }

    /**
     * Returns the mob that was spawned
     *
     * @return The mob that was spawned
     */
    public LivingEntity getMob() {
        return mob;
    }

    /**
     * Returns the Equipment that the mob spawned with
     *
     * @return The EntityEquipment of the mob
     */
    public EntityEquipment getEquipment() {
        return mob.getEquipment();
    }

    /**
     * Returns the custom name of the mob
     *
     * @return The name of the mob
     */
    public String getCustomName() {
        return mob.getCustomName();
    }

    /**
     * Set the custom name of the mob
     *
     * @param name The new name for the mob
     */
    public void getCustomName(String name) {
        mob.setCustomName(name);
        mob.setCustomNameVisible(true);
    }
}
