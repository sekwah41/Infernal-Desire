package kiba.infernal.registry;

import kiba.infernal.item.BaseItem;
import kiba.infernal.tool.BasePickaxe;
import net.minecraft.item.Item;
import net.minecraftforge.common.util.EnumHelper;
import net.minecraftforge.fml.relauncher.Side;
import net.minecraftforge.fml.relauncher.SideOnly;

public class ModItems {
    public static BaseItem itemKnowledgeFlame;
    public static BaseItem itemMoltenRockPiece;
    public static BaseItem itemHellFireChunk;
    public static BaseItem itemInfernalCrystal;



    //TOOLS & WEAPONS
    public static BasePickaxe charredPickaxe;
    public static BasePickaxe moltenPickaxe;
    public static BasePickaxe hellfirePickaxe;
    public static BasePickaxe infernalPickaxe;


    public static void init(){
        itemKnowledgeFlame = new BaseItem("knowledge_flame");
        itemMoltenRockPiece = new BaseItem("molten_rock_piece");
        itemHellFireChunk = new BaseItem("hellfire_chunk");
        itemInfernalCrystal = new BaseItem("infernal_crystal");

        //Pickaxes
        charredPickaxe = new BasePickaxe("charred_pickaxe",Materials.CHARRED);
        moltenPickaxe = new BasePickaxe("molten_pickaxe",Materials.MOLTEN);
        hellfirePickaxe = new BasePickaxe("hellfire_pickaxe",Materials.HELLFIRE);
        infernalPickaxe = new BasePickaxe("infernal_pickaxe",Materials.INFERNAL);


    }
    @SideOnly(Side.CLIENT)
    public static void initModels(){
        itemKnowledgeFlame.initModel();
        itemMoltenRockPiece.initModel();
        itemHellFireChunk.initModel();
        itemInfernalCrystal.initModel();
        charredPickaxe.initModel();
        moltenPickaxe.initModel();
        hellfirePickaxe.initModel();
        infernalPickaxe.initModel();
    }
}
