package com.swiftbeard.postgresql.service;


import com.swiftbeard.postgresql.entities.Review;

import javax.validation.constraints.NotNull;
public interface TeacherService {
    /**
     *
     * @param teacherID
     * @param review
     * @throws javax.persistence.EntityNotFoundException
     */
    void addReview(@NotNull String teacherID, @NotNull Review review);
}
