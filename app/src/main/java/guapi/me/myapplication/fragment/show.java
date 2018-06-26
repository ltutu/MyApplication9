package guapi.me.myapplication.fragment;

/**
 * Created by apple on 2018/6/24.
 * 资讯页面recyclerView的单个view信息
 */

public class show {
    private int id;
    private String shortdesc;
    private String date;
    private int image;

    public show(int id, String shortdesc, String date, int image) {
        this.id = id;
        this.shortdesc = shortdesc;
        this.date = date;
        this.image = image;
    }

    public show(int id, String shortdesc, String date) {
        this.id = id;
        this.shortdesc = shortdesc;
        this.date = date;
    }

    public int getId() {
        return id;
    }

    public String getShortdesc() {
        return shortdesc;
    }

    public String getDate() {
        return date;
    }

    public int getImage() {
        return image;
    }
}
