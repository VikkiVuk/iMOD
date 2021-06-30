package com.VikkiVuk.iMOD.registry;

import com.VikkiVuk.iMOD.fluids.ChocolateMilk.ChocolateMilk;
import com.VikkiVuk.iMOD.fluids.CustomFluid;
import com.VikkiVuk.iMOD.iMOD;
import net.fabricmc.fabric.api.client.render.fluid.v1.FluidRenderHandler;
import net.fabricmc.fabric.api.client.render.fluid.v1.FluidRenderHandlerRegistry;
import net.fabricmc.fabric.api.event.client.ClientSpriteRegistryCallback;
import net.fabricmc.fabric.api.object.builder.v1.block.FabricBlockSettings;
import net.fabricmc.fabric.api.resource.ResourceManagerHelper;
import net.fabricmc.fabric.api.resource.SimpleSynchronousResourceReloadListener;
import net.minecraft.block.Block;
import net.minecraft.block.Blocks;
import net.minecraft.block.FluidBlock;
import net.minecraft.client.MinecraftClient;
import net.minecraft.client.texture.Sprite;
import net.minecraft.client.texture.SpriteAtlasTexture;
import net.minecraft.fluid.FlowableFluid;
import net.minecraft.fluid.Fluid;
import net.minecraft.fluid.FluidState;
import net.minecraft.item.BucketItem;
import net.minecraft.item.Item;
import net.minecraft.item.Items;
import net.minecraft.resource.ResourceManager;
import net.minecraft.resource.ResourceType;
import net.minecraft.util.Identifier;
import net.minecraft.util.math.BlockPos;
import net.minecraft.util.registry.Registry;
import net.minecraft.world.BlockRenderView;

import java.util.function.Function;

import static com.VikkiVuk.iMOD.iMOD.MOD_ID;

public class FluidInit {
    public static FlowableFluid STILL_CHOCOLATE_MILK;
    public static FlowableFluid FLOWING_CHOCOLATE_MILK;
    public static Item CHOCOLATE_MILK_BUCKET;
    public static Block CHOCOLATE_MILK;

    public static void registerFluids() {
        STILL_CHOCOLATE_MILK = Registry.register(Registry.FLUID, new Identifier(MOD_ID, "chocolate_milk_still"), new ChocolateMilk.Still());
        FLOWING_CHOCOLATE_MILK = Registry.register(Registry.FLUID, new Identifier(MOD_ID, "chocolate_milk_flowing"), new ChocolateMilk.Flowing());
        CHOCOLATE_MILK_BUCKET = Registry.register(Registry.ITEM, new Identifier(MOD_ID, "chocolate_milk_bucket"), new BucketItem(STILL_CHOCOLATE_MILK, new Item.Settings().recipeRemainder(Items.BUCKET).maxCount(1).group(iMOD.iTAB)));
        CHOCOLATE_MILK = Registry.register(Registry.BLOCK, new Identifier(MOD_ID, "chocolate_milk"), new FluidBlock(STILL_CHOCOLATE_MILK, FabricBlockSettings.copy(Blocks.WATER)){});
    }

    public static void setupFluidRendering(final Fluid still, final Fluid flowing, final Identifier textureFluidId) {
        final Identifier stillSpriteId = new Identifier(textureFluidId.getNamespace(), "fluids/" + textureFluidId.getPath() + "_still");
        final Identifier flowingSpriteId = new Identifier(textureFluidId.getNamespace(), "fluids/" + textureFluidId.getPath() + "_flowing");

        // If they're not already present, add the sprites to the block atlas
        ClientSpriteRegistryCallback.event(SpriteAtlasTexture.BLOCK_ATLAS_TEXTURE).register((atlasTexture, registry) -> {
            registry.register(stillSpriteId);
            registry.register(flowingSpriteId);
        });

        final Identifier fluidId = Registry.FLUID.getId(still);
        final Identifier listenerId = new Identifier(fluidId.getNamespace(), fluidId.getPath() + "_reload_listener");

        final Sprite[] fluidSprites = { null, null };

        ResourceManagerHelper.get(ResourceType.CLIENT_RESOURCES).registerReloadListener(new SimpleSynchronousResourceReloadListener() {
            @Override
            public void reload(ResourceManager manager) {
                final Function<Identifier, Sprite> atlas = MinecraftClient.getInstance().getSpriteAtlas(SpriteAtlasTexture.BLOCK_ATLAS_TEXTURE);
                fluidSprites[0] = atlas.apply(stillSpriteId);
                fluidSprites[1] = atlas.apply(flowingSpriteId);
            }

            @Override
            public Identifier getFabricId() {
                return listenerId;
            }
        });

        // The FluidRenderer gets the sprites and color from a FluidRenderHandler during rendering
        final FluidRenderHandler renderHandler = (view, pos, state) -> fluidSprites;

        FluidRenderHandlerRegistry.INSTANCE.register(still, renderHandler);
        FluidRenderHandlerRegistry.INSTANCE.register(flowing, renderHandler);
    }
}
