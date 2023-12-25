package com.example.lab13.task2;

public class Main
{
    public static void main(String[] args)
    {
        Database database = new Database(new БазаДаних());
        Auth auth = new Auth();

        if (auth.authorize(database))
        {
            ReportBuilder br = new ReportBuilder(database);
        }
    }
}
