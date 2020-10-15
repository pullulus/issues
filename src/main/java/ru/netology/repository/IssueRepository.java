package ru.netology.repository;

import ru.netology.domain.Issue;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

public class IssueRepository {

    private List<Issue> items = new ArrayList<>();

    public void save(Issue item) {

        items.add(item);
    }

    public List<Issue> findAll() {
        return items;
    }

}



