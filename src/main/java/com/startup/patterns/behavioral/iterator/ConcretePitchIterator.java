package com.startup.patterns.behavioral.iterator;

import java.util.List;

public class ConcretePitchIterator implements PitchIterator {
    private final List<PitchRequest> requests;
    private int position = 0;
    private final ProjectCategory filterCategory;

    public ConcretePitchIterator(List<PitchRequest> requests, ProjectCategory filterCategory) {
        this.requests = requests;
        this.filterCategory = filterCategory;
    }

    @Override
    public boolean hasNext() {
        while (position < requests.size()) {
            PitchRequest current = requests.get(position);

            if (current.isOpen() &&
                    (filterCategory == null || current.getCategory().equals(filterCategory))) {
                return true;
            }
            position++;
        }
        return false;
    }

    @Override
    public PitchRequest next() {
        return requests.get(position++);
    }
}
