package kiba.infernal.registry;

import kiba.infernal.item.BaseItem;
import kiba.infernal.item.ItemMoltenRockPiece;
import kiba.infernal.tool.BasePickaxe;
import kiba.infernal.weapon.MoltenSword;
import net.minecraftforge.fml.relauncher.Side;
import net.minecraftforge.fml.relauncher.SideOnly;

public class ModItems {
    public static ItemMoltenRockPiece itemMoltenRockPiece;
    public static MoltenSword moltenSword;
    public static BaseItem itemKnowledgeFlame;
    public static BaseItem itemHellFireChunk;
    public static BaseItem itemInfernalCrystal;
    public static BaseItem itemObsidianSkull;
    public static BaseItem itemWitheringShard;



    //TOOLS & WEAPONS
    public static BasePickaxe charredPickaxe;
    public static BasePickaxe moltenPickaxe;
    public static BasePickaxe hellfirePickaxe;
    public static BasePickaxe infernalPickaxe;


    public static void init(){
        itemMoltenRockPiece = new ItemMoltenRockPiece();
        itemKnowledgeFlame = new BaseItem("knowledge_flame");
        itemHellFireChunk = new BaseItem("hellfire_chunk");
        itemInfernalCrystal = new BaseItem("infernal_crystal");
        itemObsidianSkull = new BaseItem("obsidian_skull");
        itemWitheringShard = new BaseItem("withering_shard");

        //Pickaxes
        charredPickaxe = new BasePickaxe("charred_pickaxe",Materials.CHARRED);
        moltenPickaxe = new BasePickaxe("molten_pickaxe",Materials.MOLTEN);
        hellfirePickaxe = new BasePickaxe("hellfire_pickaxe",Materials.HELLFIRE);
        infernalPickaxe = new BasePickaxe("infernal_pickaxe",Materials.INFERNAL);

        //Sword
        moltenSword = new MoltenSword();


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
        itemObsidianSkull.initModel();
        itemWitheringShard.initModel();
        moltenSword.initModel();
    }
}
