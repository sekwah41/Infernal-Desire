package kiba.infernal.registry;

import net.minecraft.item.Item;
import net.minecraftforge.common.util.EnumHelper;

public class Materials {
    //MATERIALS
    public static Item.ToolMaterial CHARRED = EnumHelper.addToolMaterial("CHARRED", 3 , 500 , 4.0F, 1.0F, 5);
    public static Item.ToolMaterial MOLTEN = EnumHelper.addToolMaterial("MOLTEN", 3 , 1561 , 8.0F, 4.0F, 22);
    public static Item.ToolMaterial HELLFIRE = EnumHelper.addToolMaterial("HELLFIRE",3,5000,12.0F,5.0F,8);
    public static Item.ToolMaterial INFERNAL = EnumHelper.addToolMaterial("INFERNAL", 5, 9000, 20.0F, 8.0F,8);
}
