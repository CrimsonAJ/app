package C3;

import android.media.MediaCodec;
import android.os.Build;
import android.os.LocaleList;
import android.view.PointerIcon;
import java.util.Comparator;
import java.util.PriorityQueue;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.ForkJoinPool;
import java.util.concurrent.TimeUnit;

/* loaded from: classes.dex */
public abstract /* synthetic */ class d {
    public static /* synthetic */ MediaCodec.CryptoInfo.Pattern g(int i9, int i10) {
        return new MediaCodec.CryptoInfo.Pattern(i9, i10);
    }

    public static /* bridge */ /* synthetic */ LocaleList i(Object obj) {
        return (LocaleList) obj;
    }

    public static /* bridge */ /* synthetic */ PointerIcon j(Object obj) {
        return (PointerIcon) obj;
    }

    public static /* synthetic */ PriorityQueue p(Comparator comparator) {
        return new PriorityQueue(comparator);
    }

    public static /* synthetic */ void s() {
    }

    public static /* synthetic */ void w(ExecutorService executorService) {
        boolean isTerminated;
        if ((Build.VERSION.SDK_INT <= 23 || executorService != ForkJoinPool.commonPool()) && !(isTerminated = executorService.isTerminated())) {
            executorService.shutdown();
            boolean z9 = false;
            while (!isTerminated) {
                try {
                    isTerminated = executorService.awaitTermination(1L, TimeUnit.DAYS);
                } catch (InterruptedException unused) {
                    if (!z9) {
                        executorService.shutdownNow();
                        z9 = true;
                    }
                }
            }
            if (z9) {
                Thread.currentThread().interrupt();
            }
        }
    }
}
