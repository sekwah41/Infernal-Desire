package kiba.infernal.handler;

import kiba.infernal.InfernalDamageSources;
import kiba.infernal.registry.ModItems;
import kiba.infernal.weapon.MoltenSword;
import net.minecraft.block.Block;
import net.minecraft.entity.Entity;
import net.minecraft.entity.EntityLiving;
import net.minecraft.entity.boss.EntityWither;
import net.minecraft.entity.item.EntityItem;
import net.minecraft.entity.monster.EntitySkeleton;
import net.minecraft.entity.monster.SkeletonType;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.init.Blocks;
import net.minecraft.init.Items;
import net.minecraft.item.ItemStack;
import net.minecraft.item.crafting.FurnaceRecipes;
import net.minecraft.potion.PotionEffect;
import net.minecraft.util.DamageSource;
import net.minecraftforge.event.entity.living.LivingDropsEvent;
import net.minecraftforge.event.entity.living.LivingEvent;
import net.minecraftforge.event.entity.player.EntityItemPickupEvent;
import net.minecraftforge.event.world.BlockEvent;
import net.minecraftforge.fml.common.eventhandler.SubscribeEvent;
import net.minecraftforge.fml.common.gameevent.TickEvent;

import java.util.Random;

public class InfernalEventHandler {
    Random random = new Random();

    @SubscribeEvent
    public void onBlockBreakOverworld(BlockEvent.BreakEvent event) {
        if (event.getPlayer().dimension == 0)
            if (event.getPlayer() != null && event.getPlayer().getHeldItemMainhand() != null && event.getPlayer().getHeldItemMainhand().getItem() == ModItems.charredPickaxe ||
                    (event.getPlayer() != null && event.getPlayer().getHeldItemMainhand() != null && event.getPlayer().getHeldItemMainhand().getItem() == ModItems.infernalPickaxe))
                if (event.getState().getBlock() == Blocks.STONE && random.nextInt(32) == 0)
                    event.getWorld().spawnEntityInWorld(new EntityItem(event.getWorld(), event.getPos().getX(), event.getPos().getY(), event.getPos().getZ(), new ItemStack(ModItems.itemMoltenRockPiece)));
    }

    @SubscribeEvent
    public void onBlockBreakNether(BlockEvent.BreakEvent event) {
        if (event.getPlayer().dimension == -1)
            if (event.getPlayer() != null && event.getPlayer().getHeldItemMainhand() != null && event.getPlayer().getHeldItemMainhand().getItem() == ModItems.moltenPickaxe ||
                    (event.getPlayer() != null && event.getPlayer().getHeldItemMainhand() != null && event.getPlayer().getHeldItemMainhand().getItem() == ModItems.infernalPickaxe))
                if (event.getState().getBlock() == Blocks.NETHERRACK && random.nextInt(64) == 0)
                    event.getWorld().spawnEntityInWorld(new EntityItem(event.getWorld(), event.getPos().getX(), event.getPos().getY(), event.getPos().getZ(), new ItemStack(ModItems.itemHellFireChunk)));

    }

    @SubscribeEvent
    public void onBlockBreakEnd(BlockEvent.BreakEvent event) {
        if (event.getPlayer().dimension == 1)
            if (event.getPlayer() != null && event.getPlayer().getHeldItemMainhand() != null && event.getPlayer().getHeldItemMainhand().getItem() == ModItems.hellfirePickaxe ||
                    (event.getPlayer() != null && event.getPlayer().getHeldItemMainhand() != null && event.getPlayer().getHeldItemMainhand().getItem() == ModItems.infernalPickaxe))
                if (event.getState().getBlock() == Blocks.END_STONE && random.nextInt(128) == 0)
                    event.getWorld().spawnEntityInWorld(new EntityItem(event.getWorld(), event.getPos().getX(), event.getPos().getY(), event.getPos().getZ(), new ItemStack(ModItems.itemInfernalCrystal)));
    }

    @SubscribeEvent
    public void onMoltenPickHarvest(BlockEvent.HarvestDropsEvent event) {
        ItemStack heldItem = event.getHarvester().inventory.getCurrentItem();
        if (heldItem != null && heldItem.getItem() == ModItems.moltenPickaxe) {
            if (event.getState().getBlock() != Blocks.NETHERRACK) {
                ItemStack smelteditem = FurnaceRecipes.instance().getSmeltingResult(new ItemStack(event.getState().getBlock()));
                if (smelteditem != null) {
                    smelteditem = smelteditem.copy();
                    event.getDrops().clear();
                    event.getDrops().add(smelteditem);
                }
            }
        }
    }

    @SubscribeEvent
    public void onHellFirePickup(EntityItemPickupEvent event) {

        if (event.getItem().getEntityItem().getItem() == ModItems.itemHellFireChunk
                && !event.getEntityPlayer().inventory.hasItemStack(new ItemStack(ModItems.itemObsidianSkull))) {
            event.getEntityPlayer().attackEntityFrom(InfernalDamageSources.HellFireburnDamage, 1.0F);
        }
    }

    @SubscribeEvent
    public void onHellFireTick(TickEvent.PlayerTickEvent event) {
        if (event.player.inventory.hasItemStack(new ItemStack(ModItems.itemHellFireChunk))
                && !event.player.inventory.hasItemStack(new ItemStack(ModItems.itemObsidianSkull))) {
            event.player.setFire(1);
            event.player.attackEntityFrom(InfernalDamageSources.HellFireburnDamage, 0.5F);

        }
    }
}


