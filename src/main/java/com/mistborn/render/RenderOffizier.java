package com.mistborn.render;

import com.mistborn.entity.EntityOberHerr;
import com.mistborn.entity.EntityOffizier;
import com.mistborn.main.Mistborn;

import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;
import net.minecraft.client.model.ModelBase;
import net.minecraft.client.renderer.entity.RenderLiving;
import net.minecraft.entity.Entity;
import net.minecraft.entity.passive.EntityCow;
import net.minecraft.util.ResourceLocation;

@SideOnly(Side.CLIENT)
public class RenderOffizier extends RenderLiving
{
    private static final ResourceLocation mobTextures = new ResourceLocation(Mistborn.MODID + ":textures/entity/Offizier.png");
    private static final String __OBFID = "CL_00000984";

    public RenderOffizier(ModelBase par1Modelbase, float par2)
    {
        super(par1Modelbase, par2);
    }

    /**
     * Returns the location of an entity's texture. Doesn't seem to be called unless you call Render.bindEntityTexture.
     */
    protected ResourceLocation getEntityTexture(EntityOffizier par1EntityCow)
    {
        return mobTextures;
    }

    /**
     * Returns the location of an entity's texture. Doesn't seem to be called unless you call Render.bindEntityTexture.
     */
    protected ResourceLocation getEntityTexture(Entity par1Entity)
    {
        return this.getEntityTexture((EntityOffizier)par1Entity);
    }
}