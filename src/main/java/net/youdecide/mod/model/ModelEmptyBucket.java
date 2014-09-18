



package net.youdecide.mod.model;

import net.minecraft.client.model.ModelBase;
import net.minecraft.client.model.ModelRenderer;
import net.minecraft.entity.Entity;

public class ModelEmptyBucket extends ModelBase
{
  //fields
	ModelRenderer Base;
    ModelRenderer SideA;
    ModelRenderer SideB;
    ModelRenderer SideC;
    ModelRenderer SideD;
  
  public ModelEmptyBucket()
  {
    textureWidth = 64;
    textureHeight = 32;
    
    Base = new ModelRenderer(this, 0, 0);
    Base.addBox(0F, 0F, 0F, 8, 1, 8);
    Base.setRotationPoint(-4F, 23F, -4F);
    Base.setTextureSize(64, 32);
    Base.mirror = true;
    setRotation(Base, 0F, 0F, 0F);
    SideA = new ModelRenderer(this, 40, 0);
    SideA.addBox(0F, 0F, 0F, 1, 6, 8);
    SideA.setRotationPoint(-4F, 17F, -4F);
    SideA.setTextureSize(64, 32);
    SideA.mirror = true;
    setRotation(SideA, 0F, 0F, 0F);
    SideB = new ModelRenderer(this, 40, 0);
    SideB.addBox(0F, 0F, 0F, 1, 6, 8);
    SideB.setRotationPoint(3F, 17F, -4F);
    SideB.setTextureSize(64, 32);
    SideB.mirror = true;
    setRotation(SideB, 0F, 0F, 0F);
    SideC = new ModelRenderer(this, 40, 0);
    SideC.addBox(0F, 0F, 0F, 8, 6, 1);
    SideC.setRotationPoint(-4F, 17F, 3F);
    SideC.setTextureSize(64, 32);
    SideC.mirror = true;
    setRotation(SideC, 0F, 0F, 0F);
    SideD = new ModelRenderer(this, 40, 0);
    SideD.addBox(0F, 0F, 0F, 8, 6, 1);
    SideD.setRotationPoint(-4F, 17F, -4F);
    SideD.setTextureSize(64, 32);
    SideD.mirror = true;
    setRotation(SideD, 0F, 0F, 0F);
  }
  
  public void render(Entity entity, float f, float f1, float f2, float f3, float f4, float f5)
  {
    super.render(entity, f, f1, f2, f3, f4, f5);
    setRotationAngles(f, f1, f2, f3, f4, f5, entity);
    Base.render(f5);
    SideA.render(f5);
    SideB.render(f5);
    SideC.render(f5);
    SideD.render(f5);
  }
  
public void renderModel(float f) {
	Base.render(f);
    SideA.render(f);
    SideB.render(f);
    SideC.render(f);
    SideD.render(f);
  }
  
  private void setRotation(ModelRenderer model, float x, float y, float z)
  {
    model.rotateAngleX = x;
    model.rotateAngleY = y;
    model.rotateAngleZ = z;
  }
  
  public void setRotationAngles(float f, float f1, float f2, float f3, float f4, float f5, Entity entity)
  {
    super.setRotationAngles(f, f1, f2, f3, f4, f5, entity);
  }

}
