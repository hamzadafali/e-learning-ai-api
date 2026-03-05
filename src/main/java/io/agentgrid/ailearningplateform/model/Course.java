package io.agentgrid.ailearningplateform.model;

public record Course(
        Long id,
        String title,
        String description,
        int durationInMinutes
) {
}
