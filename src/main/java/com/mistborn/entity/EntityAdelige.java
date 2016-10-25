package com.mistborn.entity;

import com.mistborn.main.Mistborn;

import net.minecraft.entity.EnumCreatureAttribute;
import net.minecraft.entity.SharedMonsterAttributes;
import net.minecraft.entity.ai.EntityAIAttackOnCollide;
import net.minecraft.entity.ai.EntityAINearestAttackableTarget;
import net.minecraft.entity.ai.EntityAISwimming;
import net.minecraft.entity.ai.EntityAIWander;
import net.minecraft.entity.monster.EntityMob;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.item.Item;
import net.minecraft.world.World;

public class EntityAdelige extends EntityMob{

	public EntityAdelige(World world) {
		
	
		super(world);
		this.canAttackWithItem();
		this.isImmuneToFire = true;
		this.tasks.addTask(0, new EntityAISwimming(this));
		this.tasks.addTask(1, new EntityAIWander(this, 0.20D));
		this.tasks.addTask(2, new EntityAIAttackOnCollide(this, EntityPlayer.class, 0.20D, true));
		this.targetTasks.addTask(3, new EntityAINearestAttackableTarget(this, EntityPlayer.class, 0, true));
		setSize(0.6F, 1.9F);
		
	}
	public boolean isAIEnabled(){
		return true;
	}
	public void onLivingUpdate(){
		
		this.getEntityAttribute(SharedMonsterAttributes.maxHealth).setBaseValue(20);
		this.getEntityAttribute(SharedMonsterAttributes.attackDamage).setBaseValue(5.0D);
		this.getEntityAttribute(SharedMonsterAttributes.followRange).setBaseValue(15.0D);
		this.getEntityAttribute(SharedMonsterAttributes.movementSpeed).setBaseValue(0.5D);
		super.onLivingUpdate();
	}
	protected String getLivingSound(){
		//nicht funktionstüchtig
		return "mob.villager.say";
	}
	protected String getHurtSound(){
		//nicht funktionstüchtig
		return "mob.villager.hurt";
	}
	protected String getDeathSound(){
		return "mob.zombie.death";
	}
	protected Item getDropItem(){
		return Mistborn.nebelschwert;
	}
	public EnumCreatureAttribute getCreatureAttribute(){
		return EnumCreatureAttribute.UNDEFINED;
	}
}

