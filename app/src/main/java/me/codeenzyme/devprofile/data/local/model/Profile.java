package me.codeenzyme.devprofile.data.local.model;

import androidx.room.ColumnInfo;
import androidx.room.Entity;

@Entity
public class Profile {

    private String name;

    private String alias;

    private String stack;

    @ColumnInfo(name = "fav_lang")
    private String favLang;

    public Profile(String name, String alias, String stack, String favLang) {
        this.name = name;
        this.alias = alias;
        this.stack = stack;
        this.favLang = favLang;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAlias() {
        return alias;
    }

    public void setAlias(String alias) {
        this.alias = alias;
    }

    public String getStack() {
        return stack;
    }

    public void setStack(String stack) {
        this.stack = stack;
    }

    public String getFavLang() {
        return favLang;
    }

    public void setFavLang(String favLang) {
        this.favLang = favLang;
    }
}
