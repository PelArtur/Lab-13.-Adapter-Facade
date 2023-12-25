package com.example.lab13.task2;

public class Авторизація
{
    public boolean авторизуватися(БазаДаних db)
    {
        db.отриматиДаніКористувача();
        return true;
    }
}
