package com.example.lab13.task1;

import lombok.AllArgsConstructor;
import lombok.Getter;

import java.util.Date;

@AllArgsConstructor
@Getter
public class TwitterUser
{
    private String userMail;
    private String country;
    private Date lastActiveTime;

}
