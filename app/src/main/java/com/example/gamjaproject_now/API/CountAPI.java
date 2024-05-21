package com.example.gamjaproject_now.API;

import com.google.gson.annotations.SerializedName;

public class CountAPI {
    public int getCnt() {
        return cnt;
    }

    public void setCnt(int cnt) {
        this.cnt = cnt;
    }

    @SerializedName("cnt")
    private int cnt;


}
