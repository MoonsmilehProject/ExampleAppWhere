package mx.com.moonsmileh.capitalsocial.model;

/**
 * Created by moonsmileh on 27/03/17.
 */

public class Item {

    private String title;
    private String description;
    private int image;

    public Item(String title, String description, int image) {
        this.title = title;
        this.description = description;
        this.image = image;
    }

    public String getTitle() {
        return title;
    }

    public String getDescription() {
        return description;
    }

    public int getImage() {
        return image;
    }
}
