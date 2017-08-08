package data;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by Guest on 8/8/17.
 */
public class Post {
    private String content;
    private static ArrayList<Post> instances = new ArrayList<>();


    public Post(String content) {
        this.content = content;
        instances.add(this);
    }

    public String getContent() {
        return content;
    }

    public static ArrayList<Post> getAll() {
        return instances;
    }

    public static void clearAllPosts(){
        instances.clear();
    }

}
