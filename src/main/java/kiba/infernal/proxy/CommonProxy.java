package kiba.infernal.proxy;

import kiba.infernal.handler.InfernalEventHandler;
import kiba.infernal.registry.MobDrops;
import kiba.infernal.registry.ModItems;
import kiba.infernal.registry.RecipeRegistry;
import net.minecraftforge.common.MinecraftForge;
import net.minecraftforge.fml.common.event.FMLInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPostInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPreInitializationEvent;

import java.beans.EventHandler;

public class CommonProxy {

    public void preInit(FMLPreInitializationEvent event){
        ModItems.init();
        RecipeRegistry.register(event);
        MinecraftForge.EVENT_BUS.register(new MobDrops());



    }

    public void Init(FMLInitializationEvent event){


    }

    public void postInit(FMLPostInitializationEvent event){

    }
}
