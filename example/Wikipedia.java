// package org.jsoup.examples;
// import org.jsoup.examples;

import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;
import org.jsoup.select.Elements;

import java.io.IOException;

/**
 * A simple example, used on the jsoup website.
 */
public class Wikipedia {
    public static void main(String[] args) throws IOException {
        System.out.println(" You have just run in Julia world  !");
        Document doc = Jsoup.connect("https://jvns.ca/").get();
        log(doc.title());

        // Elements articleLines = doc.select(".article-row a");
        // for (Element article: articleLines) {
        //     log("%s\n", article.absUrl("href"));
        // }

        // [TBD] debug 
        // Elements dateLines = doc.select(".article-row article-date time");
        // for (Element dline: dateLines) {
        //     // log("%s\n", dline.attr("time"));
        // }

        Elements h3Lines = doc.select("h3");
        for (Element h3s: h3Lines) {
            log("\n%s:", h3s.attr("id"));
        }
    }

    private static void log(String msg, String... vals) {
        System.out.println(String.format(msg, vals));
    }
}