package tile;

import main.GamePanel;

import javax.imageio.ImageIO;
import java.awt.*;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;

public class TileManager {
    GamePanel gp;
    public Tile[] tile;
    public int[][] mapTileNum;

    public TileManager(GamePanel gp){
        this.gp = gp;
        tile = new Tile[80];
        mapTileNum = new int[gp.maxWorldCol][gp.maxWorldRow];
        getTileImage();
        loadMap("/maps/map01.txt");
    }

    public void getTileImage(){
        try {
            tile[0] = new Tile();
            tile[0].image = ImageIO.read(getClass().getResourceAsStream("/tiles/green.jpg"));

            tile[1] = new Tile();
            tile[1].image = ImageIO.read(getClass().getResourceAsStream("/tiles/greengrass.jpg"));

            tile[2] = new Tile();
            tile[2].image = ImageIO.read(getClass().getResourceAsStream("/tiles/greenflowers.jpg"));

            tile[3] = new Tile();
            tile[3].image = ImageIO.read(getClass().getResourceAsStream("/tiles/grey.jpg"));

            tile[4] = new Tile();
            tile[4].image = ImageIO.read(getClass().getResourceAsStream("/tiles/brown.jpg"));

            tile[5] = new Tile();
            tile[5].image = ImageIO.read(getClass().getResourceAsStream("/tiles/water.jpg"));
            tile[5].collision = true;

            tile[6] = new Tile();
            tile[6].image = ImageIO.read(getClass().getResourceAsStream("/tiles/getup.jpg"));
            tile[6].collision = true;

            tile[7] = new Tile();
            tile[7].image = ImageIO.read(getClass().getResourceAsStream("/tiles/fence1.jpg"));
            tile[7].collision = true;

            tile[8] = new Tile();
            tile[8].image = ImageIO.read(getClass().getResourceAsStream("/tiles/brown2.jpg"));

            tile[9] = new Tile();
            tile[9].image = ImageIO.read(getClass().getResourceAsStream("/tiles/brown3.jpg"));

            tile[10] = new Tile();
            tile[10].image = ImageIO.read(getClass().getResourceAsStream("/tiles/fence2.jpg"));
            tile[10].collision = true;

            tile[11] = new Tile();
            tile[11].image = ImageIO.read(getClass().getResourceAsStream("/tiles/corner1.jpg"));
            tile[11].collision = true;

            tile[12] = new Tile();
            tile[12].image = ImageIO.read(getClass().getResourceAsStream("/tiles/corner2.jpg"));
            tile[12].collision = true;

            tile[13] = new Tile();
            tile[13].image = ImageIO.read(getClass().getResourceAsStream("/tiles/gravestone1.jpg"));
            tile[13].collision = true;

            tile[14] = new Tile();
            tile[14].image = ImageIO.read(getClass().getResourceAsStream("/tiles/gravestone2.jpg"));
            tile[14].collision = true;

            tile[15] = new Tile();
            tile[15].image = ImageIO.read(getClass().getResourceAsStream("/tiles/gravestone3.jpg"));
            tile[15].collision = true;

            tile[16] = new Tile();
            tile[16].image = ImageIO.read(getClass().getResourceAsStream("/tiles/gravestone4.jpg"));
            tile[16].collision = true;

            tile[17] = new Tile();
            tile[17].image = ImageIO.read(getClass().getResourceAsStream("/tiles/gravestone5.jpg"));
            tile[17].collision = true;

            tile[18] = new Tile();
            tile[18].image = ImageIO.read(getClass().getResourceAsStream("/tiles/gravestone6.jpg"));
            tile[18].collision = true;

            tile[19] = new Tile();
            tile[19].image = ImageIO.read(getClass().getResourceAsStream("/tiles/gravestone7.jpg"));
            tile[19].collision = true;

            tile[20] = new Tile();
            tile[20].image = ImageIO.read(getClass().getResourceAsStream("/tiles/gravestone8.jpg"));
            tile[20].collision = true;

            tile[21] = new Tile();
            tile[21].image = ImageIO.read(getClass().getResourceAsStream("/tiles/bench1.jpg"));
            tile[21].collision = true;

            tile[22] = new Tile();
            tile[22].image = ImageIO.read(getClass().getResourceAsStream("/tiles/bench2.jpg"));
            tile[22].collision = true;

            tile[23] = new Tile();
            tile[23].image = ImageIO.read(getClass().getResourceAsStream("/tiles/statue1.jpg"));
            tile[23].collision = true;

            tile[24] = new Tile();
            tile[24].image = ImageIO.read(getClass().getResourceAsStream("/tiles/statue2.jpg"));
            tile[24].collision = true;

            tile[25] = new Tile();
            tile[25].image = ImageIO.read(getClass().getResourceAsStream("/tiles/bench3.jpg"));
            tile[25].collision = true;

            tile[26] = new Tile();
            tile[26].image = ImageIO.read(getClass().getResourceAsStream("/tiles/bench4.jpg"));
            tile[26].collision = true;

            tile[27] = new Tile();
            tile[27].image = ImageIO.read(getClass().getResourceAsStream("/tiles/flower1.jpg"));

            tile[28] = new Tile();
            tile[28].image = ImageIO.read(getClass().getResourceAsStream("/tiles/flower2.jpg"));

            tile[29] = new Tile();
            tile[29].image = ImageIO.read(getClass().getResourceAsStream("/tiles/flower3.jpg"));

            tile[30] = new Tile();
            tile[30].image = ImageIO.read(getClass().getResourceAsStream("/tiles/flower4.jpg"));

            tile[31] = new Tile();
            tile[31].image = ImageIO.read(getClass().getResourceAsStream("/tiles/tree1.jpg"));
            tile[31].collision = true;

            tile[32] = new Tile();
            tile[32].image = ImageIO.read(getClass().getResourceAsStream("/tiles/tree2.jpg"));
            tile[32].collision = true;

            tile[33] = new Tile();
            tile[33].image = ImageIO.read(getClass().getResourceAsStream("/tiles/tree3.jpg"));
            tile[33].collision = true;

            tile[34] = new Tile();
            tile[34].image = ImageIO.read(getClass().getResourceAsStream("/tiles/tree4.jpg"));
            tile[34].collision = true;

            tile[35] = new Tile();
            tile[35].image = ImageIO.read(getClass().getResourceAsStream("/tiles/tree5.jpg"));
            tile[35].collision = true;

            tile[36] = new Tile();
            tile[36].image = ImageIO.read(getClass().getResourceAsStream("/tiles/tree6.jpg"));
            tile[36].collision = true;

            tile[37] = new Tile();
            tile[37].image = ImageIO.read(getClass().getResourceAsStream("/tiles/tree7.jpg"));

            tile[38] = new Tile();
            tile[38].image = ImageIO.read(getClass().getResourceAsStream("/tiles/tree8.jpg"));
            tile[38].collision = true;

            tile[39] = new Tile();
            tile[39].image = ImageIO.read(getClass().getResourceAsStream("/tiles/tree9.jpg"));

            tile[40] = new Tile();
            tile[40].image = ImageIO.read(getClass().getResourceAsStream("/tiles/gravestone9.jpg"));
            tile[40].collision = true;

            tile[41] = new Tile();
            tile[41].image = ImageIO.read(getClass().getResourceAsStream("/tiles/gravestone10.jpg"));
            tile[41].collision = true;

            tile[42] = new Tile();
            tile[42].image = ImageIO.read(getClass().getResourceAsStream("/tiles/house1.jpg"));
            tile[42].collision = true;

            tile[43] = new Tile();
            tile[43].image = ImageIO.read(getClass().getResourceAsStream("/tiles/house2.jpg"));
            tile[43].collision = true;

            tile[44] = new Tile();
            tile[44].image = ImageIO.read(getClass().getResourceAsStream("/tiles/house3.jpg"));
            tile[44].collision = true;

            tile[45] = new Tile();
            tile[45].image = ImageIO.read(getClass().getResourceAsStream("/tiles/house4.jpg"));
            tile[45].collision = true;

            tile[46] = new Tile();
            tile[46].image = ImageIO.read(getClass().getResourceAsStream("/tiles/house5.jpg"));
            tile[46].collision = true;

            tile[47] = new Tile();
            tile[47].image = ImageIO.read(getClass().getResourceAsStream("/tiles/house6.jpg"));
            tile[47].collision = true;

            tile[48] = new Tile();
            tile[48].image = ImageIO.read(getClass().getResourceAsStream("/tiles/house7.jpg"));
            tile[48].collision = true;

            tile[49] = new Tile();
            tile[49].image = ImageIO.read(getClass().getResourceAsStream("/tiles/house8.jpg"));
            tile[49].collision = true;

            tile[50] = new Tile();
            tile[50].image = ImageIO.read(getClass().getResourceAsStream("/tiles/house9.jpg"));
            tile[50].collision = true;


        }catch(IOException e){
            e.printStackTrace();
        }
    }

