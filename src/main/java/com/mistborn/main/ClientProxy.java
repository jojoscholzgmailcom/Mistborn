package com.mistborn.main;

import com.mistborn.entity.*;
import com.mistborn.entity.EntitySchutze;
import com.mistborn.render.ModelOberHerr;
import com.mistborn.render.RenderAdelige;
import com.mistborn.render.RenderInquisitor;
import com.mistborn.render.RenderOberHerr;
import com.mistborn.render.RenderObligator;
import com.mistborn.render.RenderOffizier;
import com.mistborn.render.RenderSchutze;
import com.mistborn.render.RenderSkar;
import com.mistborn.render.RenderSkarw;
import com.mistborn.render.RenderSoldat;

import cpw.mods.fml.client.registry.RenderingRegistry;
import cpw.mods.fml.common.FMLCommonHandler;
import net.minecraft.client.Minecraft;
import net.minecraft.client.model.ModelBiped;
import net.minecraft.client.model.ModelVillager;
import net.minecraft.client.model.ModelZombie;
import net.minecraft.client.renderer.entity.RenderArrow;
import net.minecraft.client.renderer.entity.RenderSnowball;

public class ClientProxy extends ServerProxy{
	public void registerRenderThings(){
		RenderingRegistry.registerEntityRenderingHandler(Entitydolch.class, new RenderSnowball(Mistborn.dolch));
		RenderingRegistry.registerEntityRenderingHandler(Entityglasdolch.class, new RenderSnowball(Mistborn.dolch));
		RenderingRegistry.registerEntityRenderingHandler(Entityeisdolch.class, new RenderSnowball(Mistborn.dolch));
		RenderingRegistry.registerEntityRenderingHandler(Entityobsidiandolch.class, new RenderSnowball(Mistborn.dolch));
		
		RenderingRegistry.registerEntityRenderingHandler(EntityOberHerr.class, new RenderOberHerr(new ModelBiped(), 0));
		RenderingRegistry.registerEntityRenderingHandler(EntityObligator.class, new RenderObligator(new ModelBiped(), 0));
		RenderingRegistry.registerEntityRenderingHandler(EntitySoldat.class, new RenderSoldat(new ModelBiped(), 0));
		RenderingRegistry.registerEntityRenderingHandler(EntityInquisitor.class, new RenderInquisitor(new ModelBiped(), 0));
		RenderingRegistry.registerEntityRenderingHandler(EntitySkarw.class, new RenderSkarw(new ModelBiped(), 0));
		RenderingRegistry.registerEntityRenderingHandler(EntityOffizier.class, new RenderOffizier(new ModelBiped(), 0));
		RenderingRegistry.registerEntityRenderingHandler(EntitySchutze.class, new RenderSchutze(new ModelBiped(), 0));
		RenderingRegistry.registerEntityRenderingHandler(EntityAdelige.class, new RenderAdelige(new ModelBiped(), 0));
		RenderingRegistry.registerEntityRenderingHandler(EntitySkar.class, new RenderSkar(new ModelBiped(), 0));
		
		//FMLCommonHandler.instance().bus().register(new ServerTickHandler(Minecraft.getMinecraft()));
	}
}
