package kiba.infernal.registry;

import kiba.infernal.item.ItemKnowledgeFlame;
import net.minecraftforge.fml.relauncher.Side;
import net.minecraftforge.fml.relauncher.SideOnly;

public class ModItems {
    public static ItemKnowledgeFlame itemKnowledgeFlame;

    public static void init(){
        itemKnowledgeFlame = new ItemKnowledgeFlame();
    }
    @SideOnly(Side.CLIENT)
    public static void initModels(){
        itemKnowledgeFlame.initModel();
    }
}
