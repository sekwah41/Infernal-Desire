package kiba.infernal.proxy;

import kiba.infernal.registry.ModItems;
import net.minecraftforge.fml.common.event.FMLInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPostInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPreInitializationEvent;

public class ClientProxy extends CommonProxy {

    @Override
    public void preInit(FMLPreInitializationEvent event){
        super.preInit(event);
        ModItems.initModels();
    }

    @Override
    public void Init(FMLInitializationEvent event){
        super.Init(event);
    }

    @Override
    public void postInit(FMLPostInitializationEvent event){
        super.postInit(event);
    }
}
