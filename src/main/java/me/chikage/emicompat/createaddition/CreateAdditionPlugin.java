package me.chikage.emicompat.createaddition;
/*

import dev.emi.emi.api.EmiPlugin;
import dev.emi.emi.api.EmiRegistry;
import dev.emi.emi.api.recipe.EmiRecipeCategory;
import dev.emi.emi.api.render.EmiRenderable;
import dev.emi.emi.api.stack.EmiStack;
import net.minecraft.resources.ResourceLocation;

import java.util.LinkedHashMap;
import java.util.Map;

import static me.chikage.emicompat.EmiCompatPlugin.addAll;


public class CreateAdditionPlugin implements EmiPlugin {
    public static final Map<ResourceLocation, EmiRecipeCategory> ALL = new LinkedHashMap<>();

    public static final EmiRecipeCategory
            Charging = register("charging", EmiStack.of(CABlocks.TESLA_COIL.get())),
            RollingMill = register("rolling", EmiStack.of(CABlocks.ROLLING_MILL.get()));

    @Override
    public void register(EmiRegistry registry) {
        ALL.forEach((id, category) -> registry.addCategory(category));

        registry.addWorkstation(Charging, EmiStack.of(CABlocks.TESLA_COIL.get()));
        registry.addWorkstation(RollingMill, EmiStack.of(CABlocks.ROLLING_MILL.get()));

        addAll(registry, ChargingRecipe.TYPE, EMIChargingRecipe::new);
        addAll(registry, RollingRecipe.TYPE, EMIRollingMillRecipe::new);
    }

    private static EmiRecipeCategory register(String name, EmiRenderable icon) {
        ResourceLocation id = new ResourceLocation(CreateAddition.MODID, name);
        EmiRecipeCategory category = new EmiRecipeCategory(id, icon);
        ALL.put(id, category);
        return category;
    }
}

 */
