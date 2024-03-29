package com.products.dto;

public class Info {
    private String seed;

    private String results;

    private String page;

    private String version;

    public Info() {
    }

    public Info(String seed, String results, String page, String version) {
        this.seed = seed;
        this.results = results;
        this.page = page;
        this.version = version;
    }

    public String getSeed() {
        return seed;
    }

    public void setSeed(String seed) {
        this.seed = seed;
    }

    public String getResults() {
        return results;
    }

    public void setResults(String results) {
        this.results = results;
    }

    public String getPage() {
        return page;
    }

    public void setPage(String page) {
        this.page = page;
    }

    public String getVersion() {
        return version;
    }

    public void setVersion(String version) {
        this.version = version;
    }

    @Override
    public String toString() {
        return "Info{" +
                "seed='" + seed + '\'' +
                ", results='" + results + '\'' +
                ", page='" + page + '\'' +
                ", version='" + version + '\'' +
                '}';
    }
}
