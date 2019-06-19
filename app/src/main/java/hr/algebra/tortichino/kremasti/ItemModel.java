package hr.algebra.tortichino.kremasti;

public class ItemModel {

    private int imageResource;
    private String title;

    public ItemModel(int imageResource, String title) {
        this.imageResource = imageResource;
        this.title = title;
    }

    public int getImageResource() {
        return imageResource;
    }

    public String getTitle() {
        return title;
    }
}
