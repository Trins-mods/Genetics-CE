package dev.trinsdar.core.api.gui;

import net.minecraft.resources.ResourceLocation;

public interface ITexture {
	IArea getArea();

	IBorder getBorder();

    ResourceLocation getResourceLocation();

	IBorder getTotalPadding();

	int width();

	int height();

	ITexture crop(Alignment anchor, int dist);

	ITexture crop(IBorder crop);
}
