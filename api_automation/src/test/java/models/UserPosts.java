package models;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class UserPosts {
    private String userId;
    private int id;
    private String title;
    private String body;
}
