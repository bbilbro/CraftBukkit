package org.bukkit.craftbukkit.entity;

import net.minecraft.server.EntitySlime;

import org.bukkit.craftbukkit.CraftServer;
import org.bukkit.entity.Slime;

public class CraftSlime extends CraftLivingEntity implements Slime {

    public CraftSlime(CraftServer server, EntitySlime entity) {
        super(server, entity);
    }

}
