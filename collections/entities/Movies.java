package com.gv.collections.entities;

import java.util.Objects;

public class Movies implements Comparable<Movies> {
    
    private int id;
    private String name;
    
    public Movies(int id, String name) {
        this.id = id;
        this.name = name;
    }
    
    public int getId() {
        return id;
    }
    
    public String getName() {
        return name;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null || getClass() != obj.getClass())
            return false;
        Movies movies = (Movies) obj;
        return id == movies.id &&
               Objects.equals(name, movies.name);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, name);
    }

    @Override
    public int compareTo(Movies o) {
        return this.getName().compareTo(o.getName());
    }

    @Override
    public String toString() {
        return "Movies{" +
                "id=" + id +
                ", name='" + name + '\'' +
                '}';
    }
}
