package com.tienanh.btnhom1.Activities;

/**
 * Created by Veteran Commander on 8/10/2016.
 */
public class ItemProfile {
    public String Title;
    public String Content;

    public ItemProfile(String content, String title) {
        Content = content;
        Title = title;
    }

    public void setContent(String content) {
        Content = content;
    }

    public void setTitle(String title) {
        Title = title;
    }

    public String getTitle() {
        return Title;
    }

    public String getContent() {
        return Content;
    }
}
