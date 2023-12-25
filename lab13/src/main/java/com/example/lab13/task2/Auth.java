package com.example.lab13.task2;

public class Auth extends Авторизація
{
    public boolean authorize(Database database)
    {
        database.getStatisticsData();
        return true;
    }
}
