package com.example.lab13.task3;

import lombok.SneakyThrows;
import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.jsoup.select.Elements;

public class PDLReader
{
    @SneakyThrows
    public static Company getCompanyInfo(String url)
    {
        Document document = Jsoup.connect(url).get();

        Company company = new Company();
        company.setName(document.title());

        Elements description = document.select("meta[name=description]");
        company.setDescription(description.attr("content"));

        Elements title = document.select("title");
        company.setName(title.text());

        String logo = document.select("link[rel$=icon]").attr("href");
        if (logo.startsWith("/"))
        {
            logo = url + logo;
        }
        company.setLogoUrl(logo);

        return company;
    }
}
