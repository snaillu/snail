package com.dianping.entity;

import java.util.Date;

/**
 * Created by snail on 10/16/16.
 */
public class Group {
    private int groupID;
    private String  groupIntro;
    private String groupLogo;
    private String searchKeyWord;

    public int getGroupID() {
        return groupID;
    }

    public void setGroupID(int groupID) {
        this.groupID = groupID;
    }

    public String getGroupIntro() {
        return groupIntro;
    }

    public void setGroupIntro(String groupIntro) {
        this.groupIntro = groupIntro;
    }

    public String getGroupLogo() {
        return groupLogo;
    }

    public void setGroupLogo(String groupLogo) {
        this.groupLogo = groupLogo;
    }

    public String getSearchKeyWord() {
        return searchKeyWord;
    }

    public void setSearchKeyWord(String searchKeyWord) {
        this.searchKeyWord = searchKeyWord;
    }

    @Override
    public String toString() {
        return "Group{" +
                "groupID=" + groupID +
                ", groupIntro='" + groupIntro + '\'' +
                ", groupLogo='" + groupLogo + '\'' +
                ", searchKeyWord='" + searchKeyWord + '\'' +
                '}';
    }
}
