package team.creative.cmdcam.client;

import com.mojang.blaze3d.platform.InputConstants;
import net.fabricmc.fabric.api.client.keymapping.v1.KeyMappingHelper;
import net.minecraft.client.KeyMapping;
import net.minecraft.resources.Identifier;
import team.creative.cmdcam.CMDCam;

public class KeyHandler {

    public static final KeyMapping.Category CATEGORY = KeyMapping.Category.register(Identifier.fromNamespaceAndPath(CMDCam.MODID, "cmdcam"));
    public static final KeyMapping ZOOM_IN = new KeyMapping("key.zoomin", InputConstants.KEY_V, CATEGORY);
    public static final KeyMapping ZOOM_RESET = new KeyMapping("key.centerzoom", InputConstants.KEY_B, CATEGORY);
    public static final KeyMapping ZOOM_OUT = new KeyMapping("key.zoomout", InputConstants.KEY_N, CATEGORY);

    public static final KeyMapping ROLL_LEFT = new KeyMapping("key.rollleft", InputConstants.KEY_G, CATEGORY);
    public static final KeyMapping ROLL_RESET = new KeyMapping("key.rollcenter", InputConstants.KEY_H, CATEGORY);
    public static final KeyMapping ROLL_RIGHT = new KeyMapping("key.rollright", InputConstants.KEY_J, CATEGORY);

    public static final KeyMapping POINT_ADD = new KeyMapping("key.point", InputConstants.KEY_P, CATEGORY);
    public static final KeyMapping START_STOP = new KeyMapping("key.startStop", InputConstants.KEY_U, CATEGORY);

    public static final KeyMapping CLEAR_POINT = new KeyMapping("key.clearPoint", InputConstants.KEY_DELETE, CATEGORY);

    public static void registerKeys() {
        KeyMappingHelper.registerKeyMapping(ZOOM_IN);
        KeyMappingHelper.registerKeyMapping(ZOOM_RESET);
        KeyMappingHelper.registerKeyMapping(ZOOM_OUT);

        KeyMappingHelper.registerKeyMapping(ROLL_LEFT);
        KeyMappingHelper.registerKeyMapping(ROLL_RESET);
        KeyMappingHelper.registerKeyMapping(ROLL_RIGHT);

        KeyMappingHelper.registerKeyMapping(POINT_ADD);
        KeyMappingHelper.registerKeyMapping(START_STOP);

        KeyMappingHelper.registerKeyMapping(CLEAR_POINT);
    }
}
