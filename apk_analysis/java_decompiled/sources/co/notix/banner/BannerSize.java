package co.notix.banner;

import androidx.annotation.Keep;

@Keep
/* loaded from: classes.dex */
public interface BannerSize {

    @Keep
    /* loaded from: classes.dex */
    public static final class Fixed implements BannerSize {
        private final int height;
        private final int width;

        public Fixed(int i9, int i10) {
            this.width = i9;
            this.height = i10;
        }

        public final int getHeight() {
            return this.height;
        }

        public final int getWidth() {
            return this.width;
        }
    }

    @Keep
    /* loaded from: classes.dex */
    public static final class Inline implements BannerSize {
        private final int maxHeight;
        private final int width;

        public Inline(int i9, int i10) {
            this.width = i9;
            this.maxHeight = i10;
        }

        public final int getMaxHeight() {
            return this.maxHeight;
        }

        public final int getWidth() {
            return this.width;
        }
    }

    @Keep
    /* loaded from: classes.dex */
    public static final class Sticky implements BannerSize {
        private final int width;

        public Sticky(int i9) {
            this.width = i9;
        }

        public final int getWidth() {
            return this.width;
        }
    }
}
