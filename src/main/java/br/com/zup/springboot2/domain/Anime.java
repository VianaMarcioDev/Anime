package br.com.zup.springboot2.domain;

public class Anime {

    private String name;

    public Anime(String name) {
        this.name = name;
    }

    public Anime() {
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
