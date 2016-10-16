package com.dianping.entity;

import java.util.Date;

/**
 * Created by snail on 10/16/16.
 */
public class Group {
    private int groupID;
    private String groupName;
    private String groupPermaLink;
    private String  groupIntro;
    private String groupLogo;
    private Date createDate;
    private int createUser;
    private String lastIP;
    private int userTotal;
    private int mainNoteTotal;
    private int noteTotal;
    private int weeklyNoteCount;
    private String searchKeyWord;
    private int hitsTotal;
    private int status;
    private int cityID;
    private int groupProperty;
    private int groupTypeID;

    public int getGroupID() {
        return groupID;
    }

    public void setGroupID(int groupID) {
        this.groupID = groupID;
    }

    public String getGroupName() {
        return groupName;
    }

    public void setGroupName(String groupName) {
        this.groupName = groupName;
    }

    public String getGroupPermaLink() {
        return groupPermaLink;
    }

    public void setGroupPermaLink(String groupPermaLink) {
        this.groupPermaLink = groupPermaLink;
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

    public Date getCreateDate() {
        return createDate;
    }

    public void setCreateDate(Date createDate) {
        this.createDate = createDate;
    }

    public int getCreateUser() {
        return createUser;
    }

    public void setCreateUser(int createUser) {
        this.createUser = createUser;
    }

    public String getLastIP() {
        return lastIP;
    }

    public void setLastIP(String lastIP) {
        this.lastIP = lastIP;
    }

    public int getUserTotal() {
        return userTotal;
    }

    public void setUserTotal(int userTotal) {
        this.userTotal = userTotal;
    }

    public int getMainNoteTotal() {
        return mainNoteTotal;
    }

    public void setMainNoteTotal(int mainNoteTotal) {
        this.mainNoteTotal = mainNoteTotal;
    }

    public int getNoteTotal() {
        return noteTotal;
    }

    public void setNoteTotal(int noteTotal) {
        this.noteTotal = noteTotal;
    }

    public int getWeeklyNoteCount() {
        return weeklyNoteCount;
    }

    public void setWeeklyNoteCount(int weeklyNoteCount) {
        this.weeklyNoteCount = weeklyNoteCount;
    }

    public String getSearchKeyWord() {
        return searchKeyWord;
    }

    public void setSearchKeyWord(String searchKeyWord) {
        this.searchKeyWord = searchKeyWord;
    }

    public int getHitsTotal() {
        return hitsTotal;
    }

    public void setHitsTotal(int hitsTotal) {
        this.hitsTotal = hitsTotal;
    }

    public int getStatus() {
        return status;
    }

    public void setStatus(int status) {
        this.status = status;
    }

    public int getCityID() {
        return cityID;
    }

    public void setCityID(int cityID) {
        this.cityID = cityID;
    }

    public int getGroupProperty() {
        return groupProperty;
    }

    public void setGroupProperty(int groupProperty) {
        this.groupProperty = groupProperty;
    }

    public int getGroupTypeID() {
        return groupTypeID;
    }

    public void setGroupTypeID(int groupTypeID) {
        this.groupTypeID = groupTypeID;
    }

    @Override
    public String toString() {
        return "Group{" +
                "groupID=" + groupID +
                ", groupName='" + groupName + '\'' +
                ", groupPermaLink='" + groupPermaLink + '\'' +
                ", groupIntro='" + groupIntro + '\'' +
                ", groupLogo='" + groupLogo + '\'' +
                ", createDate=" + createDate +
                ", createUser=" + createUser +
                ", lastIP='" + lastIP + '\'' +
                ", userTotal=" + userTotal +
                ", mainNoteTotal=" + mainNoteTotal +
                ", noteTotal=" + noteTotal +
                ", weeklyNoteCount=" + weeklyNoteCount +
                ", searchKeyWord='" + searchKeyWord + '\'' +
                ", hitsTotal=" + hitsTotal +
                ", status=" + status +
                ", cityID=" + cityID +
                ", groupProperty=" + groupProperty +
                ", groupTypeID=" + groupTypeID +
                '}';
    }
}
