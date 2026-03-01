package dev.trinsdar.core.api.gui;

import net.minecraft.client.renderer.texture.TextureAtlasSprite;
import net.minecraftforge.api.distmarker.Dist;
import net.minecraftforge.api.distmarker.OnlyIn;

public interface IBinnieSprite {
	@OnlyIn(Dist.CLIENT)
	TextureAtlasSprite getSprite();
}