    public void loadMap(String filePath){
        try{
            InputStream is = getClass().getResourceAsStream("/maps/map01.txt");
            BufferedReader br = new BufferedReader(new BufferedReader(new InputStreamReader(is)));
            int col=0;
            int row=0;
            while(col < gp.maxWorldCol && row < gp.maxWorldRow){
                String line = br.readLine();
                while(col < gp.maxWorldCol){
                    String numbers[] = line.split(" ");
                    int num = Integer.parseInt(numbers[col]);

                    mapTileNum[col][row] = num;
                    col++;
                }
                if(col == gp.maxWorldCol){
                    col = 0;
                    row++;
                }
            }
            br.close();
        }catch(Exception e){

        }
    }

    public void draw(Graphics2D g2){

        int worldCol = 0;
        int worldRow = 0;
        while(worldCol < gp.maxWorldCol && worldRow < gp.maxWorldRow){

            int tileNum = mapTileNum[worldCol][worldRow];

            int worldX = worldCol * gp.tileSize;
            int worldY = worldRow * gp.tileSize;
            int screenX = worldX - gp.player.worldX + gp.player.screenX;
            int screenY = worldY - gp.player.worldY + gp.player.screenY;

            if(worldX + gp.tileSize > gp.player.worldX - gp.player.screenX &&
                    worldX - gp.tileSize < gp.player.worldX + gp.player.screenX &&
                    worldY + gp.tileSize > gp.player.worldY - gp.player.screenY &&
                    worldY - gp.tileSize < gp.player.worldY + gp.player.screenY){
                g2.drawImage(tile[tileNum].image, screenX, screenY, gp.tileSize, gp.tileSize, null);
            }

            worldCol++;

            if(worldCol == gp.maxWorldCol){
                worldCol = 0;
                worldRow++;
            }
        }
    }
}
