package kiba.infernal;


import kiba.infernal.proxy.CommonProxy;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.common.SidedProxy;
import net.minecraftforge.fml.common.event.FMLInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPostInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPreInitializationEvent;

@Mod(modid = InfernalDesire.MODID , version = InfernalDesire.VERSION, name = InfernalDesire.MODNAME)
public class InfernalDesire {

    public static final String MODID = "infernal";
    public static final String MODNAME = "Infernal Desire";
    public static final String VERSION = "1.10.2-0.0.1";
    public static final String CLIENTPROXY = "kiba.infernal.proxy.ClientProxy";
    public static final String COMMONPROXY = "kiba.infernal.proxy.CommonProxy";

    @SidedProxy(clientSide = InfernalDesire.CLIENTPROXY,serverSide = InfernalDesire.COMMONPROXY)
    public static CommonProxy proxy;

    @Mod.Instance
    public static InfernalDesire instance = new InfernalDesire();

    @Mod.EventHandler
    public void preInit(FMLPreInitializationEvent event){

        proxy.preInit(event);

    }

    @Mod.EventHandler
    public void Init(FMLInitializationEvent event){

    }

    @Mod.EventHandler
    public void postInit(FMLPostInitializationEvent event){

    }

}
