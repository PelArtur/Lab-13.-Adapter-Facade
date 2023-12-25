package com.example.lab13.task2;

public class Database
{
    БазаДаних database;

    public Database(БазаДаних database)
    {
        this.database = database;
    }

    public String getUserData()
    {
        return database.отриматиДаніКористувача();
    }

    public String getStatisticsData()
    {
        return database.отриматиСтатистичніДані();
    }
}
