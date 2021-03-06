package com.justpark.models;

import java.util.Objects;

public abstract class DBObject {
    private static long NEW_UID = 0;
    private final long uid;

    public DBObject() {
        this.uid = NEW_UID++;
    }

    public long getUid() {
        return uid;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        DBObject dbObject = (DBObject) o;
        return uid == dbObject.uid;
    }

    @Override
    public int hashCode() {
        return Objects.hash(uid);
    }
}