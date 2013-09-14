package com.codisimus.plugins.phatloots.events;

import com.codisimus.plugins.phatloots.loot.LootBundle;
import org.bukkit.entity.LivingEntity;
import org.bukkit.entity.Player;

/**
 * Called when a mob is killed and drops custom loot
 *
 * @author Cody
 */
public class MobDropLootEvent extends LootEvent {
    private LivingEntity mob;
    private Player killer;

    /**
     * Creates a new event with the given data
     *
     * @param mob The mob that was killed
     * @param killer The Player who killed the mob or null if the mob died of natural causes
     * @param lootBundle The bundle of loot dropped by the mob
     */
    public MobDropLootEvent(LivingEntity mob, Player killer, LootBundle lootBundle) {
        this.mob = mob;
        this.killer = killer;
        this.lootBundle = lootBundle;
    }

    /**
     * Returns the mob that was killed
     *
     * @return The mob that was killed
     */
    public LivingEntity getMob() {
        return mob;
    }

    /**
     * Returns the Player who killed the mob
     *
     * @return The Player who killed the mob or null if the mob died of natural causes
     */
    public Player getKiller() {
        return killer;
    }
}
