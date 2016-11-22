package kiba.infernal.registry;

import net.minecraftforge.fml.common.event.FMLPreInitializationEvent;
import net.minecraftforge.fml.common.registry.GameRegistry;

public class RecipeRegistry {

    public static void register(FMLPreInitializationEvent event){
        //CRAFTING RECIPES

        //FUELS
        GameRegistry.registerFuelHandler(ModItems.itemMoltenRockPiece);


    }



}
