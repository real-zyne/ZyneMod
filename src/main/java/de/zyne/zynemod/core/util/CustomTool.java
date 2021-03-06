package de.zyne.zynemod.core.util;

import de.zyne.zynemod.core.init.ItemInit;
import net.minecraft.world.item.Tier;
import net.minecraft.world.item.crafting.Ingredient;
import net.minecraftforge.registries.ObjectHolder;

import javax.annotation.Nonnull;
import javax.annotation.Nullable;
import java.util.function.Supplier;

public enum CustomTool implements Tier {

    STEEL_SWORD(4, 1000, 15f, 8f, 17, () -> Ingredient.of(ItemInit.STEEL_INGOT.get()));


    public final int harvestLevel;
    public final int maxUses;
    public final float efficiency;
    public final float attackDamage;
    public final int enchantibility;
    public final Ingredient repairMaterial;
    
    CustomTool(int harvestLevel, int maxUses, float efficiency, float attackDamage, int enchantibility, @Nullable Supplier<Ingredient> repairMaterial) {

        this.harvestLevel = harvestLevel;
        this.maxUses = maxUses;
        this.efficiency = efficiency;
        this.attackDamage = attackDamage;
        this.enchantibility = enchantibility;
        this.repairMaterial = repairMaterial.get();

    }



    @Override
    public int getUses() {
        return this.maxUses;
    }

    @Override
    public float getSpeed() {
        return this.efficiency;
    }

    @Override
    public float getAttackDamageBonus() {
        return this.attackDamage;
    }

    @Override
    public int getLevel() {
        return this.harvestLevel;

    }
    @Override
    public int getEnchantmentValue() {
        return this.enchantibility;
    }

    @Override
    public Ingredient getRepairIngredient() {
        return this.repairMaterial;
    }
}
