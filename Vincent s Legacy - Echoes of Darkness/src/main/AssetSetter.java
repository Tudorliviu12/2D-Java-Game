package main;

import object.OBJ_Bone;

public class AssetSetter {
    GamePanel gp;

    public AssetSetter(GamePanel gp) {
        this.gp = gp;
    }

    public void setObject() {
        gp.obj[0] = new OBJ_Bone();
        gp.obj[0].worldX = 20 * gp.tileSize - gp.tileSize;
        gp.obj[0].worldY = 23 * gp.tileSize - gp.tileSize;

        gp.obj[1] = new OBJ_Bone();
        gp.obj[1].worldX = 20 * gp.tileSize - gp.tileSize;
        gp.obj[1].worldY = 12 * gp.tileSize - gp.tileSize;

        gp.obj[2] = new OBJ_Bone();
        gp.obj[2].worldX = 30 * gp.tileSize - gp.tileSize;
        gp.obj[2].worldY = 16 * gp.tileSize - gp.tileSize;

        gp.obj[3] = new OBJ_Bone();
        gp.obj[3].worldX = 46 * gp.tileSize - gp.tileSize;
        gp.obj[3].worldY = 14 * gp.tileSize - gp.tileSize;

        gp.obj[4] = new OBJ_Bone();
        gp.obj[4].worldX = 41 * gp.tileSize - gp.tileSize;
        gp.obj[4].worldY = 22 * gp.tileSize - gp.tileSize;

        gp.obj[5] = new OBJ_Bone();
        gp.obj[5].worldX = 41 * gp.tileSize - gp.tileSize;
        gp.obj[5].worldY = 22 * gp.tileSize - gp.tileSize;

        gp.obj[6] = new OBJ_Bone();
        gp.obj[6].worldX = 43 * gp.tileSize - gp.tileSize;
        gp.obj[6].worldY = 33 * gp.tileSize - gp.tileSize;

        gp.obj[7] = new OBJ_Bone();
        gp.obj[7].worldX = 23 * gp.tileSize - gp.tileSize;
        gp.obj[7].worldY = 32 * gp.tileSize - gp.tileSize;

        gp.obj[8] = new OBJ_Bone();
        gp.obj[8].worldX = 18 * gp.tileSize - gp.tileSize;
        gp.obj[8].worldY = 34 * gp.tileSize - gp.tileSize;

        gp.obj[9] = new OBJ_Bone();
        gp.obj[9].worldX = 39 * gp.tileSize - gp.tileSize;
        gp.obj[9].worldY = 44 * gp.tileSize - gp.tileSize;

        gp.obj[10] = new OBJ_Bone();
        gp.obj[10].worldX = 32 * gp.tileSize - gp.tileSize;
        gp.obj[10].worldY = 35 * gp.tileSize - gp.tileSize;

        gp.obj[11] = new OBJ_Bone();
        gp.obj[11].worldX = 38 * gp.tileSize - gp.tileSize;
        gp.obj[11].worldY = 14 * gp.tileSize - gp.tileSize;

        gp.obj[12] = new OBJ_Bone();
        gp.obj[12].worldX = 15 * gp.tileSize - gp.tileSize;
        gp.obj[12].worldY = 29 * gp.tileSize - gp.tileSize;

        gp.obj[13] = new OBJ_Bone();
        gp.obj[13].worldX = 13 * gp.tileSize - gp.tileSize;
        gp.obj[13].worldY = 12 * gp.tileSize - gp.tileSize;

        gp.obj[14] = new OBJ_Bone();
        gp.obj[14].worldX = 27 * gp.tileSize - gp.tileSize;
        gp.obj[14].worldY = 33 * gp.tileSize - gp.tileSize;

        gp.obj[15] = new OBJ_Bone();
        gp.obj[15].worldX = 29 * gp.tileSize - gp.tileSize;
        gp.obj[15].worldY = 40 * gp.tileSize - gp.tileSize;

        gp.obj[16] = new OBJ_Bone();
        gp.obj[16].worldX = 48 * gp.tileSize - gp.tileSize;
        gp.obj[16].worldY = 28 * gp.tileSize - gp.tileSize;

        gp.obj[17] = new OBJ_Bone();
        gp.obj[17].worldX = 41 * gp.tileSize - gp.tileSize;
        gp.obj[17].worldY = 13 * gp.tileSize - gp.tileSize;

        gp.obj[18] = new OBJ_Bone();
        gp.obj[18].worldX = 38 * gp.tileSize - gp.tileSize;
        gp.obj[18].worldY = 14 * gp.tileSize - gp.tileSize;

        gp.obj[19] = new OBJ_Bone();
        gp.obj[19].worldX = 45 * gp.tileSize - gp.tileSize;
        gp.obj[19].worldY = 43 * gp.tileSize - gp.tileSize;
    }
}