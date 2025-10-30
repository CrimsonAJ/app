package co.notix.lsi;

import androidx.annotation.Keep;
import co.notix.nd;

@Keep
/* loaded from: classes.dex */
public interface LsiInterval {
    public static final nd Companion = nd.f12816a;
    public static final long LSI_FALLBACK_INTERVAL = 3600000;

    @Keep
    /* loaded from: classes.dex */
    public static final class Fixed implements LsiInterval {
        private final long intervalMillis;

        public Fixed(long j) {
            this.intervalMillis = j;
        }

        public static /* synthetic */ Fixed copy$default(Fixed fixed, long j, int i9, Object obj) {
            if ((i9 & 1) != 0) {
                j = fixed.intervalMillis;
            }
            return fixed.copy(j);
        }

        public final long component1() {
            return this.intervalMillis;
        }

        public final Fixed copy(long j) {
            return new Fixed(j);
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof Fixed) && this.intervalMillis == ((Fixed) obj).intervalMillis;
        }

        public final long getIntervalMillis() {
            return this.intervalMillis;
        }

        public int hashCode() {
            long j = this.intervalMillis;
            return (int) (j ^ (j >>> 32));
        }

        public String toString() {
            return "Fixed(intervalMillis=" + this.intervalMillis + ')';
        }
    }

    @Keep
    /* loaded from: classes.dex */
    public static final class Optimized implements LsiInterval {
        public static final Optimized INSTANCE = new Optimized();

        private Optimized() {
        }
    }
}
