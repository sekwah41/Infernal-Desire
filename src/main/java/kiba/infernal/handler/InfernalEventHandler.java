package kiba.infernal.handler;

import kiba.infernal.registry.ModItems;
import net.minecraft.block.Block;
import net.minecraft.entity.item.EntityItem;
import net.minecraft.init.Blocks;
import net.minecraft.init.Items;
import net.minecraft.item.ItemStack;
import net.minecraftforge.event.world.BlockEvent;
import net.minecraftforge.fml.common.eventhandler.SubscribeEvent;

import java.util.Random;

public class InfernalEventHandler {
    Random random = new Random();

    @SubscribeEvent
    public void onBlockBreakOverworld(BlockEvent.BreakEvent event) {
        if (event.getPlayer() != null && event.getPlayer().getHeldItemMainhand() != null && event.getPlayer().getHeldItemMainhand().getItem() == ModItems.charredPickaxe ||
                (event.getPlayer() != null && event.getPlayer().getHeldItemMainhand() != null && event.getPlayer().getHeldItemMainhand().getItem() == ModItems.infernalPickaxe))
            if (event.getState().getBlock() == Blocks.STONE && random.nextInt(32) == 0)
                if (event.getPlayer().dimension == 0)

                    event.getWorld().spawnEntityInWorld(new EntityItem(event.getWorld(), event.getPos().getX(), event.getPos().getY(), event.getPos().getZ(), new ItemStack(ModItems.itemMoltenRockPiece)));
    }

    @SubscribeEvent
    public void onBlockBreakNether(BlockEvent.BreakEvent event) {
        if (event.getPlayer() != null && event.getPlayer().getHeldItemMainhand() != null && event.getPlayer().getHeldItemMainhand().getItem() == ModItems.moltenPickaxe ||
                (event.getPlayer() != null && event.getPlayer().getHeldItemMainhand() != null && event.getPlayer().getHeldItemMainhand().getItem() == ModItems.infernalPickaxe))
            if (event.getState().getBlock() == Blocks.NETHERRACK && random.nextInt(64) == 0)
                if (event.getPlayer().dimension == -1)

                    event.getWorld().spawnEntityInWorld(new EntityItem(event.getWorld(), event.getPos().getX(), event.getPos().getY(), event.getPos().getZ(), new ItemStack(ModItems.itemHellFireChunk)));

    }

    @SubscribeEvent
    public void onBlockBreakEnd(BlockEvent.BreakEvent event) {
        if (event.getPlayer() != null && event.getPlayer().getHeldItemMainhand() != null && event.getPlayer().getHeldItemMainhand().getItem() == ModItems.hellfirePickaxe ||
                (event.getPlayer() != null && event.getPlayer().getHeldItemMainhand() != null && event.getPlayer().getHeldItemMainhand().getItem() == ModItems.infernalPickaxe))
            if (event.getState().getBlock() == Blocks.STONE && random.nextInt(128) == 0)
                if (event.getPlayer().dimension == 1)

                    event.getWorld().spawnEntityInWorld(new EntityItem(event.getWorld(), event.getPos().getX(), event.getPos().getY(), event.getPos().getZ(), new ItemStack(ModItems.itemInfernalCrystal)));
    }
}


