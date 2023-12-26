package com.example.lab13.task3;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@NoArgsConstructor
@Setter
@Getter
public class Company
{
    private String name;
    private String description;
    private String logoUrl;

    @Override
    public String toString()
    {
        return "Company{" +
                "name='" + name + '\'' +
                ", description='" + description + '\'' +
                ", logoUrl='" + logoUrl + '\'' + '}';
    }
}
