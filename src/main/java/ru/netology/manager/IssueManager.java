package ru.netology.manager;

import ru.netology.domain.Issue;
import ru.netology.repository.IssueRepository;

import java.util.List;

public class IssueManager {
    private IssueRepository repository;

    public IssueManager(IssueRepository repository) {
        this.repository = repository;
    }

    public void add(Issue item) {
        repository.save(item);
    }

    public List<Issue> getAll() {
        return repository.findAll();
    }

    public List<Issue> getAllOpen(boolean open) {
        for (Issue issue : repository.findAll()) {
            if(issue.matches(true)) {
                return issue;
            }
        }
        return null;
    }
}
