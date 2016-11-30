package kiba.infernal.weapon;

import kiba.infernal.registry.Materials;
import net.minecraft.enchantment.EnchantmentHelper;
import net.minecraft.entity.Entity;
import net.minecraft.init.Enchantments;
import net.minecraft.item.ItemStack;
import net.minecraft.world.World;

public class MoltenSword extends BaseSword {
    public MoltenSword() {
        super("molten_sword", Materials.MOLTEN);

    }

    @Override
    public void onUpdate(ItemStack stack, World worldIn, Entity entityIn, int itemSlot, boolean isSelected) {
        if (EnchantmentHelper.getEnchantmentLevel(Enchantments.FIRE_ASPECT, stack) == 0)
            stack.addEnchantment(Enchantments.FIRE_ASPECT, 1);
    }
}

