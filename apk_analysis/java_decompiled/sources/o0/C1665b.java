package o0;

import android.util.Log;
import java.util.concurrent.CancellationException;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.FutureTask;

/* renamed from: o0.b, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C1665b extends FutureTask {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ RunnableC1664a f21457a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1665b(RunnableC1664a runnableC1664a, Q4.b bVar) {
        super(bVar);
        this.f21457a = runnableC1664a;
    }

    @Override // java.util.concurrent.FutureTask
    public final void done() {
        RunnableC1664a runnableC1664a = this.f21457a;
        try {
            Object obj = get();
            if (!runnableC1664a.f21455d.get()) {
                runnableC1664a.a(obj);
            }
        } catch (InterruptedException e8) {
            Log.w("AsyncTask", e8);
        } catch (CancellationException unused) {
            if (!runnableC1664a.f21455d.get()) {
                runnableC1664a.a(null);
            }
        } catch (ExecutionException e9) {
            throw new RuntimeException("An error occurred while executing doInBackground()", e9.getCause());
        } catch (Throwable th) {
            throw new RuntimeException("An error occurred while executing doInBackground()", th);
        }
    }
}
