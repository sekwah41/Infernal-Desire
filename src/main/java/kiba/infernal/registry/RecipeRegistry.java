package kiba.infernal.registry;

import net.minecraft.init.Blocks;
import net.minecraft.item.ItemStack;
import net.minecraftforge.fml.common.event.FMLPreInitializationEvent;
import net.minecraftforge.fml.common.registry.GameRegistry;

import java.util.PriorityQueue;

public class RecipeRegistry {

    public static void register(FMLPreInitializationEvent event){
        //CRAFTING RECIPES

        //FUELS
        GameRegistry.registerFuelHandler(ModItems.itemMoltenRockPiece);

        //SMELTING
        GameRegistry.addSmelting(Blocks.STONE, new ItemStack(Blocks.STONE),0.0F);


    }



}
