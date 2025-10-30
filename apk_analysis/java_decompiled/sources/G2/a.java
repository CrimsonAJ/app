package G2;

import com.anilab.data.model.response.ContinueWatchResponse;
import com.anilab.data.model.response.EpisodeResponse;
import com.anilab.data.model.response.ListEpisodeResponse;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* loaded from: classes.dex */
public final class a implements q {
    public static List a(ListEpisodeResponse dto) {
        Object next;
        long j;
        long j4;
        Long l9;
        long j9;
        boolean z9;
        boolean z10;
        long j10;
        int i9;
        boolean z11;
        long j11;
        boolean z12;
        kotlin.jvm.internal.h.e(dto, "dto");
        B7.t tVar = B7.t.f1135a;
        List list = dto.f14185b;
        if (list == null) {
            list = tVar;
        }
        ArrayList I02 = B7.k.I0(list);
        Iterator it = I02.iterator();
        ArrayList arrayList = null;
        if (!it.hasNext()) {
            next = null;
        } else {
            next = it.next();
            if (it.hasNext()) {
                Long l10 = ((ContinueWatchResponse) next).f14071h;
                if (l10 != null) {
                    j = l10.longValue();
                } else {
                    j = 0;
                }
                do {
                    Object next2 = it.next();
                    Long l11 = ((ContinueWatchResponse) next2).f14071h;
                    if (l11 != null) {
                        j4 = l11.longValue();
                    } else {
                        j4 = 0;
                    }
                    if (j < j4) {
                        next = next2;
                        j = j4;
                    }
                } while (it.hasNext());
            }
        }
        ContinueWatchResponse continueWatchResponse = (ContinueWatchResponse) next;
        if (continueWatchResponse != null) {
            l9 = continueWatchResponse.f14067d;
        } else {
            l9 = null;
        }
        List<EpisodeResponse> list2 = dto.f14184a;
        if (list2 != null) {
            arrayList = new ArrayList(B7.m.f0(list2, 10));
            for (EpisodeResponse episodeResponse : list2) {
                Iterator it2 = I02.iterator();
                int i10 = 0;
                while (true) {
                    if (it2.hasNext()) {
                        int i11 = i10 + 1;
                        ContinueWatchResponse continueWatchResponse2 = (ContinueWatchResponse) it2.next();
                        if (kotlin.jvm.internal.h.a(continueWatchResponse2.f14067d, episodeResponse.f14126a)) {
                            Long l12 = continueWatchResponse2.f14069f;
                            if (l12 != null) {
                                j11 = l12.longValue();
                            } else {
                                j11 = 0;
                            }
                            Float f9 = continueWatchResponse2.f14070g;
                            if (f9 != null && f9.floatValue() == 100.0f) {
                                z12 = true;
                            } else {
                                z12 = false;
                            }
                            I02.remove(i10);
                            z9 = z12;
                            j9 = j11;
                        } else {
                            i10 = i11;
                        }
                    } else {
                        j9 = 0;
                        z9 = false;
                        break;
                    }
                }
                if (l9 != null && l9.equals(episodeResponse.f14126a)) {
                    z10 = true;
                } else {
                    z10 = false;
                }
                Long l13 = episodeResponse.f14126a;
                if (l13 != null) {
                    j10 = l13.longValue();
                } else {
                    j10 = 0;
                }
                Integer num = episodeResponse.f14128c;
                if (num != null) {
                    i9 = num.intValue();
                } else {
                    i9 = 0;
                }
                Integer num2 = episodeResponse.f14129d;
                if (num2 != null && num2.intValue() == 1) {
                    z11 = true;
                } else {
                    z11 = false;
                }
                arrayList.add(new I2.a(j10, i9, null, null, null, null, null, j9, z10, z9, z11, 1276));
            }
        }
        if (l9 == null && arrayList != null && !arrayList.isEmpty()) {
            ((I2.a) B7.k.v0(arrayList)).j = true;
        }
        if (arrayList == null) {
            return tVar;
        }
        return arrayList;
    }

    @Override // G2.q
    public final /* bridge */ /* synthetic */ Object n(Object obj) {
        return a((ListEpisodeResponse) obj);
    }
}
