package kiba.infernal.tool;

import net.minecraft.client.renderer.block.model.ModelResourceLocation;
import net.minecraft.item.ItemPickaxe;
import net.minecraftforge.client.model.ModelLoader;
import net.minecraftforge.fml.common.registry.GameRegistry;
import net.minecraftforge.fml.relauncher.Side;
import net.minecraftforge.fml.relauncher.SideOnly;

public class BasePickaxe extends ItemPickaxe {
    public BasePickaxe(String name, ToolMaterial material) {
        super(material);
        this.setRegistryName(name);
        this.setUnlocalizedName(name);
        GameRegistry.register(this);
    }
    @SideOnly(Side.CLIENT)
    public void initModel(){
        ModelLoader.setCustomModelResourceLocation(this, 0, new ModelResourceLocation(getRegistryName(),"inventory"));
    }
}
