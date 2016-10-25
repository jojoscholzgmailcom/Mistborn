package com.mistborn.entity;

import com.mistborn.main.Mistborn;

import net.minecraft.client.Minecraft;
import net.minecraft.enchantment.Enchantment;
import net.minecraft.enchantment.EnchantmentHelper;
import net.minecraft.entity.EntityLivingBase;
import net.minecraft.entity.EnumCreatureAttribute;
import net.minecraft.entity.IEntityLivingData;
import net.minecraft.entity.IRangedAttackMob;
import net.minecraft.entity.SharedMonsterAttributes;
import net.minecraft.entity.ai.EntityAIArrowAttack;
import net.minecraft.entity.ai.EntityAIAttackOnCollide;
import net.minecraft.entity.ai.EntityAINearestAttackableTarget;
import net.minecraft.entity.ai.EntityAISwimming;
import net.minecraft.entity.ai.EntityAIWander;
import net.minecraft.entity.monster.EntityMob;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.entity.projectile.EntityArrow;
import net.minecraft.init.Items;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.world.World;
import net.minecraft.world.WorldProviderHell;

public class EntitySchutze extends EntityMob implements IRangedAttackMob{

	private EntityAIArrowAttack aiArrowAttack = new EntityAIArrowAttack(this, 1.0D, 20, 60, 15.0F);
	 private EntityAIAttackOnCollide aiAttackOnCollide = new EntityAIAttackOnCollide(this, EntityPlayer.class, 1.2D, false);
	    
	public EntitySchutze(World world) {
		
	
		super(world);
		this.canAttackWithItem();
		this.isImmuneToFire = true;
		this.tasks.addTask(0, new EntityAISwimming(this));
		this.tasks.addTask(1, new EntityAIWander(this, 0.2D));
		this.tasks.addTask(2, new EntityAIAttackOnCollide(this, EntityPlayer.class, 0.50D, true));
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
		return Items.arrow;
	}
	protected void addRandomArmor()
    {
        super.addRandomArmor();
        this.setCurrentItemOrArmor(0, new ItemStack(Items.bow));
    }
	public IEntityLivingData onSpawnWithEgg(IEntityLivingData p_110161_1_)
    {
		p_110161_1_ = super.onSpawnWithEgg(p_110161_1_);

        if (this.worldObj.provider instanceof WorldProviderHell && this.getRNG().nextInt(5) > 0)
        {
        	
        }else{
        	this.tasks.addTask(4, this.aiArrowAttack);
            this.addRandomArmor();
            this.enchantEquipment();	
        }
        return p_110161_1_;
        }
	
	public void setCurrentItemOrArmor(int p_70062_1_, ItemStack p_70062_2_)
    {
        super.setCurrentItemOrArmor(p_70062_1_, p_70062_2_);

        if (!this.worldObj.isRemote && p_70062_1_ == 0)
        {
            this.setCombatTask();
        }
    }
	 public void setCombatTask()
	    {
	        this.tasks.removeTask(this.aiAttackOnCollide);
	        this.tasks.removeTask(this.aiArrowAttack);
	        ItemStack itemstack = this.getHeldItem();

	        if (itemstack != null && itemstack.getItem() == Items.bow)
	        {
	            this.tasks.addTask(4, this.aiArrowAttack);
	        }
	        else
	        {
	            this.tasks.addTask(4, this.aiAttackOnCollide);
	        }
	    }
             
	 public void attackEntityWithRangedAttack(EntityLivingBase p_82196_1_, float p_82196_2_)
	    {
	        EntityArrow entityarrow = new EntityArrow(this.worldObj, this, p_82196_1_, 1.6F, (float)(14 - this.worldObj.difficultySetting.getDifficultyId() * 4));
	        int i = EnchantmentHelper.getEnchantmentLevel(Enchantment.power.effectId, this.getHeldItem());
	        int j = EnchantmentHelper.getEnchantmentLevel(Enchantment.punch.effectId, this.getHeldItem());
	        entityarrow.setDamage((double)(p_82196_2_ * 2.0F) + this.rand.nextGaussian() * 0.25D + (double)((float)this.worldObj.difficultySetting.getDifficultyId() * 0.11F));

	        if (i > 0)
	        {
	            entityarrow.setDamage(entityarrow.getDamage() + (double)i * 0.5D + 0.5D);
	        }

	        if (j > 0)
	        {
	            entityarrow.setKnockbackStrength(j);
	        }

	        if (EnchantmentHelper.getEnchantmentLevel(Enchantment.flame.effectId, this.getHeldItem()) > 0)
	        {
	            entityarrow.setFire(100);
	        }

	        this.playSound("random.bow", 1.0F, 1.0F / (this.getRNG().nextFloat() * 0.4F + 0.8F));
	        this.worldObj.spawnEntityInWorld(entityarrow);
	    }
	public EnumCreatureAttribute getCreatureAttribute(){
		return EnumCreatureAttribute.UNDEFINED;
	}
}

