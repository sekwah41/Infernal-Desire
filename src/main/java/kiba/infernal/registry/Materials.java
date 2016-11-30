package kiba.infernal.registry;

import net.minecraft.init.Blocks;
import net.minecraft.init.SoundEvents;
import net.minecraft.item.Item;
import net.minecraft.item.ItemArmor;
import net.minecraft.item.ItemStack;
import net.minecraftforge.common.util.EnumHelper;

import static kiba.infernal.InfernalDesire.getInfernalLocation;

public class Materials {
    //MATERIALS
    public static Item.ToolMaterial CHARRED = EnumHelper.addToolMaterial("CHARRED", 3 , 500 , 4.0F, 1.0F, 5).setRepairItem(new ItemStack(Blocks.COAL_BLOCK));
    public static Item.ToolMaterial MOLTEN = EnumHelper.addToolMaterial("MOLTEN", 3 , 1561 , 8.0F, 4.0F, 22).setRepairItem(new ItemStack(ModItems.itemMoltenRockPiece));
    public static Item.ToolMaterial HELLFIRE = EnumHelper.addToolMaterial("HELLFIRE",3,5000,12.0F,5.0F,8);
    public static Item.ToolMaterial INFERNAL = EnumHelper.addToolMaterial("INFERNAL", 5, 9000, 20.0F, 8.0F,8);
    public static ItemArmor.ArmorMaterial INFERNALA = EnumHelper.addArmorMaterial("INFERNAL", getInfernalLocation("infernal_armor"),60, new int[]{3,8,6,3},10, SoundEvents.ITEM_ARMOR_EQUIP_DIAMOND,3.0F);

}
