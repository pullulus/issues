package ru.netology.manager;

import org.junit.jupiter.api.Test;
import ru.netology.domain.Issue;
import ru.netology.repository.IssueRepository;

import java.util.ArrayList;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class IssueManagerTest {

    private IssueRepository repository = new IssueRepository();
    private IssueManager manager = new IssueManager(new IssueRepository());

    @Test
    void shoulAddIssue() {
        manager.add(new Issue(1, true));
    }


    @Test
    void shoulAddSomeIssue() {
        List<Issue> issues = new ArrayList<>();
        manager.add(new Issue(1, true));
        manager.add(new Issue(2, true));
        manager.add(new Issue(2, false));

        List<Issue> expected = manager.getAll();
        List<Issue> actual = List.of(new Issue(1, true), new Issue(2, true), new Issue(3, false));
        assertEquals(expected, actual);

    }

    @Test
    void getAllOpen() {
        List<Issue> issues = new ArrayList<>();
        manager.add(new Issue(1, true));
        manager.add(new Issue(2, true));
        manager.add(new Issue(2, false));

        List<Issue> expected = manager.getAllOpen(true);
        List<Issue> actual = List.of(new Issue(1, true), new Issue(2, true));
        assertEquals(expected, actual);
    }

}
