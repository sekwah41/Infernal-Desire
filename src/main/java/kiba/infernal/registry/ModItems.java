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

   //MATERIALS
    public static Item.ToolMaterial CHARRED = EnumHelper.addToolMaterial("CHARRED", 3 , 500 , 4.0F, 1.0F, 5);
    public static Item.ToolMaterial MOLTEN = EnumHelper.addToolMaterial("MOLTEN", 3 , 1561 , 8.0F, 4.0F, 22);
    public static Item.ToolMaterial HELLFIRE = EnumHelper.addToolMaterial("HELLFIRE",3,5000,12.0F,5.0F,8);
    public static Item.ToolMaterial INFERNAL = EnumHelper.addToolMaterial("INFERNAL", 5, 9000, 20.0F, 8.0F,8);

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
        charredPickaxe = new BasePickaxe("charred_pickaxe",ModItems.CHARRED);
        moltenPickaxe = new BasePickaxe("molten_pickaxe",ModItems.MOLTEN);
        hellfirePickaxe = new BasePickaxe("hellfire_pickaxe",ModItems.HELLFIRE);
        infernalPickaxe = new BasePickaxe("infernal_pickaxe",ModItems.INFERNAL);


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
