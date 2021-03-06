package net.minecraft.world.item.enchantment;

import net.minecraft.world.entity.EnumItemSlot;

public class EnchantmentDepthStrider extends Enchantment {

    public EnchantmentDepthStrider(Enchantment.Rarity enchantment_rarity, EnumItemSlot... aenumitemslot) {
        super(enchantment_rarity, EnchantmentSlotType.ARMOR_FEET, aenumitemslot);
    }

    @Override
    public int getMinCost(int i) {
        return i * 10;
    }

    @Override
    public int getMaxCost(int i) {
        return this.getMinCost(i) + 15;
    }

    @Override
    public int getMaxLevel() {
        return 3;
    }

    @Override
    public boolean checkCompatibility(Enchantment enchantment) {
        return super.checkCompatibility(enchantment) && enchantment != Enchantments.FROST_WALKER;
    }
}
