package edu.nf.ch05.entity;

import lombok.Data;

/**
 * @author 0.0
 * @Data会自动帮我们写getset方法，先要添加lombok插件和下载那个辣椒(lombok)
 */
@Data
public class Users {

    private int uid;
    private String userName;

    public Users() {
    }

    public Users(int uid, String userName) {
        this.uid = uid;
        this.userName = userName;
    }
}
