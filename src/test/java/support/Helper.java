package support;

public class Helper {
    public static String getUrlFor(String name) {
        switch (name) {
            case "HTC scenario":
                return "https://nop-qa.portnov.com";
            default:
                return "";
        }
    }

    public static String getXpathFor(String name) {
        switch (name) {
            case "add to card button":
                return "//a[contains(text(),'HTC')]";
            case "complete add":
                return "//div[contains(@class, 'bar-notification')][contains(@class, 'success')]";
            case "results":
                return "//a/span[contains(text(), 'Shopping cart')]";
            default:
                return "";
        }
    }
}