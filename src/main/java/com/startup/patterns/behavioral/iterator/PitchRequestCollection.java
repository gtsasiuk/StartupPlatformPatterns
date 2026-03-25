package com.startup.patterns.behavioral.iterator;

import java.util.ArrayList;
import java.util.List;

public class PitchRequestCollection {
    private final List<PitchRequest> requests = new ArrayList<>();

    public void addRequest(PitchRequest request) {
        requests.add(request);
    }

    public PitchIterator createIterator() {
        return new ConcretePitchIterator(requests, null);
    }

    public PitchIterator createFilteredIterator(ProjectCategory category) {
        return new ConcretePitchIterator(requests, category);
    }
}
