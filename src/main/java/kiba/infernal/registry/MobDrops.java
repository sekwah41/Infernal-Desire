package kiba.infernal.registry;

import kiba.infernal.weapon.MoltenSword;
import net.minecraft.entity.Entity;
import net.minecraft.entity.monster.EntitySkeleton;
import net.minecraft.entity.monster.SkeletonType;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraftforge.event.entity.living.LivingDropsEvent;
import net.minecraftforge.fml.common.eventhandler.SubscribeEvent;

import java.util.Random;

public class MobDrops {
    Random random = new Random();


    @SubscribeEvent
    public void playerKilledEntity(LivingDropsEvent event) {
        Entity killer = event.getSource().getEntity();
        if (killer != null && killer instanceof EntityPlayer &&
                ((EntityPlayer) killer).getHeldItemMainhand() != null &&
                ((EntityPlayer) killer).getHeldItemMainhand().getItem() instanceof MoltenSword) {
            if (event.getEntity() instanceof EntitySkeleton) {
                if (((EntitySkeleton) event.getEntity()).getSkeletonType() == SkeletonType.WITHER) {
                    if (random.nextInt(1) == 0) event.getEntityLiving().dropItem(ModItems.itemWitheringShard, 1);
                }
            }
        }
    }
}

