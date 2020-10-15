package ru.netology.domain;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.Objects;

@NoArgsConstructor
@AllArgsConstructor
@Data
public class Issue {
    private int id;
    private boolean open;
    private String date;
    private String title;
    private String author;
    private boolean label;
    private int numberOfLabels;
    private String textOfLabel;
    private boolean assignee;
    private int numberOfAssignees;
    private String nameOfAssignee;
    private boolean project;
    private String nameOfProject;
    private boolean milestone;
    private String nameOfMilestone;
    private String text;
    private boolean comment;
    private int numberOfComments;

    public Issue(int id, boolean open) {
        this.id = id;
        this.open = open;
    }

    public boolean matches(boolean open) {
        if (this.isOpen() == open) {
            return true;
        }
        return false;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Issue issue = (Issue) o;
        return open == issue.open &&
                milestone == issue.milestone &&
                comment == issue.comment &&
                numberOfComments == issue.numberOfComments &&
                Objects.equals(nameOfMilestone, issue.nameOfMilestone) &&
                Objects.equals(text, issue.text);
    }

    @Override
    public int hashCode() {
        return Objects.hash(open);
    }
}
