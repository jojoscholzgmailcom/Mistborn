package com.mistborn.entity;

import com.mistborn.main.Mistborn;

import cpw.mods.fml.client.registry.RenderingRegistry;
import cpw.mods.fml.common.registry.EntityRegistry;
import net.minecraft.client.renderer.entity.Render;
import net.minecraft.entity.EntityList;
import net.minecraft.entity.EnumCreatureType;
import net.minecraft.world.biome.BiomeGenBase;

public class EntityMain {
	public static void registeryMain(){
		registryEntity();
	}

	private static void registryEntity() {
		//createEntity(EntityOberHerr.class, "Oberster Herrscher", EnumCreatureType.monster, 0, 0, 0, new BiomeGenBase[]{}, 2552550, 25500);
		createEntity2(Entitydolch.class, "Nebeldolch", 0, 0);
		createEntity2(Entityglasdolch.class, "Glasdolch", 0, 0);
		createEntity2(Entityeisdolch.class, "Eisdolch", 0, 0);
		createEntity2(Entityobsidiandolch.class, "Obsidiandolch", 0, 0);
		createEntity3(EntityOberHerr.class, "OberHerr", 2552550, 25500);
		createEntity3(EntityObligator.class, "Obligator", 0xE69E57, 0xFF0000);
		createEntity3(EntitySoldat.class, "Soldat", 0xE69E57, 0x5E5C5C);
		createEntity3(EntityInquisitor.class, "Inquisitor", 0xE69E57, 0xFF0000);
		createEntity3(EntitySkar.class, "Skar", 0xE69E57, 0xE69E68);
		createEntity3(EntitySchutze.class, "Schutze", 0xE69E57, 0xFF0000);
		createEntity3(EntitySkarw.class, "Skarw", 0xE69E57, 0xE69E68);
		createEntity3(EntityAdelige.class, "Adelige", 0x962430, 0xCCC96E);
		createEntity3(EntityOffizier.class, "Offizier", 0x615F5F, 0xCCC96E);
		
		
	}
	public static void createEntity2(Class entityClass, String entityName, int solidColor, int spotColor){
		int randomId = EntityRegistry.findGlobalUniqueEntityId();
		
		EntityRegistry.registerGlobalEntityID(entityClass, entityName, randomId);
		EntityRegistry.registerModEntity(entityClass, entityName, randomId, Mistborn.modInstance, 64, 1, true);
		
	}
	public static void createEntity3(Class entityClass, String entityName, int solidColor, int spotColor){
		int randomId = EntityRegistry.findGlobalUniqueEntityId();
		
		EntityRegistry.registerGlobalEntityID(entityClass, entityName, randomId);
		EntityRegistry.registerModEntity(entityClass, entityName, randomId, Mistborn.modInstance, 64, 1, true);
		createEgg(randomId, solidColor, spotColor);
	}

	
	public static void createEntity(Class entityClass,Render render, String entityName, EnumCreatureType type, int probability, int minSpawn, int maxSpawn, BiomeGenBase[] biomes, int solidColor, int spotColor, boolean hasSpawnegg){
		int randomId = EntityRegistry.findGlobalUniqueEntityId();
		
		EntityRegistry.registerGlobalEntityID(entityClass, entityName, randomId);
		EntityRegistry.registerModEntity(entityClass, entityName, randomId, Mistborn.modInstance, 64, 1, true);
		EntityRegistry.addSpawn(entityName, probability, minSpawn, maxSpawn, type, biomes);
		RenderingRegistry.registerEntityRenderingHandler(entityClass, render);
		if(hasSpawnegg){
			createEgg(randomId, solidColor, spotColor);	
		}
		
	}

	private static void createEgg(int randomId, int solidColor, int spotColor) {
		EntityList.entityEggs.put(Integer.valueOf(randomId), new EntityList.EntityEggInfo(randomId, solidColor, spotColor));
		
	}
}
