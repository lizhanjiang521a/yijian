package com.yijian.datacollect.controller;

import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;
import org.jsoup.select.Elements;
import org.springframework.web.bind.annotation.RestController;

import java.io.IOException;

//@RestController
public class WebDataDownloadController {

    public static void main(String[] args) {
        String url = "https://www.baidu.com/";
        try {
            Document doc = Jsoup.connect(url).get();
            Elements elements = doc.getElementsByClass("s_tab_inner");
            System.out.println(elements.text());
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
