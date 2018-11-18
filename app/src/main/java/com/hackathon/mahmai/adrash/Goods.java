package com.hackathon.mahmai.adrash;

import java.util.ArrayList;
import java.util.List;

public class Goods {
    private  int image;
    private  String title;
    private String desc;

    public Goods(int image, String title, String desc) {
        this.image = image;
        this.title = title;
        this.desc = desc;
    }

    public int getImage() {
        return image;
    }

    public void setImage(int image) {
        this.image = image;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getDesc() {
        return desc;
    }

    public void setDesc(String desc) {
        this.desc = desc;
    }

    public static List<Goods>  getData(){
        ArrayList<Goods> dataList=new ArrayList<>();
        int[] image= {R.drawable.group_18, R.drawable.group_19, R.drawable.group_19, R.drawable.group_23};
        String[] title={"Abebe Kebede","Sara Alemu","samuel Mussie","Maneh Anteneh"};
        String[] desc={
                "Needs a truck going to Massawa from Djibouti on 20 Nov 2018.",
                "Needs a truck going to Jimma from Jigjiga on 22 Nov 2018.",
                "Going to Mekelle from Asmera on 23 Nov 2018.",
                "Going to Mojo from Addis Ababa on 25 Nov 2018."
        };

        for (int i=0 ;i < image.length; i++){
            Goods  goods=new Goods(image[i],title[i],desc[i]);
            dataList.add(goods);
        }
        return  dataList;
    };
}
