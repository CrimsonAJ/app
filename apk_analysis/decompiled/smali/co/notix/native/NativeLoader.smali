.class public interface abstract Lco/notix/native/NativeLoader;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lco/notix/native/NativeLoader$DefaultImpls;
    }
.end annotation


# virtual methods
.method public abstract awaitNext(JLE7/d;)Ljava/lang/Object;
    .annotation build Landroidx/annotation/Keep;
    .end annotation

    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(J",
            "LE7/d<",
            "-",
            "Lco/notix/native/NativeData;",
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

.method public abstract getNext()Lco/notix/native/NativeData;
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
