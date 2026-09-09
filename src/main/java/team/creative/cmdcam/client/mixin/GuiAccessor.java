package team.creative.cmdcam.client.mixin;

import net.minecraft.client.DeltaTracker;
import net.minecraft.client.gui.GuiGraphicsExtractor;
import net.minecraft.client.gui.Hud;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.gen.Invoker;

@Mixin(Hud.class)
public interface GuiAccessor {

    @Invoker("extractTitle")
    void callExtractTitle(GuiGraphicsExtractor graphics, DeltaTracker deltaTracker);
}