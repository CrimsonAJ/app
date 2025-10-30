package l3;

/* loaded from: classes.dex */
public final class u {
    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj != null && u.class == obj.getClass()) {
                if (Float.compare(0.0f, 0.0f) == 0) {
                    return true;
                }
                return false;
            }
            return false;
        }
        return true;
    }

    public final int hashCode() {
        return Float.floatToIntBits(0.0f) + 16337;
    }
}
