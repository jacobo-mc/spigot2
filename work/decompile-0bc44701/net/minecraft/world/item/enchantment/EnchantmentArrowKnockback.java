package net.minecraft.world.item.enchantment;

import net.minecraft.world.entity.EnumItemSlot;

public class EnchantmentArrowKnockback extends Enchantment {

    public EnchantmentArrowKnockback(Enchantment.Rarity enchantment_rarity, EnumItemSlot... aenumitemslot) {
        super(enchantment_rarity, EnchantmentSlotType.BOW, aenumitemslot);
    }

    @Override
    public int getMinCost(int i) {
        return 12 + (i - 1) * 20;
    }

    @Override
    public int getMaxCost(int i) {
        return this.getMinCost(i) + 25;
    }

    @Override
    public int getMaxLevel() {
        return 2;
    }
}
