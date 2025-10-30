.class public interface abstract Lco/notix/banner/NotixBannerLoader;
.super Ljava/lang/Object;
.source "SourceFile"


# virtual methods
.method public abstract awaitNext(JLE7/d;)Ljava/lang/Object;
    .annotation build Landroidx/annotation/Keep;
    .end annotation

    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(J",
            "LE7/d<",
            "-",
            "Lco/notix/banner/BannerData;",
            ">;)",
            "Ljava/lang/Object;"
        }
    .end annotation
.end method

.method public abstract doOnNextAvailable(LO7/l;)V
    .annotation build Landroidx/annotation/Keep;
    .end annotation

    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "LO7/l;",
            ")V"
        }
    .end annotation
.end method

.method public abstract doOnNextAvailable(LO7/l;J)V
    .annotation build Landroidx/annotation/Keep;
    .end annotation

    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "LO7/l;",
            "J)V"
        }
    .end annotation
.end method

.method public abstract getNext()Lco/notix/banner/BannerData;
    .annotation build Landroidx/annotation/Keep;
    .end annotation
.end method

.method public abstract hasNext()Z
    .annotation build Landroidx/annotation/Keep;
    .end annotation
.end method

.method public abstract startLoading()V
    .annotation build Landroidx/annotation/Keep;
    .end annotation
.end method

.method public abstract stopLoading()V
    .annotation build Landroidx/annotation/Keep;
    .end annotation
.end method
